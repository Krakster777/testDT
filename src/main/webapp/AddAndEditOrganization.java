package com.testdb.servlet;

import com.test2.bean.UserBean;
import com.test2.entity.User;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add.jsp")
public class AddAndEditMessage extends HttpServlet {

    @EJB
    private MesBean mesBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        req.setCharacterEncoding("UTF-8");

        if(req.getParameter("edit") != null){
            long id = Long.valueOf(req.getParameter("edit"));
            Message mes = mesBean.get(id);

            req.setAttribute("mes", mes);
        }

        req.getRequestDispatcher("/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        req.setCharacterEncoding("UTF-8");

        String predm = req.getParameter("predm");
        String textmes = req.getParameter("text");

        // если id есть, то выполняется редактирование
        // а если нет id, то - это значит, что создается новый документ
        if(req.getParameter("id") != ""){
            long id = Long.valueOf(req.getParameter("id"));
            Message mes = mesBean.get(id);
            mes.setPredmet(predm);
            mes.setText(text);

            // обновляем док
            mesBean.update(mes);
        } else{
            // добавляем новый
            mesBean.add(new Message(predm,text));
        }

        // перенаправляем на сервлет, который выводит все документы
        resp.sendRedirect("list.jsp");
    }
}