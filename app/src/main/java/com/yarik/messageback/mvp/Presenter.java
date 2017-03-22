package com.yarik.messageback.mvp;

import android.support.annotation.NonNull;

import com.yarik.messageback.MBContext;

/**
 * <br>
 * XYRALITY GmbH 2015, BkAndroidClient
 *
 * @author Yaroslav Volynskyi
 * @since 22/03/17.
 */

public abstract class Presenter<V extends IPresenterView> {

    protected MBContext mContext;
    private V mView;

    public Presenter(@NonNull final MBContext context) {
        mContext = context;
    }

    final void attach(@NonNull V view) {
        mView = view;
        onViewAttached();
    }

    final void detach() {
        onViewDetached();
        mView = null;
    }

    protected final V getView() {
        return mView;
    }

    void destroy() {

    }

    protected final boolean hasView() {
        return mView != null;
    }

    protected abstract void onViewAttached();

    protected abstract void onViewDetached();

    protected void onDestroy() {

    }
}
