package com.example.user.video;

import android.provider.BaseColumns;

/**
 * Created by User on 11/19/2015.
 */
public abstract class VideoEntry implements BaseColumns {
    public static final String TBL_NAME="video";
    public static final String COL_NAME_VIDEO_TITLE="Find your \"Secret Crush\" at the \"Red Wine & Chocolate\" event";
    public static final String COL_NAME_VIDEO_DESC="The 20th Annual \"Red Wine & Chocolate\" event is the weekend"
            +" of Valentine's Day with the \"Secret Crush\" event kicking things off Friday night, "
            +"the 13th. Wines from all over the Yakima Valley will be featured and each winery "
            +"will offer different activities throughout the weekend. Jordan Wilkerson went to one"
            +"of the participating tasting rooms to get the details.";
    public static final String COL_NAME_VIDEO_URL="http://www.keprtv.com/news/kickstart-with-kelley/Find-your-Secret-Crush-at-the-Red-Wine--"
            +"Chocolate-event-291734841.html?tab=video&c=y";
}
