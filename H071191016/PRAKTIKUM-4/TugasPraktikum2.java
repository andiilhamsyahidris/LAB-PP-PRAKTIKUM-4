import java.util.Scanner;

class TugasPraktikum2{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int baris = yuk.nextInt();
        int kolom = yuk.nextInt();
        int baris2 = yuk.nextInt();
        int[][] arr = new int[baris][kolom]; //Matriks 1

        for(int i = 0; i < baris; i++){
            for(int j = 0; j < kolom; j++){
                arr[i][j] = yuk.nextInt();
            }
        }
        int[][] array = new int[kolom][baris2]; //Matriks 2

        for(int i = 0; i < kolom; i++){
            for(int j = 0; j < baris2; j++){
                array[i][j] = yuk.nextInt();
            }
        }
        yuk.close();
        System.out.println();
        for(int i = 0; i < baris; i++){
            for(int j = 0; j < baris2; j++){
                int sum = 0;
                for(int k = 0; k < kolom; k++){
                    sum += arr[i][k] * array[k][j];
                }
                System.out.print(sum +" ");
            }
            System.out.println();

        }
    }
}