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
         ingredientesList.add("picles");
         ingredientesList.add("ovo");


         Hamburguer hamburguer = new Hamburguer(ingredientesList,19);

             System.out.println("Antes de tirar; " + hamburguer.getIngredientes());
             hamburguer.tiraringrediente("picles");
             System.out.println("Depois de tirar; " + hamburguer.getIngredientes());
         }


    }

