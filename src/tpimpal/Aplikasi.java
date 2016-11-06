/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tpimpal;

import java.util.ArrayList;
import tpimpal.model.FileIO;
import tpimpal.model.Kategori;
import tpimpal.model.Member;
import tpimpal.model.Mobil;

/**
 *
 * @author User
 */
public class Aplikasi {
    private ArrayList<Member> listMember = new ArrayList<Member>();
    private ArrayList<Kategori> listKategori = new ArrayList<Kategori>();
    private ArrayList<Mobil> listMobil = new ArrayList<Mobil>();
    
    private FileIO fileIO = new FileIO();

    public ArrayList<Member> getListMember() {
        return listMember;
    }

    public ArrayList<Kategori> getListKategori() {
        return listKategori;
    }

    public ArrayList<Mobil> getListMobil() {
        return listMobil;
    }

    public void setListMember(ArrayList<Member> listMember) {
        this.listMember = listMember;
    }

    public void setListKategori(ArrayList<Kategori> listKategori) {
        this.listKategori = listKategori;
    }

    public void setListMobil(ArrayList<Mobil> listMobil) {
        this.listMobil = listMobil;
    }

    
    
    public void createAkun (Member member){
        listMember.add(member);
}
    
    public void addKategori(Kategori kategori){
        listKategori.add(kategori);
    }
    
    public void addMobil(Mobil mobil){
        listMobil.add(mobil);
    }
    
    public void loadMobil(){
        listMobil = fileIO.loadMobil();
    }
    
    public void saveMobil(){
        fileIO.saveMobil(listMobil);
    }
    
    public void loadKategori(){
        listKategori = fileIO.loadKategori();
    }
    
    public void saveKategori(){
        fileIO.saveKategori(listKategori);
    }
}
