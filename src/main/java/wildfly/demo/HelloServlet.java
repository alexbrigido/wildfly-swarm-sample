package wildfly.demo;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import wildfly.demo.DemoEJB;
 
  
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
 
    @EJB DemoEJB ejb;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(ejb.greet("Francesco"));
    }
}
