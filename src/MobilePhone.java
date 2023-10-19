import java.util.Objects;

public class MobilePhone extends Phone {
    private int screenDiagonal; //диагональ экрана


    public MobilePhone(int screenDiagonal,String color,int year) {
        super(color, year);
        this.screenDiagonal = screenDiagonal;
    }

    public void takeAPhoto() {
        System.out.println("Сейчас вылетит птичка!");
    }
    @Override
    public void call(int number){
        try {
            dialing(number);
        } catch (LineBusyException e){
            System.out.println("Извините, линия занята, перезвоните позже или ожидайте ответа");
        }
    }

    public void dialing(int number) {
        if(number==0){
            throw new LineBusyException("Линия занята");
        } else {
            System.out.println("Длинные гудки, ждем ответа абонента");
        }

    }


    @Override
    public void answerCall() {
        System.out.println("Вам поступил входящий звонок!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilePhone that = (MobilePhone) o;
        return screenDiagonal == that.screenDiagonal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(screenDiagonal);
    }
}
