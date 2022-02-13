/**
 * Beschreiben Sie hier die Klasse VERLAUFSLISTE.
 * 
 * @author (STA) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class VERLAUFSLISTE
{
    // Deklaration
    int[] scores;
    String[] namen;
    PUNKTELISTEANZEIGE anzeige;

    /**
     * Konstruktor für Objekte der Klasse VERLAUFSLISTE
     */
    public VERLAUFSLISTE()
    {
        // Initialisierung
        System.out.println("Hallo 10g");
        
        //Schrank aufbauen
        namen = new String[10];
        scores = new int[10];
        
        //Schubladen befüllen
        for(int zaehler = 0; zaehler <= 9; zaehler = zaehler +1)
        {
            namen[zaehler] = "---";
            scores[zaehler] = 0;
        }
        
        anzeige = new PUNKTELISTEANZEIGE();
        anzeige.Aktualisieren(namen, scores);
    }
    
    void EintragEinfuegen(String nameNeu, int scoreNeu)
    {
       for(int zaehler = 9; zaehler >= 1; zaehler = zaehler -1)
       {
           namen[zaehler] = namen[zaehler-1];
           scores[zaehler] = scores[zaehler-1];
        }
        namen[0]=nameNeu;
        scores[0] = scoreNeu;
        //neue Listen an anzeige geben
        anzeige.Aktualisieren(namen, scores);
        /*
       name3 = name2;
       name2 = name1;
       name1 = nameNeu;
       
       score3 = score2;
       score2 = score1;
       score1 = scoreNeu;
       */
    }
}
