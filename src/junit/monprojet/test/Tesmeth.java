package junit.monprojet.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.monprojet.SommeArgent;
import junit.monprojet.UniteDistincteException;

class Tesmeth {

	 private SommeArgent somme1;
	    private SommeArgent somme2;

	    @BeforeEach
	    public void setUp() {
	        // Initialisations communes
	        somme1 = new SommeArgent(100, "USD");
	        somme2 = new SommeArgent(50, "USD");
	    }

	    @Test
	    public void testAddition() throws UniteDistincteException {
	        // Utilisez somme1 et somme2 pour tester l'addition
	        SommeArgent sommeResultante = somme1.add(somme2);
	        assertEquals(150, sommeResultante.getQuantite());
	        assertEquals("USD", sommeResultante.getUnite());
	    }

	    @Test
	    public void testEquals() {
	        // Utilisez somme1 et somme2 pour tester equals()
	        SommeArgent sommeIdentique = new SommeArgent(100, "USD");
	        assertEquals(somme1, sommeIdentique);
	    }
	    @AfterEach
	    public void tearDown() {
	        System.out.println("1ime passage APRES exécution d'une méthode de test");
	    }

}
