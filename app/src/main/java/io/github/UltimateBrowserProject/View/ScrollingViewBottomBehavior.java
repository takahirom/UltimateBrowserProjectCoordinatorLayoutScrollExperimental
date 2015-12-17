package io.github.UltimateBrowserProject.View;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

public class ScrollingViewBottomBehavior extends AppBarLayout.ScrollingViewBehavior {

        private int appBarHeight;

        public ScrollingViewBottomBehavior() {
        }

        public ScrollingViewBottomBehavior(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        @Override
        public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
            appBarHeight = dependency.getMeasuredHeight();
            return super.onDependentViewChanged(parent, child, dependency);
        }

        @Override
        public boolean setTopAndBottomOffset(int offset) {
            return super.setTopAndBottomOffset(offset - appBarHeight);
        }
    }