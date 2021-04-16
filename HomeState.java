public class HomeState implements State {
    private TV tv;

    /**
     * 
     * @param Homestate constructor that connects with inteface
     */
    public HomeState(TV tv) {
        this.tv = tv;
    }

    @Override
    /**
     * display the pressHomeButton message
     */
    public void pressHomeButton() {

        System.out.println("TV is already on the home screen");
    }
    
    @Override
    /**
     * display the pressNetflix Button 
     */
    public void pressNetflixButton() {

        System.out.println("Loading Netlix...");
        tv.setState(tv.getNetflixState());
    }

    @Override
    /**
     * displays the pressHulu Button
     */
    public void pressHuluButton() {

        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
    }

    @Override
    /**
     * displays the pressMovie Button
     */
    public void pressMovieButton() {

        System.out.println("You must pick an app to show movies");
    }

    @Override
    /**
     * displays the pressTV Button
     */
    public void pressTVButton() {

        System.out.println("You must pick an app to show tv shows");
    }    
}
