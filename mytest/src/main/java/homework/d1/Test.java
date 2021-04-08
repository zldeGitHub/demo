package homework.d1;

/**
 * @author Levy Zhao
 * @since 2021-03-18 16:52
 **/
public class Test {

    public static void main(String[] args) {

        IAborderPay iAborderPay = AborderFactory.getInstance(AborderPayA.class);
        iAborderPay.pay();

        IAborderPay iAborderPay1 = AborderFactory.getInstance(AborderPayB.class);
        iAborderPay1.pay();

        IInternals iInternals = InternalFactory.getInstance(IInternalsA.class);
        iInternals.pay();

        IInternals iInternals1 = InternalFactory.getInstance(IInternalsB.class);
        iInternals1.pay();

    }
}
