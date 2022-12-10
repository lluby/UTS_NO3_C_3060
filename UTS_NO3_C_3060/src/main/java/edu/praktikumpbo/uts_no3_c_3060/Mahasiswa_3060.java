/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.uts_no3_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */
public class Mahasiswa_3060 {
    protected String nim_3060, nama_3060, jurusan_3060;
    protected float ipk_3060;
    
    public Mahasiswa_3060(){
        
    }
    
    public Mahasiswa_3060(String a, String b, String c, int d){
        nim_3060 = a;
        nama_3060 = b;
        jurusan_3060 = c;
        ipk_3060 = d;
    }
    
    public void setnim_3060(String nim){
        nim_3060 = nim;  
    }
    
    public void setnama(String nama){
        nama_3060 = nama;
    }
    
    public void setjurusan(String jurusan){
        jurusan_3060 = jurusan;
    }
    
    public void setIPK(float ipk){
        ipk_3060 =ipk;
    }
    
    public void tampil(){
        System.out.println("NIM                 : "+nim_3060);
        System.out.println("Nama                : "+nama_3060);
        System.out.println("Jurusan             : "+jurusan_3060);
        System.out.println("IPK                 : "+ipk_3060);
    }
}
