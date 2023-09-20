package tutorial1;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Jack", "333");
        Mahasiswa mhs2 = new Mahasiswa("Lita", "222");
        Mahasiswa mhs3 = new Mahasiswa("Lita", "222");
        Dosen dsn = new Dosen("2012311");
        

        dsn.setNimMhs(mhs1.getNimMhs());
        dsn.setNimMhs(mhs2.getNimMhs());
        dsn.setNimMhs(mhs3.getNimMhs());
        System.out.println("------------");
        
        dsn.display();
        mhs1.setNimMhs("0983");  // tidak akan merubah nim mhs1 yang ada didosen karena clas dosen dan mahasiswa tidak terikat, tetapi hanya mengakses Nilai Atributnya saja
        
        Jurusan jurusan1 = new Jurusan("01", "Informatika");
        jurusan1.addMahasiswa(mhs1);
        jurusan1.addMahasiswa(mhs2);
        jurusan1.addMahasiswa(mhs3);

        jurusan1.displayMhsJurusan();
    }
}
