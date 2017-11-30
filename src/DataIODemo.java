/**
 * Created by s_chernykh on 26.04.2017.
 */
import java.io.*;
import java.net.Inet4Address;
import java.net.InetAddress;

public class DataIODemo {
    public static void main(String[] args) {
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat")))

        {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        }catch (FileNotFoundException e)
        {
            System.out.println("Can't open file");
            return;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat")))
        {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.printf("Info %d %b %f \n",i,b,d);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
