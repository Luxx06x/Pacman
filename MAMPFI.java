/**
 * Beschreiben Sie hier die Klasse MAMPFI.
 * 
 * @author Lukas 
 * @version 23.02.2022 01.23 Uhr
 */
public class MAMPFI
{
    //Deklaration
    private int xPosition;
    private int yPosition;
    private char blickrichtung;
    private boolean verwundbar;
    private MAMPFISYMBOL anzeige;
    private LABYRINTH labyrinth;
    
    /**
     * Konstruktor für Objekte der Klasse MAMPFI
     * @param LABYRINTH labNeu, damit Mampfi einem Labyrinth
     * zugeordnet werden kann
     */
    public MAMPFI(LABYRINTH labNeu)
    {
        // Initialisierung
        xPosition = 1;
        yPosition = 1;
        blickrichtung = 'O';
        verwundbar = true;
        anzeige = new MAMPFISYMBOL();
        anzeige.BogenWinkelSetzen(300);
        anzeige.StartWinkelSetzen(30);
        anzeige.BogenArtSetzen(2);
        anzeige.RadiusSetzen(25);
        anzeige.MundBewegtSichSetzen(true);
        
        anzeige.PositionXSetzen(xPosition);
        anzeige.PositionYSetzen(yPosition);
        
        labyrinth = labNeu;
    }  

    // Richtungsmethoden
    void NachOstenBlicken()
    {
        anzeige.StartWinkelSetzen(30);
        blickrichtung = 'O';
    }
    void NachSuedenBlicken()
    {
        anzeige.StartWinkelSetzen(300);
        blickrichtung = 'S';
    }
    void NachWestenBlicken()
    {
        anzeige.StartWinkelSetzen(210);
        blickrichtung = 'W';
    }
    void NachNordenBlicken()
    {
        anzeige.StartWinkelSetzen(120);
        blickrichtung = 'N';
    }
    
    //Verwundbarkeit
    void VerwundbarMachen()
    {
        verwundbar = true;
        anzeige.FuellFarbeSetzen("gelb");
    }
    
    void UnverwundbarMachen()
    {
        verwundbar = false;
        anzeige.FuellFarbeSetzen("rot");
    }
    
    void VerwundbarSetzen(boolean verwundbarNeu)
    {
        verwundbar = verwundbarNeu;
        if (verwundbar == true)
        {
            anzeige.FuellFarbeSetzen("gelb");
        }
        else
        {
            anzeige.FuellFarbeSetzen("rot");
        }
    }
    
    //Drehungen
    void RechtsDrehen()
    {
        if (blickrichtung == 'N')
        {
            NachOstenBlicken();
        }
        else if (blickrichtung == 'O')
        {
            NachSuedenBlicken();
        }
        else if (blickrichtung == 'S')
        {
            NachWestenBlicken();
        }
        else if (blickrichtung == 'W')
        {
            NachNordenBlicken();
        }
        
    }

    
    //fehlt noch void LinksDrehen()
    
    void NachNordenGehen()
    {
        NachNordenBlicken();
        System.out.println('0');
        if (!labyrinth.IstWand(xPosition, yPosition-1))
        {
            System.out.println('1');//TODO noch ee
            if (yPosition > 0)
            {
                System.out.println('1');
                yPosition = yPosition -1;
                anzeige.PositionYSetzen(yPosition);
            }
        }
    }
    
    void NachOstenGehen()
    {
        NachOstenBlicken();
        if (!labyrinth.IstWand(xPosition +1, yPosition))
        {
            if (xPosition < labyrinth.BreiteGeben()-1)
            {
                xPosition = xPosition +1;
                anzeige.PositionXSetzen(xPosition);
            }
        }
    }
    
    void NachSuedenGehen()
    {
        NachSuedenBlicken();
        if (!labyrinth.IstWand(xPosition, yPosition+1))
        {
            if (yPosition < labyrinth.HoeheGeben()-1)
            {
                yPosition = yPosition +1;
                anzeige.PositionYSetzen(yPosition);
            }
        }
    }
    
    void NachWestenGehen()
    {
        NachWestenBlicken();
        if (!labyrinth.IstWand(xPosition-1, yPosition))
        {
            if (xPosition > 0)
            {
                xPosition = xPosition -1;
                anzeige.PositionXSetzen(xPosition);
            }
        }
    }
}
