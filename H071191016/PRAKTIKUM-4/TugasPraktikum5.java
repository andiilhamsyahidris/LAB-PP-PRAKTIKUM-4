import java.util.Scanner;

public class TugasPraktikum5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris = sc.nextInt();
        int kolom = sc.nextInt();
        int [][] arr = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                arr [i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < kolom; i++) {
            for (int j = 0; j < baris; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}