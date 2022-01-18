package app;

public class storybuilder {
  
  Scanner noun = new Scanner(System.in) ;
  boolean isDone = false;
  
  public storybuilder() {
    System.out.print("Once upon a time... ") ;
    
    while (!isDone) {
      
      s = noun.nextLine()
      
      System.out.println(s + " " + verbfinder() + " " + noun.nextLine() + ". ") ;
      
      // add an "and" every now and then... a flag?
      
      if (s.length() >= 5) {
        if (s.substring(3, 4).equals("c")) {
          System.out.println("The End!")
          isDone = true ;
        }
      }
      
    }
  
  }
  
  public String verbfinder() {
    //use math.random 
    //have a list of 20 verbs and assign words to a set of math.random outputs
    return "did" ;
  }
  
}
