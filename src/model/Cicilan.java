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
public class Cicilan {

    private int jumlahTanggungan;
    private double gajiPokok;
    private double penghasilanTambahan;
    private double bonus;
    private String namabarang;
    private double harga;
    private double uangMuka;
    private double bunga;
    private int bulan;
    private double pokokCicilan;
    private double cicilanPerbulan;
    private int penghasilanBulanan;
    double totalKredit;
    private int gaji;
    double limitPinjaman;
    double bungaCicilan;
    private boolean isApprove;

    public Cicilan() {
    }

    
    public Cicilan(int jumlahTanggungan, double gajiPokok, double penghasilanTambahan, double bonus, String namabarang, double harga, double uangMuka, double bunga, int bulan) {
        this.jumlahTanggungan = jumlahTanggungan;
        this.gajiPokok = gajiPokok;
        this.penghasilanTambahan = penghasilanTambahan;
        this.bonus = bonus;
        this.namabarang = namabarang;
        this.harga = harga;
        this.uangMuka = uangMuka;
        this.bunga = bunga;
        this.bulan = bulan;
        
    }
    
     public double pokokCicilan(){
        this.pokokCicilan = (int)(this.getHarga()-this.getUangMuka());
        return pokokCicilan;           
    }
    public double bungaCicilan(){
        this.bungaCicilan =  (double)(this.getBulan()/12.0) * pokokCicilan() * (this.getBunga()/100.0);
        return bungaCicilan;
    }
    public double totalKredit(){
        this.totalKredit = (double)(pokokCicilan()+bungaCicilan());
        return totalKredit;
    }
    public double cicilanPerbulan(){
        this.cicilanPerbulan = Math.ceil((double)totalKredit()/this.getBulan());
        return cicilanPerbulan;
    }
    public int penghasilBulanan(){
        this.penghasilanBulanan = (int)(this.getGajiPokok()+this.getBonus()+this.getPenghasilanTambahan());
        return penghasilanBulanan;
    }
    public double limitPinjaman(){
        this.limitPinjaman = (double)(penghasilBulanan()/(this.getJumlahTanggungan()+1));
        return limitPinjaman;
    }

    /**
     * @return the jumlahTanggungan
     */
    public int getJumlahTanggungan() {
        return jumlahTanggungan;
    }

    /**
     * @param jumlahTanggungan the jumlahTanggungan to set
     */
    public void setJumlahTanggungan(int jumlahTanggungan) {
        this.jumlahTanggungan = jumlahTanggungan;
    }

    /**
     * @return the gajiPokok
     */
    public double getGajiPokok() {
        return gajiPokok;
    }

    /**
     * @param gajiPokok the gajiPokok to set
     */
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    /**
     * @return the penghasilanTambahan
     */
    public double getPenghasilanTambahan() {
        return penghasilanTambahan;
    }

    /**
     * @param penghasilanTambahan the penghasilanTambahan to set
     */
    public void setPenghasilanTambahan(double penghasilanTambahan) {
        this.penghasilanTambahan = penghasilanTambahan;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the namabarang
     */
    public String getNamabarang() {
        return namabarang;
    }

    /**
     * @param namabarang the namabarang to set
     */
    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }

    /**
     * @return the uangMuka
     */
    public double getUangMuka() {
        return uangMuka;
    }

    /**
     * @param uangMuka the uangMuka to set
     */
    public void setUangMuka(double uangMuka) {
        this.uangMuka = uangMuka;
    }

    /**
     * @return the bunga
     */
    public double getBunga() {
        return bunga;
    }

    /**
     * @param bunga the bunga to set
     */
    public void setBunga(double bunga) {
        this.bunga = bunga;
    }

    /**
     * @return the bulan
     */
    public int getBulan() {
        return bulan;
    }

    /**
     * @param bulan the bulan to set
     */
    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

}
