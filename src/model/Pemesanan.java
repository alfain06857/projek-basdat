/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Pemesanan {
    private Integer id_pemesanan;
    private Pegawai pegawai;
    private Pelanggan pelanggan;
    private Kurir kurir;
    private Date tanggal_pemesanan;
    private Date tanggal_pengiriman;
    private String alamat_pengiriman;
    private Double harga_total;
    private ArrayList<DetailPemesanan> detail_pemesanan;

    public Integer getId_pemesanan() {
        return id_pemesanan;
    }

    public void setId_pemesanan(Integer id_pemesanan) {
        this.id_pemesanan = id_pemesanan;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Kurir getKurir() {
        return kurir;
    }

    public void setKurir(Kurir kurir) {
        this.kurir = kurir;
    }

    public Date getTanggal_pemesanan() {
        return tanggal_pemesanan;
    }

    public void setTanggal_pemesanan(Date tanggal_pemesanan) {
        this.tanggal_pemesanan = tanggal_pemesanan;
    }

    public Date getTanggal_pengiriman() {
        return tanggal_pengiriman;
    }

    public void setTanggal_pengiriman(Date tanggal_pengiriman) {
        this.tanggal_pengiriman = tanggal_pengiriman;
    }

    public String getAlamat_pengiriman() {
        return alamat_pengiriman;
    }

    public void setAlamat_pengiriman(String alamat_pengiriman) {
        this.alamat_pengiriman = alamat_pengiriman;
    }

    public Double getHarga_total() {
        return harga_total;
    }

    public void setHarga_total(Double harga_total) {
        this.harga_total = harga_total;
    }

    public ArrayList<DetailPemesanan> getDetail_pemesanan() {
        return detail_pemesanan;
    }

    public void setDetail_pemesanan(ArrayList<DetailPemesanan> detail_pemesanan) {
        this.detail_pemesanan = detail_pemesanan;
    }
    
}
