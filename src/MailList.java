import java.util.LinkedList;

/**
 * Created by s_chernykh on 18.04.2017.
 */

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;


    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return  name + "\n"+street+"\n"+city+" "+state+" "+code;
    }
}


public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<Address>();

        ml.add(new Address("Иванов Г.В.","Красный 95","Новосибирск","НСО","2143"));
        ml.add(new Address("Петров П.В.","Какаятоулица 235","Залупинск","Таежная область","234324234"));
        ml.add(new Address("Сидоров К.В.","Ленина 2","Москва","Московская область","213"));

        for (Address e:ml
             ) {
            System.out.println(e + "\n");

            System.out.println();

        }
    }

}
