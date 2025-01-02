package abstractclass.machine;

public class Computer extends Machine {

    public Computer(String producer, int yearOfProduction) {
        super(producer, yearOfProduction);
    }

    @Override
    public Machine create() {
        return null;
    }

    @Override
    public void powerOn() {
        System.out.println("-----------computer power on --------");

    }

    @Override
    public void powerOFF() {
        System.out.println("-----------computer power off --------");

    }

    @Override
    public void soundsTheMachineMakes() {
        System.out.println("beep beep ...........");
    }


    public void listTheManufacturer() {
        System.out.println("producer = " + producer + " yearOfProduction:" + yearOfProduction);
    }
}
