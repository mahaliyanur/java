package GUI;

import Proccess.Mahasiswa;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JCheckBox;

public class GUI extends Komponen implements ActionListener{
    
    ArrayList<Mahasiswa> data=new ArrayList<>();
        String inama,inoHp,ialamat,itgl,ibln,ithn;
        String ijKelamin,ihobi,itemLahir,iid,cetak;
    
    public GUI(){
        
        //npm
        npm.setBounds(20, 30, 200, 30);
        npm.setFont(new Font("Consolas",Font.BOLD,15));
        nm.setBounds(160, 30, 200, 22);
        nm.setFont(new Font("Arial",Font.PLAIN,15));
        add(npm);
        add(nm);
        //nama
        nama.setBounds(20, 55, 200, 30);
        nama.setFont(new Font("Consolas",Font.BOLD,15));
        name.setBounds(160, 55, 300, 22);
        name.setFont(new Font("Arial",Font.PLAIN,15));
        add(nama);
        add(name);        
        //telephone
        telp.setBounds(20, 80, 200, 30);
        telp.setFont(new Font("Consolas",Font.BOLD,15));
        phone.setBounds(160, 80, 200, 22);
        phone.setFont(new Font("Arial",Font.PLAIN,15));
        add(telp);
        add(phone);
        //jenis kelamin
        jKelamin.setBounds(20, 105, 200, 30);
        jKelamin.setFont(new Font("Consolas",Font.BOLD,15));
        pria.setBounds(160, 105, 50, 25);
        wanita.setBounds(230, 105, 80, 25);
        add(jKelamin);
        kelamin.add(pria);
        kelamin.add(wanita);
        add(pria);
        add(wanita);
        //tempat tanggal lahir
        TTL.setBounds(20, 130, 200, 30);
        TTL.setFont(new Font("Consolas",Font.BOLD,15));
        tempat.setBounds(160, 130, 100, 22);
        tempat.setFont(new Font("Arial",Font.PLAIN,15));
        tgl.setBounds(270, 130, 40, 22);
        bln.setBounds(320, 130, 90, 22);
        thn.setBounds(430, 130, 60, 22);
        add(TTL);
        add(tempat);
        add(tgl);
        add(bln);
        add(thn);
        //hobby
        hobby.setBounds(20, 155, 200, 30);
        hobby.setFont(new Font("Consolas",Font.BOLD,15));
        coding.setBounds(160, 155, 80, 25);
        baca.setBounds(280, 155, 120, 25);
        desain.setBounds(160, 175, 80, 25);
        makan.setBounds(280, 175, 120, 25);
        game.setBounds(160, 195, 80, 25);
        dll.setBounds(280, 195, 120, 25);
        add(hobby);
        add(baca);
        add(coding);
        add(desain);
        add(makan);
        add(game);
        add(dll);
        //alamat
        alamat.setBounds(20, 220, 200, 30);
        alamat.setFont(new Font("Consolas",Font.BOLD,15));
        almt.setBounds(160, 220, 400, 22);
        almt.setFont(new Font("Arial",Font.PLAIN,15));
        add(alamat);
        add(almt);
        //button
        in.setBounds(160, 270, 90, 22);
        cencel.setBounds(300, 270, 90, 22);        
        add(in);
        add(cencel);
        in.addActionListener(this);
        cencel.addActionListener(this);
        setTitle("Data Mahasiswa");
        setSize(630, 390);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
               
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == in){
            iid=nm.getText();
            inama=name.getText();
            inoHp=phone.getText();
            if(pria.isSelected())
                ijKelamin="Pria";
            else if(wanita.isSelected())
                ijKelamin="Wanita";
            itemLahir=tempat.getText();
            itgl=(String)tgl.getSelectedItem();
            ibln=(String)bln.getSelectedItem();
            ithn=(String)thn.getSelectedItem();
            ihobi="";
            if(coding.isSelected())
                ihobi=ihobi+coding.getText()+",";
            if(baca.isSelected())
                ihobi=ihobi+baca.getText()+",";
            if(desain.isSelected())
                ihobi+=desain.getText()+",";
            if(makan.isSelected())
                ihobi+=makan.getText()+",";
            if(game.isSelected())
                ihobi+=game.getText()+",";
            if(dll.isSelected())
                ihobi+=dll.getText();
            ialamat=almt.getText();
            cetak="npm            : "+iid+"\n"+"nama          : "+inama+"\n"+"Telp             : "
                    +inoHp+"\n"+"jenis kelamin       : "+ijKelamin+"\n"+"TTL     : "+itemLahir+","+itgl+" "
                    +ibln+" "+ithn+"\n"+"Hobby      : "+ihobi+"\n"+"alamat      : "+ialamat;
            JOptionPane.showMessageDialog(this,cetak,"Infomation",JOptionPane.INFORMATION_MESSAGE); 
        }
        else if(ae.getSource() == cencel){
            nm.setText("");
            name.setText("");
            phone.setText("");
            pria.setSelected(false);
            wanita.setSelected(false);
            tempat.setText("");
            tgl.setSelectedIndex(0);
            bln.setSelectedIndex(0);
            thn.setSelectedIndex(0);
            coding.setSelected(false);
            baca.setSelected(false);
            desain.setSelected(false);
            makan.setSelected(false);
            game.setSelected(false);
            dll.setSelected(false);
            almt.setText("");
        }
    }

}
