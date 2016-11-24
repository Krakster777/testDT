package com.devcolibri.servlet;

import com.test2.bean.UserBean;
import com.test2.entity.User;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list.jsp")
public class MainServlet extends HttpServlet{

    // Аннотация говорит о том,
    // что данный объект будет инициализирован
    // контейнером Glassfish DI
    @EJB
    private MesBean mesBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Получаем список документов
        List<Message> allmes = mesBean.getAll();

        // добавляем полученный список в request,
        // который отправится на jsp
        req.setAttribute("mesages", allmes);

        // отправляем request на jsp
        req.getRequestDispatcher("/list.jsp").forward(req, resp);

    }

}