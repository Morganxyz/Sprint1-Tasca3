import java.util.*;
public class S1T3N1Ex1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Month m1 = new Month("Gener");
		Month m2 = new Month("Febrer");
		Month m3 = new Month("Març");
		Month m4 = new Month("Abril");
		Month m5 = new Month("Maig");
		Month m6 = new Month("Juny");
		Month m7 = new Month("Juliol");
		Month m8 = new Month("Setembre");
		Month m9 = new Month("Octubre");
		Month m10 = new Month("Novembre");
		Month m11 = new Month("Desembre");
		Month m13 = new Month("Abril");
		
		ArrayList<Month> monthNames = new ArrayList<>();
		
		monthNames.add(m1);
		monthNames.add(m2);
		monthNames.add(m3);
		monthNames.add(m4);
		monthNames.add(m5);
		monthNames.add(m6);
		monthNames.add(m7);
		monthNames.add(m8);
		monthNames.add(m9);
		monthNames.add(m10);
		monthNames.add(m11);
		monthNames.add(m13);
		
		
		//System.out.println(monthNames.size());
		
		for(Month m : monthNames) {
			System.out.println(m.getName());
		}
		
		//Añadir el nuevo mes en la posicion index con la facultad de add(index,obj)
		Month m12 = new Month("Agost");
		monthNames.add(7,m12);
		
		for(Month m : monthNames) {
			System.out.println(m.getName());
		}
		
		//Pasar el ArrayList a un HashSet con la info del ArrayList
		HashSet <Month> monthNames2 = new HashSet<>(monthNames);
		  
		//Recorrer la lista con un for
	        for (Month m : monthNames2) {
	            System.out.println(m.getName());
		
	}
	    //Recorrer la lista con un Iterador
	    Iterator<Month> it = monthNames2.iterator();
	        
	    while(it.hasNext()){
	    	String nombreMes = it.next().getName();
	    	System.out.println(nombreMes);
	    }
	    
	    
	   
}
}

