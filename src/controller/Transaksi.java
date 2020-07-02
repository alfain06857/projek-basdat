/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.DetailPemesanan;
import model.Kategori;
import model.Kurir;
import model.Pegawai;
import model.Pelanggan;
import model.Pemasok;
import model.Pemesanan;
import model.Produk;

/**
 *
 * @author HP
 */
public class Transaksi {
    Koneksi koneksi;
    ArrayList<Pelanggan> arrPelanggan;
    ArrayList<Pegawai> arrPegawai;
    ArrayList<Kurir> arrKurir;
    ArrayList<Produk> arrProduk;
    ArrayList<Pemesanan> arrPemesanan;

    public Transaksi() {
        this.koneksi = new Koneksi();
        this.arrPelanggan = new ArrayList<>();
        this.arrPegawai = new ArrayList<>();
        this.arrKurir = new ArrayList<>();
        this.arrProduk = new ArrayList<>();
        this.arrPemesanan = new ArrayList<>();
    }
           
    public ArrayList<Pelanggan> getDataPelanggan() throws SQLException{
        this.arrPelanggan.clear();
        
        ResultSet rs = this.koneksi.GetData("Select * from Pelanggan_06857");
        while(rs.next()){
            
            
            Pelanggan p = new Pelanggan();
            p.setId_pelanggan(rs.getInt("Id_Pelanggan"));
            p.setNama_depan(rs.getString("Nama_Depan"));
            p.setNama_belakang(rs.getString("Nama_Belakang"));
            p.setTanggal_lahir(rs.getDate("Tanggal_Lahir"));
            p.setAlamat(rs.getString("Alamat"));
            p.setKode_pos(rs.getInt("Kode_Pos"));
            p.setNo_telp(rs.getInt("No_Telp"));
            
            this.arrPelanggan.add(p);
        }
        
        return this.arrPelanggan;
    }
     
    public ArrayList<Pegawai> getDataPegawai() throws SQLException{
        this.arrPegawai.clear();
        
        ResultSet rs = this.koneksi.GetData("Select * from Pegawai_06857");
        while(rs.next()){
            
            
            Pegawai p = new Pegawai();
            p.setId_pegawai(rs.getInt("Id_Pegawai"));
            p.setNama_depan(rs.getString("Nama_Depan"));
            p.setNama_belakang(rs.getString("Nama_Belakang"));
            p.setTanggal_lahir(rs.getDate("Tanggal_Lahir"));
            p.setAlamat(rs.getString("Alamat"));
            p.setKode_pos(rs.getInt("Kode_Pos"));
            p.setNo_telp(rs.getInt("No_Telp"));
            
            this.arrPegawai.add(p);
        }
        
        return this.arrPegawai;
    }
    
    public ArrayList<Kurir> getDataKurir() throws SQLException{
        this.arrKurir.clear();
        
        ResultSet rs = this.koneksi.GetData("Select * from Kurir_06857");
        while(rs.next()){
            
            
            Kurir p = new Kurir();
            p.setId_kurir(rs.getInt("Id_Kurir"));
            p.setNama_perusahaan(rs.getString("Nama_Perusahaan"));
            p.setNo_telp(rs.getInt("No_Telp"));
            
            this.arrKurir.add(p);
        }
        
        return this.arrKurir;
    }
    
    public ArrayList<Produk> getDataProduk() throws SQLException{
        this.arrProduk.clear();
        
        ResultSet rs = this.koneksi.GetData("Select * from Produk_06857 join Kategori_06857 ON Produk_06857.id_kategori = Kategori_06857.id_kategori "
                + "Join Pemasok_06857 ON Produk_06857.id_pemasok = Pemasok_06857.id_pemasok");
        while(rs.next()){
            
            Kategori k = new Kategori();
            k.setId_kategori(rs.getInt("Id_kategori"));
            k.setNama_kategori(rs.getString("Nama_kategori"));
            
            Pemasok x = new Pemasok();
            x.setId_pemasok(rs.getInt("Id_pemasok"));
            x.setNama_perusahaan(rs.getString("Nama_perusahaan"));
            x.setAlamat(rs.getString("Alamat"));
            x.setKode_pos(rs.getInt("Kode_pos"));
            x.setNo_telp(rs.getInt("No_telp"));
            
            Produk p = new Produk();
            p.setId_produk(rs.getInt("Id_Produk"));
            p.setKategori(k);
            p.setPemasok(x);
            p.setNama_produk(rs.getString("Nama_Produk"));
            p.setHarga_satuan(rs.getDouble("Harga_satuan"));
            p.setStok_produk(rs.getInt("Stok_produk"));
            
            this.arrProduk.add(p);
        }
        
        return this.arrProduk;
    }
    
