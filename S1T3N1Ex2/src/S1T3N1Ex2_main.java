import java.util.LinkedList;
import java.util.ListIterator;

public class S1T3N1Ex2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList <Integer> numerosPar = new LinkedList<Integer>();
		LinkedList <Integer> numerosImpar = new LinkedList<Integer>();
		numerosPar.add(0);
		numerosPar.add(2);
		numerosPar.add(4);
		numerosPar.add(6);
		numerosPar.add(8);
		numerosImpar.add(1);
		numerosImpar.add(3);
		numerosImpar.add(5);
		numerosImpar.add(7);
		numerosImpar.add(9);
		
		//Creación  de los 2 iteradores para poder recorrerlo y activar sobre el mismo.
		ListIterator<Integer> itPar = numerosPar.listIterator(numerosPar.size());//Para recorrerlo a la
		//inversa, para seguirlo de forma inicial codigo posterior.
		ListIterator<Integer> itImpar = numerosImpar.listIterator();
		
		while(itPar.hasPrevious()) { //para recoger la posición anterior, sino usar itPar.hasNext()
			if(itImpar.hasNext()) {
				itImpar.next();
			}
			itImpar.add(itPar.previous());//para immplementar a itImpar el itPar a la inversa,
			//sino usar next()
		}
		
		System.out.println(numerosImpar);
	}

}
