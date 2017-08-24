package Problems.Chapter18_InputOutputSystem.l_ObjectSerialization;

import java.io.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author SashaKhyzhun on 8/24/17.
 * Page 796.
 * Демонстрация ключевого слова transient.
 */
public class Logon implements Serializable {

    private Date date = new Date();
    private String username;
    private transient String password;

    public Logon(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "logon info: "
                + "\n     date    : " + date
                + "\n     username: " + username
                + "\n     password: " + password;
    }


    public static void main(String[] args) throws Exception {
        Logon a = new Logon("Hulk", "MyLittlePony228");
        System.out.println("logon a = " + a);

        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Logon.out"));
        o.writeObject(a);
        o.close();

        System.out.println("=======================================");
        TimeUnit.SECONDS.sleep(1); // Задержка
        // Теперь получаем объект обратно:
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Logon.out"));
        System.out.println("Recovering object at " + new Date());
        System.out.println("=======================================");
        a = (Logon)in.readObject();
        System.out.println("logon a = " + a);

    }

}
