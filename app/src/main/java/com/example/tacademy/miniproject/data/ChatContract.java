package com.example.tacademy.miniproject.data;

import android.provider.BaseColumns;

/**
 * Created by Tacademy on 2016-08-11.
 */
public class ChatContract {
    public interface ChatUser extends BaseColumns{
        public static final String TABLE = "chatuser";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_ = "s";
        public static final String COLUMN_EMAIL = "email";
        public static final String COLUMN_LAST_MESSAGE_ID = "lastid";
    }
    public interface ChatMessage extends BaseColumns{

    }
}
