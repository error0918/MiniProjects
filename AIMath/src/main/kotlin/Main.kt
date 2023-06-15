import org.knowm.xchart.SwingWrapper
import org.knowm.xchart.XYChartBuilder
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle
import org.knowm.xchart.style.Styler
import org.knowm.xchart.style.markers.SeriesMarkers
import java.lang.Exception
import kotlin.math.pow


fun main() {
    // 데이터 불러오기
    val dataMap = listToMap(
            intListToDoubleList(dateIndexList),
            intListToDoubleList(searchVolumeList)
    )

    // 추세선 기울기 및 추세선 함수 구하기
    val trendInclination = getTrendInclination(data = dataMap)
    val trendFunction = { x: Double -> x * trendInclination }

    // 출력
    println()
    println("코틀린 검색량을 코틀린을 이용해 추세선 계산 및 시각화하기")
    println("인공지능 수학 수행평가 - 30818 정태연")
    println()
    println("최적 추세 함수 기울기: $trendInclination")
    print("손실: ${getLoss(data = dataMap, trendFunction = trendFunction)}")

    // 손실 함수 차트
    val (x, y) = List(200) { it / 100.0 } to List(200) { i -> getLoss(dataMap) { x -> x * i / 100 } }
    val lossChart = XYChartBuilder().apply {
        title("손실 함수")
        xAxisTitle("기울기")
        theme(Styler.ChartTheme.Matlab)
    }.build()
    lossChart.styler.isLegendVisible = false
    lossChart.addSeries("Loss", x, y).apply { marker = SeriesMarkers.NONE }

    // 검색량 산점도 및 추세선 차트
    val searchVolumeChart = XYChartBuilder().apply {
        title("검색량 (2017.01 ~ 2023.06)")
        xAxisTitle("기준 날짜")
        yAxisTitle("검색량 (상대량)")
        theme(Styler.ChartTheme.Matlab)
    }.build()
    searchVolumeChart.styler.apply {
        legendPosition = Styler.LegendPosition.InsideNW
        defaultSeriesRenderStyle = XYSeriesRenderStyle.Scatter
        setxAxisTickLabelsFormattingFunction { try { dateList[it.toInt()] } catch(_: Exception) { "" } }
    }
    searchVolumeChart.addSeries("산점도", dataMap.keys.toList(), dataMap.values.toList())
    searchVolumeChart.addSeries("추세선", List(66 * 5) { it / 5.0 }, List(66 * 5) { it / 5.0 })

    // 차트 표시
    val display = SwingWrapper(arrayListOf(lossChart, searchVolumeChart))
    display.setTitle("코틀린 구글 검색량 분석 - 30818 정태연")
    display.displayChartMatrix()
}


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
