/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tpimpal;

import java.util.ArrayList;
import tpimpal.model.Kategori;
import tpimpal.model.Member;
import tpimpal.model.Mobil;

/**
 *
 * @author User
 */
public class Aplikasi {
    private ArrayList<Member> listMember;
    private ArrayList<Kategori> listKategori;
    private ArrayList<Mobil> listMobil;
    
    private FileIO fileIO;
    
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
        fileIO.saveKategori(listMobil);
    }
}
