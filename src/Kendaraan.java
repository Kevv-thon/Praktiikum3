/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Kendaraan {
    String jenis;
    static void Data() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jenis : ");
        String jenis = input.nextLine();
        System.out.print("Masukkan cc : ");
        String cc = input.nextLine();
        System.out.print("Masukkan brand : ");
        String brand = input.nextLine();
        
        System.out.println("");
        System.out.println("Jenis kendaraan : " +jenis);
        System.out.println("CC : "+cc+" cc");
        System.out.println("Brand : "+brand);
    }

}
