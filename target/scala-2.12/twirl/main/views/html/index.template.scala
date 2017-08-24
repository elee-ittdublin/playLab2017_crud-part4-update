
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Home")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-12">
        <div class="well">
          <h4>"""),_display_(/*9.16*/message),format.raw/*9.23*/(""" """),format.raw/*9.24*/("""- """),_display_(/*9.27*/name),format.raw/*9.31*/("""</h4>
        </div>
      </div>
  </div>
  <!-- End of content for main -->
""")))}),format.raw/*14.2*/("""

"""))
      }
    }
  }

  def render(message:String,name:String): play.twirl.api.HtmlFormat.Appendable = apply(message,name)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,name) => apply(message,name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 15:59:27 IST 2017
                  SOURCE: /home/wdd/webapps/playapps/playLab2017_crud-part3-delete/app/views/index.scala.html
                  HASH: 6f88bac9cb4991b1522d2507bd54cb471450132e
                  MATRIX: 955->1|1081->32|1109->34|1169->67|1197->68|1243->87|1271->88|1299->89|1346->111|1366->123|1405->125|1434->128|1593->261|1620->268|1648->269|1677->272|1701->276|1810->355
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|35->3|36->4|36->4|36->4|37->5|41->9|41->9|41->9|41->9|41->9|46->14
                  -- GENERATED --
              */
          