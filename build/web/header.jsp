<%-- 
    Document   : Header
    Created on : 18-gen-2017, 17.52.48
    Author     : Maria Francesca
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <a id="top"></a>
            <div><h1>Violet D&egrave;licat</h1></div>
            <nav>
                <ul class="barra">
                    <li id="logo"><img title="logo" alt="Violet D&grave;licat" src="img/logo.png" width="76" height="52"></li>
                    <li class="barraelenco"><a href="login.html">Login</a></li>
                    <form action="Cliente" method="post">
                        <li class="barraelenco"><input type="submit" class="buttonFormLink" value="Cliente"></li>
                    </form>
                    <form action="Venditore" method="post">
                        <li class="barraelenco"><input type="submit" class="buttonFormLink" value="Venditore"></li>
                    </form>
                    <li class="barraelenco"><a href="descrizione.jsp">Descrizione</a></li>
                </ul>
            </nav>
    </body>
</html>
