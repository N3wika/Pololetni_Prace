//program vytvari nahodne priklady na scitani do 20

public class Scitani {

    public static void main( String[] args ) {
        int priklady = 0;
        while ( priklady < 10 ) {
            java.util.Random scitanec = new java.util.Random();
            int a = scitanec.nextInt( 21 );
            int b = scitanec.nextInt( 21 );
            int vysledek = a + b;
            if ( a + b <= 20 ) {
                System.out.printf( "%d + %d = %d\n", a, b, vysledek );
                priklady++;
            }
        }
    }

}
