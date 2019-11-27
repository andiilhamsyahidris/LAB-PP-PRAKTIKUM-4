import java.util.Scanner;
class TugasPraktikum1{
    
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int n = yuk.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = yuk.nextInt();
        }
        yuk.close();
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int x = 1;
                int fpb = 0;
                while((x <= arr[i]) && (x <= arr[j])){
                    if((arr[i] % x == 0) && (arr[j] % x == 0)){
                        fpb = x;
                    }
                    x++;
                }
                if(fpb == 1){
                    System.out.println(arr[i] +" "+ arr[j]);
                }   
            }
        }
    }
}