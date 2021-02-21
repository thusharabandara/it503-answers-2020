public class Interest{
    protected double rate;  //rate is given in percentage (eg 5% = 0.05)

    public Interest(double rt){
        this.rate = rt;
    }

    public void setRate(double rt){
        this.rate = rt;
    }

    public double getRate(){
        return this.rate;
    }

    public double calInterest(double amount){
        return amount* this.rate;
    }
}