/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpimpal;

import java.util.ArrayList;
import tpimpal.controller.Controller;
import tpimpal.model.Kategori;
import tpimpal.model.Mobil;

/**
 *
 * @author skday
 */
public class TPImpal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aplikasi app = new Aplikasi();
        app.loadKategori();
        app.loadMobil();
//        for (int i=0; i<app.getListMobil().size();i++){
//            System.out.println(app.getListMobil().get(i).getNama());
//        }
        new Controller(app);
    }
    
}
