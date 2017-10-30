import org.junit.*;
import static org.junit.Assert.assertEquals;


public class BusTest {
 Bus bus;
 Person person;


 @Before

 public void before(){

   this.bus = new Bus(47);
   this.person = new Person();

 }


}
