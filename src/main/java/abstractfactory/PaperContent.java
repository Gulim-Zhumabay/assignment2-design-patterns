package abstractfactory;

public class PaperContent implements Content {

    @Override
    public String medium() {
        return "paper";
    }

    @Override
    public String length() {
        return "320 pages";
    }
}