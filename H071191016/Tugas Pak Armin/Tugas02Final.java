import java.util.Scanner;

class Tugas02Final{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        System.out.println("Matriks 1");
        System.out.print("Input Baris = ");
        int p = yuk.nextInt();
        System.out.print("Input Kolom = ");
        int q = yuk.nextInt();
        int[][] arr = new int[p][q];
        for(int i = 0; i < p; i++){
            for(int j = 0; j < q; j++){
                System.out.printf("Matriks 1 (%d, %d) = ", i, j);
                arr[i][j] = yuk.nextInt();
            }
        }
        System.out.println("Matriks 2");
        System.out.print("Input Baris = ");
        int r = yuk.nextInt();
        System.out.print("Input Kolom = ");
        int s = yuk.nextInt();
        int[][] arra = new int[r][s];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < s; j++){
                System.out.printf("Matriks 2 (%d, %d) = ", i, j);
                arra[i][j] = yuk.nextInt();
            }
        }
        System.out.println("Matriks AB");
        if(p == r){
            for(int i = 0; i < p; i++){
                for(int j = 0; j < q; j++){
                    int sum = 0;
                    for(int k = 0; k < r; k++){
                        sum += arr[i][k] * arra[k][j];
                    }
                    System.out.print(sum +" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Tidak dapat dikalikan");
        }
        System.out.println("Matriks BA");
        if(p == r){
            for(int i = 0; i < p; i++){
                for(int j = 0; j < q; j++){
                    int sum = 0;
                    for(int k = 0; k < r; k++){
                        sum += arra[k][j] * arr[i][k];
                    }
                    System.out.print(sum +" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Tidak dapat dikalikan");
        }
    }
}
