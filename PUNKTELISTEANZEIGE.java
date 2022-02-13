import backend.anzeige.PunkteListeAnzeige;   //Aenderung bei backend 1_5_8
import java.awt.Font;
import java.awt.Color;

/**
 * Diese Klasse dient zum Ver&auml;ndern der Anzeige der Punkteliste. Diese Punkteliste kann
 * &uuml;ber das Menue sichtbar gemacht werden.
 * 
 * @author Thomas Guentner 
 * @version 1.0
 */

public class PUNKTELISTEANZEIGE extends PunkteListeAnzeige
{


	/**
	 * Konstructor fuer Objekte der Klasse PUNKTELISTEANZEIGE
	 */
	public PUNKTELISTEANZEIGE()
	{
		super();
	}

	/**
	 * Mit dieser Methode kann eine neue Punkteliste mit Punkteintraegen an die PunktelisteAnzeige uebergeben werden.
	 * 
	 * @param  namensliste, punkteliste   
	 */
	public void Aktualisieren(String[] namensListe, int[] punkteListe)
	{
		super.Aktualisieren(namensListe, punkteListe);
	}
	
	/**
	 * Mit dieser Methode kann eine neue Ueberschrift fuer die Punkteliste gesetzt werden.
	 * 
	 * @param ueberschriftNeu
	 */
	public void UeberschriftSetzen(String ueberschriftNeu)
	{
	    super.UeberschriftSetzen(ueberschriftNeu);
	}
	
	/**
	 * Dient zum Setzen der Schriftart der PunkteListe
	 * @param Font schriftart
	 */
	public void SchriftartSetzen(Font schriftart)
	{
	    super.SchriftartSetzen(schriftart);
	}
	
	/**
	 * Dient zum setzen der Schriftfarbe der PunkteListe
	 * @param String schriftfarbe
	 */
	public void SchriftfarbeSetzen(String farbe)
	{
	    super.SchriftfarbeSetzen(farbe);
	}
	   
	   
}
