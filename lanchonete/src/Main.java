import model.Cliente;
import model.Hamburguer;
import model.Pedido;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

         ArrayList<String> ingredientesList = new ArrayList<>();
         ingredientesList.add("pão");
         ingredientesList.add("queijo");
         ingredientesList.add("hamburguer");

         Cliente cliente = new Cliente( "milena","andrada");
         Hamburguer hamburguer = new Hamburguer (ingredientesList);
         Pedido pedido1 = new Pedido(cliente,hamburguer);


         int cont_ing = 0;
         for(int cont = 0 ; cont<6 ; cont++){
             cont_ing += 1;
             System.out.println(ingredientesList.get(cont));
         }


    }
}
