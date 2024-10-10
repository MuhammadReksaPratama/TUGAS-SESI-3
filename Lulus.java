import java.util.Scanner;

public class Lulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai:");
        int nilai = scanner.nextInt();
        if (nilai >= 75){
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
        scanner.close();
}
    
}
