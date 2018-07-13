package com.paulucha.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet("/ImieNazwisko")
public class MyAppServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String team = req.getParameter("team");

        if (name == null || name.isEmpty() || team == null || team.isEmpty() || surname == null || surname.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        LocalDate czas = LocalDate.now();
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//pl\">\n";
        writer.println(docType +
                "<html>\n" +
                "<head><title>" + request.getParameter("name") + "</title></head>\n" +
                "<br/><h2 align = \"center\"><font color = GREEN>" + " WITAJ!" + "</font></h2>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<h1 align = \"center\"><font color = blue>" + request.getParameter("name") + " " + request.getParameter("surname") + "</font></h1>\n" +
                "<h3 align = \"center\">" + "Twój zespół to:" + "</h1>\n" +
                "<h1 align = \"center\"><font color = blue>" + request.getParameter("team") + "</font></h1>\n" +
                "<h3 align = \"center\">" + "dzisiejsza data to: " + "</h3>\n" +
                "<h2 align = \"center\"><font color = blue>" + czas + "</font></h2>\n" + "<br><br><br>" +
                        "<font color = black>"+"                      .       .\n" +
                "                        / `.   .' \\\n" +
                "                .---.  <    > <    >  .---.\n" +
                "                |    \\  \\ - ~ ~ - /  /    |\n" +
                "                 ~-..-~             ~-..-~\n" +
                "             \\~~~\\.'                    `./~~~/\n" +
                "   .-~~^-.    \\__/                        \\__/\n" +
                " .'  O    \\     /               /       \\  \\\n" +
                "(_____,    `._.'               |         }  \\/~~~/\n" +
                " `----.          /       }     |        /    \\__/\n" +
                "       `-.      |       /      |       /      `. ,~~|\n" +
                "           ~-.__|      /_ - ~ ^|      /- _      `..-'   f: f:\n" +
                "                |     /        |     /     ~-.     `-. _||_||_\n" +
                "                |_____|        |_____|         ~ - . _ _ _ _ _>" + "</font>\n<br>" +
                "</body></html>"
        );


    }
}

