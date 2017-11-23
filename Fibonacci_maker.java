import java.io.* ;

class Fibonacci_maker {
    public static void main(String[] args) throws IOException{

        long[] fibonacci_array = new long[ 70 ] ;

        fibonacci_array[ 0 ] = 0 ; // 0 1 1 2 3 5 8 ...
        fibonacci_array[ 1 ] = 1 ;

        for ( int i=2; i<70; i++ ) fibonacci_array[ i ] = fibonacci_array[ i-1 ] + fibonacci_array[ i-2 ] ;

        Fibonacci_viewer Fibonacci_viewer = new Fibonacci_viewer() ;

        Fibonacci_viewer.index( fibonacci_array , new BufferedReader(new InputStreamReader(System.in)) );
    }
}
