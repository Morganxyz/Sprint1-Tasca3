import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;


public class RestMain {

	static  Scanner entrada = new Scanner(System.in);
    static HashSet<RestaurantClass> llistaRestHashSet = new HashSet<RestaurantClass>();
   

    public static void main(String[] args) {


        int opcio;


        System.out.println("");

        	try {
        do {
        	
        	
            System.out.println("Introdueix la teva elecció : \n1. Crear Restaurant\n2. Veure Restaurant\n0. Sortir");
            opcio = entrada.nextInt();
        	
        	

            switch (opcio) {
                case 1: crearRestaurant();
                    break;
                case 2: veureRestaurant();
                    break;
                case 0:
                    System.out.println("Sortint");
                    break;
                default:
                    System.out.println("Elecció incorrecte");
            }

        	}while(opcio != 0);
        
        	}catch(Exception e){
        			System.out.println("Error de formato");
        	}

    }
    public static void crearRestaurant() {

        Scanner entrada = new Scanner(System.in);
        String nomRes;
        int puntRes;

        System.out.println("Introdueix el nom del restaurant: ");
        nomRes = entrada.nextLine();
        System.out.println("Introdueix la puntuació del restaurant");
        puntRes = entrada.nextInt();

       
        RestaurantClass r0 = new RestaurantClass(nomRes, puntRes);
        llistaRestHashSet.add(r0); 
        
      
    }
            public static void veureRestaurant(){

            	
            LinkedList<RestaurantClass>llistaRest = new LinkedList<RestaurantClass>(llistaRestHashSet);
            Collections.sort(llistaRest);
            
            for(RestaurantClass k : llistaRest){
            System.out.println(k);
            }       
     
    }
}




