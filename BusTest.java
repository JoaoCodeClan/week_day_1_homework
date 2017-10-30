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

  @Test
  public void busCannotTakePerson(){
    for( int i = 0; i < 10; i++){
      bus.take(person);
    }
    assertEquals(3, bus.personCount());
  }

  @Test

  public void passengersIsFull(){
    for(int i=0; i< 3; i++){
      bus.take(person);
    }
    assertEquals(true, bus.busIsFull());
  }

}
