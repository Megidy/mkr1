public class Main {
    public static void main(String[] args) {

        Planet earth = new Earth();
        Planet moon = new Moon();

        Planet[] planets = {earth, moon};

        for (Planet p : planets) {
            p.ReportAboutMovement();
            p.ReportAboutLife();
            System.out.println("next one");
        }
    }
}