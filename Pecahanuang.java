import java.util.Scanner;

public class Pecahanuang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah uang:");
        int jumlahUang = scanner.nextInt();

        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};

        System.out.println("Pecahan uang");
        for (int pecahanUang : pecahan) {
            int jumlahLembar = jumlahUang / pecahanUang;
            if (jumlahLembar > 0 ); {
                System.out.println(jumlahLembar + "lembar" + pecahanUang);
        }
        jumlahUang %= pecahanUang;
        scanner.close();
    }
  }
}
