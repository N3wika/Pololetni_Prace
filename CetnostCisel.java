//pocita cetnost vyskytu cisel na vstupu 

import java.util.HashMap;
import java.util.Map.Entry;

public class CetnostCisel {

    public static void main( String[] args ) {
        HashMap<Integer, Integer> cisla = new HashMap<>();
        java.util.Scanner sc = new java.util.Scanner( System.in );
        while ( sc.hasNextInt() ) {
            Integer cislo = sc.nextInt();
            if ( cisla.containsKey( cislo ) ) {
                Integer pocet = cisla.get( cislo );
                cisla.put( cislo, pocet + 1 );
            } else {
                cisla.put( cislo, 1 );
            }
        }
        
        for (Entry<Integer, Integer> zaznam:cisla.entrySet()) {
            System.out.printf( "%d je obsazeno %d krat\n", zaznam.getKey(), zaznam.getValue() );
        }
    }

}
