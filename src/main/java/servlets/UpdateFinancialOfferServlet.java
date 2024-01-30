package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Submission;
import model.SubmissionManagement;

import java.io.IOException;

/**
 * Servlet implementation class UpdateFinancialOfferServlet
 */
public class UpdateFinancialOfferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateFinancialOfferServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aoId = request.getParameter("aoId");
	    String submitterName = request.getParameter("submitterName");

	    Submission submission = SubmissionManagement.findSubmission(aoId, submitterName);

	    if (submission != null) {
	        double newFinancialOffer = Double.parseDouble(request.getParameter("newFinancialOffer"));

	        submission.setMontant(newFinancialOffer);
	        
	        System.out.println(submission.getMontant());

	        response.sendRedirect("updateFinancialOfferSuccess.jsp");
	    } else {
	        response.sendRedirect("updateFinancialOfferForm.jsp?error=1");
	    }
	}

}
