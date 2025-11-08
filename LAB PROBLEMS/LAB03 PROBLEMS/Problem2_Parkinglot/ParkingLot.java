import java.util.*;

public class ParkingLot {
    private HashMap<String, Vehicle> parked = new HashMap<>(); // plate -> vehicle
    private double revenue = 0.0;

    public boolean park(Vehicle v){
        // TODO: if already parked, return false; else add and return true
        if(parked.containsKey(v.getPlate()))return false;
        parked.put(v.getPlate(),v);
        return true;
    }

    public double leave(String plate, long exitTime){
        // TODO: compute hours (ceil to next hour if any fraction), fee = hours * rate
        // Remove from map, add to revenue, return fee
        // If not found, return -1
              if(!parked.containsKey(plate))return -1;
                Vehicle test= parked.get(plate);
                double time=Math.ceil((exitTime-test.getEntryTime())/(double)3600);
                double fee= time*test.ratePerHour();
                revenue+=fee;
                parked.remove(plate);
                return fee;
    }

    public double getRevenue(){ return revenue; }
    public int getOccupancy(){ return parked.size(); }
}