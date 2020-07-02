/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HP
 */
public class Pemasok {
    private Integer id_pemasok;
    private String nama_perusahaan;
    private String alamat;
    private Integer kode_pos;
    private Integer no_telp;

    public Integer getId_pemasok() {
        return id_pemasok;
    }

    public void setId_pemasok(Integer id_pemasok) {
        this.id_pemasok = id_pemasok;
    }

    public String getNama_perusahaan() {
        return nama_perusahaan;
    }

    public void setNama_perusahaan(String nama_perusahaan) {
        this.nama_perusahaan = nama_perusahaan;
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
