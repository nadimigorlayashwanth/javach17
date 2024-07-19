class DeliverVehicle
{
 public static void deliver(String item,String location)
 {
   System.out.println("DeliverVehicle is running the deliver");
     System.out.println("item:"+item);
    System.out.println("location:"+location);
	Company.deliver(item,location);
 }
}