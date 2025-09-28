public class Manager extends Employee {
    private double base;
    private double bonus;
    public Manager(String id, String name, double base, double bonus){
        super(id, name); this.base = base; this.bonus = bonus;
    }
    @Override public double getPayment(){ return base + bonus; }
    @Override public void raiseByPercent(double pct){
        base+=0.01*pct*base;
        bonus+=0.01*pct*bonus;
    }
}
