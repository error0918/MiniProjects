<div align=center>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=280&fontSize=70&fontAlignY=45&color=gradient&customColorList=6&section=header&text=물리학%20II%20발표" alt="Start"/>
</div>

<div align=right>
    <h6>
        by 동산고등학교 30818 정태연<br/>
        (jtaeyeon05)<br/>  
        (2023/07/14~2023/07/15)
    </h6>
</div>

<details>
    <summary>목차</summary>
    <h6>
        <ul dir="auto">
            <a href="https://github.com/error0918/MiniProjects/tree/main/Physics2%20Presentation#-----소개">
                <li>
                    📜 소개
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/Physics2%20Presentation#-----포물선-운동">
                <li>
                    👀 포물선 운동
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/Physics2%20Presentation#-----역학적-에너지-보존">
                <li>
                    👀 역학적 에너지 보존
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/Physics2%20Presentation#-----구조">
                <li>
                    📱️ 구조
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/Physics2%20Presentation#----%EF%B8%8F-주요-코드">
                <li>
                    🖥️ 주요 코드
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/Physics2%20Presentation#-----결과">
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

물리학 II 발표 코드로, 포물선 운동을 분석하고 Plotly (+ Pandas, Numpy)를 이용해 인터랙티브하게 시각화했습니다. 

---

<h2>
    👀 포물선 운동
</h2>

포물선 운동은 물체의 운동 방향과 힘의 방향을 다를 때의 운동이다. 포물선 운동을 하는 물체는 이차함수의 모양으로 운동한다. (포물선 모양으로 운동한다)

---

<h2>
    👀 역학적 에너지 보존
</h2>

역학적 에너지 보존, 즉 에너지 보존 법칙은 에너지가 어떠한 형태로 바뀌더라도 그 양의 전체는 변함이 없다는 것이다. 중력이 작용하고 그 외 외력이 작용하지 않는 곳에서 물체가 운동할 때, 물체는 위치 에너지와 운동 에너지가 서로 교환되면서 운동하고 그 합은 변하지 않는다.

---

<h2>
    📱️ 구조
</h2>

```
Physics2 Presentation/
 ├── main.py: 메인 실행 파일입니다.
 ├── graph.py: Plotly를 이용해 그래프를 인터랙티브하게 시각화하는 함수가 포함되어있습니다.
 ├── motion_from_horizontality.py: 수평 방향으로 던진 물체의 운동을 처리하는 함수가 포함되어있습니다.
 └── motion_from_angle.py: 비스듬히 던진 물체의 운동을 처리하는 함수가 포함되어있습니다.
```

---

<h2>
    🖥️ 주요 코드
</h2>

<h3>
<a href="https://github.com/error0918/MiniProjects/tree/main/Physics2%20Presentation/main.py">
    main.py
</a>
</h3>

```python
# 생략
```

<h3>
    <a href="https://github.com/error0918/MiniProjects/tree/main/Physics2%20Presentation/graph.py">
        graph.py
    </a>
</h3>

```python
def make_graph(
        ...
):
    dff = pandas.DataFrame({
        ...
    })  # 데이터 구조화

    fig = express.line(
        dff,
        x="X",  # X 축 설정
        y="Y",  # Y 축 설정
        hover_data=["X", "Y",
                    "V", "Vx", "Vy",
                    "Potential Energy", "Kinetic Energy", "Mechanical Energy",
                    "Angle", "Time"]  # 마우스 호버 데이터 설정 (마우스를 위에 올릴 시 나타나는 정보)
    )
    fig.update_layout(
        title=dict(
            text=title,
            ...
        )
    )  # 그래프 타이틀 설정
    fig.show()  # 그래프 표시
```

<h3>
    <a href="https://github.com/error0918/MiniProjects/tree/main/Physics2%20Presentation/motion_from_horizontality.py">
        motion_from_horizontality.py
    </a>
</h3>

