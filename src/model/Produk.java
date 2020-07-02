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
public class Produk {
    private Integer id_produk;
    private Pemasok pemasok;
    private Kategori kategori;
    private String nama_produk;
    private Double harga_satuan;
    private Integer stok_produk;

    public Integer getId_produk() {
        return id_produk;
    }

    public void setId_produk(Integer id_produk) {
        this.id_produk = id_produk;
    }

    public Pemasok getPemasok() {
        return pemasok;
    }

    public void setPemasok(Pemasok pemasok) {
        this.pemasok = pemasok;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public Double getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(Double harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public Integer getStok_produk() {
        return stok_produk;
    }

    public void setStok_produk(Integer stok_produk) {
        this.stok_produk = stok_produk;
    }
    
    
}
