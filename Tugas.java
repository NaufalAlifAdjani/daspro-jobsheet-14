import java.util.Scanner;
public class Tugas {

    static int Rekursif(int[] angka, int n){
        if (n == 0) {
            return(0);
        }else{
            return(angka[n-1] + Rekursif(angka,n-1));
        }
    
    }

    static int Iteratif(int[] angka, int n){
        int total = 0;
        for(int i = 0; i < angka.length; i++){
            total += angka[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumla angka yang ingin dihitung : ");
        int n = sc.nextInt();

        int angka[] = new int[n];

        for(int i = 0; i < angka.length; i++){
            System.out.println("Masukkan angka ke-"+(i+1)+" : ");
            angka[i] = sc.nextInt();
        }
        System.out.println("\nMenggunakan Fungsi Rekursif:");
        int totalRekursif = Rekursif(angka, n);
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalRekursif);


        System.out.println("\nMenggunakan Fungsi Iteratif:");
        int totalIteratif = Iteratif(angka, n);
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalIteratif);
    }
}
