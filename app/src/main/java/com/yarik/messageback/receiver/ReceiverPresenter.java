package com.yarik.messageback.receiver;

import android.support.annotation.NonNull;

import com.yarik.messageback.MBContext;
import com.yarik.messageback.mvp.Presenter;

/**
 * <br>
 * XYRALITY GmbH 2015, BkAndroidClient
 *
 * @author Yaroslav Volynskyi
 * @since 22/03/17.
 */

public class ReceiverPresenter extends Presenter<IReceiverView> {

    public ReceiverPresenter(@NonNull final MBContext context) {
        super(context);
    }

    @Override
    protected void onViewAttached() {

    }

    @Override
    protected void onViewDetached() {

    }
}
