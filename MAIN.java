
/**
 * Beschreiben Sie hier die Klasse MAIN.
 * 
 * @author Lukas
 * @version 13.2.2022 01.21 Uhr
 */
public class MAIN
{
    public static void main (String[] args){
        // Erzeugen von den objekten labyrinth & mapfi in labyrinth        
        LABYRINTH labyrinth = new LABYRINTH();
        MAMPFI mampfi = new MAMPFI(labyrinth);
        
        // Testen von Mapfi        
        //for (int i = 0; i <= 5; i = i+1){
        //    mampfi.NachNordenGehen();
        //}
        mampfi.NachSuedenGehen();
    }
}
