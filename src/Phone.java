public abstract class Phone {
    private String color;
    private int year;

    public Phone(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public abstract void call(int number);
    public abstract void answerCall();

}
