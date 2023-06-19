<div align=center>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=230&fontSize=55&fontAlignY=45&color=gradient&customColorList=12&section=header&text=Cantera를%20이용한%20화학%20평형%20계산" alt="Start"/>
</div>

> ⟪과학 쌤과 파이썬 알아가기⟫를 읽고

<div align=right>
    <h6>
        by 동산고등학교 30818 정태연<br/> 
        (2023/06/12~2023/06/19)
    </h6>
</div>

<details>
    <summary>목차</summary>
    <h6>
        <ul dir="auto">
            <a href="https://github.com/error0918/MiniProjects/tree/main/ChemistryCantera//ChemistryCantera/#-----소개">
                <li>
                    📜 소개
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/ChemistryCantera//ChemistryCantera/#----%EF%B8%8F-코드">
                <li>
                    🖥️ 코드
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/ChemistryCantera//ChemistryCantera/#-----결과">
                <li>
                    🧐 결과
                </li>
            </a>
        </ul>
    </h6>
</details>

---

<h2>
    📜 소개
</h2>

TODO

---

<h2>
    📜 TODO
</h2>

TODO

---

<h2>
    📜 TODO
</h2>

TODO

---

<h2>
    🖥️ 코드
</h2>

```python
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
```
<div align=end>
    참고: https://cantera.org/
</div>

---

<h2>
    🧐 결과
</h2>

```
화학 평형 계산 결과 - 30818 정태연

온도: 1500.00000K
압력: 10.00000atm

몰 분율:
H2: 0.00000136
H: 0.00000001
O: 0.00000048
O2: 0.14282341
OH: 0.00011693
H2O: 0.85705684
HO2: 0.00000076
H2O2: 0.00000021

화학 평형 상수:
반응 1 (2 O + M <=> O2 + M): 7490172105964.52148438
반응 2 (H + O + M <=> OH + M): 458065616220.22357178
반응 3 (H2 + O <=> H + OH): 1.15378232
반응 4 (HO2 + O <=> O2 + OH): 45415817.43066091
반응 5 (H2O2 + O <=> HO2 + OH): 855.01172160
반응 6 (H + O2 + M <=> HO2 + M): 10086.03702707
반응 7 (H + O2 + O2 <=> HO2 + O2): 10086.03702707
반응 8 (H + O2 + H2O <=> HO2 + H2O): 10086.03702707
반응 9 (H + O2 + N2 <=> HO2 + N2): 10086.03702707
반응 10 (H + O2 + AR <=> HO2 + AR): 10086.03702707
반응 11 (H + O2 <=> O + OH): 0.06115555
반응 12 (2 H + M <=> H2 + M): 397012166001.34716797
반응 13 (2 H + H2 <=> H2 + H2): 397012166001.34716797
반응 14 (2 H + H2O <=> H2 + H2O): 397012166001.34716797
반응 15 (H + OH + M <=> H2O + M): 13910164959224.75585938
반응 16 (H + HO2 <=> H2O + O): 84342723.14189740
반응 17 (H + HO2 <=> H2 + O2): 39362552.89722466
반응 18 (H + HO2 <=> 2 OH): 2777429.42394539
반응 19 (H + H2O2 <=> H2 + HO2): 741.05115845
반응 20 (H + H2O2 <=> H2O + OH): 72114016917.81503296
반응 21 (H2 + OH <=> H + H2O): 35.03712518
반응 22 (2 OH (+M) <=> H2O2 (+M)): 192.89127903
반응 23 (2 OH <=> H2O + O): 30.36718860
반응 24 (HO2 + OH <=> H2O + O2): 1379150693.36878109
반응 25 (H2O2 + OH <=> H2O + HO2): 25964.30220552
반응 26 (H2O2 + OH <=> H2O + HO2): 25964.30220552
반응 27 (2 HO2 <=> H2O2 + O2): 53117.18691503
반응 28 (2 HO2 <=> H2O2 + O2): 53117.18691503
반응 29 (HO2 + OH <=> H2O + O2): 1379150693.36878109
```

<div align=center>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=gradient&customColorList=12&section=footer&desc=Copyright%202023.%20jtaeyeon05%20all%20rights%20reserved" alt="End"/>
</div>