```python
...
def motion_from_horizontality(
        ...
):
    time = math.sqrt(2 * height / 9.8)  # 운동 완료 시간
    vy_max = 9.8 * time  # 수직 방향 최대 속력
    ...
    print(
        ...
        "수평 이동 거리: " + str(velocity * time) + "m\n"  # 수평 이동 거리
        ...
        "최대 속력: " + str(math.sqrt(vy_max ** 2 + velocity ** 2)) + "m/s\n"  # 최대 속력
        "수평 방향 속력: " + str(velocity) + "m/s\n"  # 수평 방향 속력 (일정)
        ...
    )
    ...
    make_graph(
        ...
        x=time_n * velocity,  # x축 위치
        y=height - 0.5 * 9.8 * (time_n ** 2),  # y축 위치

        v=numpy.sqrt(velocity ** 2 + (time_n * 9.8) ** 2),  # 속력
        vx=numpy.full(200, velocity),  # x축 속력
        vy=time_n * 9.8,  # y축 속력

        potential_energy=9.8 * weight * (height - 0.5 * 9.8 * (time_n ** 2)),  # 위치 에너지
        kinetic_energy=0.5 * weight * (velocity ** 2 + (time_n * 9.8) ** 2),  # 운동 에너지
        mechanical_energy=9.8 * weight * (height - 0.5 * 9.8 * (time_n ** 2)) + 0.5 * weight * (velocity ** 2 + (time_n * 9.8) ** 2),  # 역학적 에너지

        angle=numpy.arctan(time_n * 9.8 / velocity) * 180 / math.pi,  # 운동 각도
        ...
    )
    ...
```

<h3>
    <a href="https://github.com/error0918/MiniProjects/tree/main/Physics2%20Presentation/motion_from_angle.py">
        motion_from_angle.py
    </a>
</h3>

```python
...
def motion_from_angle(
        angle: float, weight: float, velocity: float
):
    radian = angle * math.pi / 180  # 라디안 각도
    vx = velocity * math.cos(radian)  # 수평 방향 최대 속력
    vy = velocity * math.sin(radian)  # 수직 방향 처음 속력
    time = 2 * vy / 9.8  # 운동 완료 시간
    ...
    print(
        ...
        "최고점 도달 시간: " + str(time / 2) + "초\n"  # 최고점 도달 시간
        "수평 이동 거리: " + str(vx * time) + "m\n"  # 수평 이동 거리
        "최고점 높이: " + str(0.5 * 9.8 * (time / 2) ** 2) + "m\n"  # 최고점 높이
        ...
        "역학적 에너지: " + str(0.5 * weight * velocity ** 2) + "J\n"  # 역학적 에너지
    )
    ...
    make_graph(
        ...
        x=time_n * vx,  # x축 위치
        y=time_n * vy - 0.5 * 9.8 * (time_n ** 2),  # y축 위치

        v=numpy.sqrt(vx ** 2 + (vy - 9.8 * time_n) ** 2),  # 속력
        vx=numpy.full(200, vx),  # x축 속력
        vy=vy - 9.8 * time_n,  # y축 속력

        potential_energy=weight * 9.8 * (time_n * vy - 0.5 * 9.8 * (time_n ** 2)),  # 위치 에너지
        kinetic_energy=0.5 * weight * (vx ** 2 + (vy - 9.8 * time_n) ** 2),  # 운동 에너지
        mechanical_energy=weight * 9.8 * (time_n * vy - 0.5 * 9.8 * (time_n ** 2)) + 0.5 * weight * (vx ** 2 + (vy - 9.8 * time_n) ** 2),  # 역학적 에너지

        angle=numpy.arctan((vy - 9.8 * time_n) / vx) * 180 / math.pi,  # 운동 각도
        time=time_n
    )
    ...
```

---

<h2>
    🧐 결과
</h2>

<h3>
    수평 방향으로 던진 물체의 운동
</h3>

