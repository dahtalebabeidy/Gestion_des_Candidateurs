<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.AO" %>
<%@ page import="model.AOManagement" %><!DOCTYPE html>
<%@ page import="model.Submission" %>
<%@ page import="model.SubmissionManagement" %>
<%@ page import="model.User" %>
<%@ page import="servlets.UserLoginServlet" %>

<%
    User currentUser = (User) session.getAttribute("currentUser");
    String username = (currentUser != null) ? currentUser.getUsername() : "";
%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Utilisateur</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .dashboard-container {
            display: flex;
            justify-content: space-between;
            padding: 20px;
        }

        .dashboard-button {
            padding: 10px;
            background-color: #00000f;
            color: white;
            text-decoration: none;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .dashboard-button:hover {
            background-color: #fff;
            color: #00000f;
        }
        
        .dashboard-button:hover a {
            color: #00000f;
        }
        
        a {
        	color: white;
        	text-decoration: none;
        }
        
        .container {
            padding: 20px;
            display: flex; /* Updated to create a flex container */
        }
        
        .ao-container,
        .submission-container {
            flex: 1;
            padding: 20px;
        }

        .ao-list-container,
        .submission-list-container {
            margin-top: 20px;
        }

        .ao-item,
        .submission-item {
            margin-bottom: 10px;
            padding: 10px;
            background-color: #ffffff;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
    </style>
</head>
<body>
	<div class="dashboard-container">
	    <button class="dashboard-button"><a href="submissionForm.jsp">Somettre Un Offre</a></button>
	    <button class="dashboard-button"><a href="updateFinancialOfferForm.jsp">Modifier Votre Offre Financier</a></button>
	    <button class="dashboard-button"><a href="userLogin.jsp">Se Deconecter</a></button>
	</div>
	
	<div class="container">
		<div class="ao-container">
		    <h2>Liste des AO</h2>
		    <div class="ao-list-container">
		        <% 
		            List<AO> aoList = AOManagement.getAllAOs();
		            for (AO ao : aoList) {
		        %>
		            <div class="ao-item">
		                <p><strong>AO ID :</strong> <%= ao.getId() %></p>
			            <p><strong>Proposition :</strong> <%= ao.getProposal() %></p>
			            <p><strong>Date Limite :</strong> <%= ao.getDeadline() %></p>
		            </div>
		        <%
		            }
		        %>
		    </div>
		</div>
		
		<div class="submission-container">
		    <h2>Liste des Soumissions</h2>
		    <div class="submission-list-container">
		        <% 
		            List<Submission> submissionList = SubmissionManagement.getSubmissionsByUser(UserLoginServlet.u);
		            for (Submission submission : submissionList) {
		        %>
		            <div class="submission-item">
		                <p><strong>AO ID :</strong> <%= submission.getAoId() %></p>
		                <p><strong>Utilisateur :</strong> <%= submission.getNom() %></p>
		                <p><strong>Adresse :</strong> <%= submission.getAdresse() %></p>
		                <p><strong>Tel :</strong> <%= submission.getTel() %></p>
		                <p><strong>Montant :</strong> <%= submission.getMontant() %></p>
		                <p><strong>Date Soumission :</strong> <%= submission.getDateSoumission() %></p>
		                <p><strong>Reference :</strong></p>
		                <p><strong>Nom du Projet :</strong> <%= submission.getNomProjet() %></p>
		                <p><strong>Pour Quel Client :</strong> <%= submission.getClient() %></p>
		                <p><strong>Montant :</strong> <%= submission.getMontantReference() %></p>
		                <p><strong>Date de Realisation :</strong> <%= submission.getDateRealisation() %></p>
		                <p><strong>Proposition :</strong> <%= submission.getProposal() %></p>
		            </div>
		        <%
		            }
		        %>
		</div>
	</div>
	
</body>
</html>