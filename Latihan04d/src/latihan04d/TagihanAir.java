/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan04d;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class TagihanAir {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        String nama, noPel;
        int pemakaianAir;
        double biayaPemakaian=0;
        double hargaPerM3_1=1000;
        double hargaPerM3_2=2000;
        double hargaPerM3_3=5000;
        
        Scanner oscan1 = new Scanner(System.in);
        System.out.println("Hitung Total Tagihan");
        System.out.println("================================");
        System.out.println("Nama                : ");
        nama = oscan1.nextLine();
        System.out.println("No Pelanggan        : ");
        noPel = oscan1.nextLine();
        System.out.println("Pemakaian Air       : ");
        pemakaianAir = oscan1.nextInt();
        
        if (pemakaianAir <= 10){
            biayaPemakaian = pemakaianAir * hargaPerM3_1;
        }
        
        else if (pemakaianAir <= 20) {
            biayaPemakaian = (10 * hargaPerM3_1) + (pemakaianAir-10) * hargaPerM3_2;
        }
        else {
            biayaPemakaian = (10 * hargaPerM3_1) + (10 * hargaPerM3_2) + (pemakaianAir-20)* hargaPerM3_3;
        }
        System.out.println("Biaya Pemakaian : "+ biayaPemakaian);
    }
    
}
