from sympy import Symbol, sympify, plot, sqrt


print("\n방정식의 그래프의 길이 구하기 - 30818 정태연\n\n")

x = Symbol(
    input("사용할 변수 명을 입력하세요. \n >> ")
)  # 변수명 입력 받기
f = sympify(
    input("그래프의 길이를 구할 방정식을 입력하세요. \n >> ")
)  # 길이를 구할 방정식 입력 받기
a, b = map(
    float,
    input(
        "a에서 b까지의 그래프의 길이를 구합니다.\n"
        "a와 b를 입력해주세요. (a,b)\n"
        " >> "
    ).split(",")
)
print("\n")

print("                              [그래프의 개형]                              ")
plot(f, (x, a, b))
print("\n")

F = sqrt(1 + f.diff(x) ** 2).integrate(x)
print("길이 함수 F(x) =", F)
print("\n")

print(
    str(f) + "의 " +
    str(x) + "=" + str(a) + "부터 " +
    str(x) + "=" + str(b) + "까지의 길이 = " +
    str(F.subs({x: b}).evalf() - F.subs({x: a}).evalf())
)
