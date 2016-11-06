/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpimpal.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author skday
 */
public class FileIO {
    public void saveMobil(ArrayList<Mobil> listMobil){
        try {
            FileOutputStream fos = new FileOutputStream("mobil.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listMobil);
            fos.close();
            oos.close();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Mobil> loadMobil(){
        ArrayList<Mobil> listMobil;
        try {
            FileInputStream fin = new FileInputStream("mobil.dat");
            ObjectInputStream ois = new ObjectInputStream(fin);
            listMobil = (ArrayList<Mobil>) ois.readObject();
            ois.close();
            fin.close();
            return listMobil;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void saveKategori(ArrayList<Kategori> listKategori){
        try {
            FileOutputStream fos = new FileOutputStream("kategori.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listKategori);
            fos.close();
            oos.close();
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Kategori> loadKategori(){
        ArrayList<Kategori> listKategori;
        try {
            FileInputStream fin = new FileInputStream("kategori.dat");
            ObjectInputStream ois = new ObjectInputStream(fin);
            listKategori = (ArrayList<Kategori>) ois.readObject();
            ois.close();
            fin.close();
            return listKategori;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
