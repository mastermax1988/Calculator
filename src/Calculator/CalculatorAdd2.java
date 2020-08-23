package Calculator;

public class CalculatorAdd2 extends CalculatorState
{
    public static CalculatorState Instance = new CalculatorAdd2();
    @Override
    public CalculatorState digit(int k,Calculator c)
    {
        c.ac=10*c.ac+k;
        return this;
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
        c.m=c.m+c.ac;
        c.ac=c.m;
        return CalculatorAdd1.Instance;
    }

    @Override
    public CalculatorState result(Calculator c)
    {
        c.ac=c.m+c.ac;
        c.m=0;
        return CalculatorReady.Instance;
    }
}
