/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.uts_no3_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class StudentStaff_3060 extends Mahasiswa_3060 implements iPendapatan {
    private String unitKerja_3060;
    private int jamKerja_3060, totalPendapatan_3060;
    
    public StudentStaff_3060(){
        
    }
    
    public StudentStaff_3060(String a, String b, String c, int d, String e, int f){
        
        unitKerja_3060 = e;
        jamKerja_3060 = f;
        totalPendapatan();
    }
    
    public void setUnitKerja(String kerja){
        unitKerja_3060 = kerja;
        
    }
    
    public void setjamKerja(int jam){
        jamKerja_3060 = jam;
    }
    
    public void totalPendapatan(){
        totalPendapatan_3060 = 240000;
    }
    
    public void tampilDataMhs(){
        System.out.println("Unit Kerja          : "+unitKerja_3060);
        System.out.println("Jam Kerja           : "+jamKerja_3060);
        System.out.println("Total Pendapatan    : "+240000);
    }
}
