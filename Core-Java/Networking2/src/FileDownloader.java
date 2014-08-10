import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class FileDownloader {
    public static void main(String[] args) {
        try {
            FileDownloader downloader = new FileDownloader();
            downloader.download("http://media.very.co.uk/i/very/A301P_SP268_02_2CJG7c?$70x93_standard$", "C:/Users/IVAN/Desktop");
        } catch (IOException e) { 
         e.printStackTrace();
        }
    }

    private void download(String fileURL, String destinationDirectory) throws IOException {
        String downloadedFileName = fileURL.substring(fileURL.lastIndexOf("/") + 1);
        URL url = new URL(fileURL);
        InputStream input = url.openStream();
        FileOutputStream output = new FileOutputStream(destinationDirectory + "/" + downloadedFileName);
        byte[] buffer = new byte[4096];
        int bytesRead = 0;
        System.out.print("Downloading... " + downloadedFileName);
        while ((bytesRead = input.read(buffer)) != -1) {
            System.out.print(".");
            output.write(buffer,0,bytesRead);
        }
        output.close();
        input.close();
    }
}