<h4>
    출력 결과
</h4>

> Plotly를 이용해 포물선 운동 시각화하기 - 30818 정태연
> 
> 
> 시간, 질량, 거리, 속도, 역학적 에너지, 각도의 단위는 각각 초, kg, m, m/s, J, º입니다.
> 중력 가속도는 9.8m/s^2로 계산됩니다.
> 
> 시각화하실 운동의 번호를 작성하세요.
> 1. 수평 방향으로 던진 물체의 운동 (기본)
> 2. 비스듬히 던진 물체의 운동
> >> 2
> 
> 비스듬히 던진 물체의 운동
> 
> 이제 정보를 입력받겠습니다.
> 
> 물체를 던질 각도를 입력해주세요. (º)
> >> 60
> 물체의 질량을 입력해주세요. (kg)
> >> 10
> 물체의 초기 속력을 입력해주세요. (m/s)
> >> 30
> 
> 다음은 운동 분석 결과입니다.
> 그래프에서 더 자세히 확인할 수 있습니다.
> 
> 운동이 완료되기까지 걸린 시간: 5.302196349700644초
> 최고점 도달 시간: 2.651098174850322초
> 수평 이동 거리: 79.53294524550968m
> 최고점 높이: 34.438775510204074m
> 최소 속력: 15.000000000000004m/s
> 최대 속력: 30.0m/s
> 수평 방향 속력: 15.000000000000004m/s
> 수직 방향 최대 속력: 25.980762113533157m/s
> 역학적 에너지: 4500.0J
> 
> 곧 그래프가 표시됩니다.
> 지금까지 운동의 분석 결과 및 개형이었습니다.

<h4>
    시각화 결과
</h4>

<div align=center>
    <img src="https://raw.githubusercontent.com/error0918/MiniProjects/main/Physics2%20Presentation/image/motion_from_angle.png" alt="비스듬히 던진 물체의 운동"/>
</div>

<h3>
    비스듬히 던진 물체의 운동
</h3>

> Plotly를 이용해 포물선 운동 시각화하기 - 30818 정태연
>
>
> 시간, 질량, 거리, 속도, 역학적 에너지, 각도의 단위는 각각 초, kg, m, m/s, J, º입니다.
> 중력 가속도는 9.8m/s^2로 계산됩니다.
>
> 시각화하실 운동의 번호를 작성하세요.
> 1. 수평 방향으로 던진 물체의 운동 (기본)
> 2. 비스듬히 던진 물체의 운동
> >> 1
>
> 수평 방향으로 던진 물체의 운동
>
> 이제 정보를 입력받겠습니다.
>
> 물체를 운동시킬 높이를 입력해주세요. (m)
> >> 10
> 물체의 질량을 입력해주세요. (kg)
> >> 5
> 물체의 초기 속력을 입력해주세요. (m/s)
> >> 20
>
> 다음은 운동 분석 결과입니다.
> 그래프에서 더 자세히 확인할 수 있습니다.
>
> 운동이 완료되기까지 걸린 시간: 1.4285714285714286초
> 수평 이동 거리: 28.571428571428573m
> 최소 속력: 20.0m/s
> 최대 속력: 24.413111231467404m/s
> 수평 방향 속력: 20.0m/s
> 수직 방향 최대 속력: 14.000000000000002m/s
> 역학적 에너지: 490.0J
>
> 곧 그래프가 표시됩니다.
> 지금까지 운동의 분석 결과 및 개형이었습니다.

<h4>
    시각화 결과
</h4>

<div align=center>
    <img src="https://raw.githubusercontent.com/error0918/MiniProjects/main/Physics2%20Presentation/image/motion_from_horizontality.png" alt="수평으로 던진 물체의 포물선 운동"/>
</div>

<div align=center>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=gradient&customColorList=6&section=footer&desc=Copyright%202023.%20jtaeyeon05%20all%20rights%20reserved" alt="End"/>
</div>
