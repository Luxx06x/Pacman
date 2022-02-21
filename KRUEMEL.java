
/**
 * Beschreiben Sie hier die Klasse KRUEMEL.
 * 
 * @author Lukas
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KRUEMEL
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    int positionX;
    int positionY;
    boolean machtUnverwundbar;
    KRUEMELSYMBOL kSymbol;
    

    /**
     * Konstruktor für Objekte der Klasse KRUEMEL
     */
    public KRUEMEL(int positionXNeu, int positionYNeu)
    {
        // Instanzvariable initialisieren
        positionX = positionXNeu;
        positionY = positionYNeu;
        machtUnverwundbar = false;
        kSymbol = new KRUEMELSYMBOL(positionX, positionY);
    }
    
    void MachtUnverwundbarSetzen(boolean machtUnverwundbarNeu){
        machtUnverwundbar = machtUnverwundbarNeu;
    }

    boolean MachtUnverwundbarGeben(){
      return   machtUnverwundbar;
    }
}
