package com.example.xyzreader.ui;

import android.support.v7.widget.RecyclerView;

/**
 * Created by todd on 5/24/16.
 * https://mzgreen.github.io/2015/02/15/How-to-hideshow-Toolbar-when-list-is-scroling(part1)/
 */

public abstract class HidingScrollListener extends RecyclerView.OnScrollListener {
    private static final int HIDE_THRESHOLD = 20;
    private int scrolledDistance = 0;
    private boolean controlsVisible = true;

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        if((controlsVisible && dy>0) || (!controlsVisible && dy<0)) {
            scrolledDistance += dy;
            onScroll(scrolledDistance);
        }
    }

    public abstract void onScroll(int scrolledDistance);

}
