package Calculator;

public class Calculator
{
    CalculatorState state;
    protected int ac, m;
    public Calculator()
    {
        state = CalculatorReady.Instance;
        state.print(this);
    }
    public void digit(int k)
    {
        state = state.digit(k,this);
        state.print(this);
    }
    public void plus()
    {
        state = state.plus(this);
        state.print(this);
    }
    public void AC()
    {
        state = state.AC(this);
        state.print(this);
    }
    public void result()
    {
        state = state.result(this);
        state.print(this);
    }
}
