package com.example.tranvanlamnsc.servlet;

import com.example.tranvanlamnsc.dao.UserDao;
import com.example.tranvanlamnsc.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao dao = new UserDao();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String user = dao.getUser(username, password);

        if (user != null) {
            PrintWriter out = response.getWriter();
            out.append(user.toString());
        }else {
            PrintWriter out = response.getWriter();
            out.append("error");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}

