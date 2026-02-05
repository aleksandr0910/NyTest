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
        
    }
}
