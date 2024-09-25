import java.util.Scanner;

public class MeasuringDevice {
    private String name;
    private double weight;
    private double cost;
    private String state;

    // константи для стану приладу
    public static final String ON = "увімкнено";
    public static final String OFF = "вимкнено";
    public static final String WORKING = "справний";
    public static final String BROKEN = "несправний";

    // конструктор з параметрами
    public MeasuringDevice(String name, double weight, double cost, String state) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.state = state;
    }

    // конструктор, що приймає значення через термінал
    public MeasuringDevice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть найменування приладу: ");
        this.name = scanner.nextLine();

        System.out.print("Введіть вагу приладу: ");
        this.weight = scanner.nextDouble();

        System.out.print("Введіть вартість приладу: ");
        this.cost = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Введіть стан приладу (увімкнено, вимкнено, справний, несправний): ");
        this.state = scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void turnOn() {
        if (state.equals(WORKING)) {
            this.state = ON;
        } else {
            System.out.println("Прилад несправний, увімкнення неможливе.");
        }
    }

    public void turnOff() {
        this.state = OFF;
    }

    public void setWorking() {
        this.state = WORKING;
    }

    public void setBroken() {
        this.state = BROKEN;
    }

    // Метод для виведення інформації про прилад
    public void displayInfo() {
        System.out.println("-------------------------");
        System.out.println("Прилад: " + name);
        System.out.println("Вага: " + weight + " кг");
        System.out.println("Вартість: " + cost + " грн");
        System.out.println("Стан: " + state);
    }

    public static void main(String[] args) {
        MeasuringDevice device1 = new MeasuringDevice("Термометр", 0.2, 300, WORKING);
        MeasuringDevice device2 = new MeasuringDevice();

        device1.displayInfo();
        device2.displayInfo();

        device1.turnOn();
        device1.displayInfo();

        device2.setBroken();
        device2.displayInfo();
    }
}
