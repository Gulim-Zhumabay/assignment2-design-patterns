package abstractfactory;

public class EbookContent implements Content {

    @Override
    public String medium() {
        return "ebook";
    }
    @Override
    public String length() {
        return "480 screens";
    }
}
