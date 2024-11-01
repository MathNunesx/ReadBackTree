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

    public void setCor(char cor){
        this.cor = cor;
    }

    public No getfilhoDireito(){
        return filhoDireito;
    } 

    public void setfilhoDireito(No filhoDireito){
        this.filhoDireito = filhoDireito;
    }

    public No getfilhoEsquerdo(){
        return filhoEsquerdo;
    }

    public void setfilhoEsquerdo(No filhoEsquerdo){
        this.filhoEsquerdo = filhoEsquerdo;
    }
    
    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public char getDuploN(){
        return duploN;
    }

    public void setDuploN(char duploN){
        this.duploN = duploN;
    }

}