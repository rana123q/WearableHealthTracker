package com.example.rana_jabareen.wearablehealthtracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.HashMap;


public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "WHT.db";
    public static final String LOCATION_TABLE_NAME = "Location";
    public static final String HEART_TABLE_NAME = "HeartRate";
    public static final String TEMPERATURE_TABLE_NAME = "Temperature";

    public static final String Heart_COLUMN_ID = "HeartID";
    public static final String Heart_COLUMN_Value = "Value";
    public static final String Heart_COLUMN_ValueDate = "ValueDate";
    public static final String Heart_COLUMN_ValueTime = "ValueTime";
    public static final String Heart_COLUMN_UploadFlag = "UploadFlag";
    public static final String Heart_COLUMN_DownloadFlag = "DownloadFlag";

    public static final String Heart_COLUMN_PatientID = "PatientID";
    public static final String TEMPERATURE_COLUMN_ID = "TemperatureID";
    public static final String TEMPERATURE_COLUMN_Value = "Value";
    public static final String TEMPERATURE_COLUMN_ValueDate = "ValueDate";
    public static final String TEMPERATURE_COLUMN_ValueTime = "ValueTime";
    public static final String TEMPERATURE_COLUMN_PatientID = "PatientID";
    public static final String TEMPERATURE_COLUMN_UploadFlag = "UploadFlag";
    public static final String TEMPERATURE_COLUMN_DownloadFlag = "DownloadFlag";

    public static final String LOCATION_COLUMN_ID = "LocationID";
    public static final String Longitude_COLUMN_Value = "Longitude";
    public static final String Latitude_COLUMN_Value = "Latitude";
    public static final String LOCATION_COLUMN_ValueDate = "ValueDate";
    public static final String LOCATION_COLUMN_ValueTime = "ValueTime";
    public static final String LOCATION_COLUMN_PatientID = "PatientID";
    public static final String LOCATION_COLUMN_UploadFlag = "UploadFlag";
    public static final String LOCATION_COLUMN_DownloadFlag = "DownloadFlag";

    private HashMap hp;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "create table HeartRate " +
                        "(HeartID integer primary key  AUTOINCREMENT , Value REAL,ValueDate text, UploadFlag integer,DownloadFlag integer)"
        );

        db.execSQL(
                "create table Temperature " +
                        "(TemperatureID integer primary key AUTOINCREMENT , Value REAL,ValueDate text, UploadFlag integer,DownloadFlag integer)"
        );

        db.execSQL(
                "create table Location " +
                        "(LocationID integer primary key AUTOINCREMENT , Longitude REAL,Latitude REAL,ValueDate text, UploadFlag integer,DownloadFlag integer)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS Temperature");
        db.execSQL("DROP TABLE IF EXISTS Location");
        db.execSQL("DROP TABLE IF EXISTS HeartRate");

        onCreate(db);
    }

    public void insertLocation(double Longitude, double Latitude, String ValueDate) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Longitude", Longitude);
        contentValues.put("Latitude", Latitude);
        contentValues.put("ValueDate", ValueDate);
        contentValues.put("UploadFlag", 0);  // 0 false  // 1 true
        contentValues.put("DownloadFlag", 0);
        db.insert("Location", null, contentValues);

    }

    public Cursor getLocation() {
        SQLiteDatabase db = this.getReadableDatabase();
        final String MY_QUERY = "select * from Location";
        Cursor res = db.rawQuery(MY_QUERY, null);
        return res;
    }


}
