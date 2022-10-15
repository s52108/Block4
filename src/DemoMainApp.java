public class DemoMainApp {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person susi;

        susi = new Person();//Ein Objekt von Person für Susi
        susi.uniqueID = 4711;
        susi.firstName = "Susi";
        susi.lastName = "Sorglos";
        susi.ageInYears = 39;
        susi.mailAdress = "susi.sorglos@test.com";

        Person max = new Person();
        max.uniqueID = 2511;
        max.firstName = "Max";
        max.lastName = "Mustermann";
        max.ageInYears = 40;
        max.mailAdress = "max.mustermann@test.com";

        System.out.println(max.firstName);
        printPerson(max);
        printPerson(susi);
        printtwoPerson(max, susi);

        max.print();
        susi.print();
        System.out.println(max.fullName());
        System.out.println(susi.fullName());

        susi.setLastName(max.lastName);
        System.out.println("Susi = " + susi.fullName());

        System.out.println("susi = " + susi.ageInYears);
        susi.changeAge(40);
        System.out.println("susi = " + susi.ageInYears);

        susi.changeAge(39);
        System.out.println("susi = " + susi.ageInYears);

        susi.ageInYears = 28;
        System.out.println("susi = " + susi.ageInYears);

        System.out.println("max.toString() = " + max.toString());
        System.out.println("susi.toString() = " + susi.toString());
    }

    public static void printtwoPerson(Person person1, Person person2) {

        printPerson(person1);
        printPerson(person2);

    }


    public static void printPerson(Person person) {
        System.out.println("person.uniqueID = " + person.uniqueID);
        System.out.println("person.firstName = " + person.firstName);
        System.out.println("person.lastname = " + person.lastName);
        System.out.println("person.mailAdress = " + person.mailAdress);
        System.out.println("person.ageInYeats = " + person.ageInYears);
        System.out.println();

    }
}
