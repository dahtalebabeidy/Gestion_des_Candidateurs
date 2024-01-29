<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
		<title>Bienvenu</title>
		<style>
	        body {
	            font-family: Arial, sans-serif;
	            background-color: #f4f4f4;
	            text-align: center;
	            margin: 20vh 0;
	        }
	        
	        .parent {
			    background: white;
			    border: 1px solid #dddddd;
			    padding: 25px;
			    border-radius: 10px;
			    box-shadow: 0 0 10px #00000f;
			    margin: 20px auto;
			    width: 30%;
			}
			
			.parent div {
			    margin: 10px;
			}
			
			.parent input, div button {
			    border: 1px solid #ddd;
			    border-radius: 5px;
			    padding: 10px;
			    font-size: 1.2rem;
			    font-family: 'Nunito';
			    width: 100%;
			}
			
			div button:hover {
				background-color: #00000f;
			    color: white;
			}
			
			div button:hover a {
				color: white;
			}
			
			a {
				text-decoration: none;
				color: buttontext; 
			}
	        
		</style>
	</head>
	<body>
		<div class="parent">
			
			<div>Bienvenu Vous Avez Un :</div>
			
			<div>
				<button><a href="login.jsp">Administrateur</button>
			</div>
			
			<p>Ou</p>
			
			<div>
				<button><a href="userLogin.jsp">Utilisateur</button>
			</div>
		</div>
	</body>
</html>