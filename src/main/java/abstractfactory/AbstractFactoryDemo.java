package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args){
        BookFormatFactory[] factories = {
                new PaperFactory(),
                new EbookFactory(),
                new AudiobookFactory(),
        };
        for (BookFormatFactory factory : factories) {
            LibraryShelf shelf = new LibraryShelf(factory);
            shelf.present();
            System.out.println();
        }
    }
}
