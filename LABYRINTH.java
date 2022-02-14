
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
    ZELLE[][] spielFläche;
    
    /**
     * Konstruktor für Objekte der Klasse LABYRINTH
     */
    public LABYRINTH(int hoeheNeu, int breiteNeu)
    {
        // Instanzvariable initialisieren
        hoehe = hoeheNeu;
        breite = breiteNeu;
        spielFläche = new ZELLE[breite][hoehe];
        //in die Schublade 0 0 des Schranks spielFlaeche soll
        // eine Zelle mit den Koordinaten (0,0) gelegt werden.
        //spielFlaeche[0][0] = new ZELLE(0,0);
        for(int zaehlerY = 0; zaehlerY < hoehe; zaehlerY = zaehlerY + 1)
        {
            for(int zaehlerX = 0; zaehlerX < breite; zaehlerX = zaehlerX + 1)
            {
                spielFläche[zaehlerX][zaehlerY] = new ZELLE(zaehlerX,zaehlerY);
            }
        }
        
        GaengeErstellen();
    }
    
    //Die Methode erzeugt in einem 10x10-Labyrinth Wege
    void GaengeErstellen()
    {
        spielFläche[1][1].MauerSetzen(false);
        spielFläche[3][1].MauerSetzen(false);
        spielFläche[4][1].MauerSetzen(false);
        spielFläche[5][1].MauerSetzen(false);
        spielFläche[6][1].MauerSetzen(false);
        spielFläche[8][1].MauerSetzen(false);
        
        spielFläche[1][2].MauerSetzen(false);
        spielFläche[2][2].MauerSetzen(false);
        spielFläche[3][2].MauerSetzen(false);
        spielFläche[5][2].MauerSetzen(false);
        spielFläche[6][2].MauerSetzen(false);
        spielFläche[7][2].MauerSetzen(false);
        spielFläche[8][2].MauerSetzen(false);
        
        spielFläche[1][3].MauerSetzen(false);
        spielFläche[3][3].MauerSetzen(false);
        spielFläche[4][3].MauerSetzen(false);
        spielFläche[8][3].MauerSetzen(false);
        
        spielFläche[1][4].MauerSetzen(false);
        spielFläche[4][4].MauerSetzen(false);
        spielFläche[5][4].MauerSetzen(false);
        spielFläche[6][4].MauerSetzen(false);
        spielFläche[7][4].MauerSetzen(false);
        spielFläche[8][4].MauerSetzen(false);
        
        spielFläche[1][5].MauerSetzen(false);
        spielFläche[2][5].MauerSetzen(false);
        spielFläche[3][5].MauerSetzen(false);
        spielFläche[4][5].MauerSetzen(false);
        spielFläche[8][5].MauerSetzen(false);
        
        spielFläche[1][6].MauerSetzen(false);
        spielFläche[3][6].MauerSetzen(false);
        spielFläche[4][6].MauerSetzen(false);
        spielFläche[5][6].MauerSetzen(false);
        spielFläche[6][6].MauerSetzen(false);
        spielFläche[8][6].MauerSetzen(false);
        
        spielFläche[1][7].MauerSetzen(false);
        spielFläche[4][7].MauerSetzen(false);
        spielFläche[6][7].MauerSetzen(false);
        spielFläche[8][7].MauerSetzen(false);
        
        spielFläche[1][8].MauerSetzen(false);
        spielFläche[2][8].MauerSetzen(false);
        spielFläche[3][8].MauerSetzen(false);
        spielFläche[4][8].MauerSetzen(false);
        spielFläche[5][8].MauerSetzen(false);
        spielFläche[6][8].MauerSetzen(false);
        spielFläche[7][8].MauerSetzen(false);
        spielFläche[8][8].MauerSetzen(false);
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
        return spielFläche[X][Y].IstWandGeben();
    }
    }
