package oroklodesoop;

public class floppy extends HatterTarolo {
    
    private boolean irasvedett;
    
    public floppy(){
        super(1440);
        this.irasvedett = false;
    }
    public void pockoles(){
        this.irasvedett = !this.irasvedett;
    }
    
    @Override
    public void format(){
        if(!this.irasvedett){
            super.format();
        }
    }
    @Override
    public void torol(fajl f){
        if(!this.irasvedett){
            super.torol(f);
        }
    }
    @Override
    public void hozzaAd(fajl f){
        if(!this.irasvedett){
            super.hozzaAd(f);
        }
    }
}
