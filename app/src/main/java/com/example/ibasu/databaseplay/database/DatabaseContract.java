package com.example.ibasu.databaseplay.database;

import android.provider.BaseColumns;

/**
 * Created by ibasu on 01/10/2016.
 */

public final class DatabaseContract {

    public static final String DB_NAME =  "Basu.db";

    private DatabaseContract() {}


    public static class DBEntry implements BaseColumns {
        public static final String TABLE_NAME = "school_table";
        public static final String COLUMN_NAME_TEACHER = "teacher";
        public static final String COLUMN_NAME_SCORE = "score";

    }
}
