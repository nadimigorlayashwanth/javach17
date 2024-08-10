class Keybunch
{
 String Material;
  Key key=new Key(68,"kelvin");
 
 Keybunch(String Material,Key key)
 {
  this.Material=Material;
  this.key=key;
  
 }
 
 public void display()
 {
 System.out.println("Material:"+Material);
 
  System.out.println("key:"+key);
 
 }
}