import java.util.Scanner;

public class FeedBack1A {
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Cantidad de productos llevados :");
    int cantidad = sc.nextInt();
 
    System.out.print("Precio del producto: ");
    int precioUnidad=sc.nextInt();
 
    int importe = cantidad * precioUnidad;
 
    //Ahora aplicamos el desuento del 20%
    if (cantidad >= 1 && cantidad <= 100) {
        System.out.println("\nDescuento aplicable: 20%");
        System.out.println("Importe con descuento: " + (importe * 0.8) + " Euros");

        sc.close();
}
}
}