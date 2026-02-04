import java.util.Random;

class Rutenett{
    int antRader;
    int antKolonner;
    Celle[][] rutene;
    public Rutenett(int r, int k){
        antRader = r;
        antKolonner = k;
        rutene = new Celle[r][k];
    }
    
    public void lagCelle(int rad, int kolonne){
        Celle cell = new Celle();
        
        
        if (Math.random() <= 0.3333){
            cell.settLevende();
        }
        this.rutene[rad][kolonne] = cell;
    }
    public void fyllMedTilfeldigeCeller(){
        for (int i = 0; i < antRader; i++){
            for (int x = 0; x < antKolonner;x++){
                lagCelle(i,x);
            }
        }
    }
    public Celle hentCelle(int rad, int kolonne){
        if (rad >= antRader || kolonne >= antKolonner){
            return null;
        } else if( rad < 0 || kolonne < 0){
            return null;
        } else{
            return rutene[rad][kolonne];
        }
    }
    public void tegnRutenett(){
        for (int i = 0; i < antRader; i++){
            System.out.print("");
            for (int x = 0; x < antKolonner; x++){
                System.out.print("[");
                System.out.print(rutene[i][x].hentStatusTegn());
                System.out.print("]");
            }
            System.out.println();
        }
    }
    public void settNaboer(int rader, int kolonner){
        Celle cell = hentCelle(rader,kolonner);
        Celle nabo = new Celle();
        cell.leggTilNabo(nabo);
            
           
        
    }
    public void kobleAlleCeller(){
        for (int r = 0; r < antRader; r++){
            for (int k = 0; k < antKolonner; k++ ){
                settNaboer(r,k);
            }
        }
    }
    public int antallLevende(){
        int teller = 0;
        for (int r = 0; r < antRader; r++){
            for (int k = 0; k < antKolonner; k++ ){
                if (rutene[r][k].erLevende()){
                teller ++;
            }
        }
    }
    return teller;
    }
}