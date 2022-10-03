package hi;

public class Personaldetail {

    String  name = "kashvi";
    int age= 10;
    String address = "182 brige road,wembley,ha07qg";
    String dateofbirth ="18-2-2001";

    public static void main(String[] args) {
        Personaldetail pdetail = new Personaldetail();
        System.out.println("Address: "+(pdetail.address));
        System.out.println(pdetail.age);
        System.out.println(pdetail.name);
        System.out.println(pdetail.dateofbirth);
    }
}
