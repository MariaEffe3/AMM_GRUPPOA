/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.mariafrancescacarboni.classes;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Maria
 */
public class UtentiFactory {
    
    private static UtentiFactory singleton;
    String connectionString;
    
    public static UtentiFactory getInstance()
    {
        if (singleton == null)
            singleton = new UtentiFactory();
        
        return singleton;
    }
    
    private ArrayList<UtentiClienti> listaUtentiClienti = new ArrayList<>();
    private ArrayList<UtentiVenditori> listaUtentiVenditori = new ArrayList<>();
    
    private UtentiFactory()
    {
        //Clienti
        UtentiClienti cliente_1 = new UtentiClienti();
        cliente_1.setId(01);
        cliente_1.setNome("Ginevra");
        cliente_1.setCognome("Spada");
        cliente_1.setUsername("ginevra");
        cliente_1.setPassword("lancillotto");
        cliente_1.setVenditore(Boolean.FALSE);
        cliente_1.setSaldoContoCliente(70.30);
        listaUtentiClienti.add(cliente_1);
        
        UtentiClienti cliente_2 = new UtentiClienti();
        cliente_2.setId(02);
        cliente_2.setNome("Orlando");
        cliente_2.setCognome("Furioso");
        cliente_2.setUsername("orlando");
        cliente_2.setPassword("angelica");
        cliente_2.setVenditore(Boolean.FALSE);
        cliente_2.setSaldoContoCliente(20.30);
        listaUtentiClienti.add(cliente_2);
        
        UtentiClienti cliente_3 = new UtentiClienti();
        cliente_3.setId(03);
        cliente_3.setNome("Eloisa");
        cliente_3.setCognome("Parigi");
        cliente_3.setUsername("eloisa");
        cliente_3.setPassword("abelardo");
        cliente_3.setVenditore(Boolean.FALSE);
        cliente_3.setSaldoContoCliente(60.00);
        listaUtentiClienti.add(cliente_3);
        
        UtentiClienti cliente_4 = new UtentiClienti();
        cliente_4.setId(04);
        cliente_4.setNome("Clorinda");
        cliente_4.setCognome("Liberata");
        cliente_4.setUsername("clorinda");
        cliente_4.setPassword("tancredi");
        cliente_4.setVenditore(Boolean.FALSE);
        cliente_4.setSaldoContoCliente(33.20);
        listaUtentiClienti.add(cliente_4);
        
        UtentiClienti cliente_5 = new UtentiClienti();
        cliente_5.setId(05);
        cliente_5.setNome("Isotta");
        cliente_5.setCognome("Veleno");
        cliente_5.setUsername("isotta");
        cliente_5.setPassword("tristano");
        cliente_5.setVenditore(Boolean.FALSE);
        cliente_5.setSaldoContoCliente(80.90);
        listaUtentiClienti.add(cliente_5);
        
        //Venditori
        UtentiVenditori venditore_1 = new UtentiVenditori();
        venditore_1.setId(10);
        venditore_1.setNome("Odisseo");
        venditore_1.setCognome("Laerziade");
        venditore_1.setUsername("odisseo");
        venditore_1.setPassword("penelope");
        venditore_1.setVenditore(Boolean.TRUE);
        listaUtentiVenditori.add(venditore_1);
        
        UtentiVenditori venditore_2 = new UtentiVenditori();
        venditore_2.setId(11);
        venditore_2.setNome("Achille");
        venditore_2.setCognome("Pelide");
        venditore_2.setUsername("achille");
        venditore_2.setPassword("patroclo");
        venditore_2.setVenditore(Boolean.TRUE);
        listaUtentiVenditori.add(venditore_2);
        
        UtentiVenditori venditore_3 = new UtentiVenditori();
        venditore_3.setId(12);
        venditore_3.setNome("Ettore");
        venditore_3.setCognome("Priamide");
        venditore_3.setUsername("ettore");
        venditore_3.setPassword("andromaca");
        venditore_3.setVenditore(Boolean.TRUE);
        listaUtentiVenditori.add(venditore_3);
        
        UtentiVenditori venditore_4 = new UtentiVenditori();
        venditore_4.setId(13);
        venditore_4.setNome("Agamennone");
        venditore_4.setCognome("Atride");
        venditore_4.setUsername("agamennone");
        venditore_4.setPassword("clitemnestra");
        venditore_4.setVenditore(Boolean.TRUE);
        listaUtentiVenditori.add(venditore_4);
        
        UtentiVenditori venditore_5 = new UtentiVenditori();
        venditore_5.setId(14);
        venditore_5.setNome("Cassandra");
        venditore_5.setCognome("Priamide");
        venditore_5.setUsername("cassandra");
        venditore_5.setPassword("apollo");
        venditore_5.setVenditore(Boolean.TRUE);
        listaUtentiVenditori.add(venditore_5);
    }

    /**
     * @return the listaUtentiClienti
     */
    public ArrayList<UtentiClienti> getListaUtentiClienti() 
    {
        return listaUtentiClienti;
    }
    
    
    public UtentiClienti getCliente(int id)
    {
        for(UtentiClienti i : listaUtentiClienti)
            return i;
        
        return null;
    }
    /**
     * @return the listaUtentiVenditori
     */
    
    public ArrayList<UtentiVenditori> getListaUtentiVenditori()
    {
        return listaUtentiVenditori;
    }
    
    public UtentiVenditori getVenditore(int id)
    {
        for(UtentiVenditori y : listaUtentiVenditori)
            return y;
        
        return null;
    }
    
    public ArrayList<Utente> getListaUtenti()
    {
        ArrayList<Utente> listaUtenti = new ArrayList<>();
        
        listaUtenti.addAll(listaUtentiClienti);
        listaUtenti.addAll(listaUtentiVenditori);
        
        return listaUtenti;
    }



    // ConnectionString
    public void setConnectionString(String s)
    {
	this.connectionString = s;
    }
    public String getConnectionString(){
	return this.connectionString;
    }
}
