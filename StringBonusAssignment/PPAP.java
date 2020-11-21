import java.util.Scanner;

class PPAP {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line1 = sc.nextLine();
        stringMaker(line1);
        
    }
    
    public static void stringMaker(String line){
        String combinedLine = "";
        String object1 = "";
        String object2 = "";
        
        object1 = line.substring(line.indexOf("a ")+2, line.indexOf(",") );
        object2 = line.substring(line.lastIndexOf("a ")+2);
        
        object2 = (object2.substring(0,1)).toUpperCase() + object2.substring(1);
        
        combinedLine = ("Uh! "+ object2 + " " + object1);
        
        System.out.print(combinedLine);
    }
}