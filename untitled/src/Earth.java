public class Earth implements Planet {
    @Override
    public void ReportAboutMovement() {
        System.out.println("earth is moving around the Sun");
    }

    @Override
    public void ReportAboutLife() {
        System.out.println("life exists on earth");
    }
}
