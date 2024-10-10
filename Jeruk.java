import java.util.Scanner;

public class Jeruk{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah jeruk yang dibeli:");
        int jumlahJeruk = scanner.nextInt();
        int harga;

        if (jumlahJeruk == 1){
            harga = 3000;
        } else if (jumlahJeruk == 2){
            harga = 5000;
        } else {
            harga = 10000; 
        }
        System.out.println("Harga yang harus dibayar : Rp" + harga);
        scanner.close();
  }
}
    