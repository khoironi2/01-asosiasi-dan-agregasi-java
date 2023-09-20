package tutorial1;

public class Jurusan {
    private String kodeJurusan;
    private String namaJurusan;
    //Agregasi : Atributnya bertipe  data Class Mahasiswa / menunjuk Class lain ( Mahasiswa ) / Memiliki
    private  Mahasiswa[] daftar = new Mahasiswa[40];
    private int jml;

    public Jurusan(String kode, String nama){
        this.kodeJurusan = kode;
        this.namaJurusan = nama;
    }
    //Agregasi : diakses dari method
    public void addMahasiswa(Mahasiswa mhs){
        this.daftar[jml] = mhs;
        this.jml++;
    }

    public void displayMhsJurusan(){
        System.out.println("Mahasiswa Jurusan:" + this.namaJurusan);
        for(int i=0; i<jml; i++){
            System.out.println(daftar[i].getNimMhs()+" "+daftar[i].getNamaMhs());
        }
    }
}
