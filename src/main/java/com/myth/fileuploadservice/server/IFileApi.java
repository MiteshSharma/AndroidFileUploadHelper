package com.myth.fileuploadservice.server;

import com.myth.fileuploadservice.server.FileServerUrl;
import com.myth.retrofitextension.server.ResponseCallbackHandler;

import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedFile;

/**
 * Created by mitesh on 19/10/15.
 */
public interface IFileApi {

    @Multipart
    @POST(FileServerUrl.FILE_UPLOAD)
    void upload(@Part("file") TypedFile file, @Part("title") String name, @Part("description") String description, ResponseCallbackHandler cr);
}
