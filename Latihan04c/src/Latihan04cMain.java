
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    


/**
 *
 * @author LENOVO
 */
public class Latihan04cMain {
    public static void main(String[] args){
    String nama;
    String programStudi; 
    String nilaiHuruf;
    int nilai;

    Latihan04cPrototype data = new Latihan04cPrototype();
    data.nilai();
    
        System.out.println("Nama            :" + data.nama);
        System.out.println("Program Studi   :" + data.programStudi);
        System.out.println("Nilai           :" + data.nilai);
        System.out.println("Nilai Huruf     :" + data.nilaiHuruf);

    }
}

