<div align=center>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=280&fontSize=70&fontAlignY=45&color=gradient&customColorList=19&section=header&text=Heaviside%20Function" alt="Start"/>
</div>

<div align=right>
    <h6>
        by 동산고등학교 30818 정태연<br/>
        (jtaeyeon05)<br/>  
        (2023/04/14~)
    </h6>
</div>

<details>
    <summary>목차</summary>
    <h6>
        <ul dir="auto">
            <a href="https://github.com/error0918/MiniProjects/tree/main/Advanced%20Math%20Presentation/Heaviside%20Function#-----소개">
                <li>
                    📜 소개
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/Advanced%20Math%20Presentation/Heaviside%20Function#-----헤비사이드-함수">
                <li>
                    👀 헤비사이드 함수
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/Advanced%20Math%20Presentation/Heaviside%20Function#-코드">
                <li>
                    🖥️ 코드
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/Advanced%20Math%20Presentation/Heaviside%20Function#-----결과">
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

심화수학 I 발표 자료로, 계단 함수 중 하나인 헤비사이드 함수들을 파이썬으로 구현했습니다.

---

<h2>
    👀 헤비사이드 함수
</h2>

헤비사이드 함수는 전기공학자 올리버 헤비사이드가 연구한 계단 함수 중 하나이다. 이러한 헤비사이드 함수는 주로 신호처리 분야에서 시점을 계산할 때 사용된다. 헤비사이드 함수의 H(0)에 대해서는 여러 의견이 있지만 주로 다음과 같이 정의된다. (sgn 함수는 헤비사이드 함수를 정리할 때 사용하는 부호 함수이다) (자세한 내용은 문서 참조)

```
sgn x ┬── -1 (x < 0)
      ├── 0 (x = 0)
      └── 1 (x > 0)

H₁(x) ┬── 0 (x < 0)
      ├── 1/2 (x = 0)
      └── 1 (x > 0)

H₂(x) ┬── 0 (x ≤ 0)≥
      └── 1 (x > 0)
      
H₃(x) ┬── 0 (x < 0)
      └── 1 (x ≥ 0)
```

---

<h2>
    🖥️ 코드
</h2>

```python
def sgn(x: float) -> int: pass
# sgn 함수로, 절댓값 x를 x로 나눠 역할을 수행합니다. (x가 0인 경우 0을 반환)

def heaviside1(x: float) -> Union[int, float]: pass
# 앞에 나온 H1함수로 조건문을 통해 이용해 값을 결정합니다.

def heaviside1_sgn(x: float) -> Union[int, float]: pass
# 앞에 나온 H1함수로 sgn 함수를 이용해 값을 결정합니다.

def heaviside2(x: float) -> int: pass
# 앞에 나온 H2함수로 조건문을 통해 이용해 값을 결정합니다.

def heaviside3(x: float) -> int: pass
# 앞에 나온 H3함수로 조건문을 통해 이용해 값을 결정합니다.
```

---

<h2>
    🧐 결과
</h2>

> ------------------------------------------
>
> 헤비사이드 함수 (심화수학 발표) - 30818 정태연
>
> ------------------------------------------
>
> sgn
>
> sgn(23) = 1
> sgn(0) = 0
> sgn(-3.1) = -1
>
> ------------------------------------------
>
> Heaviside 1
>
> H1(9.18) = 1
> H1(0) = 0.5
> H1(-2) = 0
>
> H1_sgn(9.18) = 1.0
> H1_sgn(0) = 0.5
> H1_sgn(-2) = 0.0
>
> ------------------------------------------
>
> Heaviside 2
>
> H2(1/3) = 1
> H2(0) = 0
> H2(-45) = 0
>
> ------------------------------------------
>
> Heaviside 3
>
> H3(1000000) = 1
> H3(0) = 1
> H3(-1000000) = 0
>
> ------------------------------------------


<div align=center>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=gradient&customColorList=19&section=footer&desc=Copyright%202023.%20jtaeyeon05%20all%20rights%20reserved" alt="End"/>
</div>