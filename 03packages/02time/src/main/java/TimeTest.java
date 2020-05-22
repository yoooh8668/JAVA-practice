import java.time.*; // import the time class
import java.time.format.DateTimeFormatter;

public class TimeTest {
  public static void main(String[] args) {
    LocalDate myObj1 = LocalDate.now(); // Create a date object
    System.out.println("LocalDate = " + myObj1); // Display the current date
    
    LocalTime myObj2 = LocalTime.now();
    System.out.println("LocalTime = " + myObj2);
    
    LocalDateTime myObj3 = LocalDateTime.now();
    System.out.println("LocalDateTime = " + myObj3);
    
    
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
    //yyyy-MM-dd
    //dd/MM/yyyy
    //dd-MMM-yyyy
    //E, MMM dd yyyy
    String formattedDate = myObj3.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}