package com.fadi;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Fadi on 19-Apr-17.
 */
@WebServlet(name = "Servlet",urlPatterns = "/newwelcome")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String [] welcomeMessageArray = {"Hello", "World", "It's Spring's time"};
//        request.setAttribute("myWelcomeArray",welcomeMessageArray);

        GetData getData = new GetData();

        List<Country> countries = getData.getCountries();

        request.setAttribute("countries",countries);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcomeNew.jsp");
        requestDispatcher.forward(request,response);

    }
    }

