/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.mariafrancescacarboni.classes;
import java.util.ArrayList;

/**
 *
 * @author Maria
 */
public class UtentiClienti extends Utente {
     private ArrayList<OggettiInVendita> oggettiDaComprare = new ArrayList<>();
     private double saldoContoCliente;
    
    public UtentiClienti()
    {
        super();
    }
    
    public ArrayList<OggettiInVendita> getOggettiDaComprare()
    {
        return oggettiDaComprare;
    }
    
    public void setOggettiDaComprare(ArrayList<OggettiInVendita> oggettiDaComprare)
    {
        this.oggettiDaComprare = oggettiDaComprare;
    }

    /**
     * @return the saldoContoCliente
     */
    public double getSaldoContoCliente() {
        return saldoContoCliente;
    }

    /**
     * @param saldoContoCliente the saldoContoCliente to set
     */
    public void setSaldoContoCliente(double saldoContoCliente) {
        this.saldoContoCliente = saldoContoCliente;
    }
}
