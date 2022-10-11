import java.util.Scanner;

class Inputlnteger {
    public static void main(String[] args) {
    // creamos una instancia de clase Scanner
    //llamada input
        Scanner input = new Scanner(System.in);
    	
        System.out.print("Enter an integer: ");
        int nomber= input.nextInt(); // usamos input para leer un entero
        System.out.println("You entered " + nomber);

        // closing the scanner object
        input.close();
    }
}
