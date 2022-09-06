// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack ArmForce = new Stack(5);
  
      // Insert new elements into the stack
      ArmForce.push("Airman Basic");
      ArmForce.push("Airman");
      ArmForce.push("Airman First Class");
      ArmForce.push("Senior Airman");
   
  
      // Show the size of the stack
      System.out.println("The Airforce Enlisted Ranks: " + ArmForce.size());
  
      // Show top element in the stack
      System.out.println("The highest rank in Air Force Ranks: " + ArmForce.peek());
  
      // Remove top element in the stack
      ArmForce.pop();
  
      System.out.println("Military Rank Abbreviation");
  
      // Show all elements in Stack
      ArmForce.printStack();
  
      // Show top element in the stack
      System.out.println("The highest rank is: " + ArmForce.peek());
    }
  }
