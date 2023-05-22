public class SwitchableFactoryLamp extends SwitchableFactory {

    @Override
    public Switchable createSwitchable() {
        return new Lamp (getNumber ());
    }
}
