public class Main {
    public static void main( String[] args ) {
        /* TODO Create the container(Collection) of your class objects and iterate it
        You should create with your class objects. For example List <? extends Car> list.
        And add created objects to list (list.add(bmv))...
        And create cycle to iterate elements of list
            TODO create interface and implement this interface by one of your child class (Audi, Volga)
         */
        BMW bmw = new BMW("x6", "blak", 2018, 400, 0, "BMW");
        Audi audi = new Audi("s8 long", "white", 2018, 420, 0, "Audi");
        Volga volga = new Volga( " gas 3012","gray",1992,180,400000, "volga");
        System.out.println(bmw);
        System.out.println(audi);
        System.out.print(volga);

    }
}


