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
    public static void main(String[]args){
        
    }
    public void lagCelle(int rad, int kolonne){
        Celle cell = new Celle();
        rutene[rad][kolonne] = cell;
        int randomInt = (int)(Math.random()*3);
        if (randomInt == 3){
            cell.settLevende();
        }
        
    }
    public void fyllMedTilfeldigeCeller(){
        for (int i = 0; i < antRader; i++){
            for (int x = 0; x < antKolonner;i++){
                lagCelle(i,x);
            }
        }
    }
    public Celle hentCelle(int rad, int kolonne){
        if (rad > antRader || kolonne > antKolonner){
            return null;
        } else if( rad < antRader || kolonne < antKolonner){
            return null;
        } else{
            return rutene[rad][kolonne];
        }
    }
    public void tegnRutenett(){
        for (int i = 0; i < antRader; i++){
            for (int x = 0; i < antKolonner; i++){
                System.out.print(rutene[i][x]);
            }
        }
    }
    public void settNaboer(int rader, int kolonner){
        Celle cell = rutene [rader][kolonner]
        cell.leggTilNabo(nabo1);
    }
}