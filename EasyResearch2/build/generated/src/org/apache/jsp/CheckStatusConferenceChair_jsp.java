package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import conferencechairbean.ConferenceChairBean;

public final class CheckStatusConferenceChair_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
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
 ConferenceChairBean c = (ConferenceChairBean)request.getAttribute("conference1");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<div id=\"main-wraper\">\r\n");
      out.write("\t\t\t<div id=\"top-wraper\">\r\n");
      out.write("\t\t\t\t<div id=\"banner\">Easy Research</div>\r\n");
      out.write("\t\t\t\t<div id=\"nav\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li style=\"padding-left:0px; padding-right:0px;\"><a href=\"ConferenceChairLoginSuccess.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t  \t");
      out.write("\r\n");
      out.write("\t\t\t\t\t    <li style=\"padding-left:0px; padding-right:0px;\"><a href=\"AddContacts.jsp\">Add Contacts</a></li>\r\n");
      out.write("\t\t\t\t\t    <li style=\"padding-left:0px; padding-right:0px;\"><a href=\"/EasyResearch/InviteReviewers\">Invite Reviewers</a></li>  \r\n");
      out.write("\t\t\t\t\t    <li style=\"padding-left:0px; padding-right:0px;\"><a href=\"/EasyResearch/AssignReviewerPaper\">Assign Papers</a></li>\r\n");
      out.write("\t\t\t\t\t    <li style=\"padding-left:0px; padding-right:0px;\"><a href=\"/EasyResearch/ConferenceChairNotification\">Notifications</a></li>\r\n");
      out.write("\t\t\t\t\t    <li style=\"padding-left:0px; padding-right:0px;\"><a href=\"/EasyResearch/MakeDecision\">Make Paper Decision</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"logout\">\r\n");
      out.write("\t\t\t\t\t<form name=\"logout\" action=\"Logout\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Logout\" align =\"right\"> \r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<table style=\"display: inline-block;\">\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_0.setPageContext(_jspx_page_context);
          _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${abstractDetailsVar!= null && abstractDetailsVar !='' && fn:length(abstractDetailsVar) gt 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
          int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
          if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t<td style=\"padding-left: 10px; width: 40%\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t<table id = \"abstractTable\" style=\"padding-bottom: 10px; border: 1px solid #000000; border-radius: 3pt; vertical-align: top;\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h2>Check Abstracts</h2>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<dl>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
              //  c:set
              org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
              _jspx_th_c_set_1.setPageContext(_jspx_page_context);
              _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
              _jspx_th_c_set_1.setVar("listOfAbstractsDetails");
              _jspx_th_c_set_1.setValue(c.getAbstract_details());
              int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
              if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
                return;
              }
              _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</dl>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
              out.write("\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td style=\"width:50%; padding-left:20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id =\"CheckAbstractArea\" class=\"hidden\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form name=\"absChkform1\" action=\"CheckStatusConferenceChair\" method=\"post\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"Username\" style=\"width:95%\" id=\"UserKey\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"nameofconf\" style=\"width:95%\" id=\"nameofconf\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"abstractId\" style=\"width:95%\" id=\"abstractId\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"title\" style=\"width:95%\" id=\"title\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"abstractKeywords\" id=\"abstractKeywords\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"abstractsText\" id=\"abstractsText\"></input>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table id = \"checkAbstractTable\"style=\"border:1px solid #aaa; vertical-align: top;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><h3 id=\"showConfAbsTitle\" align=\"left\"></h3></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"textright\" style=\"width:10px; vertical-align: top;\">Keywords : </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tableinputtext\"><input style=\"width:95%\" class=\"tableinput\" type=\"text\" id = \"checkAbstractKeywords\" name=\"checkAbstractKeywords\" disabled=\"disabled\"></input></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"textright\" style=\"vertical-align: top;\">Abstract: </td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"text-align: left; padding-right: 20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea disabled=\"disabled\" id = \"abstract\" rows=15 cols=50 name=\"abstract\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t        \t\t\t\t\t\t\t<td class=\"textright\" style=\"vertical-align: top;\">Decision: </td>\r\n");
      out.write("\t\t\t            \t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t            \t\t\t\t\t\t<select id = \"decisionValue\" name=\"decisionType\" class=\"table_selectinput\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Decision\" selected=\"selected\"> Decision </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Accept\"> Accept </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Reject\"> Reject </option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t        \t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t        \t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t        \t\t\t\t\t\t\t<td class=\"style1\" colspan=\"3\" align=\"center\"><button type=\"button\" id = \"makeDecision\" name=\"makeDecision\" value=\"Make Decision\" class=\"loginbutton\" onclick=\"checkValueOfDecision();\">Make Decision</button></td>\r\n");
      out.write("\t\t\t        \t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br/>\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t&nbsp;\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("abstractDetailsVar");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.conference1.abstract_details}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
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
    _jspx_th_c_forEach_0.setVar("singleAbstractDetail");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listOfAbstractsDetails}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<dd><a onclick=\"displaySingleAbstract('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDetail[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDetail[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDetail[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDetail[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDetail[4]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("','");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDetail[5]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\" href=\"javascript:void(0);\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${singleAbstractDetail[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></dd>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
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
        out.write("\t\t\t\t\t\t\t\t<td style=\"text-align: left; display: inline-block; padding-left:25px; font-weight: bold; width: 200%\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<p style=\"padding-left:25px;\">No abstracts to check currently</p><br/>\r\n");
        out.write("\t\t\t\t\t\t\t\t</td>\r\n");
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
