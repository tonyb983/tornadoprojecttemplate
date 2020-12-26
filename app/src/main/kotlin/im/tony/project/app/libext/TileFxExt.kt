@file:Suppress("unused")

package im.tony.project.app.libext

import eu.hansolo.tilesfx.Tile
import eu.hansolo.tilesfx.TileBuilder
import eu.hansolo.tilesfx.TimeSectionBuilder
import eu.hansolo.tilesfx.chart.ChartData
import eu.hansolo.tilesfx.chart.TilesFXSeries
import eu.hansolo.tilesfx.skins.BarChartItem
import eu.hansolo.tilesfx.skins.LeaderBoardItem
import eu.hansolo.tilesfx.tools.Helper
import javafx.event.EventTarget
import javafx.geometry.Pos
import javafx.scene.chart.XYChart
import javafx.scene.layout.StackPane
import javafx.scene.paint.Color
import javafx.scene.paint.CycleMethod
import javafx.scene.paint.LinearGradient
import javafx.scene.paint.Stop
import tornadofx.attachTo
import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*
import kotlin.random.Random
import eu.hansolo.tilesfx.Tile.SkinType as TileSkin

private val RND: Random by lazy { Random(LocalDateTime.now().nano) }
private const val TILE_WIDTH = 150.0
private const val TILE_HEIGHT = 150.0
private const val noOfNodes = 0

fun EventTarget.tileBuilder(
  skinType: TileSkin,
  beforeBuild: TileBuilder<*>.() -> Unit = {},
  beforeAttach: (Tile) -> Unit = {},
  afterAttach: Tile.() -> Unit = {},
): Tile = TileBuilder
  .create()
  .skinType(skinType)
  .apply(beforeBuild)
  .build()
  .attachTo(this, afterAttach, beforeAttach)

