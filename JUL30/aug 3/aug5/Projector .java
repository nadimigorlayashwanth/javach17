class Projector {
    String company;
    String type;
    String color;
    double weight;

    public void print() {
        System.out.println("Company: " + this.company);
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Weight: " + this.weight + " kg");
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    Projector(String company, String type, String color, double weight) {
        this.company = company;
        this.type = type;
        this.color = color;
        this.weight = weight;
    }
}


