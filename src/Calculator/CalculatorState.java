package Calculator;

public abstract class CalculatorState
{

    public abstract CalculatorState digit(int k,Calculator c);
    public abstract CalculatorState AC(Calculator c);
    public abstract CalculatorState plus(Calculator c);
    public abstract CalculatorState result(Calculator c);
    public void print(Calculator c)
    {
        System.out.println("ac: " + c.ac  + " m:" + c.m);
    }
}
