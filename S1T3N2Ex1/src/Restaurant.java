import java.util.Objects;

public class Restaurant {

    private String nom;
    private int puntuacio;

        public Restaurant(String nom,int puntuacio){
            this.nom = nom;
            this.puntuacio = puntuacio;
        }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntuacio() {
        return this.puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    public String toString(){
            return "Nom de restaurant: " + this.nom + " Puntuació: " + this.puntuacio;
    }
    
    public int hashCode(){
		return Objects.hash(nom);
	}
    
   	public boolean equals(Object obj){
   		
   		boolean eq1 = false;
   		boolean eq2 = false;
   	
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		eq1 = Objects.equals(nom, other.nom);
		eq2 = Objects.equals(puntuacio, other.puntuacio);
		
		if(eq1 == eq2) {
			return true;
		}else {
			return false;
		}
	
	}

}

