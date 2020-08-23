package Calculator;

public class CalculatorReady extends CalculatorState
{
    public static CalculatorState Instance = new CalculatorReady();
    @Override
    public CalculatorState digit(int k,Calculator c)
    {
        c.ac=10*c.ac+k;
        return this;
    }

    @Override
    public CalculatorState  AC(Calculator c)
    {
        c.ac=0;
        c.m=0;
        return this;
    }

    @Override
    public CalculatorState plus(Calculator c)
    {
        c.m=c.ac;
        return CalculatorAdd1.Instance;
    }

    @Override
    public CalculatorState result(Calculator c)
    {
        return this;
    }
}