interface DefaultTiles {
  fun percentageTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun clockTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun gaugeTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun sparkLineTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun areaChartTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun lineChartTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun highLowTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun timerControlTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun numberTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun textTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun plusMinusTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun sliderTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun switchTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun worldTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun timeTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun barChartTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun customTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun leaderBoardTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun mapTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun radialChartTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun donutChartTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun circularProgressTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun stockTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun gaugeSparkLineTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun radarChartTile1(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun radarChartTile2(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun smoothAreaChartTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun countryTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun characterTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun flipTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun switchSliderTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun dateTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun calendarTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun sunburstTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun matrixTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun radialPercentageTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun statusTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun barGaugeTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun imageTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun timelineTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun imageCounterTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun ledTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun countdownTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun matrixIconTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun cycleStepTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun customFlagChartTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun colorTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun turnoverTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun fluidTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun fireSmokeTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun gauge2Tile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun happinessTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

  fun radialDistributionTile(
    beforeBuild: TileBuilder<*>.() -> Unit = {},
    beforeAttach: (Tile) -> Unit = {},
    afterAttach: Tile.() -> Unit = {},
  ): Tile

}

fun EventTarget.defaultTiles() = object : DefaultTiles {
  // AreaChart Data
  val series1 = XYChart.Series<String, Number>().apply {
    this.name = "Whatever"
    this.data.add(XYChart.Data("MO", 23))
    this.data.add(XYChart.Data("TU", 21))
    this.data.add(XYChart.Data("WE", 20))
    this.data.add(XYChart.Data("TH", 22))
    this.data.add(XYChart.Data("FR", 24))
    this.data.add(XYChart.Data("SA", 22))
    this.data.add(XYChart.Data("SU", 20))
  }

  // LineChart Data
  val series2 = XYChart.Series<String, Number>().apply {
    this.name = "Inside"
    this.data.add(XYChart.Data("MO", 8))
    this.data.add(XYChart.Data("TU", 5))
    this.data.add(XYChart.Data("WE", 0))
    this.data.add(XYChart.Data("TH", 2))
    this.data.add(XYChart.Data("FR", 4))
    this.data.add(XYChart.Data("SA", 3))
    this.data.add(XYChart.Data("SU", 5))
  }


  val series3 = XYChart.Series<String, Number>().apply {
    this.name = "Outside"
    this.data.add(XYChart.Data("MO", 8))
    this.data.add(XYChart.Data("TU", 5))
    this.data.add(XYChart.Data("WE", 0))
    this.data.add(XYChart.Data("TH", 2))
    this.data.add(XYChart.Data("FR", 4))
    this.data.add(XYChart.Data("SA", 3))
    this.data.add(XYChart.Data("SU", 5))
  }

  // TimeControl Data
  val timeSection = TimeSectionBuilder.create()
    .apply {
      this.start(LocalTime.now().plusSeconds(20))
      this.stop(LocalTime.now().plusHours(1))
      this.color(Tile.GRAY)
      this.highlightColor(Tile.RED)
    }.build()
    .also {
      it.setOnTimeSectionEntered { _ -> println("Section ACTIVE") }
      it.setOnTimeSectionLeft { _ -> println("Section ACTIVE") }
    }

  // BarChart Items
  val barChartItem1 = BarChartItem("Gerrit", 47.0, Tile.BLUE).apply { this.formatString = "%.1f kWh" }
  val barChartItem2 = BarChartItem("Sandra", 43.0, Tile.RED)
  val barChartItem3 = BarChartItem("Lilli", 12.0, Tile.GREEN)
  val barChartItem4 = BarChartItem("Anton", 8.0, Tile.ORANGE)

  // LeaderBoard Items
  val leaderBoardItem1 = LeaderBoardItem("Gerrit", 47.0)
  val leaderBoardItem2 = LeaderBoardItem("Sandra", 43.0)
  val leaderBoardItem3 = LeaderBoardItem("Lilli", 12.0)
  val leaderBoardItem4 = LeaderBoardItem("Anton", 8.0)

  // Chart Data
  val chartData1 = ChartData("Item 1", 24.0, Tile.GREEN)
  val chartData2 = ChartData("Item 2", 10.0, Tile.BLUE)
  val chartData3 = ChartData("Item 3", 12.0, Tile.RED)
  val chartData4 = ChartData("Item 4", 13.0, Tile.YELLOW_ORANGE)
  val chartData5 = ChartData("Item 5", 13.0, Tile.BLUE)
  val chartData6 = ChartData("Item 6", 13.0, Tile.BLUE)
  val chartData7 = ChartData("Item 7", 13.0, Tile.BLUE)
  val chartData8 = ChartData("Item 8", 13.0, Tile.BLUE)

  val smoothChartData1 = ChartData("Item 1", RND.nextDouble() * 25, Tile.BLUE)
  val smoothChartData2 = ChartData("Item 2", RND.nextDouble() * 25, Tile.BLUE)
  val smoothChartData3 = ChartData("Item 3", RND.nextDouble() * 25, Tile.BLUE)
  val smoothChartData4 = ChartData("Item 4", RND.nextDouble() * 25, Tile.BLUE)

  override fun percentageTile(
    beforeBuild: TileBuilder<*>.() -> Unit,
    beforeAttach: (Tile) -> Unit,
    afterAttach: Tile.() -> Unit
  ) = TileBuilder.create()
    .skinType(TileSkin.PERCENTAGE)
    .prefSize(TILE_WIDTH, TILE_HEIGHT)
    .title("Percentage Tile")
    .unit(Helper.PERCENTAGE)
    .description("Test")
    .maxValue(60.0)
    .apply(beforeBuild)
    .build()
    .attachTo(this@defaultTiles, afterAttach, beforeAttach)

  override fun clockTile(
    beforeBuild: TileBuilder<*>.() -> Unit,
    beforeAttach: (Tile) -> Unit,
    afterAttach: Tile.() -> Unit
  ): Tile = TileBuilder.create()
    .skinType(TileSkin.CLOCK)
    .prefSize(TILE_WIDTH, TILE_HEIGHT)
    .title("Clock Tile")
    .text("Whatever text")
    .dateVisible(true)
    .locale(Locale.US)
    .running(true)
    .apply(beforeBuild)
    .build()
    .attachTo(this@defaultTiles, afterAttach, beforeAttach)

  override fun gaugeTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile =
    TileBuilder.create()
      .skinType(TileSkin.GAUGE)
      .prefSize(TILE_WIDTH, TILE_HEIGHT)
      .title("Gauge Tile")
      .unit("V")
      .threshold(75.0)
      .apply(beforeBuild)
      .build()
      .attachTo(this@defaultTiles, afterAttach, beforeAttach)

  override fun sparkLineTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile =
    TileBuilder.create()
      .skinType(TileSkin.SPARK_LINE)
      .prefSize(TILE_WIDTH, TILE_HEIGHT)
      .title("SparkLine Tile")
      .unit("mb")
      .gradientStops(
        Stop(0.0, Tile.GREEN),
        Stop(0.5, Tile.YELLOW),
        Stop(1.0, Tile.RED)
      )
      .strokeWithGradient(true)
      //.smoothing(true)
      .apply(beforeBuild)
      .build()
      .attachTo(this@defaultTiles, afterAttach, beforeAttach)

  override fun areaChartTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile =
    TileBuilder.create()
      .skinType(TileSkin.SMOOTHED_CHART)
      .prefSize(TILE_WIDTH, TILE_HEIGHT)
      .title("SmoothedChart Tile")
      .chartType(Tile.ChartType.AREA)
      //.animated(true)
      .smoothing(true)
      .tooltipTimeout(1000.0)
      .tilesFxSeries(
        TilesFXSeries(
          series1,
          Tile.BLUE,
          LinearGradient(
            0.0, 0.0, 0.0, 1.0,
            true, CycleMethod.NO_CYCLE,
            Stop(0.0, Tile.BLUE),
            Stop(1.0, Color.TRANSPARENT)
          )
        )
      )
      .apply(beforeBuild)
      .build()
      .attachTo(this@defaultTiles, afterAttach, beforeAttach)

  override fun lineChartTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile =
    TileBuilder.create()
      .skinType(TileSkin.SMOOTHED_CHART)
      .prefSize(TILE_WIDTH, TILE_HEIGHT)
      .title("SmoothedChart Tile")
      //.animated(true)
      .smoothing(false)
      .series(series2, series3)
      .apply(beforeBuild)
      .build()
      .attachTo(this@defaultTiles, afterAttach, beforeAttach)

  override fun highLowTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile =
    TileBuilder.create()
      .skinType(TileSkin.HIGH_LOW)
      .prefSize(TILE_WIDTH, TILE_HEIGHT)
      .title("HighLow Tile")
      .unit("\u20AC")
      .description("Test")
      .text("Whatever text")
      .referenceValue(6.7)
      .value(8.2)
      .apply(beforeBuild)
      .build()
      .attachTo(this@defaultTiles, afterAttach, beforeAttach)

  override fun timerControlTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile =
    TileBuilder.create()
      .skinType(TileSkin.TIMER_CONTROL)
      .prefSize(TILE_WIDTH, TILE_HEIGHT)
      .title("TimerControl Tile")
      .text("Whatever text")
      .secondsVisible(true)
      .dateVisible(true)
      .timeSections(timeSection)
      .running(true)
      .apply(beforeBuild)
      .build()
      .attachTo(this@defaultTiles, afterAttach, beforeAttach)

  override fun numberTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile =
    TileBuilder.create()
      .skinType(TileSkin.NUMBER)
      .prefSize(TILE_WIDTH, TILE_HEIGHT)
      .title("Number Tile")
      .text("Whatever text")
      .value(13.0)
      .unit("mb")
      .description("Test")
      .textVisible(true)
      .apply(beforeBuild)
      .build()
      .attachTo(this@defaultTiles, afterAttach, beforeAttach)

  override fun textTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile =
    TileBuilder.create()
      .skinType(TileSkin.TEXT)
      .prefSize(TILE_WIDTH, TILE_HEIGHT)
      .title("Text Tile")
      .text("Whatever text")
      .description("May the force be with you\n...always")
      .descriptionAlignment(Pos.TOP_LEFT)
      .textVisible(true)
      .apply(beforeBuild)
      .build()
      .attachTo(this@defaultTiles, afterAttach, beforeAttach)

  override fun plusMinusTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile =
    TileBuilder.create()
      .skinType(TileSkin.PLUS_MINUS)
      .prefSize(TILE_WIDTH, TILE_HEIGHT)
      .maxValue(30.0)
      .minValue(0.0)
      .title("PlusMinus Tile")
      .text("Whatever text")
      .description("Test")
      .unit("\u00B0C")
      .apply(beforeBuild)
      .build()
      .attachTo(this@defaultTiles, afterAttach, beforeAttach)

  override fun sliderTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile =
    TileBuilder.create()
      .skinType(TileSkin.SLIDER)
      .prefSize(TILE_WIDTH, TILE_HEIGHT)
      .title("Slider Tile")
      .text("Whatever text")
      .description("Test")
      .unit("\u00B0C")
      .barBackgroundColor(Tile.FOREGROUND)
      .apply(beforeBuild)
      .build()
      .attachTo(this@defaultTiles, afterAttach, beforeAttach)

  override fun switchTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun worldTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun timeTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun barChartTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun customTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun leaderBoardTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun mapTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun radialChartTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun donutChartTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun circularProgressTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun stockTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun gaugeSparkLineTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun radarChartTile1(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun radarChartTile2(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun smoothAreaChartTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun countryTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun characterTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun flipTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun switchSliderTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun dateTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun calendarTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun sunburstTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun matrixTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun radialPercentageTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun statusTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun barGaugeTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun imageTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun timelineTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun imageCounterTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun ledTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun countdownTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun matrixIconTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun cycleStepTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun customFlagChartTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun colorTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun turnoverTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun fluidTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun fireSmokeTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun gauge2Tile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun happinessTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }

  override fun radialDistributionTile(beforeBuild: TileBuilder<*>.() -> Unit, beforeAttach: (Tile) -> Unit, afterAttach: Tile.() -> Unit): Tile {
    TODO("Not yet implemented")
  }
}

fun tester() {
  StackPane().apply {
    defaultTiles().percentageTile()
  }
}
