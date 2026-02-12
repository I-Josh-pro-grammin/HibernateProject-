<%@ page import="org.sms.model.Student" %>
<%@ page import="org.sms.Controller.StudentController" %>
<%@ page import="org.sms.dao.StudentDAO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>


<%!
    StudentDAO studentDao = new StudentDAO();
    List<Student> students = studentDao.getAll();
%>
<html>
<head>
    <title>Students</title>
</head>
<body>

<h2>Student List</h2>
<%
    for (Student student : students) {
        student.getId();
        student.getEmail();
        student.getFirstName();
        student.getLastName();
        System.out.println(student);
    }

%>
<table border="1" cellpadding="8">
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
    </tr>
    <c:forEach var="s" items="${students}">
        <tr>
            <td>${s.id}</td>
            <td>${s.firstName}</td>
            <td>${s.lastName}</td>
            <td>${s.email}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
