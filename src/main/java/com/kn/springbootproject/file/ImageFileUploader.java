package com.kn.springbootproject.file;

import com.kn.springbootproject.file.image.ImageProcessor;

public class ImageFileUploader implements FileUploader {
    private final ImageProcessor processor;

    public ImageFileUploader(ImageProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void upload(String type, byte[] data) {
        if(!type.contains("image"))
            throw new RuntimeException("Unsupported file type!");
        processor.process(data);
    }
}
