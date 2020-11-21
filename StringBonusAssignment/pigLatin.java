import java.util.Scanner;

class pigLatin {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        String str = sc.nextLine();
        
        while (str.indexOf(" ") > 0) {
            String word = str.substring(0,str.indexOf(" "));
            if (word.length() > 2) {
             ans += word.substring(1) + word.substring(0,1) + "ay" + " ";   
            }else {
             ans += word + " ";
            }
            str = str.substring(str.indexOf(" ")+1);
        }
        ans += str.substring(1) + str.substring(0,1) + "ay";
        System.out.print(ans);
    }
}