/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Lenovo
 * V]Nama  : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 * Diskripsi Program : Saldo Tabungan
 */
public class Saldotabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double bunga;
        double saldo = 2500000;
        int lamaBulan = 6;
        
        
        DecimalFormat rp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols fRp = new DecimalFormatSymbols();
        fRp.setCurrencySymbol("Rp. ");
        fRp.setMonetaryDecimalSeparator(',');
        fRp.setGroupingSeparator('.');
        rp.setDecimalFormatSymbols(fRp);
        for (int i = 1; i <= lamaBulan; i++){
            bunga = 0.15 * saldo;
            saldo = bunga + saldo;
            System.out.printf("Saldo di Bulan Ke - " +i+ " %s%n",rp.format(saldo));
            
        }
        
    }
    
}
