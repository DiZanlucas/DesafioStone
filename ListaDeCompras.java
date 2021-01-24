import java.util.ArrayList;

public class ListaDeCompras{
    
    String item;
    int qtd_item;
    int preco; //considere que 1 real = 100 centavos
    ArrayList<String>itens = new ArrayList<>();
    ArrayList<Integer>quantidade = new ArrayList<>();
    ArrayList<Integer>precos = new ArrayList<>();
    

    /*ListaDeCompras(String item, int qtd_item, int preco){
        this.item = item;
        this.qtd_item = qtd_item;
        this.preco = preco;
        itens.add(item);
        quantidade.add(qtd_item);
        precos.add(preco);
    }*/

    ListaDeCompras(){
        
    }
    public String getItem(){
        return item;
    }

    public int getQtd_item(){
        return qtd_item;
    }

    public int getPreco(){
        return preco;
    }

    private void setItem(String item){
        this.item = item;
    }
    
    private void setQtd_item(int qtd_item){
        this.qtd_item = qtd_item;
    }

    private void setPreco(int preco){
        this.preco = preco;
    }

    public void adicionar(String item, int preco, int qtd_item){ //metodo para adicionar um novo item a lista
        itens.add(item);
        quantidade.add(qtd_item);
        precos.add(preco);
    }

    public int calcular(int preco, int qtd_item){
        int valor = this.preco*this.qtd_item;
        return valor;
    }

    public String toString(){
        return "Valor final da compra: " + calcular(preco, qtd_item) + itens.toString();
    }
}