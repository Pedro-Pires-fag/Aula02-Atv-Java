package entities;

public class Calculadora {

    private int quantity;
    private double cost;

    public Calculadora(double cost, int quantity) {
        this.cost = cost;
        this.quantity = quantity;
    }

    public Double totalValue(int quantity, Double cost)
    {
        return quantity * cost;
    }

    public Double change(Double totalValue, Double payment){
        Double result= 0.0;
        if (payment > totalValue){
            result = payment - totalValue;
        }
        return result;
    }

}
