package com.safaricom.consumer.commons.preference;

import dagger.internal.Factory;

public final class UserPreferencesRepository_Factory implements Factory<UserPreferencesRepository> {
    @Override
    public UserPreferencesRepository get() {
        return newInstance();
    }

    public static UserPreferencesRepository_Factory create() {
        return component2.copydefault;
    }

    public static UserPreferencesRepository newInstance() {
        return new UserPreferencesRepository();
    }

    static final class component2 {
        static final UserPreferencesRepository_Factory copydefault = new UserPreferencesRepository_Factory();

        private component2() {
        }
    }
}
