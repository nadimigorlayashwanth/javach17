class Key
{
 double weight;
 String brand;
 
 
 Key(double weight,String brand)
 {
  this.weight=weight;
  this.brand=brand;
 }
 
 public void show()
 {
  System.out.println("weight:"+this.weight);
   System.out.println("brand:"+this.brand);
 }
}