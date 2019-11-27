import java.util.Scanner;

class TugasPraktikum1{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        String kata = yuk.nextLine();
        char[] kata2 = kata.toCharArray();
        int kata1 = kata.length();
        int a = kata1/2;
        kata = kata.replaceAll(" ", "");
        kata = kata.toUpperCase();
        int hexa = kata1 * kata1;
        String hex = String.format("%x", hexa);
        char hex1 = hex.charAt(0);
        int hex2 = (int)(hex1);
        int octal = kata1;
        String oct = String.format("%o", octal);
        System.out.print("#"+ hex);
        for(int i = 1; i < a; i++){
            int b = i - 1;
            System.out.print(kata.charAt(b));
        }
        for(int i = a - 2; i > 0; i--){
            int c = i - 1;
            System.out.print(kata.charAt(c));
        }
        System.out.print(oct);
        if(hex2 >= 65 && hex2 <= 90 || hex2 >= 97 && hex2 <= 122){
        	System.out.print("?");
        }
        else{
        	System.out.print("!");
        }
        
    }
}