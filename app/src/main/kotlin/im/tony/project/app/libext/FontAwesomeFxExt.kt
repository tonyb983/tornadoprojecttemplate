@file:Suppress("unused")

package im.tony.project.app.libext

import de.jensd.fx.glyphs.GlyphIcon
import de.jensd.fx.glyphs.GlyphIcons
import de.jensd.fx.glyphs.GlyphsFactory
import de.jensd.fx.glyphs.control.GlyphCheckBox
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView
import de.jensd.fx.glyphs.fontawesome.utils.FontAwesomeIconFactory
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView
import de.jensd.fx.glyphs.materialdesignicons.utils.MaterialDesignIconFactory
import de.jensd.fx.glyphs.materialicons.MaterialIcon
import de.jensd.fx.glyphs.materialicons.MaterialIconView
import de.jensd.fx.glyphs.materialicons.utils.MaterialIconFactory
import de.jensd.fx.glyphs.octicons.OctIcon
import de.jensd.fx.glyphs.octicons.OctIconView
import de.jensd.fx.glyphs.octicons.utils.OctIconFactory
import javafx.event.EventTarget
import javafx.scene.Node
import javafx.scene.paint.Paint
import javafx.scene.text.Text
import tornadofx.attachTo
import kotlin.reflect.KFunction0

sealed class InstanceOrGetter<T> {
  protected abstract fun getInternal(): T
  class Instance<T>(private val instance: T) : InstanceOrGetter<T>() {
    override fun getInternal(): T = instance
  }

  class CachedGetter<T>(getter: () -> T) : InstanceOrGetter<T>() {
    constructor(getter: KFunction0<T>) : this({ getter.invoke() })

    private val instance: T = getter.invoke()
    override fun getInternal(): T = instance
  }

  class LazyGetter<T>(private val getter: () -> T) : InstanceOrGetter<T>() {
    constructor(getter: KFunction0<T>) : this({ getter.invoke() })

    override fun getInternal(): T = getter.invoke()
  }

  fun get() = this.getInternal()

  companion object {
    fun <T> instance(t: T): Instance<T> = Instance(t)
    fun <T> lazyGetter(t: () -> T): LazyGetter<T> = LazyGetter(t)
    fun <T> lazyGetter(t: KFunction0<T>): LazyGetter<T> = LazyGetter(t)
    fun <T> cachedGetter(t: () -> T): CachedGetter<T> = CachedGetter(t)
    fun <T> cachedGetter(t: KFunction0<T>): CachedGetter<T> = CachedGetter(t)

    fun <T> new(t: T): InstanceOrGetter<T> = Instance(t)
    fun <T> new(t: () -> T, lazy: Boolean = true): InstanceOrGetter<T> = if (lazy) LazyGetter(t) else CachedGetter(t)
    fun <T> new(t: KFunction0<T>, lazy: Boolean = true): InstanceOrGetter<T> = if (lazy) LazyGetter(t) else CachedGetter(t)
  }
}

fun <T> T.asInstance(): InstanceOrGetter<T> = InstanceOrGetter.new(this)
fun <T> KFunction0<T>.asGetter(): InstanceOrGetter<T> = InstanceOrGetter.new(this)
fun <T> (() -> T).asGetter(): InstanceOrGetter<T> = InstanceOrGetter.new(this)

inline fun <reified TIcon> TIcon.createViewFor(): GlyphIcon<*>?
  where TIcon : Enum<TIcon>,
        TIcon : GlyphIcons = when (this) {
  is FontAwesomeIcon -> FontAwesomeIconView(this)
  is MaterialIcon -> MaterialIconView(this) // as? GlyphIcon<TIcon>
  is MaterialDesignIcon -> MaterialDesignIconView(this) // as? GlyphIcon<TIcon>
  is OctIcon -> OctIconView(this) // as? GlyphIcon<TIcon>
  else -> null
}

// GLYPH CHECKBOX =========================================
fun EventTarget.glyphCheckbox(
  op: GlyphCheckBox.() -> Unit = {}
) = GlyphCheckBox().attachTo(this, op)

