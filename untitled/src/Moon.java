class Moon implements Planet {
    @Override
    public void ReportAboutMovement() {
        System.out.println("moon is moving around the earth");
    }

    @Override
    public void ReportAboutLife() {
        System.out.println("moon doesnt have life");
    }
}