class Person {
    //unsere Klassen haben KEINE main-Methode

    public int uniqueID;
    public String firstName;
    public String lastName;
    public int ageInYears;
    public String mailAdress;

    //Metoden innerhalb der Klasse sind zu 99% NICHT static
    public void print() {
        System.out.println("uniqueID = " + uniqueID);
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("ageInYears = " + ageInYears);
        System.out.println("mailAdress = " + mailAdress);
        System.out.println();

    }


    public String fullName() {
        return lastName.toUpperCase() + " " + firstName;

    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public void setMailAdress(String mailAdress) {
        this.mailAdress = mailAdress;
    }

    public void setLastName(String Lastname) {
        lastName = lastName;

    }

    public void changeAge(int newAge) {
        if (newAge > ageInYears && newAge > 0 && newAge < 150) {
            ageInYears = newAge;
        } else System.out.println("404 - this age is not correct: " + newAge);

    }


    public String toString() {
        return "Person{" +
                "uniqueID=" + uniqueID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ageInYears=" + ageInYears +
                ", mailAdress='" + mailAdress + '\'' +
                '}';
    }
}
