package com.example.user.video;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.user.video.R;

public class VideoActivity extends AppCompatActivity {
    VideoView video;
    TextView desc;
    TextView title;
    Video data;
    VideoHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        video=(VideoView)findViewById(R.id.video);
        desc=(TextView)findViewById(R.id.desc);
        title=(TextView)findViewById(R.id.title);
        dbHelper=new VideoHelper(VideoActivity.this);
        data=dbHelper.getVideoData();
        video.setVideoPath(data.getUrl());
        desc.setText(data.getDesc());
        title.setText(data.getTitle());
        dbHelper.close();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_video, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
