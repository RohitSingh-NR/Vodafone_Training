package File_Handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteToFile_Using_BufferWriter{
    public static void main(String[] args)throws Exception {
        File file = new File("C:\\Users\\user\\Desktop\\pahse-I\\src\\File_Handling\\ConceptOfFileHandling.txt");
        /*
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
         */
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("Both FileWriter and BufferedWriter are useful classes for writing data to files in Java, but they serve different purposes and have different performance characteristics. The choice between them depends on the specific use case and requirements.\r\n" + //
                "\r\n" + //
                "FileWriter:\r\n" + //
                "FileWriter is a straightforward class that is used to write characters to a file. It is a subclass of Writer and offers a simple and convenient way to write data directly to a file. However, it lacks buffering, which means that every character is immediately written to the underlying file. This can result in a performance overhead if you are writing a large number of characters or making multiple small writes.\r\n" + //
                "\r\n" + //
                "BufferedWriter:\r\n" + //
                "BufferedWriter, on the other hand, is a class that wraps around other character streams, such as FileWriter, and adds buffering to improve performance. It provides an internal buffer that accumulates the data before writing it to the underlying file. This reduces the number of system calls and disk operations, resulting in faster write operations, especially when dealing with large amounts of data.\r\n" + //
                "\r\n" + //
                "To summarize:\r\n" + //
                "\r\n" + //
                "Use FileWriter when simplicity is your priority, and you are dealing with smaller amounts of data or if you don't have strict performance requirements.\r\n" + //
                "\r\n" + //
                "Use BufferedWriter when performance matters, and you are dealing with larger data sets or need to perform multiple writes in a more efficient way.\r\n" + //
                "\r\n" + //
                "Example usage of FileWriter:\r\n" + //
                "\r\n" + //
                "java\r\n" + //
                "Copy code\r\n" + //
                "try (FileWriter writer = new FileWriter(\"file.txt\")) {\r\n" + //
                "    writer.write(\"This is some text.\");\r\n" + //
                "    writer.write(\"This is another line.\");\r\n" + //
                "} catch (IOException e) {\r\n" + //
                "    e.printStackTrace();\r\n" + //
                "}\r\n" + //
                "Example usage of BufferedWriter with FileWriter:\r\n" + //
                "\r\n" + //
                "java\r\n" + //
                "Copy code\r\n" + //
                "try (BufferedWriter writer = new BufferedWriter(new FileWriter(\"file.txt\"))) {\r\n" + //
                "    writer.write(\"This is some text.\");\r\n" + //
                "    writer.write(\"This is another line.\");\r\n" + //
                "} catch (IOException e) {\r\n" + //
                "    e.printStackTrace();\r\n" + //
                "}\r\n" + //
                "In most cases, using BufferedWriter is recommended because it provides better performance. However, it's essential to close the writer properly using try-with-resources or explicitly invoking close() to ensure that any buffered data is flushed to the file and resources are released.\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "\r\n" + //
                "User\r\n" + //
                "which is better fileoutputstream or BufferedWriter class\r\n" + //
                "ChatGPT\r\n" + //
                "The choice between FileOutputStream and BufferedWriter depends on what you want to achieve and the type of data you are writing to the file.\r\n" + //
                "\r\n" + //
                "FileOutputStream:\r\n" + //
                "FileOutputStream is a class that is used to write binary data to a file. It is a subclass of OutputStream and offers a straightforward way to write raw bytes to a file. This class is useful when you need to write binary data, such as images, audio, or other non-textual data. It does not provide any character encoding, so it is not suitable for writing textual data directly unless you convert it to bytes explicitly.\r\n" + //
                "\r\n" + //
                "BufferedWriter:\r\n" + //
                "As mentioned earlier, BufferedWriter is used to write character data to a file. It wraps around other character streams, such as FileWriter, and adds buffering to improve performance. It is appropriate for writing text data, and it can handle character encoding to write text in various encodings.\r\n" + //
                "\r\n" + //
                "If you are writing textual data to a file, BufferedWriter is generally a better choice than FileOutputStream because it handles character encoding and buffering. This makes it more efficient when writing large amounts of text to the file, especially when performing multiple writes.\r\n" + //
                "\r\n" + //
                "Example usage of BufferedWriter:\r\n" + //
                "\r\n" + //
                "java\r\n" + //
                "Copy code\r\n" + //
                "try (BufferedWriter writer = new BufferedWriter(new FileWriter(\"file.txt\"))) {\r\n" + //
                "    writer.write(\"This is some text.\");\r\n" + //
                "    writer.write(\"This is another line.\");\r\n" + //
                "} catch (IOException e) {\r\n" + //
                "    e.printStackTrace();\r\n" + //
                "}\r\n" + //
                "On the other hand, if you are dealing with binary data and need to write raw bytes to a file, FileOutputStream is the appropriate choice. However, if you want buffering for binary data, you can use BufferedOutputStream in conjunction with FileOutputStream to achieve similar performance improvements.\r\n" + //
                "\r\n" + //
                "Example usage of FileOutputStream:\r\n" + //
                "\r\n" + //
                "java\r\n" + //
                "Copy code\r\n" + //
                "try (FileOutputStream fos = new FileOutputStream(\"data.bin\")) {\r\n" + //
                "    byte[] data = {0x01, 0x02, 0x03, 0x04};\r\n" + //
                "    fos.write(data);\r\n" + //
                "} catch (IOException e) {\r\n" + //
                "    e.printStackTrace();\r\n" + //
                "}\r\n" + //
                "To summarize:\r\n" + //
                "\r\n" + //
                "Use BufferedWriter when writing textual data to a file for better performance and character encoding handling.\r\n" + //
                "\r\n" + //
                "Use FileOutputStream when writing binary data to a file (e.g., images, audio) or when you need more control over writing raw bytes.\r\n" + //
                "\r\n" + //
                "In some cases, you may use a combination of both, such as when you need to write both text and binary data to a file.");
                bw.close();
        }
    }