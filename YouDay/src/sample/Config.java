package sample;

import com.dropbox.core.DbxRequestConfig;

public class Config {
    public static String TOKEN = "XXX";
    public static DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
    protected String bdHost = "localhost";
    protected String bdPort = "3310";
    protected String bdUser = "root";
    protected String bdPass = "1234";
    protected String bdName = "logforscreen";

}
