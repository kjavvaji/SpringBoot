<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Screen</title>
</head>
<body>
		<form action="addAlien">
				      Aid:  <input type ="text" name ="aid"><br>
					  AName:	 <input type="text" name ="aName"><br>
					  Technology:	 <input type="text" name ="tech"><br>
				<input type="submit" value="Add">
		</form>
		<br><br><br> 
		<form action="getAlien">
				      
				      Aid:  <input type ="text" name ="aid"><br>
					   
					  <input type="submit" value="Search">
		</form>	
		<br><br><br> 
		
		<form action="delAlien">
				      
				      Aid:  <input type ="text" name ="aid"><br>
					   
					  <input type="submit" value="Delete">
		</form>	
		<br><br><br> 	
		<form action="updateAlien">
				      Aid:  <input type ="text" name ="aid"><br>
					  AName:	 <input type="text" name ="aName"><br>
					  Technology:	 <input type="text" name ="tech"><br>
				<input type="submit" value="update">
		</form>
		<br><br><br>	
			
			
</body>
</html>