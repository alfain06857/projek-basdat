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
public class DetailPemesanan {
    private Produk produk;
    private Integer jumlah;
    private Double diskon;

    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public Double getDiskon() {
        return diskon;
    }

    public void setDiskon(Double diskon) {
        this.diskon = diskon;
    }
    
    
}
