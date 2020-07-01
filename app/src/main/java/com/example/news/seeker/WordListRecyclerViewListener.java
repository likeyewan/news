package com.example.news.seeker;

import android.view.View;

import com.example.news.bean.WordList;

/**
 * Created by ${WLX} on 2019/6/24.
 */

public interface WordListRecyclerViewListener {
    void onItemClick(View view, WordList wordList);

    void onItemLongClick(View view, WordList wordList);
}
