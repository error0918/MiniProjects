from motion_from_horizontality import motion_from_horizontality
from motion_from_angle import motion_from_angle

if __name__ == "__main__":
    print(
        "\n"
        "Plotly를 이용해 포물선 운동 시각화하기 - 30818 정태연\n"
        "\n"
    )
    print("중력 가속도는 9.8m/s^2로 계산됩니다.\n")

    answer = input(
        "시각화하실 운동의 번호를 작성하세요.\n"
        "    1. 수평 방향으로 던진 물체의 운동 (기본)\n"
        "    2. 비스듬히 던진 물체의 운동\n"
        " >> "
    ).strip()

    if answer != "2":
        print(
            "\n"
            "수평 방향으로 던진 물체의 운동\n"
        )
        print("이제 정보를 입력받겠습니다.\n")
        height = float(
            input(
                "물체를 운동시킬 높이를 입력해주세요. (m)\n"
                " >> "
            )
        )
        velocity = float(
            input(
                "물체의 초기 속력을 입력해주세요. (m/s)\n"
                " >> "
            )
        )
        print()
        motion_from_horizontality(height, velocity)
    else:
        print(
            "\n"
            "비스듬히 던진 물체의 운동\n"
        )
        print("이제 정보를 입력받겠습니다.\n")
        angle = float(
            input(
                "물체를 던질 각도를 입력해주세요. (º)\n"
                " >> "
            )
        )
        velocity = float(
            input(
                "물체의 초기 속력을 입력해주세요. (m/s)\n"
                " >> "
            )
        )
        print()
        motion_from_angle(angle, velocity)
