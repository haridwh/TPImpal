/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpimpal.model;

import java.io.Serializable;

/**
 *
 * @author skday
 */
public class Kategori implements Serializable{
    private String nama;
    private int jumlahKursi;

    public Kategori(String nama, int jumlahKursi) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
    
    public int getJumlahKursi() {
        return jumlahKursi;
    }
}
