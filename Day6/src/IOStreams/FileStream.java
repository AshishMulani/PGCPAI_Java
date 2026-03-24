package IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;

public class FileStream {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        FileReader inreader =null;
        FileWriter outWriter =null;

        try{
             in = new FileInputStream("infile.txt");
              out = new FileOutputStream("outfile.txt");

        int v;
        while((v=in.read()) != -1){
            out.write(v);

        }
        in.close();
        out.close();

        inreader = new FileReader("infile.txt");
        outWriter= new FileWriter("outfile.txt");

        v=0;
        while((v=inreader.read())!=-1) {
            outWriter.write(v);
        }

    } catch (IOException e) {
            throw new RuntimeException(e);
        }
}
}
