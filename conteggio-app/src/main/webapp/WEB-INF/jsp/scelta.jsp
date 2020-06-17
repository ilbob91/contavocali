 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scegli</title>
</head>
<body>
<form action="contaParole" method="post">
<input type="submit" value="Conta le parole">
<input type="hidden"  name="testo" value=  "${testo}">
</form>
<form action="contaVocali" method="post">
<input type="submit" value="Conta le vocali">
<input type="hidden"  name="testo" value=  "${testo}">
</form>
<form action="contaConsonanti" method="post">
<input type="submit" value="Conta le consonanti">
<input type="hidden"  name="testo" value=  "${testo}">
</form>
</body>
</html>