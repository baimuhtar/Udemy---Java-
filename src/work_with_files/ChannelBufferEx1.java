package work_with_files;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
        FileChannel channel = file.getChannel();) {

            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stix = new StringBuilder();

            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read " + byteRead);

                buffer.flip();

                while (buffer.hasRemaining()) {
                    stix.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(stix);
            String text = "\n There only two ways to live your life.";

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);


//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer.put(text.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);
//




        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}