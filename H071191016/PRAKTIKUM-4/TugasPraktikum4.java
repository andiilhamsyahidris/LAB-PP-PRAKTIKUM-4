import java.util.Scanner;

public class TugasPraktikum4 {
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);

        int a = yuk.nextInt();
        int [] arr = new int [a];
        boolean truth = false;
        int sameValue = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0, x = 0; i < arr.length; i++) {
            arr [i] = yuk.nextInt();
        }  
        yuk.close(); 
        for (int j = 0,x = 0,n = a - 1 ; j < 2*a ; j++){
            x = 0;
            x = j + 1;
            for (int i = 0; i < n; i++) {
                if (arr[j] == arr [x]){
                    truth = true;
                    sameValue = arr[j];
                    sum1 = j;
                    sum2 = x;
                }
            }
            x++;
        n--;
        }
        if (truth == true) {
            System.out.println("Bilangan yang sama adalah "+sameValue+" pada indeks ke "+sum1+" dan ke "+sum2);
        } else {
            System.out.println("Tidak ada bilangan yang sama");
        }
    }
}