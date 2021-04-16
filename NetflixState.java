public class NetflixState implements State {

    private TV tv;

    public NetflixState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen");
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
        
        System.out.println("Netflix Movies:");
        System.out.println("- The Land Before Time \n- Frozen \n- The Little Mermaid \n- Ice Age");
        tv.setState(tv.getNetflixState());

}

    @Override
    public void pressTVButton() {
        tv.pressTVButton();
      
        System.out.println("Netflix TV shows:");
        System.out.println("- Peppa Pig \n-My Little Pony \n- Garfield \n -Teenage Mutant Ninja Turtles");
        tv.setState(tv.getNetflixState());
        
}
}
