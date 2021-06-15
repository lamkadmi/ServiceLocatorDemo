import service.BusinessService;

public class InitialContext {
    public Object lookup(String name)
    {
        if (name.equalsIgnoreCase("BusinessService")) {
            System.out.println("Creating a new BusinessService object");
            return new BusinessService();
        }
        return null;
    }
}
