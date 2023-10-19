
public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone1 = new MobilePhone(5,"чёрный",2010);
        MobilePhone mobilePhone2 = new MobilePhone(5,"чёрный",2010);
        LandLinePhone landLinePhone = new LandLinePhone(15);

        int a = 5;
        int b = 5;
        System.out.println(a==b);
        System.out.println(mobilePhone1==mobilePhone2);
        System.out.println(mobilePhone1);
        System.out.println(mobilePhone2);
        System.out.println(mobilePhone1.equals(mobilePhone2));

        mobilePhone1.call(0);
    }
}

