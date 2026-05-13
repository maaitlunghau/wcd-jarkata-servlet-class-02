package org.aptech.buoi_02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.aptech.buoi_02.entity.Course;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/indirect")
public class CourseIndirect extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Tạo danh sách dữ liệu (Dữ liệu giả lập)
        List<Course> list = new ArrayList<Course>();
        list.add(new Course(1, "WCD", "Web Components Development", "SemIV"));
        list.add(new Course(2, "IDP", "Introduction to Dart Programming", "SemIV"));

        // 2. Đưa dữ liệu vào request attribute để JSP có thể lấy ra
        request.setAttribute("list-course", list);

        // 3. Chuyển hướng sang file JSP để hiển thị giao diện
        // Lưu ý quan trọng: KHÔNG dùng PrintWriter khi thực hiện forward
        request.getRequestDispatcher("list-course.jsp").forward(request, response);
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