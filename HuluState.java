public class HuluState implements State {

    private TV tv;

    public HuluState(TV tv) {
        this.tv = tv;
    }
    
    @Override
    public void pressHomeButton() {

        System.out.println("Loading the Home Screen...");
    }
    
    @Override
    public void pressNetflixButton() {

        System.out.println("We are already in Netflix");
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
    }

    @Override
    public void pressMovieButton() {
        tv.pressMovieButton();
        System.out.println("Hulu Movies:");
        System.out.println("- Cars \n- Cinderella \n- Wall-E \n- ET");
        tv.setState(tv.getHuluState());
}

    @Override
    public void pressTVButton() {
        tv.pressTVButton();
       
        System.out.println("Hulu TV shows:");
        System.out.println("- Sesame Street \n-Care Bears \n- Looney Tunes");
        tv.setState(tv.getHuluState());
    
}
    
}
