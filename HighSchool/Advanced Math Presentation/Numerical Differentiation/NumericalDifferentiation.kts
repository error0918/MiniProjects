import kotlin.math.sin
import kotlin.math.pow
import kotlin.math.ln


fun derivative(
    f: (x: Double) -> Double,
    x: Double,
    h: Double
) = (f(x + h) - f(x)) / h


println("x³ + 3x²의 도함수에 2을 넣은 값 (실제 값: 24)")
println(
    derivative(
        f = { x: Double -> x.pow(3) + 3 * x.pow(2) },
        x = 2.0,
        h = 1e-10
    )
)
println()

println("sin x의 도함수에 0을 넣은 값 (실제 값: 1)")
println(
    derivative(
        f = { x: Double -> sin(x) },
        x = 0.0,
        h = 1e-10
    )
)
println()

println("x³ + 3x² - ln x의 이계도 함수에 6을 넣은 값 (실제 값: 42.02777..)")
print(
    derivative(
        f = { x1: Double ->
            derivative(
                f = { x2: Double -> x2.pow(3) + 3 * x2.pow(2) - ln(x2) },
                x = x1,
                h = 1e-5
            )
        },
        x = 6.0,
        h = 1e-5
    )
)
