package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.AO;
import model.AOManagement;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ExtendAOServlet
 */
public class ExtendAOServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ExtendAOServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aoId = request.getParameter("aoId");
	    String newDeadline = request.getParameter("newDeadline");
	    
	    boolean isAOPresent = AOManagement.isAOPresent(aoId);

	    if (isAOPresent) {
	        AOManagement.extendAODeadline(aoId, newDeadline);
	        
	        List<AO> allAOs = AOManagement.getAllAOs();
	        for (AO ao : allAOs) {
	            System.out.println("AO ID: " + ao.getId() + ", Deadline: " + ao.getDeadline());
	        }
	        
	        response.sendRedirect("aoExtended.jsp");
	    } else {
	        response.sendRedirect("extendAOForm.jsp?error=1");
	    }
    }

}
