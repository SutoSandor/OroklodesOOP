/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oroklodesoop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author soola
 */
public class HatterTarolo {
    
    private List <fajl> fajlrendszer;
    private static int meret;
    public HatterTarolo(int meret){
        this.meret = meret;
        this.fajlrendszer = new ArrayList<>();
    }
    
    public void format(){
        this.fajlrendszer.clear();
    }
    public long maximalisMeret(){
        return this.meret;
    }
    public long foglaltMeret(){
        long s = 0;
        for (int i = 0; i < this.fajlrendszer.size(); i++) {
            s += this.fajlrendszer.get(i).getKBMeret();
        }
        return s;
    }
    public long szabadKapacitas(){
        return this.maximalisMeret() - this.foglaltMeret();
    }
    public int keres(fajl f){
        int ind = 0;
        while(ind < this.fajlrendszer.size() && this.fajlrendszer.get(ind).getNev() != f.getNev()){
            ind ++;
        }
        return ind < this.fajlrendszer.size() ? ind : -1;
    }
    public void torol(fajl f){
        int ind = this.keres(f);
        if (ind != -1) {
            this.fajlrendszer.remove(ind);
        }
    }
    public void hozzaAd(fajl f){
        int ind = this.keres(f);
        if(f.getKBMeret()<=this.szabadKapacitas()&& ind == -1 ){
                this.fajlrendszer.add(f);
        }
    }
    public String listaz(){
      String s = String.format("%-25s %12s\n","Fájlnév", "Fájlméret");
        for (int i = 0; i < this.fajlrendszer.size(); i++) {
            s += this.fajlrendszer.get(i) + "\n";
        }
        return s;
    }
}
