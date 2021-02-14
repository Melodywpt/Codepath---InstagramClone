package com.example;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("aL04Jmyz82gpDLsUBfXV5SPDgGGwB4MyOlnLDABj")
                .clientKey("aerjbQIXVfc6z5KdpP0w0IjtHApW7rXuiNpw5UNp")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
