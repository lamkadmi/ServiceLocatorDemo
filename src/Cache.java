import java.util.ArrayList;
import java.util.List;

public class Cache<T> {
    private List<T> services;

    public Cache() {
        services = new ArrayList<T>();
    }

    public T getService(Class<T> classz) {
        for (T service : services) {
            if (service.getClass().getSimpleName().equalsIgnoreCase(classz.getSimpleName())) {
                System.out.println("Returning cached "
                        + classz.getSimpleName() + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(T classz) {
        boolean exists = false;
        for (T service : services) {
            if (service.getClass().getSimpleName().equalsIgnoreCase(classz.getClass().getSimpleName())) {
                exists = true;
            }
        }
        if (!exists) {
            services.add(classz);
        }
    }
}
