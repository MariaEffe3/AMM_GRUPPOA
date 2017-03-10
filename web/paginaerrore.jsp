<%-- 
    Document   : login
    Created on : 16-gen-2017, 22.15.14
    Author     : Maria Francesca
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login ~ Violet D&egrave;licat</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <meta name="description" content = "Pagina di login di un negozio di profumi online" >
        <meta name="author" content="Maria Francesca Carboni">
        <link rel="icon" href="img/iconasito.png" type="image/png" />
        <link href="style.css" rel="stylesheet" type="text/css" media="screen">
    </head>
    
    <body>
        
        <header> 
            <a id="top"></a>
            <jsp:include page="header.jsp"/>
            
            <div><h2>Errore non hai i permessi necessari</h2></div>
        </header>
        
        <nav class="navside">
            <ul>
                <li class="barraelenco"><a href="#top">Torna su</a></li>
            </ul>
        </nav>
        
        
        <jsp:include page="footer.jsp"/>
        
    </body>
</html>
