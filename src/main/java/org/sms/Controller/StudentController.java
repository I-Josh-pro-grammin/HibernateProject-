package org.sms.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import org.sms.dao.StudentDAO;
import org.sms.model.Student;

import java.io.IOException;

@WebServlet("/students")
public class StudentController extends HttpServlet {

    private StudentDAO dao;

    @Override
    public void init() {
        dao = new StudentDAO();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String firstName = req.getParameter("firstName");
        int stud_id = Integer.parseInt(req.getParameter("stud_id"));
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");

        dao.save(new Student(firstName, lastName, email));

        res.sendRedirect("students.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setAttribute("students", dao.getAll());
        req.getRequestDispatcher("students.jsp").forward(req, res);
        System.out.println(dao.getAll());
    }
}
