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
public class Kurir {
    private Integer id_kurir;
    private String nama_perusahaan;
    private Integer no_telp;

    public Integer getId_kurir() {
        return id_kurir;
    }

    public void setId_kurir(Integer id_kurir) {
        this.id_kurir = id_kurir;
    }

    public String getNama_perusahaan() {
        return nama_perusahaan;
    }

    public void setNama_perusahaan(String nama_perusahaan) {
        this.nama_perusahaan = nama_perusahaan;
    }

    public Integer getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(Integer no_telp) {
        this.no_telp = no_telp;
    }
}
