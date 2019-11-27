import java.util.Scanner;

class Tugas01{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int a = yuk.nextInt();
        int b = yuk.nextInt();
        fpb(a, b);
        System.out.println("FPB Dari "+ a +" dan "+ b +" = "+ fpb(a, b));
    }
    public static int fpb(int a, int b){
        int x = 1;
        int fpb1 = 0;
        if(a == 0 || b == 0){
            fpb1 = a > b ? a : b;
        }
        while(x <= Math.abs(a) && x <= Math.abs(b)){
            if(a % x == 0 && b % x == 0){
                fpb1 = x;
            }
            x++;
        }
        return fpb1;
    }
}