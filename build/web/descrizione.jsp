<%-- 
    Document   : descrizione
    Created on : 16-gen-2017, 22.15.02
    Author     : Maria Francesca
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--Titolo della pagina-->
        <title> Violet D&egrave;licat ~ Parfumerie </title>
        
        <!--Informazioni meta-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <meta name="description" content = "Pagina web di un negozio di profumi online" >
        <meta name="author" content="Maria Francesca Carboni">
        
        <link rel="icon" href="img/iconasito.png" type="image/png" />
        <link href="style.css" rel="stylesheet" type="text/css" media="screen">
     </head>
     
    <body>
        
        <!--Inserisco un header-->
        <header>
            <jsp:include page="header.jsp"/>
                <!--Creo un link che rimanda all'inizio della pagina-->
            <div>
                <a id="top"></a>
                <p> Benvenuto nel sito di Violet D&egrave;licat </p>
            </div>     
        </header>
        
        <nav class="navside">
            <ul>
                <li class="barraelenco"><a href="#chisiamo">Chi Siamo</a></li>
                <li class="barraelenco"><a href="#catalogo">Catalogo</a></li>
                <li class="barraelenco"><a href="#pagamento">Modalit&agrave; di Pagamento</a></li>
                <li class="barraelenco"><a href="#restituzione">Cambio o Restituzione</a></li>
                <li class="barraelenco"><a href="#marche">Marche disponibili</a></li>
                <li class="barraelenco"><a href="#top">Torna su</a></li>
            </ul>
        </nav>
            
        <article>
            <div>
                <a id="chisiamo">
                    <h2>Chi Siamo</h2>
                    <p> Nata nel centro di Cagliari, miriamo a fornire il profumo perfetto
                        per ogni persona. 
                    <br/>
                        Attraverso dei campioncini di singole essenze che le verranno spedite
                        gratuitamente a casa, 
                        riusciremo a capire attraverso il suo feedback
                        il profumo dalle note olfattive che pi&ugrave; le sar&agrave; gradito.
                     </p>
                </a>
            </div>

            <div>
                <a id="catalogo">
                   <h2>Catalogo</h2>
                   <p>
                       Siamo dotati di un vasto catalogo. 
                       <br/>
                       Potr&agrave; effettuare ricerche di profumi in base a queste categorie:
                   </p>
                       <!--Creo un elenco non numerato--> 
                        <ul class="listatesto">
                            <li>Nota Olfattiva;</li>
                            <li>Marca del profumo</li>
                            <li>Anno di uscita del profumo</li>
                            <li>Profumiere creatore</li>
                            <li>Fragranze per donna</li>
                            <li>Fragranze per uomo</li>
                        </ul>

                    <p>
                        Inoltre il nostro catalogo vi potr&agrave; suggerire in base alle vostre preferenze personali
                        e agli acquisti passati i profumi che potrebbero interessarvi nella vostra pagina utente.
                    </p>
                </a>
            </div>

            <div>
                <a id="pagamento">
                    <h2>Modalit&agrave; di pagamento</h2>

                        <h3>Carta di credito</h3>
                            <p>
                                Il cliente potr&agrave; pagare con carte di credito di tipo American Express,
                                MasterCard e Visa.
                            </p>

                        <h3>Pagamento a consegna</h3>
                            <p>
                                Mettendo l'opzione 'Pagamento a consegna', potr&agrave; comodamente
                                pagare i prodotti da lei desiderati tramite il fattorino delegato,
                                con la comoda aggiunta di 1 €.
                            </p>

                        <h3>Ritiro in negozio</h3>
                            <p>
                                Stampando la ricevuta che ricever&agrave; per email, potr&agrave;
                                ritirare i prodotti ordinati direttamente in negozio, se lo sceglier&agrave;
                            </p>
                </a>
            </div>

            <div>
                <a id="restituzione">
                    <h2>Cambio o restituzione</h2>

                        <h3>Cambio</h3>
                            <p>Nel caso si voglia cambiare il prodotto comperato in precedenza,
                                bisogna che nella boccetta di profumo sia presente pi&uacute; della met&aacute;
                                di liquido originario.</p>

                            <h4>Cambio online</h4>
                                <p>Per effettuare il cambio online &egrave; sufficiente inviare il pacco
                                    al nostro indirizzo col modulo apposito dei cambi compilato, vi sar&aacute; spedito a casa
                                    il nuovo profumo gratuitamente.
                                </p>

                            <h4>Cambio in negozio</h4>
                            <p>Per cambiare il profumo in negozio &eacute; sufficiente portare il profumo e la ricevuta</p>

                        <h3>Restituzione con rimborso</h3>
                            <p>Vi sono due modalit&agrave; di restituzione: in negozio o online.
                               Il denaro vi sar&agrave; restituito entro 2 settimane dalla richiesta.
                            </p>
                </a>
            </div>
            <br/>
            
            <div>
                <a id="marche">
                    <h2>Marche disponibili</h2>
                    <p>Elenco di marche attualmente disponibili:</p>
                    <ul>
                        <li><img title="basechanel" alt="Chanel" src="img/BaseChanel.png" width="150" height="150"></li>
                        <li><img title="basedandg" alt="Dolce and Gabbana" src="img/BaseDandG.png" width="150" height="150"></li>
                        <li><img title="basedior" alt="Dior" src="img/BaseDior.png" width="150" height="150"></li>         
                        <li><img title="basevalentino" alt="Valentino" src="img/BaseValentino.png" width="150" height="150"></li>         
                        <li><img title="basegiorgioarmani" alt="Dior" src="img/BaseGiorgioArmani.png" width="150" height="150"></li>         
                    </ul>
                </a>
            </div>
        </article>
       
        <jsp:include page="footer.jsp"/>
    </body>    
    
</html>
