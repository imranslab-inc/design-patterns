package Factory_Design_Pattern.Example1;

import Factory_Design_Pattern.Example1.phone.OS;
import Factory_Design_Pattern.Example1.phone.OperatingSystemFactory;

public class FactoryMain
{
    public static void main(String[] args)
    {
//        OS operating_system = new Windows();
//        operating_system.spec();

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.spec();
    }
}
