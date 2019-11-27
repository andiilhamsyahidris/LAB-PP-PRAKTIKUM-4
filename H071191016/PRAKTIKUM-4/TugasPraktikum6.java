import java.util.Scanner;
class TugasPraktikum6 {
    public static void main(String[] args) {
        Scanner yuk = new Scanner(System.in);

        int barisKolom = yuk.nextInt();
        int [][] arr = new int[barisKolom][barisKolom];

        for (int i = 0; i < barisKolom; i++) {
            for (int j = 0; j < barisKolom; j++) {
                arr [i][j] = yuk.nextInt();
            }
        }

        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1; j++) { 
                if (arr[i][j] == 0){
                    if(arr[i][j] != arr[i][j - 1] && arr[i][j] != arr[i][j + 1] && arr[i][j] != arr[i - 1][j] && arr[i][j] != arr[i + 1][j]){
                        System.out.println(i+","+j);
                    }
                }
            }
        }
        try{
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 1; j++) { 
                    if(arr[i] == arr[j - 1])
                        System.out.println("Tidak Ditemukan");
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
        }
    }
}