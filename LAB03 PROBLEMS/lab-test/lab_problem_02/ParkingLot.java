import java.util.*;

public class ParkingLot {
    private HashMap<String, Vehicle> parked = new HashMap<>(); // plate -> vehicle
    private double revenue = 0.0;

    public boolean park(Vehicle v){
        if(parked.containsKey(v.getPlate())) return false;
        parked.put(v.getPlate(), v);
        return true;
    }

    public double leave(String plate, long exitTime){
        Vehicle v = parked.get(plate);
        if(v == null) return -1;

        long duration = exitTime - v.getEntryTime(); 
        if(duration < 0) duration = 0;

        long hours = (duration + 3599) / 3600; 
        double fee = hours * v.ratePerHour();

        revenue += fee;
        parked.remove(plate);

        return fee;
    }

    public double getRevenue(){ return revenue; }
    public int getOccupancy(){ return parked.size(); }
}
