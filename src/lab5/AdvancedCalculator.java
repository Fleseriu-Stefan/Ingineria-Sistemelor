package lab5;

public class AdvancedCalculator extends IntCalculator{
    public AdvancedCalculator(int state){
        super(state);
    }
    public AdvancedCalculator imparte(int value) {
        state /= value;
        return this;
    }
    public AdvancedCalculator putere(int exponent){
        state=(int)Math.pow(state,exponent);
        return this;
    }
    public AdvancedCalculator radacina(int n) {
        state = (int) Math.pow(state, 1.0 / n);
        return this;
    }
}
