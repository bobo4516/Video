package com.example.user.video;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 11/19/2015.
 */
public class VideoHelper extends SQLiteOpenHelper {
    public static final int DB_VERSION=1;
    public static final String DB_NAME="video.db";
    private static final String SQL_CREATE_ENTRIES="CREATE TABLE "
            +VideoEntry.TBL_NAME+" ("+
            VideoEntry._ID+" INTEGER PRIMARY KEY, "+
            VideoEntry.COL_NAME_VIDEO_TITLE+" TEXT, "+
            VideoEntry.COL_NAME_VIDEO_DESC+" TEXT, "+
            VideoEntry.COL_NAME_VIDEO_URL+" TEXT);";
    private static final String SQL_DELETE_ENTRIES=
            "DROP TABLE IF EXISTS "+VideoEntry.TBL_NAME;
    public VideoHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public Video getVideoData(){
        String Table_Name=VideoEntry.TBL_NAME;

        String selectQuery = "SELECT  * FROM " + Table_Name;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        Video video = null;
        if (cursor.moveToFirst()) {
            do {
                video.setTitle(cursor.getString(1));
                video.setTitle(cursor.getString(2));
                video.setTitle(cursor.getString(3));
            } while (cursor.moveToNext());
        }
        db.close();
        return video;
    }
}
