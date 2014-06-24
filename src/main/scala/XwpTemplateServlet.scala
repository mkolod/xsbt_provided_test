package com.earldouglas.xwptemplate

import scala.xml.NodeSeq
import javax.servlet.http.HttpServlet

class XwpTemplateServlet extends HttpServlet {

  import javax.servlet.http.HttpServletRequest
  import javax.servlet.http.HttpServletResponse

  override def doGet(request: HttpServletRequest, response: HttpServletResponse) {

    response.setContentType("text/html")
    response.setCharacterEncoding("UTF-8")

    val foo = new org.apache.commons.math3.stat.Frequency()

    val responseBody: NodeSeq = <html><body><h1>Test</h1></body></html>
    response.getWriter.write(responseBody.toString)
  }
}