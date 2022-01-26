import java.util.Scanner;

public class FeedBack1B {
 /**Escribir un programa que lea los valores inicial y final de un bucle for, que recorrerá los números entre esos dos, indicando para cada uno de ellos si es divisible por 5 o no.*/

public static void main (String[] args) {
  int numInicial=0, numFinal=0;
  Scanner keyboard = new Scanner(System.in);

  System.out.print ("Valor Inicial:");
    numInicial=keyboard.nextInt();
  System.out.print ("Valor Final:");
    numFinal=keyboard.nextInt();

  for (int i=numInicial; i<=numFinal; i++)

  if (i%5==0) System.out.println (i+" Divisible");

  else System.out.println (i+" No Divisible");

  keyboard.close();
}
}