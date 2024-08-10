class  ElectronicgadjectsRunner{
    public static void main(String[] args) {
        
        Electronicgadjects[] gadgets = {"Smartphone", 699.99,"Laptop", 1299.99);
        gadgets[2] = new Gadget("Smartwatch", 199.99);
        gadgets[3] = new Gadget("Tablet", 499.99);
        gadgets[4] = new Gadget("Bluetooth Speaker", 59.99);
        gadgets[5] = new Gadget("Headphones", 149.99);
        gadgets[6] = new Gadget("Gaming Console", 399.99);
        gadgets[7] = new Gadget("Drone", 799.99);
        gadgets[8] = new Gadget("Camera", 899.99);
        gadgets[9] = new Gadget("Smart TV", 1199.99)}

       
        for (int i = 0; i < gadgets.length; i++) {
            gadgets[i].displayPrice();
        }
    }
}