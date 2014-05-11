package com.yanoo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/** Hello World!表示サーブレット **/
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter out;

		res.setContentType("text/html; charset=Shift_JIS");
		out = res.getWriter();

		out.println("<html><body>");
		out.println("<h1>Hello World!</h1>");
		out.println("<p>Servletのサンプル（HelloServlet.java）</p>");
		out.println("</body></html>");
	}
}