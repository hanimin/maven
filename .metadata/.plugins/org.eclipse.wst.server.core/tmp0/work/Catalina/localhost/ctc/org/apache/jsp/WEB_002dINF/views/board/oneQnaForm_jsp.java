/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2023-04-20 05:43:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class oneQnaForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/maven-kimminseon/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/cornertocorner/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/maven-kimminseon/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/cornertocorner/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1675145505448L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');

  request.setCharacterEncoding("UTF-8");

      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("   <title>1:1문의 등록 페이지</title>\r\n");
      out.write("   <!-- CSS only -->\r\n");
      out.write("   <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("   <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("   <script src=\"https://code.jquery.com/jquery-3.6.4.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write(" <script>\r\n");
      out.write(" window.addEventListener('DOMContentLoaded', () => {\r\n");
      out.write("     const textArea = document.querySelector('textarea');\r\n");
      out.write("     const charCount = document.querySelector('.char_count');\r\n");
      out.write("     textArea.addEventListener('input', function () {\r\n");
      out.write("       const currentLength = textArea.value.length;\r\n");
      out.write("       charCount.textContent = currentLength;\r\n");
      out.write("       if (currentLength > 2500) {\r\n");
      out.write("         textArea.value = textArea.value.substring(0, 2500);\r\n");
      out.write("         alert(\"2500자 이내로 작성해주세요!\");\r\n");
      out.write("       }\r\n");
      out.write("     });\r\n");
      out.write("   });\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   \r\n");
      out.write("   <nav class=\"text-end\" style=\"margin-top:0.5%; text-align:center;\" aria-label=\"breadcrumb\">\r\n");
      out.write("      <ol class=\"breadcrumb\">\r\n");
      out.write("         <li class=\"breadcrumb-item\"><a href=\"#\" style=\"text-decoration:none; color:black;\">고객센터</a></li>\r\n");
      out.write("         <li class=\"breadcrumb-item active\" aria-current=\"page\">1:1 문의하기</li>\r\n");
      out.write("      </ol>\r\n");
      out.write("   </nav>\r\n");
      out.write("   <br><br>\r\n");
      out.write("   <form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/board/addNewQna.do\" enctype=\"multipart/form-data\"> <!-- 파일 업로드를 위한 enctype 추가 -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("    <div class=\"notice_wrap mt0\">\r\n");
      out.write("        <strong class=\"tit\">문의하시기 전 확인해 주세요.</strong>\r\n");
      out.write("        <div class=\"clearfix\">\r\n");
      out.write("          <ul class=\"list_bul disc\">\r\n");
      out.write("            <li>고객님의 소중한 의견을 빠르고 정확하게 해결하기 위해 최선을 다하겠습니다.</li>\r\n");
      out.write("            <li>상품에 대한 문의는 상품상세페이지를 통해 문의해 주세요.</li>\r\n");
      out.write("            <li>예약한 상품에 대한 문의는 예약 대리점을 통해 문의해 주세요.</li>\r\n");
      out.write("            <li>예약한 상품의 취소는 예약 대리점을 통해 문의해 주세요. (취소 시 위약금 발생)</li>\r\n");
      out.write("            <li>문의에 대한 답변은 <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/mypage/myQna.do\">\r\n");
      out.write("                <em>[마이페이지&gt;1:1 문의내역]</em>\r\n");
      out.write("              </a> 에서 확인할 수 있습니다. </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <br>\r\n");
      out.write("    <label for=\"writer\" class=\"pb-2 mb-2 border-bottom\"><b>작성자 아이디</b></label>\r\n");
      out.write("       <input class=\"form-control mt-2 mb-2\" style=\"width:35%\" type=\"text\" id=\"writer\" name=\"member_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.memberInfo.member_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly disabled>\r\n");
      out.write("         <br>\r\n");
      out.write("    <label for=\"contact\" class=\"pb-2 mb-2 border-bottom\"><b>연락처 이메일</b></label>\r\n");
      out.write("         <input class=\"form-control mt-2 mb-2\" style=\"width:35%\" type=\"email\" id=\"contact\" name=\"qna_contact\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.memberInfo.member_email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly disabled>\r\n");
      out.write("       <br>\r\n");
      out.write("    <label for=\"qna_type\" class=\"pb-2 mb-2 border-bottom\"><b>문의 유형</b></label>\r\n");
      out.write("      <select id=\"qna_type\" name=\"qna_type\" class=\"form-select\" style=\"width:150px\" >\r\n");
      out.write("           <option value=\"국내여행\">국내여행</option>\r\n");
      out.write("           <option value=\"기타여행\">기타여행</option>\r\n");
      out.write("           <option value=\"법인여행\">법인여행</option>\r\n");
      out.write("           <option value=\"상품문의\">상품문의</option>\r\n");
      out.write("      </select>\r\n");
      out.write("       <br>\r\n");
      out.write("    <label for=\"qna_title\" class=\"pb-2 mb-2 border-bottom\"><b>문의 제목</b></label>\r\n");
      out.write("       <input type=\"text\" id=\"qna_title\" name=\"qna_title\" class=\"form-control mt-2 mb-2\" placeholder=\"제목을 입력해주세요.\" required>\r\n");
      out.write("       <br>\r\n");
      out.write("   \r\n");
      out.write("    <label for=\"qna_content\" class=\"pb-2 mb-2 border-bottom\"><b>문의 내용</b></label>\r\n");
      out.write("       <textarea class=\"form-control mt-2 mb-2\" rows=\"10\" id=\"content\" name=\"qna_content\" placeholder=\"최대 2500자까지 입력 가능합니다. 문의할 내용을 입력해 주세요.\" required></textarea>\r\n");
      out.write("       <br>\r\n");
      out.write("       <div class=\"char_count_group\">\r\n");
      out.write("         <span class=\"char_count\">0</span> / 2500\r\n");
      out.write("      </div>\r\n");
      out.write("      <br>\r\n");
      out.write("    <label for=\"image\" class=\"pb-2 mb-2 border-bottom\"><b>이미지 첨부</b></label>\r\n");
      out.write("       <br>\r\n");
      out.write("       <input type=\"file\" class=\"btn btn-outline-secondary col-8 mt-2 mb-2\" id=\"board_fileName\" name=\"board_fileName\" multiple=\"multiple\">\r\n");
      out.write("       <input type=\"file\" class=\"btn btn-outline-secondary col-8 mt-2 mb-2\" id=\"board_fileName\" name=\"board_fileName\" multiple=\"multiple\">\r\n");
      out.write("       <input type=\"file\" class=\"btn btn-outline-secondary col-8 mt-2 mb-2\" id=\"board_fileName\" name=\"board_fileName\" multiple=\"multiple\">\r\n");
      out.write("       <br>\r\n");
      out.write("    <div class=\"mt-3 mb-3\"align=\"center\">\r\n");
      out.write("    <input type=\"reset\" class=\"btn btn-outline-danger mb-3\" value=\"다시입력\">\r\n");
      out.write("    <input type=\"submit\" class=\"btn btn-outline-primary mb-3\" value=\"문의등록\">\r\n");
      out.write("    </div>\r\n");
      out.write("   </form>\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/board/oneQnaForm.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/views/board/oneQnaForm.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/board/oneQnaForm.jsp(5,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}