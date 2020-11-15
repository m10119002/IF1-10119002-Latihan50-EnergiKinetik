/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan50;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program energi kinetik
 * (OBJECT ORIENTED)
 * 
 */
public class Program {
    public static void main(String[] args) {
        EnergiKinetik obj = new EnergiKinetik(145, 25);
        
        System.out.println(
                "Sebuah bola baseball dengan massa 145 g dilempar dengan kecepatan 25m/s");
        System.out.println("a. Berapakah energi kinetiknya ? ".concat("Jawab : ").
                concat(Double.toString(
                        obj.getEnergiKinetik(obj.getKecepatan()))).concat(" J"));
        System.out.println("b. Berapakah usaha yang dilakukan pada bola untuk "
                + "mencapai kecepatan ini, jika dimulai");
        System.out.println("dari keadaan diam ? ".concat("Jawab : ").
                concat(Double.toString(
                        obj.getUsaha())).concat(" J"));
    }
}
