package factorymethod;

public class SciFiBook implements Book {

    @Override
    public String getGenre() {
        return "sci-fi";
    }

    @Override
    public String blurb() {
        return "a crew on a dying space station discovers that the signal they follow is their own";
    }

    @Override
    public int estimatedReadingHours() {
        return 11;
    }
}