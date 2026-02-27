<%@ page import="java.util.List" %>
<%@ page import="org.sms.model.Student" %>

<h2>Students</h2>

<form method="post" action="students">

    First Name: <input name="firstName"/>
    Last Name: <input name="lastName"/>
    SchoolName year: <input type="text" name="schoolName" />
    Academic year: <input type="text" name="academicYear" />

    Computer: <input type="text" name="laptopDesc" />

    <button type="submit">Save</button>
</form>

