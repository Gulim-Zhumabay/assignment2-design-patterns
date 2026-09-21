package factorymethod;

public class DetectiveBook implements Book {

    @Override
    public String getGenre() {
        return "detective";
    }

    @Override
    public String blurb() {
        return "a retired inspector reopens a cold case after a strange letter arrives";
    }

    @Override
    public int estimatedReadingHours() {
        return 9;
    }
}