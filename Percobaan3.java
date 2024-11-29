import java.util.Scanner;

public class Percobaan3 {
    static double hitungLaba(double Saldo, double Tahun){
        if (Tahun == 0) {
            return(Saldo);
        }else{
            return(1.11 * hitungLaba(Saldo, Tahun-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal : ");
        saldoAwal = sc.nextInt();
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = sc.nextInt();

        System.out.println("Jumlah saldo setelah "+tahun+" tahun : ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}
