// A class representing a Person
class Person {

    // Private instance variables for encapsulation
    private String name;
    private int age;
    private String occupation;

    // Getters and setters for encapsulation
    public String getName() { 
    
	    return name; 
		}
    public void setName(String name) {
     
	    this.name = name;
	  }

    public int getAge() { 
    
	    return age; 
	  }
	  
    public void setAge(int age) { 
    
	    this.age = age; 
	  }

    public String getOccupation() { 
    
	    return occupation; 
	  }
	  
    public void setOccupation(String occupation) {
    
	    this.occupation = occupation; 
	    }
}

// A base class representing a Job
class Job {

    // Instance variables for Job class
    String title;
    double salary;

    // Constructor for Job class
    Job(String title, double salary) {
    
        this.title = title;
        this.salary = salary;
    }

    // Method to display job details
    void displayJobDetails() {
    
        System.out.println("Job Title: " + title);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass extending Job representing a Software Engineer position
class SoftwareEngineer extends Job {

    // Additional instance variable specific to SoftwareEngineer
    String programmingLanguage;

    // Constructor for SoftwareEngineer class
    SoftwareEngineer(String title, double salary, String programmingLanguage) {
    
        // Call to superclass constructor using 'super'
        super(title, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Method overriding displayJobDetails() from superclass
    @Override
    void displayJobDetails() {
    
        // Call to superclass method using 'super'
        super.displayJobDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {
    
        // Creating a Person
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        person.setOccupation("Software Engineer");

        // Displaying Person details
        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Occupation: " + person.getOccupation());
        System.out.println();

        // Creating a Software Engineer job
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Software Engineer", 90000, "Java");

        // Displaying Software Engineer job details
        System.out.println("Job Details:");
        softwareEngineer.displayJobDetails();
    }
}
