package im.tony.project.app

import javafx.scene.text.Font
import org.controlsfx.glyphfont.FontAwesome
import org.controlsfx.glyphfont.GlyphFont
import org.controlsfx.glyphfont.GlyphFontRegistry


object FontHelpers {
  val faRegular14Font = Font.loadFont(AppResources.Fonts.FA_Regular.urlString, 14.0)
  val faRegular14GlyphFont = run {
    FontAwesome.Glyph.CLOSE
    GlyphFontRegistry.register(GlyphFont("FA Regular", 14, AppResources.Fonts.FA_Regular.urlString))
    GlyphFontRegistry.font("FA Regular")
  }
}
