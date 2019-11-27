import java.util.Scanner;

class TugasPraktikum3{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int n = yuk.nextInt();
        String kata[] = new String[n];
        int jumlah = 0;

        String reverse = "";

        for (int i = 0; i < kata.length; i++) {
            kata[i] = yuk.next();
        }

        for (int i = 0; i < n; i++) {
            String convert = (kata[i]);
            for (int j = convert.length() - 1; j >= 0; j--) {
                reverse += convert.charAt(j);
            }
            if (convert.equals(reverse)) {
                jumlah++;
            }
            reverse = "";
        }
        System.out.println("Jumlah Kata yang Palindrom = "+ jumlah);
        yuk.close();
    }
}
