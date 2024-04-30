package junit.monprojet;

public class SommeArgent 
{
private int quantite;
private String unite;
public SommeArgent(int amount, String currency)
{ quantite = amount;
unite = currency;
}
public int getQuantite() {
return quantite;
}
public String getUnite() {
return unite;
}
public SommeArgent add(SommeArgent m) throws UniteDistincteException {
    if (!this.unite.equals(m.unite)) {
        throw new UniteDistincteException("Les unités des sommes d'argent sont différentes");
    }
    return new SommeArgent(this.quantite + m.quantite, this.unite);
}


@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    SommeArgent other = (SommeArgent) obj;
    return quantite == other.quantite && unite.equals(other.unite);
}
public String toString() {
    return quantite + " " + unite;
}


}