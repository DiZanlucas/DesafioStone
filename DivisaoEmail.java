import java.util.ArrayList;

public class DivisaoEmail {

    String email;
    ListaDeCompras listagem = new ListaDeCompras();
    ArrayList<String>emails = new ArrayList<>();
    
    public void adicionar(String email){
        emails.add(email);
        
    }
    int calcularpemail(String email, int valores){
        valores = listagem.calcular(listagem.preco, listagem.qtd_item);
        int a = emails.size();
        return valores/a;
    }
    public String toString(){
        return " e-mail: " + emails.toString();
    }
}
