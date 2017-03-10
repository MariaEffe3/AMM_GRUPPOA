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
            
            <div><h2>Login</h2></div>
        </header>
        
        <nav class="navside">
            <ul>
                <li class="barraelenco"><a href="#top">Torna su</a></li>
            </ul>
        </nav>
        
        <article class="compil">
            <h4>Inserisci i tuoi dati</h4>
            <div class="right">
                <form method="post" action="Login">
                    <input type="hidden" name="cmd" value="Login">
                    <div class="tablogven">
                            
                            <span class="row">
                            <!--Creo lo spazio per inserire il nome utente-->
                                <label for="nomeutente" class="cell">Nome Utente:</label>
                                <input type="text" name="Username" id="nomeutente" class="cell1"/>
                            </span>

                            <span class="row">
                                <!--Creo lo spazio per inserire la password-->
                                <label for="pass" class="cell">Password:</label>
                                <input type="password" name="Password" id="password" class="cell1"/>
                            </span>

                        </div>
                        <span class="row">
                        <!--Creo il pulsante per inviare il form-->
                        <input id="button" type="submit" name="Submit" value="Accedi" />
                        </span>
                    
                        <c:if test="${erroreLogin.equals(true)}">
                            <span class="row">
                                <ul class="errore">
                                <li>Hai immesso dei dati sbagliati</li>
                                </ul>
                            </span>
                        </c:if>
                    </form>
                </div>
        </article>
        
        <jsp:include page="footer.jsp"/>
        
    </body>
</html>
