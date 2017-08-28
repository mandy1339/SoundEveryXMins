import java.util.*;
import java.awt.*;
import javax.sound.sampled.*;


public class ScreamEveryXMins{
  public static void main(String[] args){
      Sound sound1 = new Sound("doit.wav");
      System.out.println("what's up?");
     int argument = Integer.parseInt(args[0]);
      System.out.println("argument is : " + argument);
    while(true){
      try 
      {
        sound1.play();
        Thread.sleep(argument * 60000);
      } 
      catch(InterruptedException e)
      {
       // this part is executed when an exception (in this example InterruptedException) occurs
      } 
    }    

  } 

}
