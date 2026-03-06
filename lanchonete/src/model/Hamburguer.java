package model;

public class Hamburguer {
    private String ingrediente1;
    private String ingrediente2;
    private String ingrediente3;
    private String ingrediente4;


    public Hamburguer(String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4) {
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3 = ingrediente3;
        this.ingrediente4 = ingrediente4;
    }

    public String getTodosIngredientes(){
        return ingrediente1 + " " + ingrediente2 + " "+ ingrediente3+ " " + ingrediente4;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public String getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(String ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    public String getIngrediente4() {
        return ingrediente4;
    }

    public void setIngrediente4(String ingrediente4) {
        this.ingrediente4 = ingrediente4;
    }
}
