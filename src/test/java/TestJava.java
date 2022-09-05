
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestJava {


   @Test
   public void test1()
   {
      System.out.println("Running First Test");
      Assert.assertEquals("Sneha","Sneha");
   }
   
   @Test
   public void test2()
   {
      System.out.println("Running Second Test");
      Assert.assertEquals("Sneha Malokar","Sneha");
   }


}