    public ArrayList<Pemesanan> getDataPemesanan() throws SQLException{
        this.arrPemesanan.clear();
        
        ResultSet rs = this.koneksi.GetData("Select Pelanggan_06857.id_pelanggan, Pelanggan_06857.nama_depan as Nama_Depan_Pelanggan, Pelanggan_06857.nama_belakang as Nama_Belakang_Pelanggan, Pelanggan_06857.tanggal_lahir as Tanggal_Lahir_Pelanggan, Pelanggan_06857.alamat as Alamat_pelanggan, Pelanggan_06857.kode_pos as Kode_Pos_Pelanggan, Pelanggan_06857.no_telp as No_Telp_Pelanggan, Pegawai_06857.id_pegawai, Pegawai_06857.nama_depan as Nama_Depan_Pegawai, Pegawai_06857.nama_belakang as Nama_Belakang_Pegawai, Pegawai_06857.tanggal_lahir as Tanggal_Lahir_Pegawai, Pegawai_06857.alamat as Alamat_Pegawai, Pegawai_06857.kode_pos as Kode_Pos_Pegawai, Pegawai_06857.no_telp as No_Telp_Pegawai, Pemesanaan_06857.*, Kurir_06857.* FROM Pemesanaan_06857 JOIN Pelanggan_06857 ON Pemesanaan_06857.id_pelanggan = Pelanggan_06857.id_pelanggan JOIN Pegawai_06857 ON Pemesanaan_06857.id_pegawai = Pegawai_06857.id_pegawai JOIN Kurir_06857 ON Pemesanaan_06857.id_kurir = Kurir_06857.id_kurir ORDER BY Id_Pemesanan DESC");
        while(rs.next()){
            
            Pelanggan p = new Pelanggan();
            p.setId_pelanggan(rs.getInt("Id_Pelanggan"));
            p.setNama_depan(rs.getString("Nama_Depan_Pelanggan"));
            p.setNama_belakang(rs.getString("Nama_Belakang_Pelanggan"));
            p.setTanggal_lahir(new Date(rs.getString("Tanggal_Lahir_Pelanggan")));
            p.setAlamat(rs.getString("Alamat_Pelanggan"));
            p.setKode_pos(rs.getInt("Kode_Pos_Pelanggan"));
            p.setNo_telp(rs.getInt("No_Telp_Pelanggan"));
            
            Pegawai pe = new Pegawai();
            pe.setId_pegawai(rs.getInt("Id_Pegawai"));
            pe.setNama_depan(rs.getString("Nama_Depan_Pegawai"));
            pe.setNama_belakang(rs.getString("Nama_Belakang_Pegawai"));
            pe.setTanggal_lahir(new Date(rs.getString("Tanggal_Lahir_Pegawai")));
            pe.setAlamat(rs.getString("Alamat_Pegawai"));
            pe.setKode_pos(rs.getInt("Kode_Pos_Pegawai"));
            pe.setNo_telp(rs.getInt("No_Telp_Pegawai"));
            
            Kurir k = new Kurir();
            k.setId_kurir(rs.getInt("Id_Kurir"));
            k.setNama_perusahaan(rs.getString("Nama_Perusahaan"));
            k.setNo_telp(rs.getInt("No_Telp"));
            
            Pemesanan x = new Pemesanan();
            x.setId_pemesanan(rs.getInt("Id_Pemesanan"));
            x.setPelanggan(p);
            x.setPegawai(pe);
            x.setKurir(k);
            x.setTanggal_pemesanan(new Date(rs.getString("Tanggal_Pemesanan")));
            x.setTanggal_pengiriman(new Date(rs.getString("Tanggal_Pengiriman")));
            x.setAlamat_pengiriman(rs.getString("Alamat_Pengiriman"));
            x.setHarga_total(rs.getDouble("Harga_Total"));
            
            ResultSet rsDetail_Pemesanan = this.koneksi.GetData("Select * from Detail_pemesanan_06857 join produk_06857 on Detail_pemesanan_06857."
                    + "id_produk = Produk_06857.id_produk join pemasok_06857 on produk_06857.id_pemasok = pemasok_06857.id_pemasok join "
                    + "Kategori_06857 on produk_06857.id_kategori = Kategori_06857.id_kategori WHERE Detail_pemesanan_06857."
                    + "id_pemesanan = " + rs.getString("Id_pemesanan"));
            ArrayList<DetailPemesanan> dp = new ArrayList<>();
            while(rsDetail_Pemesanan.next()){
                Pemasok pemasok = new Pemasok();
                pemasok.setId_pemasok(rsDetail_Pemesanan.getInt("Id_Pemasok"));
                pemasok.setNama_perusahaan(rsDetail_Pemesanan.getString("Nama_Perusahaan"));
                pemasok.setAlamat(rsDetail_Pemesanan.getString("Alamat"));
                pemasok.setKode_pos(rsDetail_Pemesanan.getInt("Kode_Pos"));
                pemasok.setNo_telp(rsDetail_Pemesanan.getInt("No_Telp"));
                
                Kategori kategori = new Kategori();
                kategori.setId_kategori(rsDetail_Pemesanan.getInt("Id_Kategori"));
                kategori.setNama_kategori(rsDetail_Pemesanan.getString("Nama_Kategori"));
                
                Produk produk = new Produk();
                produk.setId_produk(rsDetail_Pemesanan.getInt("Id_Produk"));
                produk.setPemasok(pemasok);
                produk.setKategori(kategori);
                produk.setNama_produk(rsDetail_Pemesanan.getString("Nama_Produk"));
                produk.setHarga_satuan(rsDetail_Pemesanan.getDouble("Harga_Satuan"));
                produk.setStok_produk(rsDetail_Pemesanan.getInt("Stok_Produk"));
                produk.setId_produk(rsDetail_Pemesanan.getInt("Id_Produk"));
                
                DetailPemesanan detail_pemesanan = new DetailPemesanan();
                detail_pemesanan.setProduk(produk);
                detail_pemesanan.setJumlah(rsDetail_Pemesanan.getInt("Jumlah"));
                detail_pemesanan.setDiskon(rsDetail_Pemesanan.getDouble("Diskon"));
                dp.add(detail_pemesanan);
            }
            x.setDetail_pemesanan(dp);
            this.arrPemesanan.add(x);
        } 
        return this.arrPemesanan;
    }
    public void insertTransaksi(Pemesanan pemesanan) throws SQLException{
        String dataPemesanan = new SimpleDateFormat("dd/MM/yyyy").format(pemesanan.getTanggal_pemesanan());
        String dataPengiriman = new SimpleDateFormat("dd/MM/yyyy").format(pemesanan.getTanggal_pengiriman());
        
        this.koneksi.ManipulasiData("insert into pemesanaan_06857 values (id_pemesanan.nextval, "+pemesanan.getPelanggan().getId_pelanggan()+", "+pemesanan.getPegawai().getId_pegawai()+","+pemesanan.getKurir().getId_kurir()+",to_date('"+dataPemesanan+"','dd/MM/yyyy'),to_date('"+dataPengiriman+"','dd/MM/yyyy'),'"+pemesanan.getAlamat_pengiriman()+"', "+pemesanan.getHarga_total().toString()+")");
        ResultSet rs = this.koneksi.GetData("Select id_pemesanan.currval from dual");
        rs.next();
        int id_pemesanan = rs.getInt("currval");
        for(DetailPemesanan dp : pemesanan.getDetail_pemesanan()){
            this.koneksi.ManipulasiData("insert into detail_pemesanan_06857 values ("+dp.getProduk().getId_produk()+", "+id_pemesanan+", "+dp.getJumlah()+","+dp.getDiskon()+")");
            this.koneksi.ManipulasiData("update produk_06857 set stok_produk=stok_produk-"+dp.getJumlah()+"where id_produk"+dp.getProduk().getId_produk());
        
        }
    }
}
