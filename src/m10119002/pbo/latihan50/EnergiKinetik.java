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
 * Deskripsi Program : Class untuk objek Energi Kinetik
 * 
 * 
 */
public class EnergiKinetik {
    private double m, v;
    
    public EnergiKinetik(int gram, int meterPerDetik)
    {this.m = (double)gram/1000.0; this.v = (double)meterPerDetik;}
    
    public double getKecepatan() {return this.v;}
    public double getEnergiKinetik(double v) {return 0.5*this.m*(v*v);}
    public double getUsaha()
    {return getEnergiKinetik(v) - getEnergiKinetik(0);}
}
