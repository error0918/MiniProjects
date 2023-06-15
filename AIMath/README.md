<div align=center>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=280&fontSize=70&fontAlignY=45&color=gradient&customColorList=15&section=header&text=인공지능%20수학%20수행평가" alt="Start"/>
</div>

<div align=right>
    <h6>
        by 동산고등학교 30818 정태연<br/>
        (jtaeyeon05)<br/>  
        (2023/06/15~2023/06/16)
    </h6>
</div>

<details>
    <summary>목차</summary>
    <h6>
        <ul dir="auto">
            <a href="https://github.com/error0918/MiniProjects/tree/main/AIMath/AIMath#-----소개">
                <li>
                    📜 소개
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/AIMath/AIMath#-----손실-함수와-추세선">
                <li>
                    👀 손실 함수와 추세선
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/AIMath/AIMath#-----구조도">
                <li>
                    📱️ 구조도
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/AIMath/AIMath#----%EF%B8%8F-주요-코드">
                <li>
                    🖥️ 코드
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/AIMath/AIMath#-----결과">
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

인공지능 수학 수행평가 자료로, "코틀린 검색량 데이터를 코틀린을 이용해 추세선 최적화 및 시각화하기"를 주제로 한 보고서에 사용된 코드입니다.

본 프로젝트에 사용된 데이터는 구글 트렌즈에서 찾은 2017.01.01부터 2023.06.15까지의 코틀린 검색량 데이터입니다. 본 프로젝트에는 손실 함수 (getLoss)와 추세선 기울기 구하기 함수 (getTrendInclination)가 포함되어 있고, 데이터에 이러한 함수를 적용해 최적화된 추세선 기울기에서의 손실과 최적화된 추세선 기울기를 구하고 출력합니다. 또한 이렇게 구한 데이터를 시각화하여 보기 편하게 합니다. 본 프로젝트는 데이터 시각화를 위해 XChart 라이브러리를 사용했습니다.

---

<h2>
    👀 손실 함수와 추세선
</h2>

손실 함수: 한 자료에서 추세선에 따른 오차의 제곱의 평균

추세선: 특정 자료의 경향을 나타내는 직선

---

<h2>
    📱️ 구조도
</h2>

```
src/main/kotlin/
 ├── Main.kt: 손실 함수, 추세선 구하기 함수, Main 함수가 들어가있습니다.
 ├── Util.kt: 프로그램에 사용된 리스트 관련 함수가 들어있습니다.
 └── Data.kt: 구글 트렌즈 코틀린 검색량에 대한 데이터가 들어있습니다.
```

---

<h2>
    🖥️ 주요 코드
</h2>

```kotlin
// 손실 함수
fun getLoss(
    data: Map<Double, Double>,
    trendFunction: (Double) -> Double
): Double
        = data.keys.sumOf {
        (data[it]!! - trendFunction(it)).pow(2)
    } / data.size


// 추세선 기울기 구하기 함수
fun getTrendInclination(data: Map<Double, Double>): Double {
    var (a, b) = .0 to .0
    data.forEach { (x, y) ->
        a += x * x
        b += x * y
    }
    return b / a
}
```

---

<h2>
    🧐 결과
</h2>

<h3>
    출력 결과
</h3>

> 코틀린 검색량을 코틀린을 이용해 추세선 계산 및 시각화하기
> 인공지능 수학 수행평가 - 30818 정태연
> 
> 최적 추세 함수 기울기: 1.3302834570010142
> 손실: 323.41440870025184

<h3>
    시각화 결과
</h3>

<div align=center>
    <img src="https://raw.githubusercontent.com/error0918/MiniProjects/main/AIMath/image/Graph.png" alt="시각화 결과"/>
</div>

<div align=center>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=gradient&customColorList=15&section=footer&desc=Copyright%202023.%20jtaeyeon05%20all%20rights%20reserved" alt="End"/>
</div>