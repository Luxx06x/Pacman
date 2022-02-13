
/**
 * Beschreiben Sie hier die Klasse LABYRINTH.
 * 
 * @author Lukas 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LABYRINTH
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    int hoehe;
    int breite;
    ZELLE[][] spielFlaeche;
    
    /**
     * Konstruktor für Objekte der Klasse LABYRINTH
     */
    public LABYRINTH(int hoeheNeu, int breiteNeu)
    {
        // Instanzvariable initialisieren
        hoehe = hoeheNeu;
        breite = breiteNeu;
        spielFlaeche = new ZELLE[breite][hoehe];
        //in die Schublade 0 0 des Schranks spielFlaeche soll
        // eine Zelle mit den Koordinaten (0,0) gelegt werden.
        //spielFlaeche[0][0] = new ZELLE(0,0);
        for(int zaehlerY = 0; zaehlerY < hoehe; zaehlerY = zaehlerY + 1)
        {
            for(int zaehlerX = 0; zaehlerX < breite; zaehlerX = zaehlerX + 1)
            {
                spielFlaeche[zaehlerX][zaehlerY] = new ZELLE(zaehlerX,zaehlerY);
            }
        }
        
        GaengeErstellen();
    }
    
    //Die Methode erzeugt in einem 10x10-Labyrinth Wege
    void GaengeErstellen()
    {
        spielFlaeche[1][1].MauerSetzen(false);
        for(int zaehler = 1; zaehler <= 8; zaehler = zaehler +1)
        {
            spielFlaeche[5][zaehler].MauerSetzen(false);
        }
    }
    
    int BreiteGeben()
    {
        return breite;
    }
    
    int HoeheGeben()
    {
        return hoehe;
    }
    
    boolean IstWand(int X, int Y)
    {
        return spielFlaeche[X][Y].IstWandGeben();
    }
    }
