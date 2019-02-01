/**
 * class Dog - is a subclass of Pet
 * TMA02 Q3
 * 
 * @author Alexandru Daniel Zelea 
 * @date 07/01/2019
 */
public class Dog extends Pet
{
   //instance variables
   private int happiness; // represents the dog's level of happiness 
   private int timesFedToday; // represents how many times the dog was fed today 
   
   /**
   * Constructor initialises its inherited instance variables as for
   * its superclass and assigns the value 2 to happiness.
   */
   public Dog(String aName, String aDescription)
   {
      super(aName, aDescription);
      this.happiness = 2;
   }
   
   /**
   * Getter method for a dog's level of happiness.
   */
   public int getHappiness()
   {
      return this.happiness;
   }
   
   /**
   * Getter method for the number of times the dog was fed today.
   */
   public int getTimesFedToday()
   {
      return this.timesFedToday;
   }
   
   /** Helper method to decrease the level of happiness by 1 if the
   * level of happiness is bigger than 0.
   */
   public void decrementHappiness()
   {
      if (this.getHappiness() > 0){
         this.happiness -= 1;
      }
   }
   
   /** Helper method to decrease the level of timesFedToday by 1 if the
   * level of timesFedToday is bigger than 0.
   */
   public void decrementTimesFedToday()
   {
      if (this.getTimesFedToday() > 0){
         this.timesFedToday -= 1;
      }
   }
   
   /** Helper method to increase the level of happiness by 1.
   */
   public void incrementHappiness(){
      this.happiness += 1;
   }
   
   /** Helper method to increase the level of timesFedToday by 1.
   */
   public void incrementTimesFedToday(){
      this.timesFedToday += 1;
   }
   
   /** Instance method which prints "I’m going for a walk!" and "I’m getting hungry"
   * and also increases the level of happiness by 1
   *  and decreses the level of timesFedToday as long as getTimesFedToday is
   *  bigger than 0
   */
   public void walkies(){
      // as long as getTimesFedToday is bigger than 0 repeat the proccess
      while(this.getTimesFedToday() > 0)
      {
         System.out.println("I’m going for a walk!");
         this.incrementHappiness();
         System.out.println("I’m getting hungry");
         this.decrementTimesFedToday();
      }
   }
   
   /** 
   * Instance method takes no argument and returns a boolean value depending
   * on the value of the instance variable happiness and timesFedToday.
   * The method also prints out either or both of “Not happy, can’t sleep” 
   * or “Hungry, can’t sleep” as appropriate.
   */
   public boolean sleep()
   {
      // returns true if both values are bigger than 0
      if ( this.getHappiness() > 0 && this.getTimesFedToday() > 0)
      {
         return true;
      } 
      // returns false and prints out a message depending on the values
      // of the two instance variables
      else if ( this.getHappiness() > 0 && this.getTimesFedToday() < 1)
      { 
         System.out.println("Hungry, can’t sleep");
         return false;
      }
      else if ( this.getHappiness() < 1 && this.getTimesFedToday() > 0)
      {
         System.out.println("Not happy, can’t sleep");
         return false;
      }
      else 
      {
         System.out.println("Hungry, can’t sleep");
         System.out.println("Not happy, can’t sleep");
         return false;
      }
   }
   
   /** The instance method takes no argument and returns no value but
   * prints out a message and decreases the value of happiness.
   */
   public void noWalkies(){
      System.out.println("No walkies :-(");
      this.decrementHappiness();
   }
      
}
