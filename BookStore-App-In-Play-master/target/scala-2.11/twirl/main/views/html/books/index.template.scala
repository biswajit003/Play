
package views.html.books

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Set[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books : Set[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*3.1*/("""<html>
    <head>
        <title>All Books</title>
    </head>
    <body>

        <h1>All Books</h1>
        """),_display_(/*10.10*/for(book <- books) yield /*10.28*/{_display_(Seq[Any](format.raw/*10.29*/("""
            """),format.raw/*11.13*/("""<a href=""""),_display_(/*11.23*/routes/*11.29*/.BooksController.show(book.id)),format.raw/*11.59*/("""">"""),_display_(/*11.62*/book/*11.66*/.title),format.raw/*11.72*/("""</a>
            <p>Price : """),_display_(/*12.25*/book/*12.29*/.price),format.raw/*12.35*/("""</p>
            <p>Author : """),_display_(/*13.26*/book/*13.30*/.author),format.raw/*13.37*/("""</p>
        """)))}),format.raw/*14.10*/("""
            """),format.raw/*15.13*/("""<a href=""""),_display_(/*15.23*/routes/*15.29*/.BooksController.create()),format.raw/*15.54*/("""">Create Book</a>
    </body>
</html"""))
      }
    }
  }

  def render(books:Set[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((Set[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Jan 29 01:20:16 IST 2020
                  SOURCE: F:/PlayFrameworkProjects/BookStore-App-In-Play-master/app/views/books/index.scala.html
                  HASH: 79783ad29871239e231975d9794673a6c2fb0889
                  MATRIX: 754->1|868->20|896->22|1034->133|1068->151|1107->152|1148->165|1185->175|1200->181|1251->211|1281->214|1294->218|1321->224|1377->253|1390->257|1417->263|1474->293|1487->297|1515->304|1560->318|1601->331|1638->341|1653->347|1699->372
                  LINES: 27->1|32->1|34->3|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|46->15
                  -- GENERATED --
              */
          