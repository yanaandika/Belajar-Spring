/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class Nasabah extends Cicilan{
    private String Nama;
    private Integer Umur;
     private String alamat;
    private String Status;

    public Nasabah(String Nama, Integer Umur, String alamat, String Status, int jumlahTanggungan, double gajiPokok, double penghasilanTambahan, double bonus, String namabarang, double harga, double uangMuka, double bunga, int bulan) {
        super(jumlahTanggungan, gajiPokok, penghasilanTambahan, bonus, namabarang, harga, uangMuka, bunga, bulan);
        this.Nama = Nama;
        this.Umur = Umur;
        this.alamat = alamat;
        this.Status = Status;
    }
    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the Umur
     */
    public Integer getUmur() {
        return Umur;
    }

    /**
     * @param Umur the Umur to set
     */
    public void setUmur(Integer Umur) {
        this.Umur = Umur;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the pekerjaan
     */
    
}
