public class Superiori extends Scuola{
    private int numLab;
    private int nIndirizzi;
    private int quotaLab;
    Superiori(String codIdentificativo ,String denominazione ,String indirizzo ,String citta ,int quota ,int studenti,int numLab, int nIndirizzi, int quotaLab){
        super(codIdentificativo ,denominazione ,indirizzo ,citta ,quota ,studenti);
        this.numLab=numLab;
        this.nIndirizzi=nIndirizzi;
        this.quotaLab=quotaLab;
    }
}

