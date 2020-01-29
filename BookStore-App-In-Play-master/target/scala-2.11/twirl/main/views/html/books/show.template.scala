
package views.html.books

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object show_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class show extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Book,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(book : Book):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),format.raw/*3.1*/("""<html>
    <head>
        <title>"""),_display_(/*5.17*/book/*5.21*/.title),format.raw/*5.27*/("""</title>
    </head>
    <body>

        <h1>All Books</h1>
        <h2>"""),_display_(/*10.14*/book/*10.18*/.title),format.raw/*10.24*/("""</h2>
        <p>Price : """),_display_(/*11.21*/book/*11.25*/.price),format.raw/*11.31*/("""</p>
        <p>Author : """),_display_(/*12.22*/book/*12.26*/.author),format.raw/*12.33*/("""</p>

        <a href=""""),_display_(/*14.19*/routes/*14.25*/.BooksController.edit(book.id)),format.raw/*14.55*/("""">Edit</a>
        <a href=""""),_display_(/*15.19*/routes/*15.25*/.BooksController.destroy(book.id)),format.raw/*15.58*/("""">Delete</a>
    </body>
</html>"""))
      }
    }
  }

  def render(book:Book): play.twirl.api.HtmlFormat.Appendable = apply(book)

  def f:((Book) => play.twirl.api.HtmlFormat.Appendable) = (book) => apply(book)

  def ref: this.type = this

}


}

/**/
object show extends show_Scope0.show
              /*
                  -- GENERATED --
                  DATE: Wed Jan 29 01:20:16 IST 2020
                  SOURCE: F:/PlayFrameworkProjects/BookStore-App-In-Play-master/app/views/books/show.scala.html
                  HASH: 355bdd810d0333f07318bbdb53817088bec36cce
                  MATRIX: 747->1|855->14|883->16|943->50|955->54|981->60|1081->133|1094->137|1121->143|1174->169|1187->173|1214->179|1267->205|1280->209|1308->216|1359->240|1374->246|1425->276|1481->305|1496->311|1550->344
                  LINES: 27->1|32->1|34->3|36->5|36->5|36->5|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|46->15|46->15|46->15
                  -- GENERATED --
              */
          