package com.yarik.messageback.mvp;

import android.support.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * <br>
 * XYRALITY GmbH 2015, BkAndroidClient
 *
 * @author Yaroslav Volynskyi
 * @since 22/03/17.
 */

public class PresentersHolder {
    public interface CreatePresenterAction<P extends Presenter<V>, V extends IPresenterView> {
        P create();
    }

    private static PresentersHolder         instance = null;
    private final Map<String, Presenter<?>> mPresentersMap;

    public static PresentersHolder getInstance() {
        if (instance == null) {
            synchronized (PresentersHolder.class) {
                if (instance == null) {
                    instance = new PresentersHolder();
                }
            }
        }
        return instance;
    }

    private PresentersHolder() {
        mPresentersMap = new HashMap<>();
    }

    public String getNextId() {
        return UUID.randomUUID().toString();
    }

    @SuppressWarnings("unchecked")
    public <P extends Presenter<V>, V extends IPresenterView> P getOrCreate(@NonNull final String presenterId, @NonNull final CreatePresenterAction<P, V> createPresenterAction) {
        P presenter = (P) mPresentersMap.get(presenterId);
        if (presenter == null) {
            presenter = createPresenterAction.create();
            mPresentersMap.put(presenterId, presenter);
        }
        return presenter;
    }

    public void removePresenter(@NonNull final String uuid) {
        mPresentersMap.remove(uuid);
    }
}
