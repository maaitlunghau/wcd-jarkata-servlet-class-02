package org.aptech.buoi_02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/direct")
public class CourseDirect extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Course Direct</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Course Direct at " + request.getContextPath() + "</h1>");

            // 1. Declare
            List<String> list = new ArrayList<String>();
            list.add("1. WCD - Web Components Development - SemIV");
            list.add("2. IDP - Introduction to Dart Programming - SemIV");

            // 2. Data organization
            for (String course : list) {
                out.print(course + "<br>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        processRequest(req, resp);
    }
}