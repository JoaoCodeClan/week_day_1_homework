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

  @Test
  public void hasNumber(){

    int number = bus.getNumber();
    assertEquals(47, number);
  }

  @Test
  public void passengersStartEmpty(){
    assertEquals(0, bus.personCount());

  }

  @Test
  public void busCantakePerson(){
    bus.take(person);
    assertEquals(1, bus.personCount());
  }

}
