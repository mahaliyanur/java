/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess;

/**
 *
 * @author User
 */
public class Mahasiswa extends Manusia {

    String nama,noHp,alamat,tgl,bln,thn;
    String jKelamin,hobi,temLahir,id;
    
    @Override
    public void setNama(String nama) {
        this.nama=nama;
    }

    @Override
    protected String getNama() {
        return nama;
    }

    @Override
    public void setNoHp(String noHp) {
        this.noHp=noHp;
    }

    @Override
    protected String getNoHp() {
        return noHp;
    }

    @Override
    public void setAlamt(String alamat) {
        this.alamat=alamat;
    }

    @Override
    protected String getAlamat() {
        return alamat;
    }

    @Override
    public void setId(String id) {
        this.id=id;
    }

    @Override
    protected String getId() {
        return id;
    }

    @Override
    public void setTemLahir(String temLahir) {
        this.temLahir=temLahir;
    }

    @Override
    protected String getTemLahir() {
        return temLahir;
    }

    @Override
    public void setTgl(String tgl) {
        this.tgl=tgl;
    }

    @Override
    protected String getTgl() {
        return tgl;
    }

    @Override
    public void setBln(String bln) {
        this.bln=bln;
    }

    @Override
    protected String getBln() {
        return bln;
    }

    @Override
    public void setThn(String thn) {
        this.thn=thn;
    }

    @Override
    protected String getThn() {
        return thn;
    }
    
    public void setHobi(String hobi){
        this.hobi=hobi;
    }
    
    protected String getHobi(){
        return hobi;
    }
    
    public void setJKelamin(String jKelamin){
        this.jKelamin=jKelamin;
    }
    
    protected String getJKelamin(){
        return jKelamin;
    }    
    
}
