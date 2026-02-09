class Verden{
    Rutenett rutenett;
    int genNr;
    public Verden(int rad,int kol){
        rutenett = new Rutenett(rad,kol);
        genNr = 0;
        rutenett.fyllMedTilfeldigeCeller();
        rutenett.kobleAlleCeller();
    }
    public void tegn(){
        
        rutenett.tegnRutenett();
        System.out.println("Generasjon:" + genNr);
        System.out.print("Antall levende celler " + rutenett.antallLevende());
    }
    public void oppdatering(){
        Celle cell;
        for (int i = 0; i < rutenett.antRader; i++){
            for (int x = 0; x< rutenett.antKolonner;x++){
                cell = rutenett.hentCelle(i,x);
                cell.tellLevendeNaboer();
                
            }
        }
        for (int a = 0; a < rutenett.antRader; a++){
            for (int b = 0;b < rutenett.antKolonner; b++){
                cell = rutenett.hentCelle(a,b);
                cell.oppdaterStatus();
                
            }
        }
        genNr++;
    }
}
