class DeliverGuy
{
 public static void deliver(String item)
 {
   System.out.println("DeliverGuy is running the deliver");
     System.out.println("item:"+item);
    DeliverVehicle.deliver(item,"location");
 }
}