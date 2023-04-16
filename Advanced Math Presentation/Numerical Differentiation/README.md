<div align=center>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=280&fontSize=70&fontAlignY=45&color=gradient&customColorList=19&section=header&text=Numerical%20Differentiation" alt="Start"/>
</div>

<div align=right>
    <h6>
        by 동산고등학교 30818 정태연<br/>
        (jtaeyeon05)<br/>  
        (2023/04/16~)
    </h6>
</div>

<details>
    <summary>목차</summary>
    <h6>
        <ul dir="auto">
            <a href="https://github.com/error0918/MiniProjects/tree/main/Advanced%20Math%20Presentation/Numerical%20Differentiation#-----소개">
                <li>
                    📜 소개
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/Advanced%20Math%20Presentation/Numerical%20Differentiation#-----수치적-미분">
                <li>
                    👀 헤비사이드 함수
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/Advanced%20Math%20Presentation/Numerical%20Differentiation#-코드">
                <li>
                    🖥️ 코드
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/Advanced%20Math%20Presentation/Numerical%20Differentiation#-----결과">
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

심화수학 I 발표 자료로, 계단 함수 중 하나인 코틀린을 활용해 수치적 미분법으로 미분 계수를 구합니다.

---

<h2>
    👀 수치적 미분
</h2>

수치적 미분은 복잡한 과정을 요구하는 직접 도함수를 구하는 방법 대신, (f(x + h) - (f(x))) / h에서 h에 0에 가까운 수를 넣어 미분 계수와 충분히 비슷한 수를 구하는 방법입니다. (자세한 내용은 문서 참조)

---

<h2>
    🖥️ 코드
</h2>

```kotlin
fun derivative(
    f: (x: Double) -> Double,
    x: Double,
    h: Double
) = (f(x + h) - f(x)) / h
// 수치적 미분을 통해 미분 계수를 반환합니다.
```

---

<h2>
    🧐 결과
</h2>

> x³ + 3x²의 도함수에 2을 넣은 값 (실제 값: 24)
> 24.000001985768904
>
> sin x의 도함수에 0을 넣은 값 (실제 값: 1)
> 1.0
>
> x³ + 3x² - ln x의 이계도 함수에 6을 넣은 값 (실제 값: 42.02777..)
> 42.02888703730423


<div align=center>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=gradient&customColorList=19&section=footer&desc=Copyright%202023.%20jtaeyeon05%20all%20rights%20reserved" alt="End"/>
</div>