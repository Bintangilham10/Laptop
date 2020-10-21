
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class Penjualanlaptop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi variable//
        int hargalaptop,diskon,hargadiskon,totalharga;
        //membuat objek dari class scanner//
        Scanner input = new Scanner(System.in);
        //perintah untuk use//
        System.out.println("Masukkan Harga Laptop :");
        //mengambil nilai input user lalu disimpan ke variabel hargabarang//
        hargalaptop = input.nextInt();
        //tampil output hasil//
        System.out.println("Harga laptop Rp."+hargalaptop);
        System.out.println("Masukkan Diskon : ");
        diskon = input.nextInt();
        
        System.out.println("=================================================================");
        System.out.println("Diskon "+ diskon+"%");
        
        //perhitungan mencari harga diskon laptop//
        hargadiskon = (hargalaptop * diskon/100);
        
        System.out.println("Harga Potongan Diskon laptop = Rp."+hargadiskon);
        
        //perhitungan harga akhir laptop setalah didiskon//
        totalharga = hargalaptop - hargadiskon;
        System.out.println("Total Pembayaran laptop Setelah Potongan Diskon = Rp."+ totalharga);
        
        
    }
    
}
