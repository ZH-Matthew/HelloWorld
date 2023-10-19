
public class LandLinePhone {

    private int wireLength; //длина провода

    public LandLinePhone(int wireLength) {
        this.wireLength = wireLength;
    }

    public void listenToAnsweringMachineMessages() {
        System.out.println("Включаю последнее сообщение из автоответчика");
    }

    public int getWireLength() {
        return wireLength;
    }

}
