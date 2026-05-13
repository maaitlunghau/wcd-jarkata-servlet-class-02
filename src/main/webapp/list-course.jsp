<%@ page import="java.util.List" %>
<%@ page import="org.aptech.buoi_02.entity.Course" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Course List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="container mt-5">
    <h2 class="mb-4">Danh sách khóa học</h2>
    <table class="table table-bordered table-hover">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Code</th>
                <th>Name</th>
                <th>Semester</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <% 
                List<Course> list = (List<Course>) request.getAttribute("list-course"); 
                if (list != null) {
                    for (Course data : list) { 
            %>
            <tr>
                <td><%= data.getId() %></td>
                <td><%= data.getCode() %></td>
                <td><%= data.getName() %></td>
                <td><%= data.getSemester() %></td>
                <td>
                    <a href="#" class="btn btn-sm btn-primary">Edit</a>
                    <a href="#" class="btn btn-sm btn-danger">Delete</a>
                </td>
            </tr>
            <% 
                    } 
                } else {
            %>
            <tr>
                <td colspan="5" class="text-center">Không có dữ liệu trong danh sách</td>
            </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>