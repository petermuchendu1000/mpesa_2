package com.safaricom.consumer.commons.offline;

import dagger.internal.Factory;

public final class OfflineModeRepository_Factory implements Factory<OfflineModeRepository> {
    @Override
    public OfflineModeRepository get() {
        return newInstance();
    }

    public static OfflineModeRepository_Factory create() {
        return copydefault.ShareDataUIState;
    }

    public static OfflineModeRepository newInstance() {
        return new OfflineModeRepository();
    }

    static final class copydefault {
        static final OfflineModeRepository_Factory ShareDataUIState = new OfflineModeRepository_Factory();

        private copydefault() {
        }
    }
}
