import java.util.Scanner;
import java.util.Random;

class Tugas02{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int n = yuk.nextInt();
        int m = yuk.nextInt();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber); 
    }
    public static String generateSerial(int n, int m){
        String str = "";
        Random no = new Random();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int a = no.nextInt(10);
                str += a;
            }
            if(i < (n - 1)){
                str += "-";
            }
        }
        return str;
    }
}