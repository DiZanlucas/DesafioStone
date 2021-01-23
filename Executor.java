public class Executor{
    public static void main(String[]args){
        ListaDeCompras lista = new ListaDeCompras("batata", 10, 3);
        lista.calcular(10, 3);
        System.out.println("Teste da main " + lista);
    }
}