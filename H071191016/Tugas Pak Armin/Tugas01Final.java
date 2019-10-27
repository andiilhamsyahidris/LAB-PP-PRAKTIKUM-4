import java.util.Scanner;

class Tugas01Final{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int n = yuk.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        System.out.println("_____________________");
        System.out.println("| No | Data | Error |");
        System.out.println("_____________________");

        for(int i = 1; i < n; i++){
            arr[i] = i;
            sum += arr[i];
        }
        for(int i = 1; i < n; i++){
            arr[i] = i;
            double rata = sum / n;
            double error1 = rata - arr[i];
            double error = Math.sqrt(Math.pow(error1, 2));
            System.out.println("| "+ i +"  | "+ arr[i] +"   | "+ error +"   |");
        }
    }
}
