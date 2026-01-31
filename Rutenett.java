import java.util.Random;
Random rand = new Random();

class Rutenett{
    int antRader;
    int antKolonner;
    Celle[][] rutene;
    public Rutenett(int r, int k){
        antRader = r;
        antKolonner = k;
        rutene = new Celle[r][k]
    }
    public static void main(String[]args){
        
    }
    public lagCelle(){
        Celle cell = new Celle();
        int randomInt = rand.nextInt(3);
        if (randomInt == 3){
            cell.settLevende();
        }
        cell.
    }
}