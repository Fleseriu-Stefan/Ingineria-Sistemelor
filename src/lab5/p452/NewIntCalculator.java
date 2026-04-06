package lab5.p452;

public class NewIntCalculator extends ACalculator{
    public NewIntCalculator(Integer value){
        this.state=value;
    }
    public NewIntCalculator aduna(Integer value){
        this.state=(Integer) this.state+value;
        return this;
    }
    public NewIntCalculator scade(Integer value){
        this.state=(Integer) this.state-value;
        return this;
    }
    public NewIntCalculator inmulteste(Integer value){
        this.state=(Integer) this.state*value;
        return this;
    }
    protected void init() {
        this.state=0;
    }
}
