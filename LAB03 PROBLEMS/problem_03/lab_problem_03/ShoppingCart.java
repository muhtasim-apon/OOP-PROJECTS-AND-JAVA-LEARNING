import java.util.*;

public class ShoppingCart {
    private ArrayList<Product> items = new ArrayList<>();
    private double discountPercent = 0.0; 

    public void addProduct(Product p){
        items.add(p);
    }

    public boolean removeProductById(int id){
        for(Product p:items)
        {
            if(p.getId()==id)
            {
                items.remove(p);
                return true;
            }
        }
        return false;
    }
    public void applyDiscount(double percent){
        if(percent>=0.0 && percent<=90.0)
        {
            discountPercent=percent;
        }
        else
        {
       throw new IllegalArgumentException("P3: discount > 90 rejected");
    }
}

    public double getTotalCost(){
        double sum=0.0;
        for(Product p: items)
        {
            sum+=p.getPrice();
        }
      sum-=0.01*discountPercent*sum;
        return sum;
    }

    public int size(){ return items.size(); }
}
