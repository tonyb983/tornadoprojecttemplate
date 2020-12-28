@file:Suppress("unused")

package im.tony.project.app.utility.timing

import javafx.animation.AnimationTimer
import javafx.beans.property.DoubleProperty
import javafx.beans.property.SimpleDoubleProperty
import tornadofx.booleanProperty

/**
 * Shamelessly stolen from the awesome website [EdenCoding](https://edencoding.com/).
 *
 * @author Ed Eden-Rump
 * @created 27/07/2020 - 07:34
 * @project EdenCoding JavaFX Animation
 */
abstract class PausableAnimationTimer : AnimationTimer() {
  var pauseStart: Long = 0
  var animationStart: Long = 0

  var isPaused = false
  var isPausedProperty = booleanProperty(false)

  var isActive = false
  var isActiveProperty = booleanProperty(false)

  protected var pauseScheduled = false
  protected var playScheduled = false
  protected var restartScheduled = false

  var animationDuration: DoubleProperty = SimpleDoubleProperty(0.0)
  val animationDurationProperty: DoubleProperty
    get() = animationDuration

  fun pause() {
    if (!isPaused) {
      pauseScheduled = true
    }
  }

  fun play() {
    if (isPaused) {
      playScheduled = true
    }
  }

  override fun start() {
    super.start()
    isActive = true
    restartScheduled = true
  }

  override fun stop() {
    super.stop()
    pauseStart = 0
    isPaused = false
    isActive = false
    pauseScheduled = false
    playScheduled = false
    animationDuration.set(0.0)
  }

  override fun handle(now: Long) {
    if (pauseScheduled) {
      pauseStart = now
      isPaused = true
      pauseScheduled = false
    }

    if (playScheduled) {
      animationStart += now - pauseStart
      isPaused = false
      playScheduled = false
    }

    if (restartScheduled) {
      isPaused = false
      animationStart = now
      restartScheduled = false
    }

    if (!isPaused) {
      val animDuration = now - animationStart
      animationDuration.set(animDuration / 1e9)
      tick(animDuration)
    }
  }

  abstract fun tick(relativeNow: Long)
}
