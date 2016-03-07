package com.myth.fileuploadservice;

import com.myth.basehandler.BaseServerHandler;
import com.myth.basehandler.listeners.IEventListener;
import com.myth.fileuploadservice.pojo.FileEventType;
import com.myth.fileuploadservice.server.FileServerApi;

/**
 * Created by mitesh on 19/10/15.
 */
public class FileServerHandler extends BaseServerHandler implements IFileHandler {

    public FileServerHandler(IEventListener listener) {
        super(listener);
    }

    @Override
    public void uploadFile(String filePath, String name, String description) {
        this.startEvent(FileEventType.FILE_UPLOAD);
        FileServerApi.uploadFile(filePath, name, description, this);
    }
}
