/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpimpal.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import tpimpal.Aplikasi;
import tpimpal.model.Member;
import tpimpal.view.LoginView;
import tpimpal.view.MenuPenyewaanView;
import tpimpal.view.MenuUtama;
import tpimpal.view.Registrasi;
import tpimpal.view.RiwayatPenyewaan;

/**
 *
 * @author skday
 */
public class Controller implements ActionListener{

    private Aplikasi app;
    private LoginView loginView;
    private Registrasi registrasi;
    private MenuUtama menuUtama;
    private MenuPenyewaanView menuPenyewaanView;
    private RiwayatPenyewaan riwayatPenyewaan;
    
    public Controller(Aplikasi app) {
        this.app = app;
        loginView = new LoginView();
        loginView.setVisible(true);
        loginView.addListener(this);
    }    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(loginView.getBtnRegister())) {
            loginView.dispose();
            registrasi = new Registrasi();
            registrasi.setVisible(true);
            registrasi.addListener(this);
        }else if (source.equals(loginView.getBtnLogin())){
            String username = loginView.getUsername().getText();
            String password = loginView.getPassword().getText();
            if ((!username.equals(""))
                    && (!password.equals(""))) {
                boolean terdaftar = false;
                for (int i = 0; i < app.getListMember().size(); i++) {
                    if (username.equals(app.getListMember().get(i).getUsername())
                            && password.equals(app.getListMember().get(i).getPassword())) {
                        terdaftar = true;
                        break;
                    }
                }
                
                if (terdaftar) {
                    loginView.dispose();
                    menuUtama = new MenuUtama();
                    menuUtama.setVisible(true);
                    menuUtama.addListener(this);
                }else{
                    JOptionPane.showMessageDialog(loginView, "Username atau Password Salah");
                }
            }else{
                JOptionPane.showMessageDialog(loginView, "Form tidak boleh kosong");
            }
        }else if (source.equals(registrasi.getBtnresgistrasi())) {
            if ((!registrasi.getTextnama().getText().equals("")) && (!registrasi.getTextusername().getText().equals(""))
                    && (!registrasi.getTextpassword().getText().equals("")) && (!registrasi.getTextulangpass().getText().equals(""))) {
                if (registrasi.getTextpassword().getText().equals(registrasi.getTextulangpass().getText())) {
                    Member member = new Member(registrasi.getTextnama().getText(), registrasi.getTextusername().getText(), registrasi.getTextpassword().getText());
                    app.createAkun(member);
                    JOptionPane.showMessageDialog(registrasi, "Berhasil Registrasi");
                    registrasi.dispose();
                    loginView = new LoginView();
                    loginView.setVisible(true);
                    loginView.addListener(this);        
                }else{
                    JOptionPane.showMessageDialog(registrasi, "Password Tidak Sama");
                }
            }else{
                JOptionPane.showMessageDialog(registrasi, "Form Tidak Boleh Kosong");
            }
        }else if (source.equals(registrasi.getBtnkembali())) {
            registrasi.dispose();
            loginView = new LoginView();
            loginView.setVisible(true);
            loginView.addListener(this);
        }else if (source.equals(menuUtama.getBtnLogout())) {
            menuUtama.dispose();
            loginView = new LoginView();
            loginView.setVisible(true);
            loginView.addListener(this);
        }else if (source.equals(menuUtama.getBtnPenyewaan())) {
            menuUtama.dispose();
            menuPenyewaanView = new MenuPenyewaanView();
            menuPenyewaanView.setVisible(true);
            menuPenyewaanView.addListener(this);
        }
    }
    
}
