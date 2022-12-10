/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.uts_no3_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class AsistenPraktikum_3060 extends Mahasiswa_3060 implements iPendapatan {
    private String mkAsistensi_3060;
    private int jmlhPertemuan_3060, totalPendapatan_3060;
    
    public AsistenPraktikum_3060(){
        
    }
    
    public AsistenPraktikum_3060(String a, String b, String c, int d, String e, int f){
        super(a,b,c,d);
        mkAsistensi_3060 = e;
        jmlhPertemuan_3060 = f;  
        totalPendapatan();
    }
    
    public void setmkAsistensi_3060(String asis){
        mkAsistensi_3060 = asis;
    }
    
    public void setjmlhPertemuan(int temu){
        jmlhPertemuan_3060 = temu;
    }
    
    public int totalPendapatan(){
        totalPendapatan_3060 = jmlhPertemuan_3060 * 50000;
        return totalPendapatan_3060;
    }
    
    public void tampilDataMhs(){
        System.out.println("MK Asistensi        : "+mkAsistensi_3060);
        System.out.println("Jumlah Pertemuan    : "+jmlhPertemuan_3060);
        System.out.println("----------------------------------------");
        System.out.println("Total Pendapatan    : "+totalPendapatan());
    }
}
