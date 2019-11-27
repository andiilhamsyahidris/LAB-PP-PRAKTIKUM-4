import java.util.Scanner;

class TugasPraktikum3{  
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int m = yuk.nextInt();
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int total;
        int[] arr = new int[m];
        for(int i = 0; i < m; i++){
            arr[i] = yuk.nextInt();
            sum += arr[i];
        }
        int n = yuk.nextInt();
        int[] arra = new int[n];
        for(int j = 0; j < n; j++){
            arra[j] = yuk.nextInt();
            sum1 += arra[j];
        }
        yuk.close();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i] == arra[j]){
                    sum2 += arr[i];
                }  
            }
        }
        total = (sum + sum1) - sum2;
        System.out.println(total);
    }
}