
/**
 * Beschreiben Sie hier die Klasse MAIN.
 * 
 * @author Lukas
 */
public class MAIN
{
    public static void main (String[] args){
        // Erzeugen von den objekten labyrinth & mapfi in labyrinth        
        LABYRINTH labyrinth = new LABYRINTH(10,10);
        MAMPFI mampfi = new MAMPFI(labyrinth);
        
        // Testen von Mapfi        
        //for (int i = 0; i <= 5; i = i+1){
        //    mampfi.NachNordenGehen();
        //}
        mampfi.NachSuedenGehen();
    }
}
