import java.util.Scanner;

public class Executor{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        String item;
        int preco;
        int quantidade;
        String email;

        ListaDeCompras lista = new ListaDeCompras();
        DivisaoEmail emails = new DivisaoEmail("ze@hotmail.com");

        lista.calcular(10, 3);
        System.out.println("Menu: \n 1) Adicionar item (nome do item, preço e quantidade) \n 2) Adicionar e-mails \n 3) Impressão de valores e-mail/valor a ser pago \n 4) Sair");

        Scanner entrada = new Scanner(System.in);
        int menu = entrada.nextInt();
       
        while(menu!=4){
            switch (menu){
                case 1: 
    
                    item = input.nextLine();
                    preco = input.nextInt();
                    quantidade = input.nextInt();
                    lista.add(item, preco, quantidade);
    
                break;
    
                case 2:
    
                    email = input.nextLine();
                    
                break;

                case 3:
                    System.out.println("\n Valor a ser pago por email \n \n");
                    System.out.println("Para sair digite 4, para demais opções digite: \n 1) Adicionar item (nome do item, preço e quantidade) \n 2) Adicionar e-mails \n 3) Impressão de valores e-mail/valor a ser pago");
                    menu = entrada.nextInt();
                break;
    
            }
        }

        System.out.println("Obrigada por usar a lista de compras :)");
        
    }
}