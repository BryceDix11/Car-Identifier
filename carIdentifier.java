public class carIdentifier
{
     private String brand;
     private String model;
     private int year;
  
   public carIdentifier(String initBrand, String initModel, int initYear)
   {
      brand = initBrand;
      model = initModel;
      year = initYear;
   }
   
   public void printInfo()
   {
      System.out.println("The car is a: " + year + " " + brand + " " + model);
   }
   
   public static void main(String[] args)
   {
      carIdentifier car01 = new carIdentifier("Mazda", "3", 2003);
      car01.printInfo();
   }
}