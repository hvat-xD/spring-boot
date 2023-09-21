package com.kn.springbootproject.file;

public interface FileUploader {
    void upload(String type, byte[] data);
}
