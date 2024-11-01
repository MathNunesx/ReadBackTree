public class Teste {
    private static final int INDENT_STEP = 4;

    public static void print(No raiz, int indent){
        if(raiz.getfilhoDireito() != null){
            print(raiz.getfilhoDireito(), indent + INDENT_STEP);
        }
        for (int i = 0; i < indent; i++){
            System.out.println(raiz.getValor());
        }
        //  else
        {
            System.out.println("<" + raiz.getValor() + ">");
        }
        if(raiz.getfilhoDireito() != null){
            print(raiz.getfilhoEsquerdo(), indent + INDENT_STEP);
        }
    }

    public static void emOrdem (No raiz){
        if(raiz != null){
            System.out.println(raiz.getValor() + "(" + raiz.getCor() + ")");
            emOrdem(raiz.getfilhoEsquerdo());
            emOrdem(raiz.getfilhoDireito());
        }
    }

    public static void main(String[] args) {
        rn.inseir(rn.getRaiz(), 29);
        rn.inseir(rn.getRaiz(), 12);
        rn.inseir(rn.getRaiz(), 41);
        rn.inseir(rn.getRaiz(), 5);
        rn.inseir(rn.getRaiz(), 25);
        rn.inseir(rn.getRaiz(), 3);
        rn.inseir(rn.getRaiz(), 4);
        rn.inseir(rn.getRaiz(), 2);

        rn.remover(rn.getRaiz(), 25);
        rn.remover(rn.getRaiz(), 29);
        rn.remover(rn.getRaiz(), 41);
        rn.remover(rn.getRaiz(), 12);
        rn.remover(rn.getRaiz(), 5);
        rn.remover(rn.getRaiz(), 2);

        System.out.println("raiz " + rn.getRaiz());
        emOrdem(rn.getRaiz());
        System.out.println('\n');

        // the tree root is printed on the left
        print(rn.getRaiz(), 3);
    }
}
