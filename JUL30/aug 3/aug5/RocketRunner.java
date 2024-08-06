class RocketRunner {
    public static void main(String[] args) {
        Rocket rocket1 = new Rocket("USA", 28000, 500000, 4);
        rocket1.print();

        Rocket rocket2 = new Rocket("Russia", 25000, 450000, 5);
        rocket2.print();
    }
}