/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train_booking_system;

import java.util.Scanner;
public class TRAIN_BOOKING_SYSTEM {
    public String Asal_kota;
    public String Tujuan_kota;
    public String tanggal_berangkat;
    public String tanggal_kembali;
    public int penumpang;

    public String getAsal_kota() {
        return Asal_kota;
    }

    public void setAsal_kota(String Asal_kota) {
        this.Asal_kota = Asal_kota;
    }

    public String getTujuan_kota() {
        return Tujuan_kota;
    }

    public void setTujuan_kota(String Tujuan_kota) {
        this.Tujuan_kota = Tujuan_kota;
    }

    public String getTanggal_berangkat() {
        return tanggal_berangkat;
    }

    public void setTanggal_berangkat(String tanggal_berangkat) {
        this.tanggal_berangkat = tanggal_berangkat;
    }

    public String getTanggal_kembali() {
        return tanggal_kembali;
    }

    public void setTanggal_kembali(String tanggal_kembali) {
        this.tanggal_kembali = tanggal_kembali;
    }

    public int getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        TRAIN_BOOKING_SYSTEM orang = new TRAIN_BOOKING_SYSTEM();
       System.out.println("*******SELAMAT DATANG DI KAI ACCESS*********");
       System.out.println("Masukkan Asal kota anda : ");
       orang.Asal_kota = keyboard.nextLine();
       System.out.println("Masukkan Tujuan kota anda : ");
       orang.Tujuan_kota = keyboard.nextLine();
       System.out.println("Masukkan Tanggal Keberangkatan : ");
       orang.tanggal_berangkat = keyboard.nextLine();
       System.out.println("Masukkan Tanggal Kembali : ");
       orang.tanggal_kembali = keyboard.nextLine();
       System.out.println("Jumlah Penumpang : ");
       orang.penumpang = keyboard.nextInt();
       System.out.println("\nAsal kota : "+orang.Asal_kota);
       System.out.println("Tujuan kota : "+orang.Tujuan_kota);
       System.out.println("Berangkat : "+orang.tanggal_berangkat);
       System.out.println("Kembali : "+orang.tanggal_kembali);
       System.out.println("Penumpang : "+orang.penumpang +" Orang ");
       
    }
    
}
