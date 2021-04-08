package homework.d2;

/**
 * @author Levy Zhao
 * @since 2021-03-18 18:32
 **/
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> instance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {

    }

    public static ThreadLocalSingleton getInstance() {
        return instance.get();
    }

}
