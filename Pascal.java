// program tiskne pascaluv trojuhelnik zarovnany na stred podle zadaneho parametru
public class Pascal {

    public static void main( String[] args ) {
        int pocetRadku = Integer.parseInt( args[0] );

        int[] radek = {};
        for ( int i = pocetRadku; i > 0; --i ) {
            radek = vytvorRadek( radek );
            tiskniRadek( radek, i);
        }
    }


    private static void tiskniRadek( int[] radek, int i ) {
        for ( int mezery = i; mezery > 1; --mezery ) {
            System.out.printf( "  " );
        }

        for ( int cisla = 0; cisla < radek.length; ++cisla ) {
            System.out.printf( "%3d ", radek[cisla] );
        }
        System.out.println();
    }


    private static int[] vytvorRadek( int[] predchoziRadek ) {
        int[] novyRadek = new int[predchoziRadek.length + 1];
        novyRadek[0] = 1;
        novyRadek[novyRadek.length - 1] = 1;
        for ( int i = 1; i < novyRadek.length - 1; ++i ) {
            novyRadek[i] = predchoziRadek[i - 1] + predchoziRadek[i];
        }
        return novyRadek;
    }
}
