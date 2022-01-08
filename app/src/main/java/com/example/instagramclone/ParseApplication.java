package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LNpG00YWGZqlVF92dsbveS7vJGXdEuZh0EOl6yhK")
                .clientKey("1qTyYfsyJIkoa2XIIJo3Rv7OImZ6N6bIXQ0qkAYU")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
