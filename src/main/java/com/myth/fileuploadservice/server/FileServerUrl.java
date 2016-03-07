package com.myth.fileuploadservice.server;

import com.myth.retrofitextension.listeners.IServerUrl;

/**
 * Created by manish on 8/10/15.
 */
public enum FileServerUrl implements IServerUrl {

    // Do Not write any urls here.
    // All urls should be in res/urls.xml

    APP_SERVER, // app server
    CLOUDFRONT;

    //PATHS should be defiend as constants not enums

    public static final String FILE_UPLOAD = "/userfile/upload";


    String url;

    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
}
