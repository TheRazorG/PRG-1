public class FeedBack1C {

  public static void main( String[] args ) {
    int numero = 4;
    System.out.println( "El factorial de " + numero + " es: " + factorial( numero ) );      
 }

 public static int factorial( int numero ) {
    int fact = 1;
    for( int i = 1; i <= numero; i++ ) {
       fact *= i;
    }

    return fact;
}
}