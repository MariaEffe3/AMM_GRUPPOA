package amm.mariafrancescacarboni;
import amm.mariafrancescacarboni.classes.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maria Francesca
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    
    
    private static final String JDBC_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String DB_CLEAN_PATH = "../../web/WEB-INF/db/ammdb";
    private static final String DB_BUILD_PATH = "WEB-INF/db/ammdb";
    
    @Override 
    public void init(){
        String dbConnection = "jdbc:derby:" + this.getServletContext().getRealPath("/") + DB_BUILD_PATH;
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        UtentiFactory.getInstance().setConnectionString(dbConnection);
        OggettiInVenditaFactory.getInstance().setConnectionString(dbConnection);
    }

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
        
        HttpSession session = request.getSession(true);
              
        session.setAttribute("loggedIn", false);
        
        if(request.getParameter("Submit") != null)
        {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            ArrayList<Utente> listaUtenti = UtentiFactory.getInstance().getListaUtenti();
            for(Utente u : listaUtenti)
            {
                if(u.getUsername().equals(username) &&
                   u.getPassword().equals(password))
                {
                    session.setAttribute("loggedIn", true);
                    session.setAttribute("id", u.getId());
                   
                    if(u instanceof UtentiVenditori) 
                    {
                        session.setAttribute("venditore", u);
                        session.setAttribute("utVenditore",true);
                        request.getRequestDispatcher("venditore.jsp").forward(request, response);
                        request.setAttribute("erroreLogin",false);
                       
                    }
                    else
                    {
                        session.setAttribute("cliente", u);
                        request.getRequestDispatcher("cliente.jsp").forward(request, response);
                        session.setAttribute("utVenditore",false);
                        request.setAttribute("erroreLogin",false);
                    }                    
                }
            }
            if (session.getAttribute("loggedIn").equals(false))
            {
                request.setAttribute("erroreLogin", true);
            }
        }
        session.invalidate();
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
