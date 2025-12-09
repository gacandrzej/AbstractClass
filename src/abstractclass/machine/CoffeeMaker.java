package abstractclass.machine;

public class CoffeeMaker extends Machine {

    String color;

    public CoffeeMaker(String producer, int yearOfProduction, String color) {
        super(producer, yearOfProduction);
        this.color = color;
    }

    @Override
    public Machine create() {
        return new CoffeeMaker(this.producer, this.yearOfProduction, this.color);
    }

    @Override
    public void powerOn() {
        System.out.println(AnsiColors.BLUE + "-----------coffemaker power on --------" + AnsiColors.RESET);
    }

    @Override
    public void powerOFF() {
        System.out.println(AnsiColors.BLUE + "-----------coffeemaker power off --------" + AnsiColors.RESET);
    }

    @Override
    public void soundsTheMachineMakes() {
        System.out.println(AnsiColors.GREEN + "brbrbrbrbrr.........." + AnsiColors.RESET);
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
