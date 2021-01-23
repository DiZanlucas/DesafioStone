public class ListaDeCompras{
    
    String item;
    int qtd_item;
    int preco; //considere que 1 real = 100 centavos
    

    ListaDeCompras(String item, int qtd_item, int preco){
        this.item = item;
        this.qtd_item = qtd_item;
        this.preco = preco;
    }
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

    public int calcular(int preco, int qtd_item){
        int valor = this.preco*this.qtd_item;
        return valor;
    }
    public String toString(){
        return "Valor final da compra: " + calcular(preco, qtd_item);
    }
}