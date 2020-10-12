public class predator extends creatureCreator
{
    
    // String species;
    // term: Variable
    // definition: a name which is associated with a value that can be changed
    // usage: it's a variable, it does like, EVERYTHING

    String species = "spider";
    String color = "black";
    int eyes = 8;
    
    // There are multiple terms here...
    
    // public predator(){}
    // term:
    // definition:
    // usage:
    
    // (String species, String color, etc.)
    // term:
    // definition:
    // usage:
    
    // public predator(String species, String color, int eyes) {}
    // term:
    // definition:
    // usage:
    
    public predator(String species, String color, int eyes)
    {
        this.species = species;
        this.color = color;
        this.eyes = eyes;
        
        predatorAmount++;
    }
    
    public predator()
    {
        predatorAmount++;
    }
    
    public void feed(String prey)
    {
        if (preyAmount > 0)
        {
            preyAmount--;
            
            System.out.print(species);
            System.out.println(" ate " + prey);
        }
        else
        {
            System.out.println("There was nothing to eat!");
        }
    }
    
    public void reproduce()
    {
        predatorAmount *= 2;
    }
    
    public void dnaChange(String paint)
    {
        this.color = paint;
    }
    
    public void dnaChange(int eyeAmount)
    {
        this.eyes = eyeAmount;
    }
    
}