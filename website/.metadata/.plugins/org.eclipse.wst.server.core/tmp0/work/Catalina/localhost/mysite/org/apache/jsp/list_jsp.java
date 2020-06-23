/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-06-23 14:03:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import mysite.DBconnection;
import mysite.BoardDBbean;
import mysite.BoardBean;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("mysite.DBconnection");
    _jspx_imports_classes.add("mysite.BoardBean");
    _jspx_imports_classes.add("mysite.BoardDBbean");
  }

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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>게시판 리스트</title>\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction read(num){\n");
      out.write("\t\tdocument.readFrm.num.value = num;\n");
      out.write("\t\tdocument.readFrm.action = \"read.jsp\";\n");
      out.write("\t\tdocument.readFrm.submit();\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</head>\n");
 request.setCharacterEncoding("utf-8");
	BoardDBbean bdb = new BoardDBbean();
	Connection conn= null;
	conn = bdb.getConn();
	Vector<BoardBean> boardList = bdb.selectBoard();
	int total  = 0;
   	if(boardList != null){
	   total  = bdb.getBoardCount();   
   	}	
      out.write("\n");
      out.write("<body bgcolor=\"#FFFFCC\">\n");
      out.write("\t<div align=\"center\">\n");
      out.write("\t<br/>\n");
      out.write("\t<h3>Nyel Board</h3>\n");
      out.write("\t<br/>\n");
      out.write("\t<table align=\"center\" width=\"600\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>Total : <font color=\"red\">");
      out.print( bdb.getBoardCount() );
      out.write("</font> Articles</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t</table><table align=\"center\" width=\"600\" cellpadding=\"3\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td align=\"center\" colspan=\"2\">\n");
      out.write("\t\t\t");
 int cnt = boardList.size();
				  if (cnt== 0) {
					out.println("등록된 게시물이 없습니다.");
				  } else {
			
      out.write("\n");
      out.write("\t\t\t\t  <table width=\"100%\" cellpadding=\"2\" cellspacing=\"0\">\n");
      out.write("\t\t\t\t\t<tr align=\"center\" bgcolor=\"#D0D0D0\" height=\"120%\">\n");
      out.write("\t\t\t\t\t\t<td>번 호</td>\n");
      out.write("\t\t\t\t\t\t<td>제 목</td>\n");
      out.write("\t\t\t\t\t\t<td>작성자</td>\n");
      out.write("\t\t\t\t\t\t<td>날 짜</td>\n");
      out.write("\t\t\t\t\t\t<td>조회 수</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t");

					for (int i = 0;i<cnt; i++) {							
						BoardBean bd = boardList.get(i);
						String regdate = bd.getRegdate();
						String date = regdate.substring(0, 4)+"."+regdate.substring(4,6)+"."+regdate.substring(6,8)+(". ")+regdate.substring(8,10)+(":")+regdate.substring(10,12)+(":")+regdate.substring(12,14);
						int re_level = bd.getRe_level();
					
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t    ");
      out.print( i+1 );
      out.write("\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t");
 if(re_level > 0){
							for(int j = 0; j < re_level; j++){
								out.println("&nbsp;&nbsp;");
							}
						}
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:read('");
      out.print( bd.getNum() );
      out.write("')\">");
      out.print( bd.getSubject() );
      out.write("</a></td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">");
      out.print( bd.getWriter() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">");
      out.print( date );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">");
      out.print( bd.getReadcnt() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t");
}//for
      out.write("\n");
      out.write("\t\t\t\t</table> ");

 			}//if
 		
      out.write("\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td colspan=\"2\"><br /><br /></td>\n");
      out.write("\t\t</tr>\t\t\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t\t<td align=\"right\">\n");
      out.write("\t\t\t\t\t<a href=\"writeForm.jsp\">[글쓰기]</a>\t\t\t\t\t\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t<hr width=\"600\"/>\t\n");
      out.write("\t<form name=\"readFrm\" method=\"post\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"num\">\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
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
}
