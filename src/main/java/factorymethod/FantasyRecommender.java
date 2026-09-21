package factorymethod;

public class FantasyRecommender extends BookRecommender {

    @Override
    protected Book createBook() {
        return new FantasyBook();
    }
}