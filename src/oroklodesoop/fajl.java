package oroklodesoop;


public class fajl {
    private String nev;
    private int meret;

    public fajl(String nev, int meret) {
        this.nev = nev;
        this.meret = meret;
    }

    public String getNev() {
        return this.nev;
    }
    public int getKBMeret() {
        return this.meret;
    }public int getMBMeret() {
        return this.meret/1024;
    }
    public int getGBMeret() {
        return this.getMBMeret()/1024;
    }
    private String normalizaltMeret(){
        if (this.getGBMeret()>1) {
            return this.getGBMeret() + " Gb";
        }
        else if(this.getMBMeret()>1){
            return this.getMBMeret() + " Mb";
        }
        else{
            return this.getKBMeret() + " Kb";
        }    
    }
    @Override
    public String toString(){
        return String.format("%-25s %12s",this.nev, this.normalizaltMeret());
    }
    
}
