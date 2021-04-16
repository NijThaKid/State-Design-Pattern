public class NetflixState implements State {
    
    private TV tv;
    /**
     * 
     * @param NetflixState constructor that connects with the interface
     */
    public NetflixState(TV tv) {
        this.tv = tv;
    }

    @Override
    /**
     * loads the home screen from netflix state
     */
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...");
      
   
    }
    
    @Override
    /**
     * displays warning message
     */
    public void pressNetflixButton() {
        System.out.println("We are already in Netflix");
    }

    @Override
    /**
     * loads the hulu screen from the netflix state
     */
    public void pressHuluButton() {

        System.out.println("Loading Hulu...");
    
    }

    @Override
    /**
     * displays 5 movies from the netflix screen
     */
    public void pressMovieButton() {
      
        
        System.out.println("Netflix Movies:");
        System.out.println("- Extraction \n- Outside the Wire \n- MoonLight \n- The Pianist \n- Saving Private Ryan");
        tv.setState(this);
       

}

    @Override
    /**
     * displays 5 tv shows from the netflix screen
     */
    public void pressTVButton() {

        System.out.println("Netflix TV shows:");
        System.out.println("- Stranger Things \n- Last Chance U \n- Orange is the new Black \n- All American \n- Riverdale");
        tv.setState(this);
       
        
}
}
