package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Administrateur;

import java.io.IOException;

/**
 * Servlet implementation class ChangePasswordServlet
 */
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ChangePasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");

        // Check if the provided old password matches the current password
        if (oldPassword.equals(Administrateur.password)) {
            // Update the password in the Administrator object
        	Administrateur.password = newPassword;

            // Redirect to a success page or perform further actions
            response.sendRedirect("passwordChanged.jsp");
        } else {
            // Redirect back to the change password page with an error message
            response.sendRedirect("changePassword.jsp?error=1");
        }
	}

}