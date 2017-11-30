import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by s_chernykh on 28.04.2017.
 */
public class MappedChannelRead {
    public static void main(String[] args) {
        try (FileChannel fChan = ((FileChannel) Files.newByteChannel(Paths.get("testx.txt")))) {
            long fSize = fChan.size();

            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            for (int i = 0; i < fSize; i++) {
                System.out.println(Integer.toBinaryString(mBuf.get()));


            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
