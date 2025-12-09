package abstractclass.machine;

public class MyAbstractClass {

    public static void main(String[] args) {
        //<editor-fold desc="Description">
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
        //</editor-fold>
        /**
         * Programowanie do intefejsu, a nie do implementacji.
         * Poniżej tworzymy obiekty klas dziedziczących po klasie abstrakcyjnej `Machine`,
         * ale odwołujemy się do nich poprzez referencje typu `Machine`.
         * Dzięki temu możemy traktować różne typy maszyn w ujednolicony sposób.
         */
        Machine coffeeMaker = new CoffeeMaker("coffee machine manufacturer", 2023, "white");
        coffeeMaker.powerOn();
        coffeeMaker.soundsTheMachineMakes();
        System.out.println(coffeeMaker);
        coffeeMaker.powerOFF();

        System.out.println();

        Machine computer = new Computer("computer manufacturer", 2001);
        computer.powerOn();
        computer.soundsTheMachineMakes();
        System.out.println(computer);
        computer.listTheManufacturer();
        computer.powerOFF();

        System.out.println();

        // Wywołanie metody create() na instancji coffeeMaker
        // Zwraca to nową instancję typu Machine (która faktycznie jest CoffeeMaker)
        Machine secondCoffeeMaker = coffeeMaker.create();

        // Użycie nowo utworzonej maszyny
        if (secondCoffeeMaker != null) {
            System.out.println("\n" + AnsiColors.CYAN + "--- Utworzono drugą maszynę ---" + AnsiColors.RESET);
            secondCoffeeMaker.powerOn();
            System.out.println("Nowy obiekt: " + secondCoffeeMaker);
            secondCoffeeMaker.powerOFF();
        }

        // Analogicznie dla Computer
        Machine secondComputer = computer.create();
        if (secondComputer != null) {
            System.out.println("\n" + AnsiColors.CYAN + "--- Utworzono drugą maszynę ---" + AnsiColors.RESET);
            secondComputer.powerOn();
            System.out.println("Nowy obiekt: " + secondComputer);
            secondComputer.powerOFF();

        }

        System.out.println(AnsiColors.CYAN + "------------------------------------------------------------" + AnsiColors.RESET);


        /*
         * To pokazuje, jak można utworzyć jednorazową instancję
         * klasy abstrakcyjnej (poprzez jej implementację w locie).
         */
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

            @Override
            public String toString() {
                return "AnonymousMachine instance";
            }
        };
        System.out.println(AnsiColors.CYAN + "------------------------------------------------------------" + AnsiColors.RESET);
        System.out.println(machine);
        machine.listTheManufacturer();
        System.out.println(AnsiColors.CYAN + "------------------------------------------------------------" + AnsiColors.RESET);

        /**
         * Przedstawienie nazw klas i ich pełnych kwalifikowanych nazw.
         */
        System.out.println(coffeeMaker.getClass().getSimpleName());
        System.out.println(computer.getClass().getSimpleName());
        System.out.println(machine.getClass().getSimpleName()); // klasa anonimowa
        System.out.println(AnsiColors.CYAN + "------------------------------------------------------------" + AnsiColors.RESET);

        /**
         * Przedstawienie nazw klas i ich prostych nazw.
         */
        System.out.println(machine.getClass().getName()); // klasa anonimowa
        System.out.println(coffeeMaker.getClass().getName());
        System.out.println(computer.getClass().getName());
        System.out.println(AnsiColors.CYAN + "------------------------------------------------------------" + AnsiColors.RESET);

    }

}
