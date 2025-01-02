package abstractclass.machine;

public abstract class Machine {
    String producer;
    int yearOfProduction;

    public Machine() {

    }


    public Machine(String producer, int yearOfProduction) {
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract Machine create();

    public abstract void powerOn();

    public abstract void powerOFF();

    public abstract void soundsTheMachineMakes();


    public void listTheManufacturer() {
        System.out.println("-------- abstract -----------");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
