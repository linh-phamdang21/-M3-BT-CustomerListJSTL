package controller;

import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CustomerServlet", urlPatterns = "/show")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher;
        ArrayList<Customer> customerList = new ArrayList();
        customerList.add(new Customer("Pham Dang Linh", "21/04/1996", "Tay Ho"));
        customerList.add(new Customer("Pham Phuong Linh", "28/08/2000", "My Dinh"));
        customerList.add(new Customer("Vu Quang Nguyen", "23/08/1996", "Hai Duong"));
        customerList.add(new Customer("Luong Minh Thu", "23/07/1996", "Thai Binh"));

        requestDispatcher = request.getRequestDispatcher("customerShow.jsp");
        request.setAttribute("List", customerList);
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
