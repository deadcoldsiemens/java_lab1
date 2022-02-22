package ua.iot.lviv;

    public class Main {
        public static void main(String[] args) {
            Camera c1 = new Camera(),
                    c2 = new Camera("Sony", 14, false),
                    c3 = new Camera("Canon", 8, true, 330, "ultracompact", 12);
        }
}
