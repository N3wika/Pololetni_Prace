//Program kresli elipsu podle zadanych parametru
//Pouzila jsem kod pro nakresleni kruhu (https://alej.alisma.cz/prog1/pg08/index.html)

public class Elipsa {

    public static void main( String[] args ) {
        int a = Integer.parseInt( args[0] );
        int b = Integer.parseInt( args[1] );

        kresli( a, b );
    }


    public static void kresli( int a, int b ) {
        for ( int y = -b; y <= b; y++ ) {
            for ( int x = -a; x <= a; x++ ) {
                if ( vElipse( a, b, x, y ) ) {
                    System.out.print( "X" );
                } else {
                    System.out.print( " " );
                }
            }
            System.out.println();
        }
    }


    private static boolean vElipse( int a, int b, int x, int y ) {
        return ( (double) x / a ) * ( (double) x / a ) + ( (double) y / b ) * ( (double) y / b ) < 1;
    }
}
