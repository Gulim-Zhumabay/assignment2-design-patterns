package abstractfactory;

public class AudiobookContent implements Content{

    @Override
    public String medium(){
        return "audiobook";
    }
    @Override
    public String length(){
        return "540 minutes";
    }
}
