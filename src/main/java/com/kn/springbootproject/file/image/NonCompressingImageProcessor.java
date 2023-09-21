package com.kn.springbootproject.file.image;

public class NonCompressingImageProcessor implements ImageProcessor {
    @Override
    public byte[] process(byte[] data) {
        return data;
    }
}
