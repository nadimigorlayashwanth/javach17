class ProjectorRunner {
    public static void main(String[] args) {
        Projector projector1 = new Projector("Epson", "LCD", "Black", 2.5);
        projector1.print();

        Projector projector2 = new Projector("BenQ", "DLP", "White", 3.0);
        projector2.print();
    }
}