package com.example.ibasu.databaseplay.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ibasu on 02/10/2016.
 */

public class DBOpenHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;



    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA = " ,";

    private static final String CREATE_SCHOOL_TABLE = "CREATE TABLE "
            + DatabaseContract.DBEntry.TABLE_NAME + " ("
            + DatabaseContract.DBEntry.COLUMN_NAME_TEACHER + COMMA
            + DatabaseContract.DBEntry.COLUMN_NAME_SCORE + COMMA + " )";



    public static final String DROP_SCHOOL_TABLE = "DROP TABLE IF EXISTS "+ DatabaseContract.DBEntry.TABLE_NAME;

    public DBOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_SCHOOL_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_SCHOOL_TABLE);
        onCreate(sqLiteDatabase);


    }
}
