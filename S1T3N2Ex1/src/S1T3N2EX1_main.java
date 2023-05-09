
import java.util.HashSet;
import java.util.Scanner;

public class S1T3N2EX1_main {


    static HashSet<Restaurant> llistaRestHashSet = new HashSet<Restaurant>();

    public static void main(String[] args) {


        int opcio;


        System.out.println("");

        do {

            System.out.println("Introdueix la teva elecció : \n1. Crear Restaurant\n2. Veure Restaurant\n0. Sortir");
            Scanner entrada = new Scanner(System.in);
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

    }
    public static void crearRestaurant() {

        Scanner entrada = new Scanner(System.in);
        String nomRes;
        int puntRes;

        System.out.println("Introdueix el nom del restaurant: ");
        nomRes = entrada.nextLine();
        System.out.println("Introdueix la puntuació del restaurant");
        puntRes = entrada.nextInt();

       
        Restaurant r0 = new Restaurant(nomRes, puntRes);
        llistaRestHashSet.add(r0); 

    }
            public static void veureRestaurant(){

            for(Restaurant h : llistaRestHashSet){
            System.out.println(h);
            }       
    }
}




