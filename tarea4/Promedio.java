package tarea4;

// Permitir la captura de n números y calcular su promedio

import java.util.Scanner;

public class Promedio {
public static void main(String args[]){

try (Scanner sn = new Scanner(System.in)) {
System.out.print("Introduzca un numero: ");
int n=sn.nextInt();
int i = 1;
double num = 0;

for (i = 1; i <= n; i=i+1){
System.out.println(i);
num += i;
<<<<<<< HEAD
=======
}

System.out.println("El promedio es: "+ num/n);
}
}
>>>>>>> 8bee56122b7813a7b649700dc7a2db0fbbfd55c9
}

System.out.println("El promedio es: "+ num/n);
}
}
}


  
