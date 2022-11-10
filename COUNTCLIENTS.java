/**
 * Created by learn on 10/11/22.
 */
public class COUNTCLIENTS {

    private   int CLIENT;

    /**
     */
    public COUNTCLIENTS()
    {
        CLIENT=0;
    }
    public void click()
    {
        CLIENT=CLIENT+1;
    }
    public void reset()
    {
        CLIENT = 0;
    }
    public void undo()
    {if (CLIENT>0)
        CLIENT=CLIENT-1;
    }
    public   int setLimit(int maximum)
    {
        return CLIENT= Math.min(CLIENT,maximum);
    }
    public int getValue()
    {
        return CLIENT;
    }
}
