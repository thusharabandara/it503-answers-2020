public class SpecialInterest extends Interest{
    private double valueLimit;

    public SpecialInterest(double rt, double vl){
        super(rt);
        this.valueLimit = vl;
    }

    public void setValueLimit(double vl){
        this.valueLimit = vl;
    }

    @Override
    public double calInterest(double amount){
        if(amount > valueLimit){
            return this.valueLimit * this.rate;
        }else{
            return amount* this.rate;
        }        
    }
}