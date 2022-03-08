package com.example.instagramclone;

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
                .applicationId("escbcGCkti21JgtePpvvfKTG8Ll3ow6Y4AVFFXGS")
                .clientKey("IGXLYbgeX3JSiC5r8kFUbM2unfzHChMZnsKn5DcN")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
