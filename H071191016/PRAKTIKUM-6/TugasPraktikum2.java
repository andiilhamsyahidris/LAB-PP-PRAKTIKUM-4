import java.util.Scanner;

class TugasPraktikum2{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        String kata = yuk.nextLine();
        char[] kata2 = kata.toCharArray();
        String kata1 = "";
        System.out.print("Input Baris = "); // Matriks
        int baris = yuk.nextInt(); 
        System.out.print("Input Kolom = ");
        int kolom = yuk.nextInt();

        for(int i = 0; i < kata2.length; i++){
            if(i % 2 == 0){
                kata1 += (kata.charAt(i));
            }
            else{
                kata1 += (int) kata.codePointAt(i);
            }
        }
         int angka = 0;
         for(int i = 0; i < baris; i++){
             for(int j = 0; j < kolom; j++){
                 for(int k = 0; k < Math.ceil((double)kata1.length()/16); k++){
                     if(angka < kata1.length()){
                         System.out.print(kata1.charAt(angka));
                         angka++;
                     }
                     else{
                         System.out.print("?");
                     }
                 }
                 System.out.print(" ");
             }
             System.out.println();
         }
        yuk.close();
    }
}