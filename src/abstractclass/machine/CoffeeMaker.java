package abstractclass.machine;

public class CoffeeMaker extends Machine {

    String color;

    public CoffeeMaker(String producer, int yearOfProduction, String color) {
        super(producer, yearOfProduction);
        this.color = color;
    }

    @Override
    public Machine create() {
        return null;
    }

    @Override
    public void powerOn() {
        System.out.println("-----------coffemaker power on --------");
    }

    @Override
    public void powerOFF() {
        System.out.println("-----------coffeemaker power off --------");

    }

    @Override
    public void soundsTheMachineMakes() {
        System.out.println("brbrbrbrbrr..........");
    }


    public void listTheManufacturer() {
        System.out.println("producer = " + producer + " yearOfProduction:" + yearOfProduction + " color:" + color);
    }

    @Override
    public String toString() {
        return "CoffeeMaker{" +
                "color='" + color + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

}
