/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.mariafrancescacarboni;
import amm.mariafrancescacarboni.classes.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Maria
 */
@WebServlet(name = "Venditore_2", urlPatterns = {"/Venditore_2"})
public class Venditore_2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(false);
        
        String nomeOggetto = request.getParameter("nomeOggetto");
        String urlImmagine = request.getParameter("url");
        String descrizione = request.getParameter("descrizione");
        double prezzo = Double.parseDouble(request.getParameter("prezzo"));
        int quantita = Integer.parseInt(request.getParameter("quantita"));
        int idOggetto = Integer.parseInt(request.getParameter("idOggetto"));
        String marcaOggetto = request.getParameter("marcaOggetto");
        
        OggettiInVendita nuovoOggetto = new OggettiInVendita();
        nuovoOggetto.setId(idOggetto);
        nuovoOggetto.setDescrizione(descrizione);
        nuovoOggetto.setNomeOggetto(nomeOggetto);
        nuovoOggetto.setPrezzoOggetto(prezzo);
        nuovoOggetto.setQuantitaOggetto(quantita);
        nuovoOggetto.setMarca(marcaOggetto);
        nuovoOggetto.setUrlImmagine(urlImmagine);
        
        
        if(request.getParameter("submitOggetto") != null)
        {
            session.setAttribute("oggettoImmesso", nuovoOggetto);
            request.setAttribute("oggettoInserito", true);
            request.getRequestDispatcher("venditore.jsp").forward(request, response); 
        }
        
        else
        {
            request.getRequestDispatcher("paginaerrore.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
