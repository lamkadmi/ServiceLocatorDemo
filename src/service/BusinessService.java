package service;

public class BusinessService implements IBusinessService {
    @Override
    public String getAssetByAssetnum() {
        System.out.println("BusinessService");
        return "TOTO";
    }
}
