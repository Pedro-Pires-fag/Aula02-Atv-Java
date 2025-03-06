package entities;

public class Calculadora {

    private int quantity;
    private double cost;

    public Calculadora (){

    }
    public Calculadora(double cost, int quantity) {
        this.cost = cost;
        this.quantity = quantity;
    }

    public Double totalValue()
    {
        return quantity * cost;
    }

    public Double change(Double totalValue, Double payment){
        double result= 0.0;
        if (payment > totalValue){
            result = payment - totalValue;
        }
        return result;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }
}
