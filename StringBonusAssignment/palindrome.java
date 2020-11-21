import java.util.Scanner;

class palindrome {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String forward = "";
        String backward = "";
        String str = (sc.nextLine()).toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
         if (Character.isLetter(str.charAt(i)) ){
             forward += str.charAt(i);
         }
        }
        for (int i = str.length()-1; i > -1; i--) {
         if (Character.isLetter(str.charAt(i)) ) {
             backward += str.charAt(i);
         }
        }
        if (forward.equals(backward) ) {
         System.out.print("Palindrome");   
        }else {
         System.out.print("Not Palindrome");
        }
    }
}