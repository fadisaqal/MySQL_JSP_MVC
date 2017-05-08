package com.fadi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Fadi on 03-May-17.
 */
@WebServlet(name = "Controller",urlPatterns = "/controller")
public class Controller extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Country myCountry = new Country();
        String button = request.getParameter("button");

        if ("submit".equals(button)) {
            String searchCriteria = request.getParameter("item");
            GetData getData = new GetData();
            getData.getCountryNameByCode(searchCriteria);
            response.sendRedirect("/newwelcome");
        }

//        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        req.setAttribute("countries",countries);
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("welcomeNew.jsp");
//        requestDispatcher.forward(req,resp);

    }

}
