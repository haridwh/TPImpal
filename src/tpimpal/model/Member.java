/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpimpal.model;

import java.util.ArrayList;

/**
 *
 * @author skday
 */
public class Member extends Akun {
    
    private String noMember;
    private ArrayList<Penyewaan> penyewa;
    
    public Member(String nama, String username, String password) {
        super(nama, username, password);
    }
    
}
