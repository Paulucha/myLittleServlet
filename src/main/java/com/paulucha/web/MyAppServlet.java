package com.paulucha.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.inject.Inject;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.paulucha.dao.MyAppDao;
import com.paulucha.model.MyApp;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet ("/ImieNazwisko")
public class MyAppServlet extends HttpServlet {
@Inject
   private MyAppDao myAppDao;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String team = req.getParameter("team");

        if (name == null || name.isEmpty() || team== null || team.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
        PrintWriter writer = resp.getWriter();
        LocalDate czas = LocalDate.now();
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
        writer.println(docType +
                "<html>\n" +
                "<head><title>" + name + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<h1 align = \"center\">" + name + "</h1>\n" +
                "<h1 align = \"center\">" + team + "</h1>\n" +
                "<h2 align = \"center\">" + "dzisiejsza data to: " + czas + "</h2>\n" +
                "</body></html>"
        );
//        writer.println("Paulina Przekop, Patataje " + czas + name) ;
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Hello World from my first servlet z metody dopOst");
    }
    }