fun <TGlyph1, TGlyph2> EventTarget.glyphCheckbox(
  notSelectedIcon: TGlyph1?,
  selectedIcon: TGlyph2?,
  text: String,
  op: GlyphCheckBox.() -> Unit = {}
) where TGlyph1 : GlyphIcon<*>,
        TGlyph2 : GlyphIcon<*> = GlyphCheckBox(notSelectedIcon, selectedIcon, text).attachTo(this, op)

inline fun <reified TGlyph1, reified TGlyph2> EventTarget.glyphCheckbox(
  notSelectedIcon: TGlyph1?,
  selectedIcon: TGlyph2?,
  text: String,
  op: GlyphCheckBox.() -> Unit = {}
) where TGlyph1 : Enum<TGlyph1>,
        TGlyph1 : GlyphIcons,
        TGlyph2 : Enum<TGlyph2>,
        TGlyph2 : GlyphIcons = GlyphCheckBox(notSelectedIcon?.createViewFor(), selectedIcon?.createViewFor(), text).attachTo(this, op)
// ========================================================

// GENERIC GLYPH FACTORY ==================================
fun <TFactory : GlyphsFactory, TCreated : Node> EventTarget.genericGlyphFactory(
  factory: TFactory,
  use: TFactory.() -> TCreated
) = factory.let(use).attachTo(this)

fun <TFactory : GlyphsFactory, TCreated : Node> EventTarget.genericGlyphFactory(
  factory: TFactory,
  create: TFactory.() -> TCreated,
  modify: TCreated.() -> Unit = {}
) = factory.let(create).attachTo(this, modify)
// ========================================================

// FONT AWESOME FACTORY ===================================
fun <TCreated : Node> EventTarget.fontAwesomeFactory(
  use: FontAwesomeIconFactory.() -> TCreated
) = FontAwesomeIconFactory.get().let(use).attachTo(this)

fun <TCreated : Node> EventTarget.fontAwesomeFactory(
  create: FontAwesomeIconFactory.() -> TCreated,
  modify: TCreated.() -> Unit = {}
) = FontAwesomeIconFactory.get().let(create).attachTo(this, modify)
// ========================================================

// MATERIAL DESIGN ICON FACTORY ===========================
fun <TCreated : Node> EventTarget.materialDesignIconFactory(
  use: MaterialDesignIconFactory.() -> TCreated
) = MaterialDesignIconFactory.get().let(use).attachTo(this)

fun <TCreated : Node> EventTarget.materialDesignIconFactory(
  create: MaterialDesignIconFactory.() -> TCreated,
  modify: TCreated.() -> Unit = {}
) = MaterialDesignIconFactory.get().let(create).attachTo(this, modify)
// ========================================================

// MATERIAL ICON FACTORY ==================================
fun <TCreated : Node> EventTarget.materialIconFactory(
  use: MaterialIconFactory.() -> TCreated
) = MaterialIconFactory.get().let(use).attachTo(this)

fun <TCreated : Node> EventTarget.materialIconFactory(
  create: MaterialIconFactory.() -> TCreated,
  modify: TCreated.() -> Unit = {}
) = MaterialIconFactory.get().let(create).attachTo(this, modify)
// ========================================================

// OCTICON FACTORY ========================================
fun <TCreated : Node> EventTarget.octIconFactory(
  use: OctIconFactory.() -> TCreated
) = OctIconFactory.get().let(use).attachTo(this)

fun <TCreated : Node> EventTarget.octIconFactory(
  create: OctIconFactory.() -> TCreated,
  modify: TCreated.() -> Unit = {}
) = OctIconFactory.get().let(create).attachTo(this, modify)

