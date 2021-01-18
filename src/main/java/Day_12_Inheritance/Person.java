package Day_12_Inheritance;

public class Person {
    int idNum;
    String first;
    String last;
    public Person(String firstName, String lastName, int idNumber) {
        this.first = firstName;
        this.last = lastName;
        this.idNum = idNumber;
    }
    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + last + ", " + first
                        + 	"\nID: " + idNum);
    }
}
