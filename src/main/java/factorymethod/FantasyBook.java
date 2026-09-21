package factorymethod;

public class FantasyBook implements Book {

    @Override
    public String getGenre() {
        return "fantasy";
    }

    @Override
    public String blurb() {
        return "a young hero finds a hidden map and sets off to cross a cursed kingdom";
    }

    @Override
    public int estimatedReadingHours() {
        return 14;
    }
}