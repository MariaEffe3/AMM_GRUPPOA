/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.mariafrancescacarboni.classes;
/**
 *
 * @author Maria
 */
public class OggettiInVendita {
    private int id;
    private String nomeOggetto;
    private double prezzoOggetto;
    private int quantitaOggetto;
    private String marca;
    private String descrizione;
    private String urlImmagine;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nomeOggetto
     */
    public String getNomeOggetto() {
        return nomeOggetto;
    }

    /**
     * @param nomeOggetto the nomeOggetto to set
     */
    public void setNomeOggetto(String nomeOggetto) {
        this.nomeOggetto = nomeOggetto;
    }

    /**
     * @return the prezzoOggetto
     */
    public double getPrezzoOggetto() {
        return prezzoOggetto;
    }

    /**
     * @param prezzoOggetto the prezzoOggetto to set
     */
    public void setPrezzoOggetto(double prezzoOggetto) {
        this.prezzoOggetto = prezzoOggetto;
    }

    /**
     * @return the quantitaOggetto
     */
    public int getQuantitaOggetto() {
        return quantitaOggetto;
    }

    /**
     * @param quantitaOggetto the quantitaOggetto to set
     */
    public void setQuantitaOggetto(int quantitaOggetto) {
        this.quantitaOggetto = quantitaOggetto;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * @param descrizione the descrizione to set
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * @return the urlImmagine
     */
    public String getUrlImmagine() {
        return urlImmagine;
    }

    /**
     * @param urlImmagine the urlImmagine to set
     */
    public void setUrlImmagine(String urlImmagine) {
        this.urlImmagine = urlImmagine;
    }
    
}
