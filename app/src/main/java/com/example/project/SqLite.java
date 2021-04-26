package com.example.project;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqLite extends SQLiteOpenHelper {
    private static final String dbname="project";
    private static  final int version = 1;


    public SqLite(Context myContext)
    {
        super(myContext,dbname,null,1);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "Create table users(userid int primary key,firstname varchar(30),lastname varchar(30),email varchar(30),phonenumber varchar(30))";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insert(SQLiteDatabase db,User u)
    {
        String url = "Insert into users values("+u.getUserId()+","+u.getFirstname()+","+u.getLastname()+","+u.getEmailaddress()+","+u.getPhoneNumber()+")";
        db.execSQL(url);
    }
    public void update(SQLiteDatabase db,String fname,String newname,int id)
    {
        String url = "update from users set firstname = "+newname+"";
        db.execSQL(url);
    }
    public void delete(SQLiteDatabase db, int id)
    {
        String url = "update from users where users.userid="+id;
        db.execSQL(url);

    }
}
