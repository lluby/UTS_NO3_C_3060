/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.uts_no3_c_3060;

/**
 *
 * @author Ervie Liana Luby 21103060
 */

import java.io.*;

public class UTS_NO3_C_3060 {

    public static void main(String[] args) {
        Mahasiswa_3060 a = new Mahasiswa_3060();
        Mahasiswa_3060 d = new Mahasiswa_3060();
        AsistenPraktikum_3060 b = new AsistenPraktikum_3060();
        StudentStaff_3060 c = new StudentStaff_3060();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            
            System.out.println("Jumlah Asisten Praktkum : 1");
            System.out.println("==== Input Asisten Praktikum ====");;
            System.out.println("NIM                 : ");
            a.setnim_3060(br.readLine() .toString());
            System.out.println("Nama                : ");
            a.setnama(br.readLine() .toString());
            System.out.println("Jurusan             : ");
            a.setjurusan(br.readLine() .toString());
            System.out.println("IPK                 : ");
            a.setIPK(Float.parseFloat(br.readLine() .toString()));
            System.out.println("MK Asistensi        : ");
            b.setmkAsistensi_3060(br.readLine() .toString());
            System.out.println("Jumlah Pertemuan    : ");
            b.setjmlhPertemuan(Integer.parseInt(br.readLine() .toString()));
            System.out.println("");
            
            
            System.out.println("Jumlah Student Staff : 1");
            System.out.println("==== Input Data Student Staff");
            System.out.println("NIM                 : ");
            d.setnim_3060(br.readLine() .toString());
            System.out.println("Nama                : ");
            d.setnama(br.readLine() .toString());
            System.out.println("Jurusan             : ");
            d.setjurusan(br.readLine() .toString());
            System.out.println("IPK                 : ");
            d.setIPK(Float.parseFloat(br.readLine() .toString()));
            System.out.println("Unit Kerja          : ");
            c.setUnitKerja(br.readLine() .toString());
            System.out.println("Jam Kerja           : ");
            c.setjamKerja(Integer.parseInt(br.readLine() .toString()));
            System.out.println("");
            
            System.out.println("=== Data Asisten Praktikum ===");
            a.tampil();
            b.tampilDataMhs();
            System.out.println("");
            
            System.out.println("=== Data Student Staff ===");
            d.tampil();
            c.tampilDataMhs();
            System.out.println("");
            
            
            
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        
    }
}
