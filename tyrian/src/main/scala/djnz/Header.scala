package djnz

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import tyrian.*
import tyrian.Html.cls
import tyrian.Html.div
import tyrian.Html.img
import tyrian.Html.src

object Header {

  @js.native
  @JSImport("url:../../static/img/fiery-lava-128x128.png", JSImport.Namespace)
  val imageUrl: String = js.native

  def view: Html[Nothing] = div(cls := "p-1")(
    img(
      src := imageUrl
    )
  )

}
