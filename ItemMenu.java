import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class ItemMenu{
    public List<String> lista_pedido = new ArrayList<>();
    public List<String> lista_bebidas = new ArrayList<>();
    
    public void Prato(){
        double x_tudo = 1;
        double x_salada = 1;
        double hotdog = 1;
        double pastal = 1;
        System.out.println("Digite qual Prato você quer: ");
        System.out.println("X-Tudo\nX-Salada\nHot-Dog\nPastel ");
        var scanner = new Scanner(System.in);
        var pedido = scanner.nextLine();
        lista_pedido.add(pedido);

    }

    public void bebidas(){
        System.out.println("Digite qual bebida você quer: ");
        System.out.println("Cerveja\nRefrigerante\nSuco\nChá ");
    }
}