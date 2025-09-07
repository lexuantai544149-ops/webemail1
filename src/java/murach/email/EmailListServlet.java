package murach.email;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import murach.business.User;
import murach.data.UserDB;

public class EmailListServlet extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        }
        else if (action.equals("add")) {
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String email = request.getParameter("email");
    String dob = request.getParameter("dob");
    String source = request.getParameter("source");
    String updates = request.getParameter("updates");
    String emailUpdates = request.getParameter("emailUpdates");
    String contactMethod = request.getParameter("contactMethod");

    User user = new User(firstName, lastName, email, dob, source, updates, emailUpdates, contactMethod);
    UserDB.insert(user);

    request.setAttribute("user", user);
    url = "/thanks.jsp";
}



        // forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
