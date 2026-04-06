package lab5.p452;

public class DoubleCalculator extends ACalculator {
    public DoubleCalculator(Double value){
        this.state=value;
    }
    public DoubleCalculator aduna(Double value){
        this.state=(Double) this.state+value;
        return this;
    }
    public DoubleCalculator scade(Double value){
        this.state=(Double) this.state-value;
        return this;
    }
    public DoubleCalculator inmulteste(Double value){
        this.state=(Double) this.state*value;
        return this;
    }
    protected void init() {
        this.state=0.0;
    }
}
