package com.example.news.seeker;

import android.view.View;

import com.example.news.bean.Note;

/**
 * Created by ${WLX} on 2019/4/22.
 */

public interface RecycylerViewListener {
    void onItemClick(View view, Note note);

    void onItemLongClick(View view, Note note);
}
