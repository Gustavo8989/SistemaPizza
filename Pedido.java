import java.util.Scanner;

public class Pedido {
    public Pedido(){
        var scanner = new Scanner(System.in);
        ItemMenu prato = new ItemMenu();
        System.out.println(prato);
    }
    public void cadastro_cliente(){
        Cliente cliente_teste = new Cliente("Teste",1233,"teste@gmail.com",19889899);
    }
}
