package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import conferencebean.ConferenceBean;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("<!DOCTYPE>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Easy Research </title>\r\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<script src=\"functions.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
 ConferenceBean c = (ConferenceBean)request.getAttribute("conferences");
      out.write("\r\n");
      out.write("\t<div id=\"main-wraper\">\r\n");
      out.write("\t\t<div id=\"top-wraper\">\r\n");
      out.write("\t\t\t<div id=\"banner\">Easy Research</div>\r\n");
      out.write("\t\t\t<div id=\"nav\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t  <li><a href=\"/EasyResearch/Home\">Home</a></li>\r\n");
      out.write("\t\t\t\t  <li><a href=\"AboutUs.jsp\">About us</a></li>\r\n");
      out.write("\t\t\t\t  <li><a href=\"ContactUs.jsp\">Contact</a></li>\r\n");
      out.write("\t\t\t\t  <li><a href=\"Admin.jsp\">Admin</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<table style=\"width: 926px; display: inline-block; float: none;\">\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td id=\"left\" class = \"left\" valign=\"top\" >\r\n");
      out.write("\t\t\t\t\t\t\t<p style=\"font-size: 16px;\"><strong>Login as</strong></p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><a href=\"AuthorLogin.jsp\">Author</a></p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><a href=\"ConferenceChair.jsp\">Conference chair</a></p>\r\n");
      out.write("\t\t\t\t\t\t  \t<p><a href=\"ReviewerLogin.jsp\">Reviewer</a></p>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td id=\"right\"  valign=\"top\" class=\"right\" style=\"display: block; overflow: hidden;\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"para_title\">EasyResearch</p>\r\n");
      out.write("\t\t\t\t\t\t<p style=\"font-size: 12px; font-style: normal; text-align:justify; width:450px;\">\r\n");
      out.write("\t\t\t\t\t\tEasyResearch is a Web application for managing registration, paper submission and paper review. Written in Java, with a MySQL database at the back end, it is a comprehensive and powerful, yet easy to use solution for online conference management.\r\n");
      out.write("\t\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t\tEasy research is a Conference Management System that provides a common platform for the researchers to submit their research papers. It allows the authors to login and submit their research papers. This system also displays various conferences proceedings and the researcher can find his/her area of interest conference and submit their paper. The important dates will not be missed since e-mail reminders are sent to the author.\r\n");
      out.write("\t\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t\tThis system is useful for the conference chair and as well as for the reviewers. Conference chair can host the conference and assign the reviewers based on their area of interest. The reviewers can provide feedback and comments to the papers under consideration. The authors can keep track of the paper decision of all the conferences aligned to his/ her interests on his profile.\r\n");
      out.write("\t\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t\tBut the most important feature of EasyResearch is it's <strong>free!!!</strong>.   \r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td id=\"rightmostConference\" valign=\"top\" class=\"rightmost\" style=\"display: block; overflow-x: scroll; overflow-y: scroll; border: 1px solid #000; height:308px; width:300px; border-radius: 5pt;\">\r\n");
      out.write("\t\t\t\t\t\t<h2 style=\"padding-top: 10px;\">Conferences</h2>\r\n");
      out.write("\t\t\t\t\t\t");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("fullListOfConferencesDetails");
      _jspx_th_c_set_0.setValue(c.getConferenceDetailsList());
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
        return;
      }
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div id=\"overlay\">\r\n");
      out.write("     \t\t<div id=\"maincontent\">\r\n");
      out.write("          \t\t<table>\r\n");
      out.write("          \t\t\t<thead>\r\n");
      out.write("          \t\t\t\t<tr>\r\n");
      out.write("          \t\t\t\t\t<td id = \"closeButtonModalId\"class =\"closebuttonModal\" colspan=\"4\"></td>\r\n");
      out.write("          \t\t\t\t</tr>\r\n");
      out.write("          \t\t\t\t<tr>\r\n");
      out.write("          \t\t\t\t\t<td colspan=\"4\" style=\" padding-top: 5px; padding-left: 5px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2 style=\"display: inline-block;\">Conference Details</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("          \t\t\t\t</tr>\r\n");
      out.write("          \t\t\t</thead>\r\n");
      out.write("          \t\t\t<tbody>\r\n");
      out.write("\t      \t\t\t\t<tr style=\"font-size: 14.5px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"215px\" style=\"text-align: center; border-left:1px solid #aaa; border-right:1px solid #aaa; border-bottom:1px solid #aaa; border-top: 1px solid #aaa;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Conference Name</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"150px\" style=\"text-align: center; border-left:1px solid #aaa; border-right:1px solid #aaa; border-bottom:1px solid #aaa; border-top: 1px solid #aaa;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Place</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"120px\" style=\"text-align: center; border-left:1px solid #aaa; border-right:1px solid #aaa; border-bottom:1px solid #aaa; border-top: 1px solid #aaa;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>To be held on</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"200px\" style=\"text-align: center; border-left:1px solid #aaa; border-right:1px solid #aaa; border-bottom:1px solid #aaa; border-top: 1px solid #aaa;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>Abstract Submission by</strong>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("          \t\t\t\t<tr style=\"font-size: 14.5px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<td id=\"homeConfNameValue\" width=\"215px\" style=\"text-align: center; border-left:1px solid #aaa; border-right:1px solid #aaa; border-bottom:1px solid #aaa;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td id=\"homeConfPlaceValue\" width=\"150px\" style=\"text-align: center; border-left:1px solid #aaa; border-right:1px solid #aaa; border-bottom:1px solid #aaa;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td id=\"homeConfDateValue\" width=\"120px\" style=\"text-align: center; border-left:1px solid #aaa; border-right:1px solid #aaa; border-bottom:1px solid #aaa;\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td id=\"homeAbsSubDateValue\" width=\"200px\" style=\"text-align: center; border-left:1px solid #aaa; border-right:1px solid #aaa; border-bottom:1px solid #aaa;\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("          \t\t\t</tbody>\r\n");
      out.write("          \t\t</table>\r\n");
      out.write("\t     \t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t<p id=\"copyright\">Copyright &copy; 2014. Developed by Chandrachudeswaran Sankar, Sashank Santhanam, Rohit Bansod, Samatha Kolagatla</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fullListOfConferencesDetails!= null && fullListOfConferencesDetails !='' && fn:length(fullListOfConferencesDetails) gt 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_forEach_0.setVar("singleConferencesDetails");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fullListOfConferencesDetails}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<li style=\"list-style-type: none;\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<a id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleConferencesDetails[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"javascript:void(0);\" onclick=\"overlay('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleConferencesDetails[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleConferencesDetails[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleConferencesDetails[6]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleConferencesDetails[4]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleConferencesDetails[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
          out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\tNo conferences Available\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
