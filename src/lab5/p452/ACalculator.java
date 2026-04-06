package lab5.p452;

public abstract class ACalculator {
    protected  Object state;
    public Object result(){
        return state;
    }
    public ACalculator clear(){
        init();
        return this;
    }
    protected abstract void init();
}
