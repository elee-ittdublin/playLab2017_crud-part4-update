
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
    </head>
    <body>
    <!-- start of nav section -->
    <nav class="navbar navbar-inverse">
            <!-- nav header/ branding -->
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Product Catalogue</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
                <li """),_display_(/*28.22*/if(title == "Home")/*28.41*/{_display_(Seq[Any](format.raw/*28.42*/("""class="active"""")))}),format.raw/*28.57*/("""><a href=""""),_display_(/*28.68*/routes/*28.74*/.HomeController.index()),format.raw/*28.97*/("""">Home</a></li>
                <li """),_display_(/*29.22*/if(title == "About")/*29.42*/{_display_(Seq[Any](format.raw/*29.43*/("""class="active"""")))}),format.raw/*29.58*/("""><a href=""""),_display_(/*29.69*/routes/*29.75*/.HomeController.about()),format.raw/*29.98*/("""">About Us</a></li>
                <li """),_display_(/*30.22*/if(title == "Products")/*30.45*/{_display_(Seq[Any](format.raw/*30.46*/("""class="active"""")))}),format.raw/*30.61*/("""><a href=""""),_display_(/*30.72*/routes/*30.78*/.HomeController.products()),format.raw/*30.104*/("""">Products</a></li>
            </ul>
    </nav>
    
    <div class="container-fluid">
        """),format.raw/*36.32*/("""
        """),_display_(/*37.10*/content),format.raw/*37.17*/("""
    """),format.raw/*38.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*47.19*/routes/*47.25*/.Assets.versioned("javascripts/main.js")),format.raw/*47.65*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 15:59:27 IST 2017
                  SOURCE: /home/wdd/webapps/playapps/playLab2017_crud-part3-delete/app/views/main.scala.html
                  HASH: 32657a95f6cac612feb208b14970caa51af0b5b5
                  MATRIX: 1206->260|1331->290|1359->292|1439->397|1475->406|1510->414|1536->419|1811->667|1826->673|1889->714|1977->775|1992->781|2053->820|2460->1200|2488->1219|2527->1220|2573->1235|2611->1246|2626->1252|2670->1275|2734->1312|2763->1332|2802->1333|2848->1348|2886->1359|2901->1365|2945->1388|3013->1429|3045->1452|3084->1453|3130->1468|3168->1479|3183->1485|3231->1511|3355->1697|3392->1707|3420->1714|3452->1719|3814->2054|3829->2060|3890->2100
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|47->16|47->16|47->16|48->17|48->17|48->17|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|66->36|67->37|67->37|68->38|77->47|77->47|77->47
                  -- GENERATED --
              */
          