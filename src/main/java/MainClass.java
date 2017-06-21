
import DownloadPackage.FileInfo;
import DownloadPackage.DownloadFile;

public class MainClass {
    public static void main(String[] args) {
        String filename;
        String fileurl;
        String filedir;
        if (args.length != 3) {
            System.out.println("Wrong number of arguments. Notice: URL Directory Filename");
            System.exit(0);
        }
        fileurl = args[0];
        filedir = args[1];
        filename = args[2];
        System.out.println("FILE URL: " + fileurl);
        System.out.println("DIRECTORY: " + filedir);
        System.out.println("FILE NAME: " + filename);
        System.out.println();
        FileInfo fileInfo = new FileInfo(fileurl, filename);
        DownloadFile newDownload = new DownloadFile();
        newDownload.downloadFile(fileInfo, filedir);
        System.out.println(newDownload.getFileStatus());

    }

}
