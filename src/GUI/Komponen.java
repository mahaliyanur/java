/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;

/**
 *
 * @author User
 */
public class Komponen extends JFrame {
    String tanggal[]= {null,"1","2","3","4","5","6","7","8","9","10","11","12","13","14",
                       "15","16","17","18","19","20","21","22","23","24","25","26",
                       "27","28","29","30","31"};
    String bulan[]={null,"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus",
                    "September","Oktober","Novembet","Desember"};
    String tahun[]={null,"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002"};
        
    JLabel npm= new JLabel("NPM            :   ");
    JLabel nama= new JLabel("Nama           :   ");
    JLabel telp= new JLabel("Telp.          :   ");
    JLabel jKelamin= new JLabel("Jenis Kelamin  :   ");
    JLabel TTL= new JLabel("TTL            :   ");
    JLabel hobby= new JLabel("Hobby          :   ");
    JLabel alamat= new JLabel("Alamat         :   ");
    
    JTextField nm=new JTextField();
    JTextField name=new JTextField();
    JTextField phone=new JTextField();
    JTextField tempat=new JTextField();
    JTextField almt=new JTextField();
    
    JRadioButton pria=new JRadioButton("Pria");
    JRadioButton wanita=new JRadioButton("Wanita");
    ButtonGroup kelamin=new ButtonGroup();
    
    JComboBox tgl=new JComboBox(tanggal);
    JComboBox bln=new JComboBox(bulan);
    JComboBox thn=new JComboBox(tahun);
    
    JCheckBox coding=new JCheckBox("Ngoding");
    JCheckBox baca=new JCheckBox("Baca Novel");
    JCheckBox desain=new JCheckBox("Design");
    JCheckBox makan=new JCheckBox("Makan Bakso");
    JCheckBox game=new JCheckBox("Game");
    JCheckBox dll=new JCheckBox("DLL");
    
    JButton in=new JButton("Insert");
    JButton cencel=new JButton("Cancel");
    
}
