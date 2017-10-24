package mydynamicpages;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {


    private UserValidationService service = new UserValidationService();

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

    //DO GET METHOD
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // get parameters are coming from browser url after ?

        //String userName = request.getParameter("username");
        //request.setAttribute("usernameOnJSP", userName);

        request.setAttribute("usernameOnJSP", request.getParameter("username"));
        request.setAttribute("passwordOnJSP", request.getParameter("password"));

        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }


    //DO POST METHOD
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        String name = request.getParameter("usernameOnJSP");
        String password = request.getParameter("passwordOnJSP");

        boolean userValid = service.isUserValid(name, password);

        if (userValid) {
            request.setAttribute("usernameOnJSP", name);
            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Invalid Credentials!!");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }


      /*
        // post request is coming from jsp page where the variables are called nameOnJSP and passwordOnJSP
        request.setAttribute("usernameOnJSP", request.getParameter("usernameOnJSP"));
        request.setAttribute("passwordOnJSP", request.getParameter("passwordOnJSP"));

        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);

     */
    }


}
