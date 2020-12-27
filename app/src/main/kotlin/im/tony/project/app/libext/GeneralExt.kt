package im.tony.project.app.libext

import javafx.animation.Animation
import javafx.scene.Node
import tornadofx.onLeftClick
import tornadofx.seconds

fun Animation.skipOnClick(owner: Node) {
  fun skip() {
    this.delay = 0.seconds
    this.jumpTo("end")
    owner.onLeftClick { }
  }
  owner.onLeftClick { skip() }
}
