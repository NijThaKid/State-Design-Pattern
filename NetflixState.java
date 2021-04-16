public class NetflixState implements State {
    
    private TV tv;
    public NetflixState(TV tv) {
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
      
        
        System.out.println("Netflix Movies:");
        System.out.println("- Extraction \n- Outside the Wire \n- MoonLight \n- The Pianist \n- Saving Private Ryan");
        tv.setState(this);
       

}

    @Override
    public void pressTVButton() {

        System.out.println("Netflix TV shows:");
        System.out.println("- Stranger Things \n- Last Chance U \n- Orange is the new Black \n- All American \n- Riverdale");
        tv.setState(this);
       
        
}
}
