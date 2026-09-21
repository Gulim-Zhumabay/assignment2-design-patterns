package factorymethod;

public abstract class BookRecommender {

    protected abstract Book createBook();

    public void recommend() {
        Book book = createBook();
        System.out.println("genre: " + book.getGenre());
        System.out.println("about: " + book.blurb());
        System.out.println("reading time: " + book.estimatedReadingHours() + " hours");
    }
}