package com.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author user
 * @date 2019.9.17
 * 登陆的请求响应
 */

@WebServlet(urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求乱码
        req.setCharacterEncoding("UTF8");
        //通过req请求参数获取前台表单的用户参数
        String username = req.getParameter("username");
        //跳转之前把用户名存入req对象
        String password = req.getParameter("password");
        //把用户密码存入req对象
        req.setAttribute("username",username);
        req.setAttribute("password",password);
        //通过req跳转
        System.out.println(username);
        System.out.println(password);
        //http://localhost:8080/index.jsp
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
        //resp.sendRedirect("/index.jsp");//重定位

        //通过req请求对象获取session会话对象
        HttpSession session = req.getSession();
        //把用户名存入session
        session.setAttribute("username",username);
        //同过resp跳转
        resp.sendRedirect("/index.jsp");
    }
}
