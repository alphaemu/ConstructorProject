public class creatureCreator
{

    public static int preyAmount = 0;
    public static int predatorAmount = 0;
    
    public static int checkPrey()
    {
       return preyAmount;
    }
    
   public static int checkPredator()
   {
       return predatorAmount;
   }
    
    public static void census()
    {
        System.out.print("Predators: ");
        System.out.println(checkPredator());
        System.out.print("Prey: ");
        System.out.println(checkPrey());
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        
        System.out.println();
        System.out.println("The code is working.");
        System.out.println();
        
        // Create your predators and prey here! Feel free to mess around and add your own methods as well!
        
        
        
    }
   
    
}