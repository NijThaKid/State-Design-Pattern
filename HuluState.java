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

        System.out.println("Loading Netflix...");
      
    }

    @Override
    public void pressHuluButton() {
        System.out.println("We are already in Hulu");
    }

    @Override
    public void pressMovieButton() {
      
        System.out.println("Hulu Movies:");
        System.out.println("- Gemini Man \n- Creed II \n- Maze Runner \n- Transformers \n- Little Monsters");
        tv.setState(this);
       
        
}

    @Override
    public void pressTVButton() {
    
        
        System.out.println("Hulu TV shows:");
        System.out.println("- Law and Order SVU \n- SnowFall \n- Shark Tank \n- Power \n- Good Doctor");
        tv.setState(this);
        
       
    
}
    
}
