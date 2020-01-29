
package views.html.books

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object create_Scope0 {
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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookFrom : Form[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.25*/("""
"""),format.raw/*2.93*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<html>
    <head>
        <title>Create Book</title>
    </head>
    <body>

        <h1>Create Book</h1>
        """),format.raw/*12.66*/("""
        """),_display_(/*13.10*/helper/*13.16*/.form(action = routes.BooksController.save())/*13.61*/{_display_(Seq[Any](format.raw/*13.62*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(bookFrom("id"))),format.raw/*14.46*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(bookFrom("title"))),format.raw/*15.49*/("""
            """),_display_(/*16.14*/helper/*16.20*/.inputText(bookFrom("price"))),format.raw/*16.49*/("""
            """),_display_(/*17.14*/helper/*17.20*/.inputText(bookFrom("author"))),format.raw/*17.50*/("""

            """),format.raw/*19.13*/("""<input type="submit" value="Create Book">

            """)))}),format.raw/*21.14*/("""
    """),format.raw/*22.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(bookFrom:Form[Book]): play.twirl.api.HtmlFormat.Appendable = apply(bookFrom)

  def f:((Form[Book]) => play.twirl.api.HtmlFormat.Appendable) = (bookFrom) => apply(bookFrom)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Wed Jan 29 01:20:16 IST 2020
                  SOURCE: F:/PlayFrameworkProjects/BookStore-App-In-Play-master/app/views/books/create.scala.html
                  HASH: d9faf459bfd5d542ece2661c560096a509966ea0
                  MATRIX: 757->1|890->24|918->117|945->135|972->136|1114->307|1151->317|1166->323|1220->368|1259->369|1300->383|1315->389|1362->415|1403->429|1418->435|1468->464|1509->478|1524->484|1574->513|1615->527|1630->533|1681->563|1723->577|1810->633|1842->638
                  LINES: 27->1|32->1|33->2|34->4|35->5|42->12|43->13|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|49->19|51->21|52->22
                  -- GENERATED --
              */
          