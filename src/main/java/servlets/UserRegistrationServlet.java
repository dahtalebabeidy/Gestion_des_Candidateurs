package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;
import model.UserManagement;

import java.io.IOException;

/**
 * Servlet implementation class UserRegistrationServlet
 */
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UserRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newUsername = request.getParameter("newUsername");
        String newPassword = request.getParameter("newPassword");

        // Create a new user instance
        User newUser = new User(newUsername, newPassword);

        // Add user to UserManagement
        UserManagement.addUser(newUser);

        // Log information for debugging
        System.out.println("User added: " + newUser.toString());

        // Redirect to a success page or perform further actions
        response.sendRedirect("userRegistered.jsp");
	}

}
