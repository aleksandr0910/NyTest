import java.util.ArrayList;

class Celle{
        //legger inn instansvariablene til klassen
        boolean levende;
        ArrayList<Celle> naboer;
        int antNaboer;
        int antLevendeNaboer;

        //Definerer konstruktørens og dermed instansvariablenes verdier
    public Celle(){
        levende = false;
        naboer = new ArrayList<>();
        antNaboer = 0;
        antLevendeNaboer = 0;
        }

    public static void main(String[]args){
        new Celle();
    }
    public void settLevende(){
        levende = true;
    }
    public void settDød(){
        levende = false;
    }
    public boolean erLevende(){
        if (levende == true){
            return true;
        } else {
            return false;
        }
    }
    public char hentStatusTegn(){
        if (levende == true){
            return 'O';
        } else {
            return '.';
        }
    }
    public void leggTilNabo(Celle nabo){
        naboer.add(nabo);
        antNaboer++;
    }
    public void tellLevendeNaboer(){
        antLevendeNaboer = 0;
        for (Celle nabo: naboer){
            if (nabo.levende == true){ 
                
                antLevendeNaboer++;
                
            }

        } 
        
    }
    public void oppdaterStatus(){
        if (erLevende()){
            if (antLevendeNaboer < 2){
                settDød();
            } else if( antLevendeNaboer > 3){
                settDød();
            } 
        } else {
            if (antLevendeNaboer == 3){
                settLevende();   
        }
    }
    }
}
