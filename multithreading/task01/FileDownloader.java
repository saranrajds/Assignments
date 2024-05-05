package multithreading.task01;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class FileDownloader {

	public static void main(String[] args) {
 		
 		String fileURL = "https://masstamilan.com.in/download/hash/78073";
 		String downloadePath = "C:\\Users\\admin\\Desktop\\sample\\mysong.mp3";

        FileDownload downloader = new FileDownload(fileURL, downloadePath);
        downloader.start();
        
        try {
            Thread.sleep(10000);
            downloader.stopDownload();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
