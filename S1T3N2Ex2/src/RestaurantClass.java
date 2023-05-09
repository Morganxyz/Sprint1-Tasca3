import java.util.Objects;

public class RestaurantClass implements Comparable<RestaurantClass>{

    private String nom;
    private int puntuacio;

        public RestaurantClass(String nom,int puntuacio){
        	super();
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
		return Objects.hash(nom,puntuacio);
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
		RestaurantClass other = (RestaurantClass) obj;
		eq1 = Objects.equals(nom, other.nom);
		eq2 = Objects.equals(puntuacio, other.puntuacio);
		
		if(eq1 == eq2) {
			return true;
		}else {
			return false;
		}
	
	}
   	
   	public int compareTo(RestaurantClass r0) {

   		int res = this.nom.compareToIgnoreCase(r0.getNom());
          
        if (res != 0) { 
        	return res; 
        	}
        
        if (this.puntuacio < r0.getPuntuacio()){
				return 1;
			}else if (this.puntuacio > r0.getPuntuacio()) {
				return -1;
		}else {
				return 0;
	}	
        
   	}      
       
}






