import java.io.* ;

class Fibonacci_viewer {
    static void index ( long[] fibonacci_array , BufferedReader br ) throws IOException {

        System.out.println("Please type half-width numeric.( 1 ~ 70 ) *Typing 'quit' or 'exit' is exit.") ;

        String asked_numeric = br.readLine() ;

        if ( asked_numeric.equals("quit") || asked_numeric.equals("exit") ) {
            System.out.println( "See you." ) ;
            System.exit( 0 );
        }

        try {

            int asked_numeric_int = (int)Math.round( Double.parseDouble( asked_numeric ) ) ;

            if ( 0 < asked_numeric_int && asked_numeric_int <= 70 ) {

                asked_numeric_int -- ;
                String output_text  = asked_numeric + "番目のフィボナッチ数: " ;
                       output_text += String.valueOf( fibonacci_array[ asked_numeric_int ] ) ;
                       output_text += "\n" + asked_numeric + "番目のまでのフィボナッチ数:" ;
                // for( int i=0; i<=asked_numeric_int; i++ ) output_text += " " + String.valueOf( fibonacci_array[ i ] ) ;
                int i = 0 ;
                while( i <= asked_numeric_int ){
                    output_text += " " + String.valueOf( fibonacci_array[ i ] ) ;
                    i ++ ;
                }

                System.out.println( output_text ) ;

            } else {

                System.out.println("sorry... it's not 1 ~ 70.") ;

            }

        } catch (NumberFormatException e) {

            System.out.println("sorry... it's not a half-width numeric.") ;

        }

        index( fibonacci_array , br ) ;
    }
}
