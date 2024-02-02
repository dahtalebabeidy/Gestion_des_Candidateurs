package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Administrateur;
import model.User;
import model.UserManagement;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");

        Administrateur defaultAdmin = new Administrateur();

        if (username.equals(defaultAdmin.getUsername()) && password.equals(defaultAdmin.getPassword())) {
            response.sendRedirect("administrateur.jsp");
            return;
        } else {
        	response.sendRedirect("login.jsp?error=1");
        }
	}
}
