package abstractclass.machine;

/**
 * * Klasa abstrakcyjna `Machine` stanowi podstawę dla wszystkich maszyn w systemie.
 * Definiuje wspólne cechy (producent, rok produkcji) oraz abstrakcyjne zachowania,
 * które muszą być zaimplementowane przez konkretne podklasy (np. `CoffeeMaker`, `Computer`).
 * <p>
 * Klasy abstrakcyjne nie mogą być bezpośrednio instancjonowane, ale mogą zawierać:
 * - Pola (zmienne instancji)
 * - Konstruktory (wywoływane przez podklasy)
 * - Metody abstrakcyjne (bez implementacji, muszą być zaimplementowane w podklasach)
 * - Metody konkretne (z pełną implementacją)
 * <p>
 * Dzięki klasie abstrakcyjnej `Machine` możemy:
 * - Wymusić implementację pewnych metod (np. `powerOn()`, `powerOFF()`) w podklasach.
 * - Dostarczyć domyślne implementacje dla innych metod (np. `listTheManufacturer()`).
 * - Zapewnić wspólny interfejs dla różnych typów maszyn, co ułatwia polimorfizm.
 */
public abstract class Machine {
    protected String producer;
    protected int yearOfProduction;

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
