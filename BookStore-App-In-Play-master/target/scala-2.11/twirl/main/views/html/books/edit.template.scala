
package views.html.books

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edit_Scope0 {
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

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookFrom : Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <title>Edit Book</title>
    </head>
    <body>

        <h1>Edit Book</h1>
            """),format.raw/*10.70*/("""
            """),_display_(/*11.14*/helper/*11.20*/.form(action = routes.BooksController.update())/*11.67*/{_display_(Seq[Any](format.raw/*11.68*/("""
                """),_display_(/*12.18*/helper/*12.24*/.inputText(bookFrom("id"))),format.raw/*12.50*/("""
                """),_display_(/*13.18*/helper/*13.24*/.inputText(bookFrom("title"))),format.raw/*13.53*/("""
                """),_display_(/*14.18*/helper/*14.24*/.inputText(bookFrom("price"))),format.raw/*14.53*/("""
                """),_display_(/*15.18*/helper/*15.24*/.inputText(bookFrom("author"))),format.raw/*15.54*/("""

                """),format.raw/*17.17*/("""<input type="submit" value="Edit Book">

                """)))}),format.raw/*19.18*/("""
    """),format.raw/*20.5*/("""</body>
</html>

"""))
      }
    }
  }

  def render(bookFrom:Form[Book]): play.twirl.api.HtmlFormat.Appendable = apply(bookFrom)

  def f:((Form[Book]) => play.twirl.api.HtmlFormat.Appendable) = (bookFrom) => apply(bookFrom)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Wed Jan 29 01:45:21 IST 2020
                  SOURCE: F:/PlayFrameworkProjects/BookStore-App-In-Play-master/app/views/books/edit.scala.html
                  HASH: baa590bb4ae8ac92fb32796fa7cb069ba60741ed
                  MATRIX: 753->1|886->24|913->42|1055->213|1096->227|1111->233|1167->280|1206->281|1251->299|1266->305|1313->331|1358->349|1373->355|1423->384|1468->402|1483->408|1533->437|1578->455|1593->461|1644->491|1690->509|1779->567|1811->572
                  LINES: 27->1|32->1|33->3|40->10|41->11|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|47->17|49->19|50->20
                  -- GENERATED --
              */
          