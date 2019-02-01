
/**
 * The Lovable has three methods, stroke(), canStroke() and feed().
 * 
 * @Alexandru Daniel Zelea
 * @17/01/2019
 */
public interface Lovable
{
  /** 
  * Performs an arbitrary action in response to 'stroke'.
  */
  public void stroke();
   
  /** 
  * Performs an arbitrary action in response to 'canStroke'.
  */
  public boolean canStroke();
   
  /** 
  * Performs an arbitrary action in response to 'feed'.
  */
  public void feed();
   
   
}
