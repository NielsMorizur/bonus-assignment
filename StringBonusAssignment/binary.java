import java.util.Scanner;

class binary {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = "";
        int number = sc.nextInt();
        
        while (number/2 != 0) {
            binary = number % 2 + binary;
            number = number/2;
        }
        if (number == 1) {
         binary = 1 + binary;
        }
        System.out.print(binary);
    }
}