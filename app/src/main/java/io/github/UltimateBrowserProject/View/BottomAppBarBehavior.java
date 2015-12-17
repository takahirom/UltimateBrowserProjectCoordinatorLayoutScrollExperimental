package io.github.UltimateBrowserProject.View;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;

public class BottomAppBarBehavior extends AppBarLayout.Behavior {

    private int appBarHeight;

    public BottomAppBarBehavior() {
        super();
    }

    public BottomAppBarBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onLayoutChild(CoordinatorLayout parent, AppBarLayout abl, int layoutDirection) {
        appBarHeight = abl.getMeasuredHeight();
        return super.onLayoutChild(parent, abl, layoutDirection);
    }

    @Override
    public boolean setTopAndBottomOffset(int offset) {
        return super.setTopAndBottomOffset(offset + appBarHeight);
    }

    @Override
    public int getTopAndBottomOffset() {
        return super.getTopAndBottomOffset() - appBarHeight;
    }
}
