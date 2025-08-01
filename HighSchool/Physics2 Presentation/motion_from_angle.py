from graph import make_graph
import numpy
import math


def motion_from_angle(
        angle: float, weight: float, velocity: float
):
    radian = angle * math.pi / 180
    vx = velocity * math.cos(radian)
    vy = velocity * math.sin(radian)
    time = 2 * vy / 9.8

    print(
        "다음은 운동 분석 결과입니다.\n"
        "그래프에서 더 자세히 확인할 수 있습니다.\n"
    )
    print(
        "운동이 완료되기까지 걸린 시간: " + str(time) + "초\n"
        "최고점 도달 시간: " + str(time / 2) + "초\n"
        "수평 이동 거리: " + str(vx * time) + "m\n"
        "최고점 높이: " + str(0.5 * 9.8 * (time / 2) ** 2) + "m\n"
        "최소 속력: " + str(vx) + "m/s\n"
        "최대 속력: " + str(velocity) + "m/s\n"
        "수평 방향 속력: " + str(vx) + "m/s\n"
        "수직 방향 최대 속력: " + str(vy) + "m/s\n"
        "역학적 에너지: " + str(0.5 * weight * velocity ** 2) + "J\n"
    )
    print("곧 그래프가 표시됩니다.")

    time_n = numpy.linspace(0, time, 200)
    make_graph(
        title="비스듬히 던진 물체의 포물선 운동",

        x=time_n * vx,
        y=time_n * vy - 0.5 * 9.8 * (time_n ** 2),

        v=numpy.sqrt(vx ** 2 + (vy - 9.8 * time_n) ** 2),
        vx=numpy.full(200, vx),
        vy=vy - 9.8 * time_n,

        potential_energy=weight * 9.8 * (time_n * vy - 0.5 * 9.8 * (time_n ** 2)),
        kinetic_energy=0.5 * weight * (vx ** 2 + (vy - 9.8 * time_n) ** 2),
        mechanical_energy=weight * 9.8 * (time_n * vy - 0.5 * 9.8 * (time_n ** 2)) + 0.5 * weight * (vx ** 2 + (vy - 9.8 * time_n) ** 2),

        angle=numpy.arctan((vy - 9.8 * time_n) / vx) * 180 / math.pi,
        time=time_n
    )
    print("지금까지 운동의 분석 결과 및 개형이었습니다.")
