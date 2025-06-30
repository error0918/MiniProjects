import cantera as ct

gas = ct.Solution("h2o2.yaml")
# 반응 메커니즘 파일 로드
gas.TPX = 1500, 10 * ct.one_atm, "H2:3, O2:2"
# 초기 온도 (1500K), 압력 (10atm), 몰분율 설정
gas.equilibrate("TP", solver="gibbs")
# 온도와 압력을 기반으로 화학 평형 계산 (gibbs 알고리즘으로 평형 상수 계산)


# 결과 출력
print("\n화학 평형 계산 결과 - 30818 정태연\n")

print("온도: %.5fK" % gas.T)
print("압력: %.5fatm" % (gas.P / ct.one_atm))
print()

print("몰 분율:")
for name in gas.species_names:
    if "%.8f" % gas[name].X[0] != "0.00000000": 
        print("%s: %.8f" % (name, gas[name].X[0]))  
        # 여덟 번쨰 자리까지 출력 (작은 값 제외)
print()

print("화학 평형 상수:")
for i, reaction in enumerate(gas.reaction_equations()):
    print('반응 %d (%s): %.8f' % (i + 1, reaction, gas.equilibrium_constants[i]))
    # 여덟 번쨰 자리까지 출력
