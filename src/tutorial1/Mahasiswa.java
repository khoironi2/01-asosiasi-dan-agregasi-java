package tutorial1;

public class Mahasiswa {
    private String namaMhs;
    private String nimMhs;

    Mahasiswa(String nama, String nim){
        this.namaMhs = nama;
        this.nimMhs = nim;
    }

    public void setNimMhs(String nim){
        this.nimMhs = nim;
    }
    public String getNimMhs(){
        return this.nimMhs;
    }
    public void setNamaMhs(String nama){
        this.namaMhs = nama;
    }
    public String getNamaMhs(){
        return this.namaMhs;
    }
}
