package junit.monprojet.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import junit.monprojet.SommeArgent;
import junit.monprojet.UniteDistincteException;

//import junit.framework.Assert; v4 junit

class Test {

	@org.junit.jupiter.api.Test
	    public void testAddition() throws UniteDistincteException {
	        SommeArgent somme1 = new SommeArgent(100, "USD");
	        SommeArgent somme2 = new SommeArgent(50, "USD");

	        SommeArgent sommeResultat = somme1.add(somme2);

	        assertEquals(150, sommeResultat.getQuantite());
	        assertEquals("USD", sommeResultat.getUnite());
	    }
	
	@org.junit.jupiter.api.Test
	    public void testequals() {
		SommeArgent m12CHF= new SommeArgent(12, "CHF");
		SommeArgent m14CHF= new SommeArgent(14, "CHF");
		SommeArgent m14USD= new SommeArgent(14, "USD");
		assertTrue(!m12CHF.equals(null));
		assertEquals(m12CHF, m12CHF);
		assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
		assertTrue(!m12CHF.equals(m14CHF));
		assertTrue(!m14USD.equals(m14CHF));
	    }

	
	
	

	
	    
	    
	    
	
	 // Initialisations communes avant chaque méthode de test
	    SommeArgent   m12CHF = new SommeArgent(12, "CHF");
	    SommeArgent m14CHF = new SommeArgent(14, "CHF");
	    SommeArgent m14USD = new SommeArgent(14, "USD");
	   
	   
	   
	    
	    @org.junit.jupiter.api.Test
	    public void testEqualsSommeArgent() {
	       
	        assertTrue(!m12CHF.equals(null));
	        
	     
	        assertEquals(m12CHF, m12CHF);
	        
	        
	        assertEquals(m12CHF, new SommeArgent(12, "CHF"));
	        
	      
	        assertTrue(!m12CHF.equals(m14CHF));
	        
	       
	        assertTrue(!m14USD.equals(m14CHF));
	    }
	    
	    
	    
	    
	    
	 //  private SommeArgent m12CHF;
	    
	    static int i=1;
		   int s=i;
	    @BeforeEach
	    public void setUp() {
	    	i++;
			System.out.println(s+"ime passage avant exécution d'une méthode de test");

	        // Initialisations communes
			 SommeArgent   m12CHF = new SommeArgent(12, "CHF");
			    SommeArgent m14CHF = new SommeArgent(14, "CHF");
			    SommeArgent m14USD = new SommeArgent(14, "USD");
	    }

	   

	    @org.junit.jupiter.api.Test
	    public void testEquals() {
	        
	        SommeArgent sommeIdentique = new SommeArgent(12, "CHF");
	        assertEquals(m12CHF, sommeIdentique);
	    }
	    @AfterEach
	    public void tearDown() {
	        System.out.println(s+" ime passage APRES exécution d'une méthode de test");
	    }

	    
	    
	    
	    
	    
	}




