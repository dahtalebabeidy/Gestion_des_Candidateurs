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
 * Servlet implementation class AddUserServlet
 */
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newUsername = request.getParameter("newUsername");
        String newPassword = request.getParameter("newPassword");

        User newUser = new User(newUsername, newPassword);

        UserManagement.addUser(newUser);

        System.out.println("User added: " + newUser.toString());

        response.sendRedirect("userAdded.jsp");
	}

}
