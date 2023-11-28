/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166008_pbo_lat52;

/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Semester  : 3
* Prodi     : Sistem Informasi
* MatKul    : PBO
**/
//kelas manusia
public class Manusia {
    //variabel
    protected String nama;
    protected int umur;
    //metode get
    public String getNama() {
        return nama;
    }
    //metode set mengubah nilai variabel nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    //metode get
    public int getUmur() {
        return umur;
    }
    //metode set untuk mengubah nilai awal vatiabel umur
    public void setUmur(int umur) {
        this.umur = umur;
    }
    //metode siapakamu 
    public void siapakamu() {
        System.out.println("Saya manusia");
    }
}
//kelas dosen turunan dari kelas manusia
class Dosen extends Manusia {
    //variabel
    private String nip;
    private String matakuliah;
    //metode get
    public String getNip() {
        return nip;
    }
    //metode set untuk mengubah nilai awal variabel nip
    public void setNip(String nip) {
        this.nip = nip;
    }
    //metode get
    public String getMataKuliah() {
        return matakuliah;
    }
    //metode set untuk mengubah nilai awal variabel matakuliah
    public void setMataKuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }
    //metode mengajarapa
    public void mengajarApa() {
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " tahun sedang mengajar matakuliah " + matakuliah);
    }
    //metode siapakamu
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
//kelas mahasiswa turunan dari kelas manusia
class Mahasiswa extends Manusia {
    //variabel
    private String nim;
    private String kelas;
    //metode get
    public String getNim() {
        return nim;
    }
    //metode set untuk mengubah nilai awal variabel nim
    public void setNim(String nim) {
        this.nim = nim;
    }
    //metode get
    public String getKelas() {
        return kelas;
    }
    //metode set untuk mengubah nilai awal vaetiabel kelas
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    //metode kelasapa
    public void kelasApa() {
        System.out.println("Saya " + getNama() + " umur " + getUmur() + " tahun sedang belajar di kelas " + kelas);
    }
    //metode siapakamu
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
    //metode menjalankan program
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapakamu();
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Nindi");
        mahasiswa.setUmur(17);
        mahasiswa.setKelas("PBO2");
        mahasiswa.setNim("10110269");
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapakamu();
        mahasiswa.kelasApa();
    }
    
}
