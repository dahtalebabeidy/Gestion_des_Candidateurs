<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ajouter Un Utilisateur</title>
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

        .error-message {
            color: red;
        }
    </style>
</head>
<body>
    <form action="AddUserServlet" method="post">
        <h2>Ajouter Un Utilisateur</h2>
        <div>
        	<label for="newUsername">nom d'utilisateur:</label>
        	<input type="text" id="newUsername" name="newUsername" required>
        </div>
        
        <div>
        	<label for="newPassword">mot de passe:</label>
        	<input type="password" id="newPassword" name="newPassword" required>
        </div>

		<div>
			<input type="submit" value="Ajouter">
		</div>
		
    </form>
</body>
</html>