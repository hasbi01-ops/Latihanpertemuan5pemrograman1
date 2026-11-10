package pemrograman;
import java.util.Scanner;

public class no3{
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan nilai:  ");
        double nilai = in.nextDouble();
        String grade;

        if (nilai >=90){
            grade = "A";        
        }else if(nilai >=80){
            grade = "b";
        }else if(nilai >70){
            grade = "c";
        }else{
            grade = "d";
        }

        System.out.println("Nilai anda = "+nilai);
        System.out.println("Grade anda = "+grade);


    }
}