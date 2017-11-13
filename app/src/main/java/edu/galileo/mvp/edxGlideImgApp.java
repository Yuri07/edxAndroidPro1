package edu.galileo.mvp;

import android.app.Application;

import edu.galileo.mvp.lib.GlideImageLoader;
import edu.galileo.mvp.lib.ImageLoader;

/**
 * Created by yuri_ on 13/11/2017.
 */

public class edxGlideImgApp extends Application{

    private ImageLoader imageLoader;

    @Override
    public void onCreate() {
        super.onCreate();
        setupImageLoader();
    }

    private void setupImageLoader() {
        imageLoader = new GlideImageLoader(this);
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }

}
