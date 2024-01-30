package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.*;

import java.io.IOException;

/**
 * Servlet implementation class SubmissionServlet
 */
public class SubmissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SubmissionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aoId = request.getParameter("aoId");

		AOManagement.initializeAOData();
		
	    // Assuming you have a class to manage AO and deadlines (e.g., AOManagement)
	    boolean isAOPresent = AOManagement.isAOPresent(aoId);

	    if (isAOPresent) {
	        // Check if the AO has a proposal
	        AO ao = AOManagement.getAOById(aoId);
	        boolean hasProposal = ao != null && ao.getProposal() != null;

	        if (hasProposal) {
	            // AO exists and has a proposal, proceed with submission
	            String nom = request.getParameter("nom");
	            String adresse = request.getParameter("adresse");
	            String tel = request.getParameter("tel");
	            double montant = Double.parseDouble(request.getParameter("montant"));
	            String dateSoumission = request.getParameter("dateSoumission");
	            String nomProjet = request.getParameter("nomProjet");
	            String client = request.getParameter("client");
	            double montantReference = Double.parseDouble(request.getParameter("montantReference"));
	            String dateRealisation = request.getParameter("dateRealisation");
	            String proposal = request.getParameter("proposal");

	            // Create a new submission
	            Submission submission = new Submission(aoId, nom, adresse, tel,
	                    montant, dateSoumission, nomProjet, client, montantReference, dateRealisation, proposal);

	            // Add the submission to SubmissionManagement
	            SubmissionManagement.addSubmission(submission);
	            
	            System.out.println(submission.getMontant());

	            // Redirect to a success page or perform further actions
	            response.sendRedirect("submissionSuccess.jsp");
	        } else {
	            // AO does not have a proposal, redirect to the form with an error parameter
	            response.sendRedirect("submissionForm.jsp?error=1=1");
	        }
	    } else {
	        // AO does not exist, redirect to the form with an error parameter
	        response.sendRedirect("submissionForm.jsp?error=1=1");
	    }
	}

}
