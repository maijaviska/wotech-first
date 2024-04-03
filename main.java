// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
  
    Integer temperature = -5;

    if (temperature <= 5) {
      System.out.println("Wear super warm");
    }
    else if (temperature <= 15) {
      System.out.println("Warm");
    }
    else if (temperature <= 30) {
      System.out.println("Normal clothes needed");
    }
    else { //you don't need to define everything, can just put else as last one
      System.out.println("You need cooling");
    }
    //else if (temperature > 30) {
     // System.out.println("No clothes needed");
    //}
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  }
}
