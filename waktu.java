/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package improvedprojectrentalgames;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class waktu {
    int tanggalPeminjaman, bulanPeminjaman,tahunPeminjaman, tanggalKembali, bulanKembali,tahunKembali;
    Scanner key = new Scanner(System.in);
    
    void peminjaman(){
        System.out.print("Masukkan Tanggal Pinjam (1-31): ");
        tanggalPeminjaman = key.nextInt();
        System.out.print("Masukkan Bulan Pinjam	(1-12): ");
        bulanPeminjaman = key.nextInt();
        System.out.print("Masukkan Tahun Pinjam: ");
        tahunPeminjaman = key.nextInt();
    }
    
    void pengembalian(){
        System.out.print("Masukkan Tanggal Kembali (1-31): ");
        tanggalKembali = key.nextInt();
        System.out.print("Masukkan Bulan Kembali (1-12): ");
        bulanKembali = key.nextInt();
        System.out.print("Masukkan Tahun Kembali : ");
        tahunKembali = key.nextInt();
        System.out.print("");
    }
}

