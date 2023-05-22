public abstract class SwitchableFactory {

    public static final SwitchableFactory VENTILATOR = new SwitchableFactoryVentilator ();
    public static final SwitchableFactory LAMP = new SwitchableFactoryLamp ();

    private static int number = 1;

    protected int getNumber () {
        return number++;
    }

    public abstract Switchable createSwitchable ();
}
