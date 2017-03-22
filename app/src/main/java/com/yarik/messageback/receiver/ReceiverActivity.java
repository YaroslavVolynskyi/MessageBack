package com.yarik.messageback.receiver;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.yarik.messageback.MBContext;
import com.yarik.messageback.R;
import com.yarik.messageback.mvp.PresenterActivity;

import butterknife.ButterKnife;

/**
 * <br>
 * XYRALITY GmbH 2015, BkAndroidClient
 *
 * @author Yaroslav Volynskyi
 * @since 22/03/17.
 */

public class ReceiverActivity extends PresenterActivity<ReceiverPresenter, IReceiverView> implements IReceiverView {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @NonNull
    @Override
    protected ReceiverPresenter onCreatePresenter(@NonNull final MBContext context) {
        return new ReceiverPresenter(context);
    }

    @Override
    protected IReceiverView getPresenterView() {
        return this;
    }
}
