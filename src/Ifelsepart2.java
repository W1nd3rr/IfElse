
import java.util.Scanner;


public class Ifelsepart2 {

    
    public static void main(String[] args) {
        String nama;
        int umur;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda");
        nama = input.nextLine();
        System.out.println("Masukkan umur Anda");
        umur = input.nextInt();
        if  (  umur >= 60 )
        {
            System.out.println("Tuan " + nama + " Apakah Anda Sudah Pensiun");
        }
        else if ( umur <= 60 && umur == 25)
        {
            System.out.println("Saudara " + nama + " Apakah Anda Masih Berkerja?");
        }
        else if ( umur <= 25 )
        {
            System.out.println( umur + " Masih Bocil Deckkk ");
        }
        else 
        {
            System.out.println("Inputan Anda Salah");
        }
    }
    
}
