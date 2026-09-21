package factorymethod;

public class DetectiveRecommender extends BookRecommender {

    @Override
    protected Book createBook() {
        return new DetectiveBook();
    }
}