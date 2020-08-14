package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class portal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("\t<title>Proyecto AVI</title>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"images/icon/favicon-32x321.png\">\r\n");
      out.write("\t<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"images/icon/favicon-32x321.png\" sizes=\"32x32\">\r\n");
      out.write("\t<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"images/icon/favicon-32x321.png\" sizes=\"16x16\">\r\n");
      out.write("        <link href=\"css/bundle.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        \r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("      var _gaq = _gaq || [];\r\n");
      out.write("      _gaq.push(['_setAccount', 'UA-27079802-1']);\r\n");
      out.write("      _gaq.push(['_trackPageview']);\r\n");
      out.write("\r\n");
      out.write("      (function() {\r\n");
      out.write("          var ga = document.createElement('script');\r\n");
      out.write("          ga.type = 'text/javascript';\r\n");
      out.write("          ga.async = true;\r\n");
      out.write("          ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\r\n");
      out.write("          var s = document.getElementsByTagName('script')[0];\r\n");
      out.write("          s.parentNode.insertBefore(ga, s);\r\n");
      out.write("      })();\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t<!-- Your header goes here -->\r\n");
      out.write("<header class=\"header navbar navbar-expand-md header--alt header--alternative\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<a href=\"portal.jsp\" class=\"icon navbar-brand d-md-none d-lg-none d-xl-none\"></a>\r\n");
      out.write("\r\n");
      out.write("\t\t<button class=\"navbar-toggler collapsed\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    \r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse align-items-center row\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t<a  class=\"logo-small-dark navbar-brand mr-auto d-md-none d-lg-none d-xl-none\"></a>\r\n");
      out.write("\t\t\t\t<a  class=\"logo navbar-brand mr-auto d-lg-inline-block d-xl-inline-block hidden-xs\"></a>\r\n");
      out.write("\t\t\t</div><!-- /.col-sm-3 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav justify-content-sm-around\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#normas\">Normas</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"login.jsp\">Expresate</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#miembro\">Miembros</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#proyecto\">Conocenos</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div><!-- /.col-sm-6 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav justify-content-sm-end\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/Proyecto-IR/login.jsp\">Login\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"ico-arrow-orange d-none d-md-inline-block d-lg-inline-block d-xl-inline-block\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"ico-arrow-large d-inline-block d-md-none d-lg-none d-xl-none\"></i>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div><!-- /.col-sm-3 -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div><!-- /.container -->\r\n");
      out.write("</header><!-- /.header navbar\t-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"jumbotron-fluid\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"particle-animation\">\r\n");
      out.write("\t\t\t\t\t<div class=\"ring-explosion\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/temp/pattern4.png\" alt=\"\" width=\"1920\" height=\"1920\">\r\n");
      out.write("\t\t\t\t\t</div><!-- /.ring-explosion -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"particle-animation__inner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"rings-outer\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/temp/ring2.png\" alt=\"\" width=\"1420\" height=\"1086\" class=\"ring-static ring-3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/temp/ring3.png\" alt=\"\" width=\"1420\" height=\"1086\" class=\"ring-static ring-4\">\r\n");
      out.write("\t\t\t\t\t\t</div><!-- /.rings-outer -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"scale-down\">\r\n");
      out.write("<!--\t\t\t\t\t\t\t<img src=\"images/temp/square1.png\" alt=\"\" width=\"655\" height=\"661\" class=\"square square-normal\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/temp/square2.png\" altassets=\"\" width=\"875\" height=\"866\" class=\"square square-normal square--rotated square--rotated-big\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/temp/square3.png\" alt=\"\" width=\"878\" height=\"873\" class=\"square square-normal square--rotated-alt square--rotated-big \">\r\n");
      out.write("-->\t\t\t\t\t\t</div><!-- /.scale-down -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/temp/ring-medium.png\" alt=\"\" width=\"835\" height=\"835\" class=\"ring-medium\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/temp/ring-medium.png\" alt=\"\" width=\"835\" height=\"835\" class=\"ring-small-alt\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"scale-up\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/temp/ring-small.png\" alt=\"\" width=\"353\" height=\"353\" class=\"ring-small\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/temp/ring-small2.png\" alt=\"\" width=\"353\" height=\"353\" class=\"ring-small ring-1\">\r\n");
      out.write("\t\t\t\t\t\t</div><!-- /.scale-up -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/canvas-pentagram.png\" alt=\"\" width=\"526\" height=\"501\" class=\"particle__item\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/canvas-hexagon.png\" alt=\"\" class=\"particle__item\" width=\"197\" height=\"197\">\r\n");
      out.write("\t\t\t\t\t</div><!-- /.particle-animation__inner -->\r\n");
      out.write("\t\t\t\t</div><!-- /.inner -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"row align-items-center justify-content-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-9 main-head-center\">\r\n");
      out.write("\t\t\t\t\t\t<h6 class=\"jumbotron__subtitle head-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>si puedes imaginarlo puedes programarlo</span>\r\n");
      out.write("\t\t\t\t\t\t</h6>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<h1 class=\"jumbotron__title\">\r\n");
      out.write("\t\t\t\t\t\t\t<b>Construye el</b> <br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<span style=\"font-size: 70%\"> Futuro Con Nosotros</span>\r\n");
      out.write("\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t</div><!-- /.col-md-9 -->\r\n");
      out.write("\t\t\t\t</div><!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"registro.jsp#inicio\" class=\"btn btn-invest--large\">\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\tRegistrate con Nosotros\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"arrow-large\"></i>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div><!-- /.container -->\r\n");
      out.write("\t\t</div><!-- /.jumbotron-fluid -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"main main--primary\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<section id=\"normas\" class=\"section section--small section-philosophy row justify-content-between animate\">\r\n");
      out.write("\t\t\t\t\t<div class=\"section__content col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"section__title\" style=\"font-size: 280%\">HOLA, SOMOS FORO UNTELS</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"section__content section__content-cols\">\r\n");
      out.write("\t\t\t\t\t\t\t<p style=\"text-align: justify;\">Foro UNTELS es un lugar donde los alumnos y los profesores pueden dialogar, \r\n");
      out.write("                                                            pueden compartir ideas y preguntar ante cualquier duda. \r\n");
      out.write("                                                            Este proyecto surge en un curso de nuestra carrera, llamado Ingenieria de Requerimientos, al mando del profesor Juan Carlos Reategui. \r\n");
      out.write("                                                            Esta plataforma web busca innovar la comunicacion entre profesores y alumnos. En Foro UNTELS estamos totalmente comprometidos a apoyar y proteger la libertad de expresión. Del mismo modo, tenemos que establecer ciertos límites en torno a algunos tipos de contenido o comportamientos muy concretos, aunque de gran importancia, ya que ponen en peligro a nuestros usuarios o perjudican a la comunidad.\r\n");
      out.write("                                                            En Foro UNTELS queremos que te expreses libremente y que utilices nuestra plataforma para mostrarte tal y como eres, compartir lo que te gusta, lo que piensas o aquello en lo que crees\r\n");
      out.write("                                                            . Pero no toleramos ningún contenido que fomente o incite al terrorismo, ni los discursos que promueven el odio hacia los demás en base a su religión, género, orientación sexual, edad, discapacidad o enfermedad. Si das con este tipo de contenido que infringe nuestras políticas, denúncialo.\r\n");
      out.write("                                                            Ten en cuenta que una publicación puede ser de mal gusto sin estar fomentando la violencia o el odio. En casos como este, siempre puedes bloquear al autor o autora del contenido o, si te apetece, responder con el diálogo para expresarle tus preocupaciones, defender tu postura, contrastar opiniones, visibilizar el problema, crear conciencia o debatirlo con el resto de la comunidad.</p>\r\n");
      out.write("\t\t\t\t\t\t</div><!-- /.section__content section__content-cols -->\r\n");
      out.write("\t\t\t\t\t</div><!-- /.section__content col-md-8 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"section__aside col-lg-3 col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"widgets\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"widget widget-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"d-flex flex-column\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"login.jsp\" class=\"d-flex align-items-center justify-content-between\">Expresate <i class=\"ico-arrow-dark\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#proyecto\" class=\"d-flex align-items-center justify-content-between\">Conocenos <i class=\"ico-arrow-dark\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#miembro\" class=\"d-flex align-items-center justify-content-between\">Nuestro Team <i class=\"ico-arrow-dark\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li><!-- /.widget widget-nav -->\r\n");
      out.write("\t\t\t\t\t\t</ul><!-- /.widgets -->\r\n");
      out.write("\t\t\t\t\t</div><!-- /.section__aside col-lg-3 col-md-4 -->\r\n");
      out.write("\t\t\t\t</section><!-- /.section section-/-small section-philosophy -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<section class=\"section section--small\" id=\"proyecto\">\r\n");
      out.write("                                    <div class=\"section--small--tow--boxes\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tow--boxes--holder\">\r\n");
      out.write("                                                    <br>\r\n");
      out.write("                                                    <br>\r\n");
      out.write("                                                    <br>\r\n");
      out.write("\t\t\t\t\t\t\t<h6>Foro UNTELS</h6>\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"section__title\">Proyecto</h3>\r\n");
      out.write("\t\t\t\t\t\t\t<h6 style=\"text-align: justify;\"> este proyecto empieza con la idea de poder innovar la comunicacion que existe en nuestros compañeros de aula, aunque tambien puede ser utilizado para una empresa\r\n");
      out.write("ya sea por una pagina de susgerencias o quejas y reclamos, intercamciando las dieas que surgende nuestros pensamientos y poder expresarlas con libre albedrio\r\n");
      out.write("sin la necesidad de pensar en lo que dirian los demas ya que esta pagina esta hecaha claramente con ese objetivo que es poder capturar las ideas de cada uno de los compañeros y mostrarla para todo el que \r\n");
      out.write("desee o muestre interes por ella.</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tow--boxes--holder\">\r\n");
      out.write("                                                    <br>\r\n");
      out.write("                                                    <br>\r\n");
      out.write("                                                    <br>\r\n");
      out.write("                                                    \r\n");
      out.write("\t\t\t\t\t\t\t<h6>Foro UNTELS</h6>\r\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"section__title\">Objetivo</h3>\r\n");
      out.write("                                                        <h6 style=\"text-align: justify;\"> El objetivo de este proyecto es hacer que los compañeros de clase opinen y den ideas libremente para que todo el aula de clases pueda ver cada punto de vista y tener una vision mas amplia\r\n");
      out.write("de lo que se esta hablando para asi poder llegar a un acuerdo mutuo con respecto a lo que se esta conversando y tener la empatia de ver que es lo que cada unno del salon piensa\r\n");
      out.write("sin cerranos a nuestras ideas en una burbuja personal que impide el acceso a una informacion diferentea que se tiene pensada.</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<section class=\"section section-features\" id=\"miembro\">\r\n");
      out.write("\t\t\t\t\t<div class=\"section__body\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"list-features d-flex justify-content-between row\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"col-md-3 col-sm-6 col-6 animate\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2 style=\"font-size: 300%\">SILVERA<small> IÑIGO</small></h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Programador<br> Diseñador Web</p>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"col-md-3 col-sm-6 col-6 animate\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2 style=\"font-size: 300%\">Gomez<small> Flores</small></h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Administrador<br> de la Base de Datos</p>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"col-md-3 col-sm-6 col-6 animate\">\r\n");
      out.write("                                                                <h2 style=\"font-size: 300%\">Ramos<small> Machuca</small></h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Editor y Gestor<br> del contenido web </p>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("                                                        \r\n");
      out.write("                                                        <li class=\"col-md-3 col-sm-6 col-6 animate\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2 style=\"font-size: 300%\">SOTOMAYOR<small> GONZALES</small></h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Creador de la BD</p>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("                                                       \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul><!-- /.list-features -->\r\n");
      out.write("                                                <ul class=\"list-features d-flex justify-content-between row\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"col-md-3 col-sm-6 col-6 animate\">\r\n");
      out.write("                                                        </li>\r\n");
      out.write("                                                        \r\n");
      out.write("                                                        <li class=\"col-md-3 col-sm-6 col-6 animate\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2 style=\"font-size: 300%\">CRUZ<small> HUANCA</small></h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Jefe de Proyecto</p>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("                                                        <li class=\"col-md-3 col-sm-6 col-6 animate\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2 style=\"font-size: 300%\">REATEGUI<small> MORALES</small></h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Profesor Encargado</p>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("                                                        <li class=\"col-md-3 col-sm-6 col-6 animate\">\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("                                                       \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul><!-- /.list-features -->\r\n");
      out.write("\t\t\t\t\t</div><!-- /.section__body -->\r\n");
      out.write("\t\t\t\t</section><!-- /.section section-features -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div><!-- /.container -->\r\n");
      out.write("\t\t</div><!-- /.main main-/-primary -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Your footer goes here -->\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"footer__body\">\r\n");
      out.write("\t\t\t<div class=\"row flex-column align-items-center justify-content-center\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-6 md-8 sm-10 d-flex flex-column align-items-center justify-content-center\">\r\n");
      out.write("\t\t\t\t\t<a href=\"portal.jsp\" class=\"logo-small\"></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"navbar-nav justify-content-sm-around d-flex flex-column flex-md-row flex-lg-row flex-xl-row\">\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#normas\">Normas</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"login.jsp\">Expresate</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#miembro\">Miembros</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#proyecto\">Conocenos</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"registro.jsp#inicio\" class=\"btn-alternative\">\r\n");
      out.write("\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\tRegistrate con Nosotros\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"ico-arrow-white\"></i>\r\n");
      out.write("\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div><!-- /.row -->\r\n");
      out.write("\t\t\t</div><!-- /.col-md-10 -->\r\n");
      out.write("\t\t</div><!-- /.footer__body -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"footer__bar d-none d-md-block d-lg-block d-xl-block\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"socials d-none d-md-flex d-lg-flex d-xl-flex flex-row align-items-center justify-content-center justify-content-md-start justify-content-xl-start justify-content-lg-start\">\r\n");
      out.write("\t\t\t\t\t\t<span>Siguenos</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<span class=\"line\"></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"d-inline-flex flex-row\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-facebook\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-twitter\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-instagram\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"https://github.com/agust-D2/proyecto-AVI\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tSuscribete a nuestro GitHub\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div><!-- /.socials -->\r\n");
      out.write("\t\t\t\t</div><!-- /.col-sm-6 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"btn btn-red btn-top\">\r\n");
      out.write("\t\t\t\t\t<i class=\"ico-arrow-white\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div><!-- /.row -->\r\n");
      out.write("\t\t</div><!-- /.footer__bar -->\r\n");
      out.write("\t</div><!-- /.container -->\r\n");
      out.write("</footer><!-- /.footer -->\r\n");
      out.write("\r\n");
      out.write("\t</div><!-- /.wrapper -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/bundle.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyA5cGeMy0bvV99UcOjFOIUVpCZ3oVK9Umo&callback=initMap\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
