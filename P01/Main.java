public class Main
{
   public static void main(String args[])
   {
      Car car = new Car();
      System.out.println(car);
      car.drive();
      car.drive();
      System.out.println(car);
      car.fillTires();
      System.out.println(car);
      car.drive();
      car.drive();
      car.drive();
      System.out.println(car);
      car.fillTires();
      System.out.println(car);
      for (int i = 0; i < 8; i++)
         car.drive();
      System.out.println(car);
   }   
}