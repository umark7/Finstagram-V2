package com.codepath.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("vXKmYt8fJaD9BFvzDnrZW21vaaq9z7dJEeACmigg")
                .clientKey("knTA0n9YQLMD2fsR5wUec6J1nqlqE2Fc47k1831r")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
