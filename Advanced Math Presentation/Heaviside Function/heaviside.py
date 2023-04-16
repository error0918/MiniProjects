import math
from typing import Union

"""
sgn ⫟ -1 (x < 0)
    | 0 (x = 0)
    ⌞ 1 (x > 0)

H1 ⫟ 0 (x < 0)
   | 1/2 (x = 0)
   ⌞ 1 (x > 0)

H2 ⫟ 0 (x ≤ 0)
   ⌞ 1 (x > 0)

H3 ⫟ 0 (x < 0)
   ⌞ 1 (x ≥ 0)
"""


def sgn(x: float) -> int:
    return int(math.fabs(x) / (1 if x == 0 else x))


def heaviside1(x: float) -> Union[int, float]:
    if x < 0:
        return 0
    if x > 1:
        return 1
    else:
        return 0.5


def heaviside1_sgn(x: float) -> Union[int, float]:
    return 0.5 * (sgn(x) + 1)


def heaviside2(x: float) -> int:
    if x <= 0:
        return 0
    else:
        return 1


def heaviside3(x: float) -> int:
    if x < 0:
        return 0
    else:
        return 1


print("""
------------------------------------------

헤비사이드 함수 (심화수학 발표) - 30818 정태연

------------------------------------------

sgn

sgn(23) = """ + str(sgn(23)) + """
sgn(0) = """ + str(sgn(0)) + """
sgn(-3.1) = """ + str(sgn(-3.1)) + """

------------------------------------------

Heaviside 1

H1(9.18) = """ + str(heaviside1(9.18)) + """
H1(0) = """ + str(heaviside1(0)) + """
H1(-2) = """ + str(heaviside1(-2)) + """

H1_sgn(9.18) = """ + str(heaviside1_sgn(9.18)) + """
H1_sgn(0) = """ + str(heaviside1_sgn(0)) + """
H1_sgn(-2) = """ + str(heaviside1_sgn(-2)) + """

------------------------------------------

Heaviside 2

H2(1/3) = """ + str(heaviside2(1/3)) + """
H2(0) = """ + str(heaviside2(0)) + """
H2(-45) = """ + str(heaviside2(-45)) + """

------------------------------------------

Heaviside 3

H3(1000000) = """ + str(heaviside3(1000000)) + """
H3(0) = """ + str(heaviside3(0)) + """
H3(-1000000) = """ + str(heaviside3(-1000000)) + """

------------------------------------------
""")
