package com.myth.fileuploadservice.server;

import com.google.gson.reflect.TypeToken;
import com.myth.retrofitextension.ServerCallBuilder;
import com.myth.retrofitextension.listeners.ResponseCallbackListener;
import com.myth.retrofitextension.server.ResponseCallbackHandler;

import java.io.File;

import retrofit.mime.TypedFile;

/**
 * Created by mitesh on 17/08/15.
 */
public class FileServerApi {

    public static void uploadFile(String filePath, String name, String description, ResponseCallbackListener callbackListener) {
        IFileApi fileApi = ServerCallBuilder.getInstance().getServerApi(IFileApi.class);
        ResponseCallbackHandler cr = new ResponseCallbackHandler(callbackListener, new TypeToken<Long>(){}.getType());
        TypedFile typedFile = new TypedFile("multipart/form-data", new File(filePath));
        fileApi.upload(typedFile, name, description, cr);
    }

}