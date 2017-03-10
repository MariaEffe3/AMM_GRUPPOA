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
public class OggettiInVenditaFactory 
{   
    String connectionString;
    
    private static OggettiInVenditaFactory singleton;
    
    public static OggettiInVenditaFactory getInstance()
    {
        if (singleton == null)
            singleton = new OggettiInVenditaFactory();
            
        return singleton;
    }
    
    private ArrayList<OggettiInVendita> listaOggetti = new ArrayList<>();
    
    private OggettiInVenditaFactory()
    {
        OggettiInVendita profumo_01 = new OggettiInVendita();
        profumo_01.setId(34);
        profumo_01.setNomeOggetto("Bleu De Chanel - Eau de Toilette");
        profumo_01.setUrlImmagine("img/bleudechanel_edt.jpg");
        profumo_01.setPrezzoOggetto(60.00);
        profumo_01.setQuantitaOggetto(63);
        profumo_01.setMarca("Chanel");
        profumo_01.setDescrizione("Note: Labdano, Noce Moscata, Zenzero, Sandalo, Patchouli\n" + 
                "Menta, Gelsomino, Pompelmo, Limone, Vetiver, Incenso, Cedro, Pepe Rosa");
        listaOggetti.add(profumo_01);
        
        OggettiInVendita profumo_02 = new OggettiInVendita();
        profumo_02.setId(31);
        profumo_02.setNomeOggetto("Dior Addict - Eau de Parfum");
        profumo_02.setUrlImmagine("img/dioraddict_edp.jpg");
        profumo_02.setPrezzoOggetto(60.30);
        profumo_02.setQuantitaOggetto(36);
        profumo_02.setMarca("Dior"); 
        profumo_02.setDescrizione("Note di testa: Fiori d'arancio;\n"
                    + "Note di cuore: Gelsomino Sambac;\n"
                    + "Note di fondo: Vaniglia di Bourbon");
        listaOggetti.add(profumo_02);
        
        OggettiInVendita profumo_03 = new OggettiInVendita();
        profumo_03.setId(30);
        profumo_03.setNomeOggetto("Miss Dior - Eau de Parfum");
        profumo_03.setUrlImmagine("img/Miss_Dior.jpg");
        profumo_03.setPrezzoOggetto(60.00);
        profumo_03.setQuantitaOggetto(23);
        profumo_03.setMarca("Dior");
        profumo_03.setDescrizione("Note di testa: Arancia Sanguinella;\n"
                    + "Note di cuore:  Rosa di Grasse & Gelsomino Sambac;\n"
                    + "Note di fondo: Patchouli dell'Indonesia");
        listaOggetti.add(profumo_03);
        
        OggettiInVendita profumo_04 = new OggettiInVendita();
        profumo_04.setId(32);
        profumo_04.setNomeOggetto("J'adore - Eau de Parfum");
        profumo_04.setUrlImmagine("img/jadore_edp.jpg");
        profumo_04.setPrezzoOggetto(62.60);
        profumo_04.setQuantitaOggetto(42);
        profumo_04.setMarca("Dior");
        profumo_04.setDescrizione("Note di testa: Ylang Ylang delle Comore;\n"
                    + "Note di cuore: Rosa Damascena;\n"
                    + "Note di fondo: Gelsomino Sambac");
        listaOggetti.add(profumo_04);
        
        OggettiInVendita profumo_05 = new OggettiInVendita();
        profumo_05.setId(33);
        profumo_05.setNomeOggetto("Poison Girl - Eau de Parfum");
        profumo_05.setUrlImmagine("img/poisongirl_edp.jpg");
        profumo_05.setPrezzoOggetto(55.30);
        profumo_05.setQuantitaOggetto(39);
        profumo_05.setMarca("Dior");
        profumo_05.setDescrizione("Note di testa: Arancia Amara;\n"
                    + "Note di cuore: Rosa di Grasse;\n"
                    + "Note di fondo: Fava Tonka del Venezuela");
        listaOggetti.add(profumo_05);
        
    }
    
    public ArrayList<OggettiInVendita> getOggettiInVenditaList()
    {
        return listaOggetti;
    }
    
    public OggettiInVendita getOggettiInVendita(int id)
    {
        for ( OggettiInVendita i : listaOggetti )
            if ( i.getId() == id)
                return i;
        return null;
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

