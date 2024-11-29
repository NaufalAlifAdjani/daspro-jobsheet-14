import java.util.Scanner;
public class Percobaan2 {
    static int hitungPangkat(int x, int y){
        if (y == 0) {
            return(1);
        }else{
            System.out.print(x + (y > 1 ? "x" : "x1 = "));
            return (x * hitungPangkat(x, y-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan, pangkat;
        System.out.println("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.println("\nPangkat: ");
        pangkat = sc.nextInt();

        System.out.println("\nDeret perhitungan: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(hasil);
    }
}
