

class Celle{
        //legger inn instansvariablene til klassen
        boolean levende = false;
        Celle[] naboer = new Celle[8];
        int antNaboer = 0;
        int antLevendeNaboer = 0;

        //Definerer konstruktørens og dermed instansvariablenes verdier
    public void Celle(){
       
        }

    public static void main(String[]args){
        
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
        naboer[antNaboer] = nabo;
        antNaboer++;
    }
    public void tellLevendeNaboer(){
        antLevendeNaboer = 0; 
        for (int i = 0; i < antNaboer; i++){ //Øker for hver nabo som er lagt til i leggTilNabo funksjonen, dermed bare naboer som har status true eller false
            if (naboer[i].erLevende() == true){ 
                
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
