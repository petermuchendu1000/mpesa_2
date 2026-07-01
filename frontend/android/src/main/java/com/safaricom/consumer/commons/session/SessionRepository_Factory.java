package com.safaricom.consumer.commons.session;

import dagger.internal.Factory;

public final class SessionRepository_Factory implements Factory<SessionRepository> {
    @Override
    public SessionRepository get() {
        return newInstance();
    }

    public static SessionRepository_Factory create() {
        return copydefault.component1;
    }

    public static SessionRepository newInstance() {
        return new SessionRepository();
    }

    static final class copydefault {
        static final SessionRepository_Factory component1 = new SessionRepository_Factory();

        private copydefault() {
        }
    }
}
