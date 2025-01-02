package abstractclass.machine;

public class MyAbstractClass {

    public static void main(String[] args) {
/*
              0) Nie można utworzyć instancji klasy abstract!!!
                  np.: Machine machine = new Machine();
              1) Abstract class nie musi posiadać żadnej metody abstract.
              2) Deklaracja metody wymaga słowa abstract lub jej implementacji, ciała metody.
              3) Metoda absctract wymaga klasy abstrakcyjnej!!!
              4) Każda klasa, która dziedziczy po klasie abstract musi implementować metody abstract
              5) Przykłady istniejących klas abstract:
                  a) Number
                  b) Component i JComponent
                  c) Graphics i Graphics2D
                  d) Enum
                  e) AbstractMap
              6) metody interfejsów są abstract, choć słowo to nie musi wystąpić
              7) Koniec
*/
            Machine coffeeMaker = new CoffeeMaker("coffee machine manufacturer",2023,"white");
            coffeeMaker.powerOn();
            coffeeMaker.soundsTheMachineMakes();
            System.out.println(coffeeMaker);
            coffeeMaker.powerOFF();

            Machine computer = new Computer("computer manufacturer",2001);
            computer.powerOn();
            computer.soundsTheMachineMakes();
            computer.listTheManufacturer();
            computer.powerOFF();

            // klasa anonimowa
            Machine machine = new Machine() {
                    @Override
                    public Machine create() {
                            return null;
                    }

                    @Override
                    public void powerOn() {

                    }

                    @Override
                    public void powerOFF() {

                    }

                    @Override
                    public void soundsTheMachineMakes() {

                    }
            };
            machine.listTheManufacturer();

            System.out.println(machine.getClass().getName()); // klasa anonimowa
            System.out.println(coffeeMaker.getClass().getName());
            System.out.println(computer.getClass().getName());
    }

}
