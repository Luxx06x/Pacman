
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
    boolean machtVerwundbar;
    KRUEMELSYMBOL kSymbol;

    /**
     * Konstruktor für Objekte der Klasse KRUEMEL
     */
    public KRUEMEL(int positionXNeu, int positionYNeu)
    {
        // Instanzvariable initialisieren
        positionX = positionXNeu;
        positionY = positionYNeu;
    }

    void machtVerwundbarSetzen(boolean machtVerwundbarSetzen)
    {
        machtVerwundbar = machtVerwundbarSetzen;
    }
    
    boolean machtVerwundbarGeben()
    {
        // tragen Sie hier den Code ein
        return machtVerwundbar;
    }
}
