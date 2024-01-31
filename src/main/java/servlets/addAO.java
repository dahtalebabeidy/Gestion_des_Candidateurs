package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AO;
import model.AOManagement;

import java.io.IOException;

public class addAO extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public addAO() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aoId = request.getParameter("id");
		String deadline = request.getParameter("deadline");
		String proposal = request.getParameter("proposal");
        
        if (AOManagement.isAOPresent(aoId)) {
        	response.sendRedirect("addAO.jsp?error=1");
        } else {
        	AO ao = new AO(aoId, deadline, proposal);

            AOManagement.addAO(ao);
            
            response.sendRedirect("administrateur.jsp");
        }
	}

}
