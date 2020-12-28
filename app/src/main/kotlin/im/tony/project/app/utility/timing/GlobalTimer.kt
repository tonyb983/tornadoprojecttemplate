package im.tony.project.app.utility.timing

interface IGlobalTimer {
  interface Listener {
    fun tick(delta: Long)
  }

  fun addListener(listener: Listener?): Boolean
  fun removeListener(listener: Listener?): Boolean
  val isRunning: Boolean
}

private object GlobalTimerImpl : IGlobalTimer {
  private class TimerImpl : PausableAnimationTimer() {
    private val danger: Long = (Long.MAX_VALUE * 0.8).toLong()
    var ticks = 0L
    override fun tick(relativeNow: Long) {
      ticks += 1
      if (ticks >= danger) ticks = 0
      removeNulls()
      if (listeners.isEmpty()) {
        pause(); return
      }

      listeners.forEach { it?.tick(relativeNow) }
    }
  }

  private val animTimer: TimerImpl = TimerImpl().apply { pause() }
  private var listeners: MutableSet<IGlobalTimer.Listener?> = mutableSetOf()

  private fun removeNulls() = listeners.removeIf { it == null }
  private fun checkState() = if (listeners.isEmpty()) animTimer.pause() else animTimer.start()

  override val isRunning: Boolean get() = !animTimer.isPaused

  override fun addListener(listener: IGlobalTimer.Listener?): Boolean {
    if (listener == null) {
      return false
    }

    val wasEmpty = listeners.isEmpty()
    val result = listeners.add(listener)
    removeNulls()

    if (wasEmpty && listeners.isNotEmpty()) {
      animTimer.start()
    }

    return result
  }

  override fun removeListener(listener: IGlobalTimer.Listener?): Boolean {
    if (listener == null) {
      val before = listeners.size
      removeNulls()
      if (listeners.isEmpty()) {
        animTimer.pause()
      }
      return listeners.size == before
    }

    val result = listeners.remove(listener)
    if (listeners.isEmpty()) {
      animTimer.pause()
    }

    return result
  }
}

val GlobalTimer: IGlobalTimer = GlobalTimerImpl
