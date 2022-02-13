
/**
 * Beschreiben Sie hier die Klasse ZELLE.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ZELLE
{
    // Deklaration
    int positionX;
    int positionY;
    boolean istMauer;
    ZELLENSYMBOL anzeige;

    /**
     * Konstruktor f�r Objekte der Klasse ZELLE
     */
    public ZELLE(int positionXNeu, int positionYNeu)
    {
        // Instanzvariable initialisieren
        positionX=positionXNeu;
        positionY=positionYNeu;
        istMauer=true
        ;
        anzeige= new ZELLENSYMBOL(positionX, positionY);
        anzeige.FuellFarbeSetzen("blau");
        anzeige.FuellungSichtbarSetzen(true);
    }

    void MauerSetzen(boolean istMauerNeu)
    {
        anzeige.FuellungSichtbarSetzen(istMauerNeu);
        
        //Alternative
        /*if(istMauerNeu == true)
        {
            anzeige.FuellungSichtbarSetzen(true);
        }
        else
        {
            anzeige.FuellungSichtbarSetzen(false);
        }*/
        
        istMauer = istMauerNeu;
    }
    
    void RandFarbeSetzen(String farbeNeu)
    {
        anzeige.RandFarbeSetzen(farbeNeu);
    }
    
    boolean IstWandGeben()
    {
        return istMauer;
    }
    }