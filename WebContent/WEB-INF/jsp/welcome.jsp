<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
 <link href="<c:url value="/resources/main.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/main.js" />"></script>
    <link href="<c:url value="/resources/popup.css" />" rel="stylesheet">
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

<style type="text/css">
</style>
</head>
<body>
	<!-- Navigation Bar on Top -->
 	<header id="header">
  		<div class="inner">
   			<a href="index.html" class="logo">Alessandro DS</a>
   			<nav id="nav">
    			<a id="home">Bentornato ${username}</a>
    			<a id="contact">I miei documenti</a>
    			<a id="contact">Il mio profilo</a>
    			<a href="" id="logout">Logout</a>
   			</nav>
  		</div>
 	</header>

</body>
</html>