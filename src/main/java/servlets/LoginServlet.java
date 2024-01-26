package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Administrateur;

import java.io.IOException;

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
            // Successful login, redirect to a welcome page or perform further actions
            response.sendRedirect("welcome.jsp");
        } else {
            // Failed login, redirect back to the login page with an error message
            response.sendRedirect("login.jsp?error=1");
        }
	}

}
