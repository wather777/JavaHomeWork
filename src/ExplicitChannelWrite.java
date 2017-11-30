import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by s_chernykh on 28.04.2017.
 */
public class ExplicitChannelWrite {
    public static void main(String[] args) {


            try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"),StandardOpenOption.READ,StandardOpenOption.WRITE)) {

                MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);


                for (int i = 0; i < 26; i++) {
                    mBuf.put((byte) ('A' + i));

                }

                for (int i = 0; i < 3; i++) {
                    mBuf.rewind();

                    fChan.write(mBuf);

                }


            } catch (IOException e1) {
                e1.printStackTrace();
            }
    }

    }

