package com.webapp;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SurveyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String dob = request.getParameter("dob");
        String hear = request.getParameter("hear");
        String announce = request.getParameter("announce");
        String contact = request.getParameter("contact");

        out.println("<html><body>");
        out.println("<h1>Survey Result</h1>");
        out.println("<p>First Name: " + firstName + "</p>");
        out.println("<p>Last Name: " + lastName + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Date of Birth: " + dob + "</p>");
        out.println("<p>Heard about us: " + hear + "</p>");
        out.println("<p>Announcements: " + announce + "</p>");
        out.println("<p>Contact method: " + contact + "</p>");
        out.println("</body></html>");
    }
}
