/**
 * @author Nijel Felder
 * April 17, 2021
 */
public class TV {

    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    /**
     * @param TV Constructor for the TV class 
     * @ it connects the TV class with the interface and the child classes under
     */
    public TV() {
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        state = HomeState;


    }
    /**
     * calls press home button on the state variable
     */
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    /**
     * calls press netflix button on the state variable
     */
    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    /**
     * calls press hulu button on the state variable
     */
    public void pressHuluButton() {
        state.pressHuluButton();
    }

    /**
     * calls press hulu button on the state variable
     */
    public void pressMovieButton() {
        state.pressMovieButton();
    }

    /**
     * calls press tv button on the state variable
     */
    public void pressTVButton() {
        state.pressTVButton();
    }

    /**
     * @param sets and changes state 
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * 
     * @return the Homestate class
     */
    public State getHomeState() {
        return HomeState;
    }

    /**
     * 
     * @return the Netflix class
     */
    public State getNetflixState() {
        return NetflixState;
    }

    /**
     * 
     * @return the HuluState class
     */
    public State getHuluState() {
        return HuluState;
    }
}
