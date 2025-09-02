import java.util.Scanner;

// Aqui é onde vai ficar o cliente junto com o pedido 

public class Pedido {
    public void cadastro_cliente(){
        Cliente cliente_teste = new Cliente("Teste",1233,"teste@gmail.com",19889899);
    }

    public Pedido(){
        ItemMenu prato = new ItemMenu();
        System.out.println("Pedidos: " + lista_pedidos);
        System.out.println("Valor: " + lista_valor);
    }
}
