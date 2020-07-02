/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Pelanggan {
    private Integer id_pelanggan;
    private String nama_depan;
    private String nama_belakang;
    private Date tanggal_lahir;
    private String alamat;
    private Integer kode_pos;
    private Integer no_telp;
    
    public Integer getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(Integer id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getNama_depan() {
        return nama_depan;
    }

    public void setNama_depan(String nama_depan) {
        this.nama_depan = nama_depan;
    }

    public String getNama_belakang() {
        return nama_belakang;
    }

    public void setNama_belakang(String nama_belakang) {
        this.nama_belakang = nama_belakang;
    }

    public Date getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(Date tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getKode_pos() {
        return kode_pos;
    }

    public void setKode_pos(Integer kode_pos) {
        this.kode_pos = kode_pos;
    }

    public Integer getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(Integer no_telp) {
        this.no_telp = no_telp;
    }
    
    
}
