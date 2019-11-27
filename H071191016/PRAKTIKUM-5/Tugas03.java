import java.util.Scanner;

class Tugas03{
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);
        int day = yuk.nextInt();
        myDay(day);
    }
    public static void myDay(int day){
        System.out.println(tahun(day)+" Tahun");
        System.out.println(bulan(day)+" Bulan");
        System.out.println(hari(day)+" Hari");
    }
    public static int tahun(int day){
        int tahun = day/365;
        return tahun;
    }
    public static int bulan(int day){
        int bulan = (day % 365)/30;
        return bulan;
    }
    public static int hari(int day){
        int hari = (day % 365)%30;
        return hari;
    }
}