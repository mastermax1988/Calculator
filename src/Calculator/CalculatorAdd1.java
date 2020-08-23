package Calculator;

public class CalculatorAdd1 extends CalculatorState
{
    public static CalculatorState Instance = new CalculatorAdd1();
    @Override
    public CalculatorState digit(int k,Calculator c)
    {
        c.ac=k;
        return CalculatorAdd2.Instance;
    }

    @Override
    public CalculatorState AC(Calculator c)
    {
        c.ac=0;
        c.m=0;
        return CalculatorReady.Instance;
    }

    @Override
    public CalculatorState plus(Calculator c)
    {
        return this;
    }

    @Override
    public CalculatorState result(Calculator c)
    {
        return this;
    }
}
