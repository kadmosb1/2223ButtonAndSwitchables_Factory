public class SwitchableFactoryVentilator extends SwitchableFactory {

    @Override
    public Switchable createSwitchable() {
        return new Ventilator (getNumber ());
    }
}
