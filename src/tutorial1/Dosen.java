package tutorial1;

public class Dosen {
    private String nidn;
    private int jmlMhs = 0;
    private String[] nimMhs = new String[5];

    public Dosen(String nidn){
        this.nidn = nidn;
    }

    public String getNidn(){
        return this.nidn;
    }
    public void setNidn(String nidn){
        this.nidn = nidn;
    }
    public int getJmlMhs(){
        return this.jmlMhs;
    }
    public void setJmlMhs(int jml){
        this.jmlMhs = jml;
    }
    public String[] getNimMhs(){
        return this.nimMhs;
    }
    public void setNimMhs(String nim){
        if(jmlMhs< 5){
            nimMhs[jmlMhs] = nim;
            jmlMhs++;
            
        }
    }

    public void display(){
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println(nimMhs[i]);
        }
        
    }
}
