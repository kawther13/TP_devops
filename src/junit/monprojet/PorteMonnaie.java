package junit.monprojet;

import java.util.HashMap;
import java.util.Objects;

public class PorteMonnaie {

	private HashMap<String, Integer> contenu;
	public HashMap<String, Integer> getContenu() {
	return contenu;
	}
	public PorteMonnaie() {
	contenu = new HashMap<String, Integer>();
	}
	

	public void ajouteSomme(SommeArgent sa) {
	    String unite = sa.getUnite();
	    int quantite = sa.getQuantite();
	    

	    if (contenu.containsKey(unite)) {
	        quantite += contenu.get(unite);
	    }
	    
	   
	    contenu.put(unite, quantite);
	}

	 
	 public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Contenu du porte-monnaie :\n");
	        for (String unite : contenu.keySet()) {
	            sb.append(contenu.get(unite)).append(" ").append(unite).append("\n");
	        }
	        return sb.toString();
	    }
	 @Override
	 public boolean equals(Object obj) {
	     if (this == obj) return true;
	     if (obj == null || getClass() != obj.getClass()) return false;
	     PorteMonnaie other = (PorteMonnaie) obj;
	     return Objects.equals(contenu, other.contenu);
	 }

}
