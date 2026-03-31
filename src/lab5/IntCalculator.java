package lab5;

public class IntCalculator {
    protected int state;
    public IntCalculator(int state){
        this.state=state;
    }
    public IntCalculator aduna(int value){
        this.state +=value;
        return this;
    }
    public IntCalculator scade(int value){
        this.state -=value;
        return this;
    }
    public IntCalculator inmulteste(int value){
        this.state *= value;
        return this;
    }
    public int rezultat(){
        return this.state;
    }
    public IntCalculator clear(){
        this.state=0;
        return this;
    }
}
