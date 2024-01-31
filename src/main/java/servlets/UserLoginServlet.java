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
 * Servlet implementation class UserLoginServlet
 */
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UserLoginServlet() {
        super();
    }
    
    public static String u = "";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = UserManagement.getUserByUsername(username);

        if (user != null && password.equals(user.getPassword())) {
        	u = username;
        	System.out.println(u);
            response.sendRedirect("user.jsp");
        } else {
            response.sendRedirect("userLogin.jsp?error=1");
        }
	}

}
