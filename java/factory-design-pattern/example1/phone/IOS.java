package Factory_Design_Pattern.Example1.phone;

public class IOS implements OS
{
    @Override
    public void spec() {
        System.out.println("Steve Jobs made me ... ...");
    }
}
