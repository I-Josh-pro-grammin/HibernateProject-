package org.sms.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import org.sms.dao.StudentDAO;
import org.sms.model.Laptop;
import org.sms.model.Person;
import org.sms.model.PersonNames;
import org.sms.model.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
        PrintWriter pw= res.getWriter();

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String schoolName = req.getParameter("schoolName");
        String academicYear = req.getParameter("academicYear");
        String laptopDesc = req.getParameter("laptopDesc");
        Laptop laptop1 = new Laptop(laptopDesc);

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);

//        String email = req.getParameter("email");

        PersonNames names = new PersonNames(firstName, lastName);
        dao.save(new Student( schoolName, academicYear, laptops, names));

        pw.println("Student created successfully");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setAttribute("students", dao.getAll());
        req.getRequestDispatcher("students.jsp").forward(req, res);
        System.out.println(dao.getAll());
    }
}
