# ConstructorProject

## **Learning Goal** 
Identify, using its signature, the correct constructor being called.

## **Getting Started** 
Before we can jump into making your own class, it’s important to understand the terminology for everything you’re learning. To accomplish this, you’re going to write the following definitions [in your own words so you can’t copy paste >:)] at their place, along with their usage in the predator code. I’ve gone ahead and added one for you already.

1. **VARIABLES** - a name which is associated with a value that can be changed
2. **SIGNATURE** - the method name and the number, type and order of its parameters
3. **CONSTRUCTOR** - a special method that is used to initialize objects
4. **PARAMETERS** - a value that you can pass to a method in Java

## **Making the Constructor**
For this activity, you’ll be making your own class, the “prey” class, using the existing “predator” class as a guideline. 

1. First, we need to define what variables will make up our “prey”. Instantiate 3 or more variables in the prey file that define our prey, one being a String, and one being an Int.
2. Now that we have our variables, it’s time to assign them to the class through parameters. Write up a signature for a constructor titled “prey”.
          *(When creating the signature, make sure to pass along the variables you instantiated in step 1 as parameter values.)*
3. Inside the constructor, assign the parameters to the newly created object using the “this.object = parameter” code. If you’re confused, refer to the predator class for help! 
          *(As well, within the constructor, make it so that when a new prey object is made, the variable “preyAmount” increases by 1. This makes sure another piece of code functions properly in the main creatorCreator class.)*

## **Method Madness**
You’ve got the basis done! Now, have fun and just mess around! Here’s a checklist of things to try out while you do this - I’ve gone ahead and marked the first one off for you.

- [x] Instantiate 3 or more variables in the prey class
- [ ] Add another prey constructor without any parameters - this “overloads” the original constructor… what does that mean?
- [ ] Create 3 different predators in the creatureCreator class, then use the “reproduce” method”
- [ ] Make a method in the prey class that changes one of the variables assigned to the object
- [ ] Make a method in the prey class that prints out a line of text to the console
- [ ] Try making a new predator object without adding any parameters and print out its species - what happens?
- [ ] Write comments on each method you’ve made, describing what they’re doing (I know, not as fun, but it helps you to learn!)
- [ ] Create 3 different prey in the creatureCreator class, then use the “census” method
- [ ] Try calling methods from the creatureCreator class in the prey class - does it work? 
- [ ] Try calling methods from the predator class with one of your prey - does it work?
