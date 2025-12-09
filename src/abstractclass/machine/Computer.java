package abstractclass.machine;

public class Computer extends Machine {

    public Computer(String producer, int yearOfProduction) {
        super(producer, yearOfProduction);
    }

    @Override
    public Machine create() {
        return new Computer(this.producer, this.yearOfProduction);
    }

    @Override
    public void powerOn() {
        System.out.println(AnsiColors.RED + "-----------computer power on --------" + AnsiColors.RESET);
    }

    @Override
    public void powerOFF() {
        System.out.println(AnsiColors.RED + "-----------computer power off --------" + AnsiColors.RESET);
    }

    @Override
    public void soundsTheMachineMakes() {
        System.out.println(AnsiColors.YELLOW + "beep beep ..........." + AnsiColors.RESET);
    }


    public void listTheManufacturer() {
        System.out.println("producer = " + producer + " yearOfProduction:" + yearOfProduction);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "producer='" + producer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

}
