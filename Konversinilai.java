import java.util.Scanner;

public class Konversinilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai:");
        int nilai = scanner.nextInt();
        char grade;

        if (nilai > 85){
            grade = 'A';
        } else if (nilai > 75){
            grade = 'B';
        } else if (nilai > 65){
            grade = 'C';
        } else if (nilai > 55){
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("Nilai:" + grade);
        scanner.close();
    }
    
}
