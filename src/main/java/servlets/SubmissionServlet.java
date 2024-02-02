package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.*;

import java.io.IOException;

public class SubmissionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SubmissionServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aoId = request.getParameter("aoId");
		String nom = request.getParameter("nom");
		
	    boolean isAOPresent = AOManagement.isAOPresent(aoId);

	    if (isAOPresent && nom.equals(UserLoginServlet.u)) {
	        AO ao = AOManagement.getAOById(aoId);
	        boolean hasProposal = ao != null && ao.getProposal() != null;

	        if (hasProposal) {
	            String adresse = request.getParameter("adresse");
	            String tel = request.getParameter("tel");
	            double montant = Double.parseDouble(request.getParameter("montant"));
	            String dateSoumission = request.getParameter("dateSoumission");
	            String nomProjet = request.getParameter("nomProjet");
	            String client = request.getParameter("client");
	            double montantReference = Double.parseDouble(request.getParameter("montantReference"));
	            String dateRealisation = request.getParameter("dateRealisation");
	            String proposal = request.getParameter("proposal");

	            Submission submission = new Submission(aoId, nom, adresse, tel,
	                    montant, dateSoumission, nomProjet, client, montantReference, dateRealisation, proposal);

	            SubmissionManagement.addSubmission(submission);
	            
	            System.out.println(submission.getMontant());

	            response.sendRedirect("submissionSuccess.jsp");
	        } else {
	            response.sendRedirect("submissionForm.jsp?error=1=1");
	        }
	    } else {
	        response.sendRedirect("submissionForm.jsp?error=1=1");
	    }
	}
}
