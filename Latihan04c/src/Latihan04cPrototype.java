/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import jdk.internal.util.xml.impl.Input;
/**
 *
 * @author LENOVO
 */
public class Latihan04cPrototype {
    String nama;
    String programStudi; 
    String nilaiHuruf;
    int nilai;

    public void nilai(){
        Scanner oscan01 = new Scanner(System.in);
        
        System.out.println("Data Test");
        System.out.println("===========================");
        System.out.print("Nama            : ");
        nama = oscan01.nextLine();
        System.out.print("Program Studi   : ");
        programStudi = oscan01.nextLine();
        System.out.print("Nilai           : ");
        nilai = oscan01.nextInt();
        
        
        //pengondisian nilai huruf..........................
        if (nilai >= 85 && nilai < 100){
            nilaiHuruf = "A";
        } 
        else if (nilai >= 70 && nilai < 85){
            nilaiHuruf = "B";
        }
        else if (nilai >= 60 && nilai < 70){
            nilaiHuruf = "C";
        }
         else if (nilai >= 50 && nilai < 60){
            nilaiHuruf = "D";
        }
        else if (nilai >= 0 && nilai < 50){
            nilaiHuruf = "E";
        }
        else {
            nilaiHuruf = "error";
        } 
        
    
        System.out.println("Nilai Huruf    : " + nilaiHuruf);
        System.out.println("=======================================");
        
    }
}
