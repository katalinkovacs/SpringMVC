package mydynamicpages;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/welcome")
public class LoginServlet extends HttpServlet {

/*
    // USING SERVLET

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome from SERVLET!!!!!!!!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Kati's First Servlet");
        out.println("</body>");
        out.println("</html>");

    }
*/

    // USING JSP

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        //request.setAttribute("name", request.getParameter("name"));   //??????????????????????????????

        //System.out.println(request.getParameter("name"));      //??????????????????????????????

        /*request.setAttribute("name", request.getParameter("name"));
        request.setAttribute("password", request.getParameter("password"));



        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
*/

        String userName = request.getParameter("username");

        request.setAttribute("nameToForward", userName);


        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);


    }
}
