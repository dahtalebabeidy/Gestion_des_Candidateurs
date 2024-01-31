<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
		<title>Somettre Un Offre</title>
		<style>
	        body {
	            font-family: Arial, sans-serif;
	            background-color: #f4f4f4;
	            text-align: center;
	            margin: 20vh 0;
	        }
	
	        form {
			    background: white;
			    border: 1px solid #dddddd;
			    padding: 25px;
			    border-radius: 10px;
			    box-shadow: 0 0 10px #00000f;
			    margin: 20px auto;
			    width: 30%;
			}
			
			form div {
			    margin: 10px;
			}
			
			form input, form button {
			    border: 1px solid #ddd;
			    border-radius: 5px;
			    padding: 10px;
			    font-size: 1.2rem;
			    font-family: 'Nunito';
			    width: 100%;
			}
			
			form label {
			    display: inherit;
			    font-size: .9rem;
			    padding-bottom: 3px;
			    color: #9d9d9d;
			}
			
			form input[type="submit"], form button {
			    border: 1px solid #ddd;
			    padding: 10px 25px;
			    font-size: 1.1rem;
			    margin: 10px 0;
			    border-radius: 5px;
			    cursor: pointer;
			}
			
			form input[type="submit"]:hover, form button:hover {
			    background-color: #00000f;
			    color: white;
			}
			
			form button:hover a {
				color: white;
			}
			
			form button {
				margin: 0px;
			}
			
			form a {
			    text-decoration: none;
			    color: buttontext;
			}
			
			a:hover {
				color: #999
			}
	
	        .error-message {
	            color: red;
	        }
	    </style>
	</head>
	<body>
		<form action="SubmissionServlet" method="post">
	        <h2>Somettre Un Offre</h2>
	        <div>
	        	<label for="aoId">AO ID :</label>
	        	<input type="text" name="aoId" required>
	        </div>
	        
	        <div>
	        	<label for="proposal">Proposition :</label>
	        	<input type="text" name="proposal" required>
	        </div>
	        
	        <div>
	        	<label for="nom">Nom d'utilisateur :</label>
	        	<input type="text" name="nom" required>
	        </div>
	        
	        <div>
	        	<label for="adresse">Adresse :</label>
	        	<input type="text" name="adresse" required>
	        </div>
	        
	        <div>
	        	<label for="tel">Tel :</label>
	        	<input type="text" name="tel" required>
	        </div>
	        
	        <div>
	        	<label for="montant">Montant :</label>
	        	<input type="number" name="montant" required>
	        </div>
	        
	        <div>
	        	<label for="dateSoumission">Date de soumission :</label>
	        	<input type="text" name="dateSoumission" required>
	        </div>
	
			<p>Références:</p>
			
			<div>
	        	<label for="nomProjet">Nom du projet :</label>
	        	<input type="text" name="nomProjet" required>
	        </div>
	        
	        <div>
	        	<label for="client">Pour quel client :</label>
	        	<input type="text" name="client" required>
	        </div>
	        
	        <div>
	        	<label for="montantReference">Montant (référence) :</label>
	        	<input type="number" name="montantReference" required>
	        </div>
	        
	        <div>
	        	<label for="dateRealisation">Date de réalisation :</label>
	        	<input type="date" name="dateRealisation" required>
	        </div>
	
			<div>
				<input type="submit" value="Enregistrer">
			</div>
				
	        <% if (request.getParameter("error") != null) { %>
	            <p class="error-message">Vous devez saisir un AO existe.</p>
	        <% } %>
	    </form>
	</body>
</html>