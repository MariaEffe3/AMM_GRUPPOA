<%-- 
    Document   : venditore
    Created on : 16-gen-2017, 22.15.22
    Author     : Maria Francesca
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Venditore ~ Violet D&egrave;licat</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <meta name="description" content = "Pagina del venditore di un negozio di profumi online" >
        <meta name="author" content="Maria Francesca Carboni">
        <link rel="icon" href="img/iconasito.png" type="image/png" />
        <link href="style.css" rel="stylesheet" type="text/css" media="screen">
    </head>
    
    
    
    <body>
        <header>
            <!--Aggiungo la sezione di navigazione con i link a login.html e descrizione.html-->
            <jsp:include page="header.jsp"/>
            <div>
                <a id="top"></a>
                <h2>Venditore</h2> 
            </div>
        </header>
        
        <nav class="navside">
            <ul>
                <li class="barraelenco"><a href="#top">Torna su</a></li>
            </ul>
        </nav>
            
        
        <article class="compil">
                <h3>Venditore ${venditore.nome} ${venditore.cognome}</h3>
                <div class="right">
                    <form action="Venditore_2" method="post">
                        <div class="tablogven"> 
                            <span class="row">
                                <label for="idOggetto" class='cell'>Numero id oggetto: </label>
                                <input type="text" name="idOggetto" id='idOggetto' class='cell1'>
                            </span>
                            
                            <span class="row">
                            <!--Tramite una input di tipo text creo lo spazio per inserire il nome dell'oggetto-->
                                <label for="nomeOggetto" class="cell">Nome Oggetto: </label>
                                <input type="text" name="nomeoggetto" id="nomeoggetto" class="cell1"/>
                            </span>
                            
                            <span class="row">
                                <label for="marcaOggetto" class='cell'>Marca oggetto: </label>
                                <input type="text" name="marcaOggetto" id="marcaOggetto" class='cell1'>
                            </span>
                            
                            <span class="row">
                            <!--Tramite una input di tipo text creo lo spazio per inserire l'URL dell'immagine-->
                                <label for="url" class="cell">URL Immagine: </label>
                                <input type="text" name="url" id="url" class="cell1"/>  
                            </span>

                            <span class="row">
                            <!--Tramite una textarea creo lo spazio per inserire la descrizione dell'oggetto
                                specificando che vi sarà uno spazio di visualizzazione di 6 righe e 35 colonne
                            -->
                                <label for="descrizione" class="cell" id="descr">Descrizione Oggetto:</label>
                                <textarea rows="6" cols="35" name="descrizione" id="descrizione" class="cell1"></textarea>
                            </span>

                            <span class="row">
                            <!--Tramite una input di tipo text creo lo spazio per inserire il prezzo dell'oggetto-->
                                <label for="prezzo" class="cell">Prezzo Oggetto: </label>
                                <input type="text" name="prezzo" id="prezzo" class="cell1"/>
                            </span>

                            <span class="row">
                            <!--Tramite una input di tipo text creo lo spazio per inserire la quantita' di oggetti disponibili-->
                                <label for="quantita" class="cell">Quantit&agrave; Disponibili:</label>
                                <input type="text" name="quantita" id="quantita" class="cell1"/>             
                            </span>

                            <span class="row">
                            <!--Creo un pulsante di tipo input che inviera' i dati a venditore.html in questo caso-->    
                                <input id="button" type="submit" name="submitOggetto" value="Aggiungi Oggetto"/>
                            </span>
                            <c:if test="${oggettoInserito.equals(true)}">
                                <ul class="avviso">
                                    <li>Oggetto inserito correttamente</li>
                                    <li>Id: ${oggettoImmesso.id}</li>
                                    <li>Nome: ${oggettoImmesso.nomeOggetto}</li>
                                    <li>Marca: ${oggettoImmesso.marca}</li>
                                    <li>Url Immagine: ${oggettoImmesso.urlImmagine}</li>
                                    <li>Descrizione: ${oggettoImmesso.descrizione}</li>
                                    <li>Prezzo: ${oggettoImmesso.prezzoOggetto}</li>
                                    <li>Quantit&agrave;: ${oggettoImmesso.quantitaOggetto}</li>
                                </ul>
                            </c:if>
                            <span class="row">
                            </span>
                            
                            
                        </div>
                    </form>
                </div>
            </article>
                <jsp:include page="footer.jsp"/>
        
    
    </body>
</html>
