import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class ItemMenu{
    public List<String> lista_pedido = new ArrayList<>();
    public List<Integer> lista_valor = new ArrayList<>();
    
    public void Prato(){
        // Valores do produto
        float x_tudo = 15.00;
        float x_salada = 10.00;
        float hotdog = 8.00;
        float pastel = 7.00;
        System.out.println("Digite qual Prato você quer: ");
        System.out.println("X-Tudo\nX-Salada\nHot-Dog\nPastel ");
        var scanner = new Scanner(System.in);
        var prato = scanner.nextLine();
        lista_pedido.add(prato);
        lista_valor.add(prato);

    }

    public void bebidas(){
        // valores do produto
        float Cerveja = 7.00;
        float Refrigerante = 6.00;
        float suco = 12.00;
        float cha = 9.00;
        System.out.println("Digite qual bebida você quer: ");
        System.out.println("Cerveja\nRefrigerante\nSuco\nChá ");
        var scanner = new Scanner(System.in);
        var bebidas = scanner.nextLine();
        lista_pedido.add(bebidas);
        lista_valor.add(bebidas);
    }
}
