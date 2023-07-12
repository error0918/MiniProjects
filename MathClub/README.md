<div align=center>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=280&fontSize=70&fontAlignY=45&color=gradient&customColorList=4&section=header&text=메쓰터리%20독서%20탐구" alt="Start"/>
</div>

<div align=right>
    <h6>
        by 동산고등학교 30818 정태연<br/>
        (jtaeyeon05)<br/>  
        (2023/07/13)
    </h6>
</div>

<details>
    <summary>목차</summary>
    <h6>
        <ul dir="auto">
            <a href="https://github.com/error0918/MiniProjects/tree/main/MathClub#-----%EC%86%8C%EA%B0%9C">
                <li>
                    📜 소개
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/MathClub#-----sympy">
                <li>
                    👀 SymPy
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/MathClub#----%EF%B8%8F-%EA%B5%AC%EC%A1%B0%EB%8F%84">
                <li>
                    📱️ 구조도
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/MathClub#----%EF%B8%8F-mysymbol">
                <li>
                    🖥️ mySymbol
                </li>
            </a>
            <a href="https://github.com/error0918/MiniProjects/tree/main/MathClub#----%EF%B8%8F-mysolve">
                <li>
                    🖥️ mySolve
                </li>
            </a>
        </ul>
    </h6>
</details>

---

<h2>
    📜 소개
</h2>

동산고등학교 매쓰터리 동아리 독서 탐구 활동 코드입니다. <파이썬으로 풀어보는 수학 (아미트 사하)>을 읽고 SymPy를 이용해 코드를 작성했습니다.

---

<h2>
    👀 SymPy
</h2>

SymPy는 파이썬의 오픈 소스 수학 라이브러리로 심볼릭 연산이 지원됩니다. SymPy는 그 이름 자체가 Symbolic Python의 줄임말에 온 것철섬 심볼릭 연산은 SymPy의 강력한 기능입니다.

SymPy는 다양한 수학 기능을 지원합니다. 미분, 적분, 인수분해, 방정식의 해 구하기, 방정식 시각화하기 등 다양하고 강력한 내장 기능들을 가지고 있습니다.

SymPy는 오픈 소스라는 특징 덕분에 galgebra, PyDy, PyTorch TorchInductor, yt 등 다양한 프로그램에서 사용되고 있습니다.

---

<h2>
    📱️ 구조도
</h2>

```
MathClub
 ├── mySymbol.py: 손실 함수, 추세선 구하기 함수, Main 함수가 들어가있습니다.
 └── mySolve.py: 구글 트렌즈 코틀린 검색량에 대한 데이터가 들어있습니다.
```

---

<h2>
    🖥️ mySymbol
</h2>

SymPy의 심볼릭 연산과 미적분에 대한 코드입니다. 코드 내에 설명과 실행 결과가 주석으로 나와있습니다.

---

<h2>
    🖥️ mySolve
</h2>

<h3>
    주요 코드
</h3>

```python
plot(f, (x, a, b))  # 그래프 개형 출력

F = sqrt(1 + f.diff(x) ** 2).integrate(x)  # 그래프 길이 공식을 이용해 그래프 길이 함수 구하기

F.subs({x: b}).evalf() - F.subs({x: a}).evalf())  # 그래프의 길이 계산하기
```

<h3>
    결과
</h3>

```
방정식의 그래프의 길이 구하기 - 30818 정태연


사용할 변수 명을 입력하세요. 
 >> x
그래프의 길이를 구할 방정식을 입력하세요. 
 >> 2/3 * x ** 1.5
a에서 b까지의 그래프의 길이를 구합니다.
a와 b를 입력해주세요. (a,b)
 >> 0,3


                              [그래프의 개형]                              
    3.5 |                                                      /
        |                                                    .. 
        |                                                  ..   
        |                                                ..     
        |                                              ..       
        |                                            ..         
        |                                          ..           
        |                                        ..             
        |                                      ..               
        |                                    ..                 
   1.75 |----------------------------------..-------------------
        |                               ...                     
        |                             ..                        
        |                          ...                          
        |                       ...                             
        |                     ..                                
        |                  ...                                  
        |              ....                                     
        |          ....                                         
        |     .....                                             
      0 |_______________________________________________________
         0                          1.5                        3


길이 함수 F(x) = 0.666666666666667*(1.0*x**1.0 + 1)**(3/2)


2*x**1.5/3의 x=0.0부터 x=3.0까지의 길이 = 4.66666666666667
```

<div align=center>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=gradient&customColorList=4&section=footer&desc=Copyright%202023.%20jtaeyeon05%20all%20rights%20reserved" alt="End"/>
</div>