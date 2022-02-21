
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
    ZELLE[][] spielFl�che;
    //KRUEMEL kruemel;
    
    /**
     * Konstruktor f�r Objekte der Klasse LABYRINTH
     */
    public LABYRINTH(int hoeheNeu, int breiteNeu)
    {
        // Instanzvariable initialisieren
        hoehe = hoeheNeu;
        breite = breiteNeu;
        spielFl�che = new ZELLE[breite][hoehe];
        //in die Schublade 0 0 des Schranks spielFlaeche soll
        // eine Zelle mit den Koordinaten (0,0) gelegt werden.
        //spielFlaeche[0][0] = new ZELLE(0,0);
        for(int zaehlerY = 0; zaehlerY < hoehe; zaehlerY = zaehlerY + 1)
        {
            for(int zaehlerX = 0; zaehlerX < breite; zaehlerX = zaehlerX + 1)
            {
                spielFl�che[zaehlerX][zaehlerY] = new ZELLE(zaehlerX,zaehlerY);
                //kruemel = new KRUEMEL(zaehlerX, zaehlerY);
            }
        }
        
        GaengeErstellen();
    }
    
    //Die Methode erzeugt in einem 10x10-Labyrinth Wege
    void GaengeErstellen()
    {
        spielFl�che[1][1].MauerSetzen(false);
        spielFl�che[3][1].MauerSetzen(false);
        spielFl�che[4][1].MauerSetzen(false);
        spielFl�che[5][1].MauerSetzen(false);
        spielFl�che[6][1].MauerSetzen(false);
        spielFl�che[8][1].MauerSetzen(false);
        
        spielFl�che[1][2].MauerSetzen(false);
        spielFl�che[2][2].MauerSetzen(false);
        spielFl�che[3][2].MauerSetzen(false);
        spielFl�che[5][2].MauerSetzen(false);
        spielFl�che[6][2].MauerSetzen(false);
        spielFl�che[7][2].MauerSetzen(false);
        spielFl�che[8][2].MauerSetzen(false);
        
        spielFl�che[1][3].MauerSetzen(false);
        spielFl�che[3][3].MauerSetzen(false);
        spielFl�che[4][3].MauerSetzen(false);
        spielFl�che[8][3].MauerSetzen(false);
        
        spielFl�che[1][4].MauerSetzen(false);
        spielFl�che[4][4].MauerSetzen(false);
        spielFl�che[5][4].MauerSetzen(false);
        spielFl�che[6][4].MauerSetzen(false);
        spielFl�che[7][4].MauerSetzen(false);
        spielFl�che[8][4].MauerSetzen(false);
        
        spielFl�che[1][5].MauerSetzen(false);
        spielFl�che[2][5].MauerSetzen(false);
        spielFl�che[3][5].MauerSetzen(false);
        spielFl�che[4][5].MauerSetzen(false);
        spielFl�che[8][5].MauerSetzen(false);
        
        spielFl�che[1][6].MauerSetzen(false);
        spielFl�che[3][6].MauerSetzen(false);
        spielFl�che[4][6].MauerSetzen(false);
        spielFl�che[5][6].MauerSetzen(false);
        spielFl�che[6][6].MauerSetzen(false);
        spielFl�che[8][6].MauerSetzen(false);
        
        spielFl�che[1][7].MauerSetzen(false);
        spielFl�che[4][7].MauerSetzen(false);
        spielFl�che[6][7].MauerSetzen(false);
        spielFl�che[8][7].MauerSetzen(false);
        
        spielFl�che[1][8].MauerSetzen(false);
        spielFl�che[2][8].MauerSetzen(false);
        spielFl�che[3][8].MauerSetzen(false);
        spielFl�che[4][8].MauerSetzen(false);
        spielFl�che[5][8].MauerSetzen(false);
        spielFl�che[6][8].MauerSetzen(false);
        spielFl�che[7][8].MauerSetzen(false);
        spielFl�che[8][8].MauerSetzen(false);
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
        return spielFl�che[X][Y].IstWandGeben();
    }
    }
