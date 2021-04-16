public class HuluState implements State {

    private TV tv;

    /**
     * 
     * @param HuluState constructor that connects with interface
     */
    public HuluState(TV tv) {
        this.tv = tv;
    }
    
    @Override
    /**
     * it loads the homescreen from the Hulu State
     */
    public void pressHomeButton() {

        System.out.println("Loading the Home Screen...");

    }
    
    @Override
    /**
     * loads the netflix screen from the hulu state
     */
    public void pressNetflixButton() {

        System.out.println("Loading Netflix...");
      
    }

    @Override
    /**
     * displays the warning message 
     */
    public void pressHuluButton() {
        System.out.println("We are already in Hulu");
    }

    @Override
    /**
     * displays 5 movies from the hulu screen
     */
    public void pressMovieButton() {
      
        System.out.println("Hulu Movies:");
        System.out.println("- Gemini Man \n- Creed II \n- Maze Runner \n- Transformers \n- Little Monsters");
        tv.setState(this);
       
        
}

    @Override
    /**
     * displays 5 tv shows from the hulu screen
     */
    public void pressTVButton() {
    
        
        System.out.println("Hulu TV shows:");
        System.out.println("- Law and Order SVU \n- SnowFall \n- Shark Tank \n- Power \n- Good Doctor");
        tv.setState(this);
        
       
    
}
    
}
