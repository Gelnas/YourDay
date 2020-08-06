package sample;

import com.dropbox.core.DbxRequestConfig;

public class Config {
    public static String TOKEN = "3h5KwXERRHAAAAAAAAAARRdQbxkNashPY7zNupJnFNoBssV1qJw-enBy1ofpDc-D";
    public static DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
    protected String bdHost = "localhost";
    protected String bdPort = "3310";
    protected String bdUser = "root";
    protected String bdPass = "1234";
    protected String bdName = "logforscreen";

}