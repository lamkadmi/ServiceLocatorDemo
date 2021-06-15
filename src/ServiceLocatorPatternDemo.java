import service.BusinessService;

public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        ServiceLocator.getService(BusinessService.class).getAssetByAssetnum();
        ServiceLocator.getService(BusinessService.class).getAssetByAssetnum();
    }
}
