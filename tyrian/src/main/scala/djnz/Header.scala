package djnz

import tyrian.*
import tyrian.Html.cls
import tyrian.Html.div

object Header {

  def view: Html[Nothing] = div(cls := "p-1")(
    div(cls := "space-y-4")("header1"),
  )

}
