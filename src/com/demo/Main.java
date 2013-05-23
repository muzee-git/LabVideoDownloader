package com.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
    
    static Log logger = LogFactory.getLog(Main.class);

    public static void main(String[] args) {

        if (args == null || args.length != 2) {
            logger.warn("It needs two args: filename and video-url");
            return;
        }

        String filename = args[0];
        String youtubeUrl = args[1];

        VideoUrlParser parser = new VideoUrlParser();
        String url = parser.parse(youtubeUrl);

        if (url != null) {
            VideoDownloader downloader = new VideoDownloader();
            downloader.saveVideo(filename, url);
        }
    }
}
