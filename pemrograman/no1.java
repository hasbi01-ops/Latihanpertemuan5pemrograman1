package pemrograman;
import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan angka : ");
        int angka = in.nextInt();

        if (angka %2 == 0){
            System.out.println("Ini angka genap");
        }else{
            System.out.println("Ini angka ganjil");
        }

        



        
    }
}
