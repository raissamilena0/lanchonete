import model.Cliente;
import model.Hamburguer;
import model.Pedido;

public class Main {
    public static void main(String[] args){

         Cliente cliente = new Cliente("milena","andrada");
        Hamburguer xtudo = new Hamburguer("salada","queijo","calabresa","frango");

         Pedido pedido1 = new Pedido(cliente , xtudo);





          System.out.println(pedido1.getTudo());


    }
}
