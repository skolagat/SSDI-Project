package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import authorbean.AuthorBean;

public final class CheckStatusAuthor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t\t<script src=\"functions.js\"></script>\r\n");
      out.write("\t\t<title>Check Status</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
 AuthorBean b = (AuthorBean)request.getAttribute("conference");
      out.write("\r\n");
      out.write("\t\t<div id=\"main-wraper\">\r\n");
      out.write("\t\t\t<div id=\"top-wraper\">\r\n");
      out.write("\t\t\t\t<div id=\"banner\">Easy Research</div>\r\n");
      out.write("\t\t\t\t<div id=\"nav\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t  <li><a href=\"AuthorLoginSuccess.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t  <li><a href=\"/EasyResearch/ListofConferences\">List of Conferences</a></li>\r\n");
      out.write("\t\t\t\t      <li><a href=\"/EasyResearch/EditProfile\">Edit Profile</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"logout\">\r\n");
      out.write("\t\t\t\t\t<form name=\"logout\" action=\"Logout\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Logout\" align =\"right\"> \r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<table class = \"columncss\" id =\"authorstatusmaintable\" align=\"center\" style=\"display: inline-block; width :472px; padding-bottom: 10px; border: 1px solid #aaa; border-radius: 3pt;\">\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\" padding-top: 5px; padding-left: 5px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2 style=\"display: inline-block;\">Status of Abstracts and Papers</h2>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("listOfAbstractsDecision");
      _jspx_th_c_set_0.setValue(b.getAbstract_status());
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<form id = \"paperUpload\" name = \"paperUpload\" action=\"UploadPaper\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"uploadPaperAbstractId\" name=\"uploadPaperAbstractId\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t<table align=\"center\" width=\"509px\" id = \"AbstractStatusArea\" class = \"hidden\" style=\"border:1px solid #aaa; text-align: center; margin-left: 41px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr style=\"font-size: 14.5px; border-bottom :1px solid #aaa;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"215px\" style=\"text-align: center; border-bottom:1px solid #aaa; border-right:1px solid #aaa;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>Conference Name</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"200px\" style=\"text-align: center; border-bottom:1px solid #aaa; border-right:1px solid #aaa;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>Abstract/Paper Title</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id = \"AutPapUpAbstStat\"width=\"150px\" style=\"text-align: center; border-bottom:1px solid #aaa; border-right:1px solid #aaa;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>Abstract Status</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td width=\"370px\" id = \"AutPapUp\" style=\"text-align: center; display: none; border-bottom:1px solid #aaa;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>Upload Paper</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id = \"AutPapUpPaperStat\"width=\"150px\" style=\"text-align: center; border-bottom:1px solid #aaa; display:none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>Paper Status</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr style=\"border-bottom:1px solid #aaa;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"conferenceNameAuthorCheckStatus\" width=\"215px\" style=\"text-align: center; border-right:1px solid #aaa;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"titleAuthorCheckStatus\" width=\"200px\" style=\"text-align: center; border-right:1px solid #aaa;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"abstractStatusAuthorCheckStatus\" width=\"150px\" style=\"text-align: center; border-right:1px solid #aaa;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"uploadPaperAuthorCheckStatus\" width=\"370px\" style=\"text-align: center; display:none;\"><input type=\"file\" name=\"uploadlink\" style=\"width: 190px; padding-left: 15px;\"><input type=\"submit\" class = \"loginbutton\" name=\"upload\" value=\"Upload Paper\" style = \"min-width:80px;\" onclick=\"paperStatusUpload();\"/></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td id=\"paperStatusAuthorCheckStatus\" width=\"150px\" style=\"text-align: center; display: none;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<div class=\"footer\" style=\"padding-top: 3px;\">\r\n");
      out.write("\t\t\t\t<p id=\"copyright\">Copyright &copy; 2014. Developed by Chandrachudeswaran Sankar, Sashank Santhanam, Rohit Bansod, Samatha Kolagatla</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("singleAbstractDecision");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listOfAbstractsDecision}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t<td width=\"60%\" style=\"padding-left: 10px;\">\r\n");
          out.write("\t\t\t\t\t\t\t<ul style=\"list-style-type: none;\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<li style=\"font-weight: bold;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDecision[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</li>\r\n");
          out.write("\t\t\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t<td align=\"center\" style=\"padding-left:50px;\">\r\n");
          out.write("\t\t\t\t\t\t\t<input type=\"submit\" name=\"Check Status\" value =\"Status\" class = \"loginbutton\" style=\"text-align: center; min-width: 90pt;\" onclick=\"displayAbstractStatus('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDecision[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDecision[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDecision[5]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDecision[6]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDecision[7]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');\">\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
