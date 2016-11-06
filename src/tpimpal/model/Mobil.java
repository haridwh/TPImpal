/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpimpal.model;

/**
 *
 * @author skday
 */
public class Mobil {
    private String nama;
    private Kategori kategori;
    private long harga;

    public Mobil(String nama, Kategori kategori, long harga) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }
}
