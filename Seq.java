//program tiskne ciselnou radu podle zadanych argumentu
public class Seq {

    public static void main( String[] args ) {

        //inicializace hodnot
        int delka = args.length;
        int zacatek = 1;
        int krok = 1;
        int konec = 0;
        String oddelovac = " ";

        int poziceArg = 0;
        if ( "-s".equals( args[0] ) ) {
            oddelovac = ( args[1] );
            poziceArg = 2;
            delka -= 2;
        }
        if ( delka == 1 ) {
            konec = Integer.parseInt( args[poziceArg] );
        } else if ( delka == 2 ) {
            zacatek = Integer.parseInt( args[poziceArg] );
            konec = Integer.parseInt( args[poziceArg + 1] );
        } else if ( delka == 3 ) {
            zacatek = Integer.parseInt( args[poziceArg] );
            krok = Integer.parseInt( args[poziceArg + 1] );
            konec = Integer.parseInt( args[poziceArg + 2] );
        }

        tiskni( zacatek, krok, konec, oddelovac );
    }


    private static void tiskni( int zacatek, int krok, int konec, String oddelovac ) {
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
