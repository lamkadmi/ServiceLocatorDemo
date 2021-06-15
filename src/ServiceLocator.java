public class ServiceLocator<T> {

    private static Cache cache = new Cache();

    public static <T> T getService(Class<T> classz) {
        T service = (T) cache.getService(classz);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        T ServiceOne = (T) context.lookup(classz.getSimpleName());
        cache.addService(ServiceOne);
        return ServiceOne;
    }
}
