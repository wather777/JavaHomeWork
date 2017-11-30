/**
 * Created by s_chernykh on 27.04.2017.
 */

import java.io.*;
import java.nio.*;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;

        Path filepath = null;




        try (SeekableByteChannel fChan =  Files.newByteChannel(Paths.get("testx.txt"))) {

            ByteBuffer mBuf = ByteBuffer.allocate(3);

            do {
                count = fChan.read(mBuf);
                if (count != 1) {
                    mBuf.rewind();
                    System.out.println("d");

                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);

            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
