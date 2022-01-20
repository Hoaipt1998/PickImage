package com.android30112021.apppickimage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImageModel {
    private int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ImageModel{" +
                "image=" + image +
                '}';
    }

    public ImageModel(int image) {
        this.image = image;
    }
    public  static List<ImageModel> getmock(){
        return  new ArrayList<>(Arrays.asList(
                new ImageModel(R.drawable.bo),
                new ImageModel(R.drawable.bocanhcung),
                new ImageModel(R.drawable.bongua),
                new ImageModel(R.drawable.heo),
                new ImageModel(R.drawable.ech),
                new ImageModel(R.drawable.cachep),
                new ImageModel(R.drawable.chimcanhcut),
                new ImageModel(R.drawable.cachep),
                new ImageModel(R.drawable.chodom),
                new ImageModel(R.drawable.chuonchuon),
                new ImageModel(R.drawable.khi),
                new ImageModel(R.drawable.meoden),
                new ImageModel(R.drawable.meolucky),
                new ImageModel(R.drawable.meotrang),
                new ImageModel(R.drawable.rua),
                new ImageModel(R.drawable.soi),
                new ImageModel(R.drawable.voi)


        ));
    }
}
