package Factory_Design_Pattern.Example1.phone;

public class OperatingSystemFactory
{
    public OS getInstance(String str)
    {
        if(str.equals("Open"))
            return new Android();
        else if(str.equals("Closer"))
            return new IOS();
        else
            return new Windows();

    }
}
