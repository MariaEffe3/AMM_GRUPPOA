<%-- 
    Document   : cliente
    Created on : 16-gen-2017, 22.13.46
    Author     : Maria Francesca
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cliente ~ Violet D&egrave;licat</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <meta name="description" content = "Pagina del cliente di un negozio di profumi online" >
        <meta name="author" content="Maria Francesca Carboni">
        
        <link rel="icon" href="img/iconasito.png" type="image/png" />
        <link href= "style.css" rel= "stylesheet" type= "text/css" media= "screen">
    </head>
    
    <body>
        <header>
            <a id="top"></a>
            <jsp:include page="header.jsp"/>
            <div><h2>Cliente</h2></div>
        </header>
        
        <nav class="navside">
            <ul>
                <li class="barraelenco"><a href="#top">Torna su</a></li>
            </ul>
        </nav>
            
        <article>
            <h3>Cliente ${cliente.nome} ${cliente.cognome}</h3>
            <h2>Tabella Cliente</h2>
            
            <c:if test="${sendObject.equals(true)}">
                        <!--Ricapitolamento Ordine!-->
                <div id="right">
                        <ul class="avviso">
                            <li>Hai aggiunto ${oggetto.nomeOggetto}</li>
                            <li>Descrizione: ${oggetto.descrizione}</li>
                            <li>Prezzo: ${oggetto.prezzoOggetto}</li>
                            <li>Quantit&agrave;: ${oggetto.quantitaOggetto}</li>
                            <li>Id oggetto: ${oggetto.id}</li>
                        </ul>
                        
                        <form action="Cliente_3" method="post">
                            <input type="submit" name="conferma" value="Conferma l'acquisto">
                            <c:if test="${acquistoConfermato.equals(true)}">
                                <c:if test="${cliente.saldoContoCliente >= oggetto.prezzoOggetto}">
                                    <ul class="avviso">
                                        <li>Il profumo ${oggetto.nomeOggetto} &egrave; stato acquistato correttamente</li>
                                    </ul>
                                </c:if>
                        </form>
                                <c:otherwise>
                                    <ul class='avviso'>
                                        <li>Il tuo credito risulta insufficiente per la richiesta di acquisto.</li>
                                    </ul>
                                </c:otherwise>
                       
                            </c:if>
                </div>
            </c:if>
                        
            <form action="Cliente_2" method="post">
                <div class="right">
                    <table id="tabcliente">
                        <tr>
                            <th>Nome Oggetto</th>
                            <th>Immagine</th>
                            <th>Q.&agrave; Disponibili</th>
                            <th>Prezzo</th>
                            <th>Aggiungi al carrello</th>
                        </tr>

                        <tr class="pari">
                            <td>Miss Dior Eau de Parfum</td>
                            <td><img title="missdior" alt="Miss Dior Eau de Parfum" src="img/Miss_Dior.jpg" width="200" height="200">
                            <td>23</td>
                            <td>60,00 €</td>
                            <td><input type="image" name="subMissDior" title="addcart" alt="Aggiungi al Carrello" src="img/aggiungi_it.gif"
                                       width="100" height="37" ></td>
                        </tr>


                        <tr>
                            <td>Dior Addict Eau de Parfum</td>
                            <td><img title="dioraddict" alt="Dior Addict Eau de Parfum" src="img/dioraddict_edp.jpg" width="200" height="200">
                            <td>36</td>
                            <td>60,30 €</td>
                            <td><input type="image" name="subDiorAddict" title="addcart" alt="Aggiungi al Carrello"  src="img/aggiungi_it.gif" 
                                       width="100" height="37" ></td>
                        </tr>


                        <tr class= "pari"> 
                            <td>J'adore Eau de Parfum</td>
                            <td><img title="jadore" alt="J'adore Eau de Parfum" src="img/jadore_edp.jpg" width="200" height="200">
                            <td>42</td>
                            <td>62,60 €</td>
                            <td><input type="image" name="subJAdore" title="addcart" alt="Aggiungi al Carrello" src="img/aggiungi_it.gif"
                                       width="100" height="37" ></td>
                        </tr>


                        <tr>
                            <td>Poison Girl</td>
                            <td><img title="poisongirl" alt="Poison Girl" src="img/poisongirl_edp.jpg" width="200" height="200">
                            <td>39</td>
                            <td>55,30 €</td>
                            <td><input type="image" name="subPoison" title="addcart" alt="Aggiungi al Carrello" src="img/aggiungi_it.gif" 
                                       width="100" height="37" ></td>
                        </tr>

                        <tr class="pari">
                            <td>Bleu de Chanel Eau de Toilette</td>
                            <td><img title="bleudechanel" alt="Bleu de Chanel Eau de Toilette" src="img/bleudechanel_edt.jpg" width="200" height="200">
                            <td>63</td>
                            <td>60,00 €</td>
                            <td><input type="image" name="subBleu" title="addcart" alt="Aggiungi al Carrello" src="img/aggiungi_it.gif" 
                                        width="100" height="37" ></td>
                        </tr>

                    </table>
                </div>
            </form>
            
            
        </article> 
            <br/><br/>

        <jsp:include page="footer.jsp"/>
    </body>
</html>
