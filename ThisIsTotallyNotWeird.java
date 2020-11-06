public class ThisIsTotallyNotWeird {

  // Hi, I'm Egemen. You probably don't know me, but we are in the same
  // java course this semester.
  // I just wanted to try something fun, and this code is not supposed to
  // run properly.
  // What would you reply with to the output?

  Person u;
  String status;
  String occupied;
  String availability;
  String location

  // checks if the person is single
  public boolean isSingle(){
    if(u.status.equals("Single")){
      return true;
    }else{
      return false;
    }
  }

  // checks if the person cannot be bothered to meet someone new
  public boolean isBusy(){
    if(u.occupied.equals("Busy")){
      return true;
    }else{
      return false;
    }
  }

  // checks if the person is emotionally available
  public boolean emotionallyAvailable(){
    if(u.availability.equals("Available")){
      return true;
    }else{
      return false;
    }
  }

  // checks if the person is currently in Victoria
  public boolean inVictoria(){
    if(u.location.equals("Victoria")){
      return true;
    }else{
      return false;
    }
  }

  public int checking(){
    if(u.isSingle()){
      if(!u.isBusy() && u.emotionallyAvailable()){
        if(u.inVictoria()){
          return 10;
        }
      }else if(!u.isBusy() && u.emotionallyAvailable()){
        if(!u.inVictoria()){
          return 7.5;
        }
      }else if(u.isBusy() && u.emotionallyAvailable()){
        return 5;
      }else if(!u.isBusy() && !u.emotionallyAvailable()){
        return 2.5;
      }else if(u.isBusy() && !u.emotionallyAvailable()){
        return 0;
      }else{
        return -1;
      }
    }else{
      return -10;
    }
  }

  public static void getToKnow(Person p){
    if(p.checking() >= 5){
      System.out.println("I'd like to get to know you");
    }else if(p.checking() == 2.5){
      System.out.println("Friends?")
    }else{
      System.out.println(" [sad Egemen noises] ");
    }
  }

  public static void main(String[] args){
    getToKnow(Layla);
  }

}
