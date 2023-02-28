package kindergarten;

public class Main {
    public static void main(String[] args) {
        Kindergarten kindergarten = new Kindergarten("Sunshine", 8);

        Child childOne = new Child("Lilyana", "Petrova", 3, "Selena", "0899");
        Child childTwo = new Child("Elona", "Muskova", 4,"Max", "0888");
        Child childThree = new Child("George", "Bush", 5,"Ivan", "0988");
        Child childFour = new Child("Ruzha", "Ignatova", 6,"George", "0789");
        Child childFive = new Child("Veselina", "Kostadinova", 3,"Nikolas", "0788");
        Child childSix = new Child("Tom", "Todorov", 2,"Zendaya", "0799");
        Child childSeven = new Child("Sara", "Gomez", 2,"Victor", "0998");
        Child childEight = new Child("Greta", "Thunberg", 3,"Boris", "0999");
        Child childNine = new Child("Anna", "Cameron", 4, "Breja", "0999");

        System.out.println(kindergarten.addChild(childOne));

        System.out.println(kindergarten.addChild(childTwo));
        System.out.println(kindergarten.addChild(childThree));
        System.out.println(kindergarten.addChild(childFour));
        System.out.println(kindergarten.addChild(childFive));
        System.out.println(kindergarten.addChild(childSix));
        System.out.println(kindergarten.addChild(childSeven));
        System.out.println(kindergarten.addChild(childEight));

        System.out.println(kindergarten.addChild(childNine));
        System.out.println(kindergarten.removeChild("Ruzha"));
        System.out.println(kindergarten.removeChild("George"));
        System.out.println(kindergarten.removeChild("Elona"));
        System.out.println(kindergarten.removeChild("Ruzha"));
        System.out.println(kindergarten.removeChild("Tim"));

        System.out.println(kindergarten.getChildrenCount());

        Child getChildTom = kindergarten.getChild("Tom");
        Child getChildGreta = kindergarten.getChild("Greta");

        System.out.println(getChildTom);

        System.out.println(getChildGreta);
        System.out.println(kindergarten.registryReport());


    }
}
