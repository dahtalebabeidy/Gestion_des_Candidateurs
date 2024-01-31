<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
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
	<form action="addAO" method="post">
        <h2>Ajouter Un AO</h2>
        <div>
        	<label for="id">AO ID :</label>
        	<input type="text" id="id" name="id" required>
        </div>
        
        <div>
        	<label for="proposal">Proposition :</label>
        	<input type="text" id="proposal" name="proposal" required>
        </div>

		<div>
        	<label for="deadline">Date Limite :</label>
        	<input type="date" id="deadline" name="deadline" required>
        </div>

		<div>
			<input type="submit" value="Ajouter">
		</div>
			
        <% if (request.getParameter("error") != null) { %>
            <p class="error-message">Entre Un Nouveau AO.</p>
        <% } %>
    </form>
	
</body>
</html>