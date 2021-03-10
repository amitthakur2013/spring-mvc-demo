<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>
	<title>
		Customer confirmation:
	</title>
</head>

<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}
<br/>
The customer has ${customer.freePasses} passes
<br/>
The postal code is: ${customer.postalCode}
<br/>
The course code is : ${customer.courseCode}

</body>

</html>