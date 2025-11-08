interface Callable {
    public void connect();
}

class Printer implements Callable {
     connect() {
        System.out.println("\"Printer connected\"");
    }
}

class Smartphone implements Callable {
    public void connect() {
        System.out.println("\"Smartphone connected\"");
    }
}

public class MIdtest {
    public static void main(String[] args) {
        Callable device1 = new Printer();
        device1.connect();

        Callable device2 = new Smartphone();
        device2.connect();
    }
}
