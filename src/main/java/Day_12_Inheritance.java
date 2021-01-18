import java.util.Scanner;
class Person {
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

class Student extends Person { //this is really Inheritance.Student extends Inheritance.Person


    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Inheritance.Person's first name.
     *   @param lastName - A string denoting the Inheritance.Person's last name.
     *   @param id - An integer denoting the Inheritance.Person's ID number.
     *   @param scores - An array of integers denoting the Inheritance.Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int idNumber,int[] scores){
        super(firstName, lastName, idNumber);
        this.testScores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate(){
        int sum = 0;
        int average;
        for (int testScore : testScores) {
            sum += testScore;
        }
        average = sum/testScores.length;
        if(average >= 90 && average <= 100){
            return 'O';
        } else if(average >= 80 && average < 90){
            return 'E';
        } else if (average >= 70 && average < 80){
            return 'A';
        } else if (average >= 50 && average < 70){
            return 'P';
        } else if (average >= 40 && average < 55){
            return 'D';
        } else {
            return 'T';
        }
    }
}


class Day12_Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
