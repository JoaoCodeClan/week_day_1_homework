class Bus{
  private int number;
  private Person[] passengers;

  public Bus(int number){
    this.number = number;
    this.passengers = new Person[3];
  }
  public int getNumber(){
    return this.number;
  }
  public int personCount(){
    int count = 0;

    for (Person person: passengers){
      if (person != null){
        count++;
      }
    }
    return count;
  }

}
