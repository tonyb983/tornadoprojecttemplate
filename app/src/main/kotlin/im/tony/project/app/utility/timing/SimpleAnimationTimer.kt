package im.tony.project.app.utility.timing

import javafx.animation.AnimationTimer
import javafx.beans.property.IntegerProperty
import javafx.beans.property.SimpleIntegerProperty
import kotlin.math.roundToInt


/**
 * @author Ed Eden-Rump
 * @created 25/07/2020 - 18:06
 * @project EdenCoding Animation
 */
abstract class SimpleAnimationTimer : AnimationTimer() {
  var lastFrameTime = -1L
  var deltaTimeNano: Long = 0
  var frameRate: IntegerProperty = SimpleIntegerProperty(0)
  fun getFrameRate(): Int = frameRate.get()

  val frameRateProperty: IntegerProperty
    get() = frameRate

  override fun handle(currentTimeNano: Long) {
    updateFrameTime(currentTimeNano)
    updateFrameRate()
    tick()
  }

  protected fun updateFrameTime(currentTimeNano: Long) {
    deltaTimeNano = currentTimeNano - lastFrameTime
    lastFrameTime = currentTimeNano
  }

  protected fun updateFrameRate() = frameRate.set(frameRateHertz.roundToInt())

  abstract fun tick()
  val frameRateHertz: Double
    get() {
      val frameRate = 1.0 / deltaTimeNano
      return frameRate * 1e9
    }
}
