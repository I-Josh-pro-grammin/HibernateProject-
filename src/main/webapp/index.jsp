<%@ page import="java.util.List" %>
<%@ page import="org.sms.model.Student" %>

<h2>Students</h2>

<form method="post" action="students">
    Student Id: <input name="stud_id"/>
    First Name: <input name="firstName"/>
    Last Name: <input name="lastName"/>
    Email: <input name="email"/>
    <button type="submit">Save</button>
</form>

