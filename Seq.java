//program tiskne ciselnou radu podle zadanych argumentu
public class Seq {

    public static void main( String[] args ) {

        //inicializace hodnot
        int delka = args.length;
        int zacatek = 1;
        int krok = 1;
        int konec = 0;
        String oddelovac = " ";

        if ( "-s".equals( args[0] ) ) {
            if ( delka == 3 ) {
                oddelovac = ( args[1] );
                konec = Integer.parseInt( args[2] );
            } else if ( delka == 4 ) {
                oddelovac = ( args[1] );
                zacatek = Integer.parseInt( args[2] );
                konec = Integer.parseInt( args[3] );
            } else if ( delka == 5 ) {
                oddelovac = ( args[1] );
                zacatek = Integer.parseInt( args[2] );
                krok = Integer.parseInt( args[3] );
                konec = Integer.parseInt( args[4] );
            }
        } else {
            if ( delka == 1 ) {
                konec = Integer.parseInt( args[0] );
            } else if ( delka == 2 ) {
                zacatek = Integer.parseInt( args[0] );
                konec = Integer.parseInt( args[1] );
            } else if ( delka == 3 ) {
                zacatek = Integer.parseInt( args[0] );
                krok = Integer.parseInt( args[1] );
                konec = Integer.parseInt( args[2] );
            }
        }

        tiskni( delka, zacatek, krok, konec, oddelovac );

    }


    private static void tiskni( int delka, int zacatek, int krok, int konec, String oddelovac ) {
        if ( krok >= 0 ) {
            for ( int cislo = zacatek; cislo <= konec; cislo += krok ) {
                System.out.printf( "%d", cislo );
                if ( cislo + krok <= konec ) {
                    System.out.printf( "%s", oddelovac );
                }
            }
        } else {
            for ( int cislo = zacatek; cislo >= konec; cislo += krok ) {
                System.out.printf( "%d", cislo );
                if ( cislo + krok >= konec ) {
                    System.out.printf( "%s", oddelovac );
                }
            }
        }
    }

}
