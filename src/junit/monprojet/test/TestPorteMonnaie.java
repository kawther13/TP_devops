package junit.monprojet.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.monprojet.PorteMonnaie;
import junit.monprojet.SommeArgent;

class TestPorteMonnaie {

	 @Test
	    public void testAjouteSomme() {
	        PorteMonnaie porteMonnaie = new PorteMonnaie();
	        
	        SommeArgent somme1 = new SommeArgent(5, "EUR");
	        SommeArgent somme2 = new SommeArgent(5, "EUR");
	        
	        porteMonnaie.ajouteSomme(somme1);
	        porteMonnaie.ajouteSomme(somme2);
	        
	        assertEquals("Contenu du porte-monnaie :\n10 EUR\n", porteMonnaie.toString());
	    }

}
