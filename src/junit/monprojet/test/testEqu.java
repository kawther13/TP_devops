package junit.monprojet.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.monprojet.SommeArgent;

class testEqu {
	  @Test
	    public void testEqualsWithDifferentUnits() {
	        
	        SommeArgent m12CHF= new SommeArgent(12, "CHF");
	        SommeArgent m14CHF= new SommeArgent(14, "CHF");
	        SommeArgent m14USD= new SommeArgent(14, "USD");
	        assertTrue(!m12CHF.equals(null));
	        assertEquals(m12CHF, m12CHF);
	       assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
	       assertTrue(!m12CHF.equals(m14CHF));
	        assertTrue(!m14USD.equals(m14CHF));
	    }
	  
	  
	  
	  
	  
}
