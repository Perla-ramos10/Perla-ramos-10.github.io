public class ForNumbers {
public static void main (String[] args)
{


    int n = 9;
    // for loop 
   
    System.out.println ("tabala del 9");
    for (int i = 9; i <= (n * 9); i=i+9) {
        System.out.println(i);
    }
    System.out.println ("tabala del v2 9");
    for (int i = 1; i <= n; i++) {
        System.out.println(i * 9);
    }

System.out.println("Pares menores de 100");
      for (int i = 2; i <= n; i=i+2) {
        System.out.println(i); 
      }
      System.out.println("Impares entre 10 y 50");
      for (int i = 10; i <= n; i=i+3) {
        System.out.println(i); 
      }
      System.out.println("Pares menores de 100 en descendente");
      n=0;
      for (int i = 98; i >= n; i=i-2) {
        System.out.println(i); 
      }
      System.out.println("Impares entre 18 y 50 en descendente");
      n=11;
      for (int i =49; i >=n; i=i -2) {
        System.out.println(i); 
       }
    }
 }




    