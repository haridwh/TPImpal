/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpimpal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author skday
 */
public class FileIO {
    public void saveMobil(ArrayList list){
         try{
            FileOutputStream fOS = new FileOutputStream("mobil.dat");
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);
            oOS.writeObject(list);
            fOS.close();
            oOS.close();
        }catch(Exception e){            
            e.printStackTrace();
        }
    }
    
    public ArrayList loadMobil(){
        ArrayList list;
        try {
            FileInputStream fIN = new FileInputStream("mobil.dat");
            ObjectInputStream oIS = new ObjectInputStream(fIN);
            list = (ArrayList) oIS.readObject();
            oIS.close();
            fIN.close();
        } catch (IOException io) {
            io.printStackTrace();
            return null;
        } catch (ClassNotFoundException c){
            c.printStackTrace();
            return null;
        }
        return list;
    }
    
    public void saveKategori(ArrayList list){
         try{
            FileOutputStream fOS = new FileOutputStream("kategori.dat");
            ObjectOutputStream oOS = new ObjectOutputStream(fOS);
            oOS.writeObject(list);
            fOS.close();
            oOS.close();
        }catch(Exception e){            
            e.printStackTrace();
        }
    }
    
    public ArrayList loadKategori(){
        ArrayList list;
        try {
            FileInputStream fIN = new FileInputStream("kategori.dat");
            ObjectInputStream oIS = new ObjectInputStream(fIN);
            list = (ArrayList) oIS.readObject();
            oIS.close();
            fIN.close();
        } catch (IOException io) {
            io.printStackTrace();
            return null;
        } catch (ClassNotFoundException c){
            c.printStackTrace();
            return null;
        }
        return list;
    }
}