// FONT AWESOME CONTROLS ==================================
fun <FAIcon> EventTarget.fontAwesomeIconText(
  faIcon: FAIcon,
  size: Int? = null,
  fill: Paint? = null,
  op: Text.() -> Unit = {}
): Text
  where FAIcon : FontAwesomeIcon,
        FAIcon : GlyphIcons =
  fontAwesomeFactory(
    create = { if (size != null) this.createIcon(faIcon, size.toString()) else this.createIcon(faIcon) }
  ) {
    this.attachTo(this, op) {
      if (fill != null) it.fill = fill
    }
  }

fun <FAIcon> EventTarget.fontAwesomeIconView(
  faIcon: FAIcon,
  size: Int? = null,
  fill: Paint? = null,
  op: Text.() -> Unit = {}
)
  where FAIcon : FontAwesomeIcon,
        FAIcon : GlyphIcons =
  (if (size != null) FontAwesomeIconView(faIcon, size.toString()) else FontAwesomeIconView(faIcon)).attachTo(this, op) {
    if (fill != null) it.fill = fill
  }
// ========================================================

// MATERIAL DESIGN ICON CONTROLS ==========================
fun <MDIcon> EventTarget.materialDesignIconText(
  mdIcon: MDIcon,
  size: Int? = null,
  fill: Paint? = null,
  op: Text.() -> Unit = {}
): Text
  where MDIcon : MaterialDesignIcon,
        MDIcon : GlyphIcons = MaterialDesignIconFactory.get().let {
  if (size != null) {
    it.createIcon(mdIcon, size.toString())
  } else {
    it.createIcon(mdIcon)
  }
}.attachTo(this, op) {
  if (fill != null) it.fill = fill
}

fun <MDIcon> EventTarget.materialDesignIconView(
  mdIcon: MDIcon,
  size: Int? = null,
  fill: Paint? = null,
  op: Text.() -> Unit = {}
)
  where MDIcon : MaterialDesignIcon,
        MDIcon : GlyphIcons =
  (if (size != null) MaterialDesignIconView(mdIcon, size.toString()) else MaterialDesignIconView(mdIcon)).attachTo(this, op) {
    if (fill != null) it.fill = fill
  }

// MATERIAL ICON CONTROLS =================================
fun <MDIcon> EventTarget.materialIconText(
  mdIcon: MDIcon,
  size: Int? = null,
  fill: Paint? = null,
  op: Text.() -> Unit = {}
): Text
  where MDIcon : MaterialIcon,
        MDIcon : GlyphIcons = MaterialIconFactory.get().let {
  if (size != null) {
    it.createIcon(mdIcon, size.toString())
  } else {
    it.createIcon(mdIcon)
  }
}.attachTo(this, op) {
  if (fill != null) it.fill = fill
}

fun <MDIcon> EventTarget.materialIconView(
  mdIcon: MDIcon,
  size: Int? = null,
  fill: Paint? = null,
  op: Text.() -> Unit = {}
)
  where MDIcon : MaterialIcon,
        MDIcon : GlyphIcons =
  (if (size != null) MaterialIconView(mdIcon, size.toString()) else MaterialIconView(mdIcon)).attachTo(this, op) {
    if (fill != null) it.fill = fill
  }
// ========================================================

// OCTICON CONTROLS =======================================
fun <TOctIcon> EventTarget.octIconText(
  octIcon: TOctIcon,
  size: Int? = null,
  fill: Paint? = null,
  op: Text.() -> Unit = {}
): Text
  where TOctIcon : OctIcon,
        TOctIcon : GlyphIcons = OctIconFactory.get().let {
  if (size != null) {
    it.createIcon(octIcon, size.toString())
  } else {
    it.createIcon(octIcon)
  }
}.attachTo(this, op) {
  if (fill != null) it.fill = fill
}

fun <TOctIcon> EventTarget.octIconView(
  octIcon: TOctIcon,
  size: Int? = null,
  fill: Paint? = null,
  op: Text.() -> Unit = {}
)
  where TOctIcon : OctIcon,
        TOctIcon : GlyphIcons =
  (if (size != null) OctIconView(octIcon, size.toString()) else OctIconView(octIcon)).attachTo(this, op) {
    if (fill != null) it.fill = fill
  }
// ========================================================
