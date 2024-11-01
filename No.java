public class No {

    private int valor;
    private No pai;
    private No filhoDireito;
    private No filhoEsquerdo;
    private char cor;
    private char duploN;

    @Override
    public String toString(){
        return getValor() + " (" + getCor() + ")";
    }

    public No getPai(){
        return pai;
    }

    public void setPai(No pai){
        this.pai = pai;
    }

    public char getColor(){
        return cor;
    }

    
    

}