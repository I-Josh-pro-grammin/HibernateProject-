<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Students</title>
</head>
<body>

<h2>Student List</h2>
<%--
    The scriptlet below is commented out as it's generally not recommended in JSP for presentation logic.
    The JSTL equivalent below provides a cleaner approach.
    for (Student student : students) {
        student.getPersonId();
        student.getNames().getFirstName();
        student.getNames().getLastName();
        System.out.println(student);
    }
--%>
<table border="1" cellpadding="8">
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    <c:forEach var="s" items="${students}">
        <tr>
            <td>${s.personId}</td>
            <td>${s.names.firstName}</td>
            <td>${s.names.lastName}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
