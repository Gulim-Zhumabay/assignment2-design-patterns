package factorymethod;

public class SciFiRecommender extends BookRecommender {

    @Override
    protected Book createBook() {
        return new SciFiBook();
    }
}