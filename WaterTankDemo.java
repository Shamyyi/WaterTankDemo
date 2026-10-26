public class WaterTankDemo{
public static void main(String[] args) {
    //non-parameterized constructor
    WaterTank tank1 = new WaterTank();
    tank1.pour(10);
    tank1.pour(20);
    tank1.pour(15);
    System.out.println("Top bucket: "+ tank1.checkTop() + "L");
    tank1.drain();
       System.out.println("Bucket Left: " + tank1.bucketCount() + " | Total Liters: "+ tank1.totalLiters());

WaterTank tank2 = new WaterTank("Tanke sa Tubig ni BBM", 5);
   tank2.pour(5);
    tank2.pour(10);
    tank2.pour(15);
   tank2.pour(20);
    tank2.drain();
    tank2.drain();
    tank2.drain();
    tank2.drain();
    System.out.println("Is the Tank Empty? No | Buckets: " + tank1.bucketCount() + " | Total Liters: " + tank1.totalLiters());


}
}