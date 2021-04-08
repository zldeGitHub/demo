package proxy.dbchange.staticproxy;

/**
 * @author Levy Zhao
 * @since 2021-03-24 11:10
 **/
public class DynamicDataSourceEntry {

    public final static String DEFAULT_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<>();

    private DynamicDataSourceEntry() {

    }

    public static void clear() {
        local.remove();
    }

    public static String get() {
        return local.get();
    }

    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }

    public static void set(String s) {
        local.set(s);
    }

    public static void set(int year) {
        local.set("DB_" + year);
    }

}
