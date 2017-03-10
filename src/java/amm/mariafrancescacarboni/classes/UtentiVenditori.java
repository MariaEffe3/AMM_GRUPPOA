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
public class UtentiVenditori extends Utente
{
    private ArrayList<OggettiInVendita> oggettiDaVendere = new ArrayList<>();
    private double saldoContoVenditore;
    
    public UtentiVenditori()
    {
        super();
    }
    
    public ArrayList<OggettiInVendita> getOggettiDaVendere()
    {
        return oggettiDaVendere;
    }
    
    public void setOggettiDaVendere(ArrayList<OggettiInVendita> oggettiDaVendere)
    {
        this.oggettiDaVendere = oggettiDaVendere;
    }

    /**
     * @return the saldoContoVenditore
     */
    public double getSaldoContoVenditore() {
        return saldoContoVenditore;
    }

    /**
     * @param saldoContoVenditore the saldoContoVenditore to set
     */
    public void setSaldoContoVenditore(double saldoContoVenditore) {
        this.saldoContoVenditore = saldoContoVenditore;
    }
}
