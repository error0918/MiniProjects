from graph import make_graph
import numpy
import math


def motion_from_horizontality(
        height: float, weight: float, velocity: float
):
    time = math.sqrt(2 * height / 9.8)
    vy_max = 9.8 * time

    print(
        "다음은 운동 분석 결과입니다.\n"
        "그래프에서 더 자세히 확인할 수 있습니다.\n"
    )
    print(
        "운동이 완료되기까지 걸린 시간: " + str(time) + "초\n"
        "수평 이동 거리: " + str(velocity * time) + "m\n"
        "최소 속력: " + str(velocity) + "m/s\n"
        "최대 속력: " + str(math.sqrt(vy_max ** 2 + velocity ** 2)) + "m/s\n"
        "수평 방향 속력: " + str(velocity) + "m/s\n"
        "수직 방향 최대 속력: " + str(vy_max) + "m/s\n"
        "역학적 에너지: " + str(9.8 * weight * height) + "J"
    )

    time_n = numpy.linspace(0, time, 100)
    make_graph(
        title="수평 방향으로 던진 물체의 포물선 운동",

        x=time_n * velocity,
        y=height - 0.5 * 9.8 * (time_n ** 2),

        v=numpy.sqrt(velocity ** 2 + (time_n * 9.8) ** 2),
        vx=numpy.full(100, velocity),
        vy=time_n * 9.8,

        potential_energy=9.8 * weight * (height - 0.5 * 9.8 * (time_n ** 2)),
        kinetic_energy=0.5 * weight * (velocity ** 2 + (time_n * 9.8) ** 2),
        mechanical_energy=9.8 * weight * (height - 0.5 * 9.8 * (time_n ** 2)) + 0.5 * weight * (velocity ** 2 + (time_n * 9.8) ** 2),

        angle=numpy.arctan(time_n * 9.8 / velocity) * 180 / math.pi,
        time=time_n
    )
