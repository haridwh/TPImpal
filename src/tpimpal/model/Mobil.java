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
public class Mobil implements Serializable{
    private String nama;
    private Kategori kategori;
    private long harga;

    public Mobil(String nama, Kategori kategori, long harga) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }
    
    public Kategori getKategori() {
        return kategori;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }
    
    public long getHarga() {
        return harga;
    }
}
