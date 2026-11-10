package pemrograman;
import java.util.Scanner;

public class no2{
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan angka : ");
        int angka = in.nextInt();

        if (angka >0){
            System.out.println("angka positif");
        }else if(angka<0){
            System.out.println("angka negatif");
        }else{
            System.out.println("bilangan 0");
        }
    }
}