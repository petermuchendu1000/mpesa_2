package com.huawei.digitalpayment.consumer.fixeddata.di;

import com.huawei.digitalpayment.consumer.fixeddata.data.FixedDataRepositoryImpl;
import com.huawei.digitalpayment.consumer.fixeddata.data.HomeWirelessRepositoryImpl;
import com.huawei.digitalpayment.consumer.fixeddata.data.ManageAccountRepositoryImpl;
import com.huawei.digitalpayment.consumer.fixeddata.data.mapper.AccountDetailsUiMapper;
import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.FixedDataRepository;
import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.HomeWirelessRepository;
import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.ManageAccountRepository;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.HomeWirelessViewModel;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000bH\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0007¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/di/FixedDataModule;", "", "<init>", "()V", "provideHomeFibreRepository", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/FixedDataRepository;", "provideHomeWirelessRepository", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/HomeWirelessRepository;", "provideManageAccountRepository", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/ManageAccountRepository;", "provideAccountDetailsUiMapper", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/mapper/AccountDetailsUiMapper;", "provideFixedDataViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "fixedDataRepository", "accountDetailsUiMapper", "provideHomeWirelessViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/HomeWirelessViewModel;", "homeWirelessRepository", "provideManageAccountViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/ManageAccountViewModel;", "manageAccountRepository", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class FixedDataModule {
    public static final int $stable = 0;
    public static final FixedDataModule INSTANCE = new FixedDataModule();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;

    private FixedDataModule() {
    }

    @Provides
    @Singleton
    public final FixedDataRepository provideHomeFibreRepository() {
        int i = 2 % 2;
        FixedDataRepositoryImpl fixedDataRepositoryImpl = new FixedDataRepositoryImpl();
        int i2 = copydefault + 121;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
        return fixedDataRepositoryImpl;
    }

    @Provides
    @Singleton
    public final HomeWirelessRepository provideHomeWirelessRepository() {
        int i = 2 % 2;
        HomeWirelessRepositoryImpl homeWirelessRepositoryImpl = new HomeWirelessRepositoryImpl();
        int i2 = ShareDataUIState + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return homeWirelessRepositoryImpl;
    }

    @Provides
    @Singleton
    public final ManageAccountRepository provideManageAccountRepository() {
        int i = 2 % 2;
        ManageAccountRepositoryImpl manageAccountRepositoryImpl = new ManageAccountRepositoryImpl();
        int i2 = ShareDataUIState + 63;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return manageAccountRepositoryImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final AccountDetailsUiMapper provideAccountDetailsUiMapper() {
        int i = 2 % 2;
        AccountDetailsUiMapper accountDetailsUiMapper = new AccountDetailsUiMapper();
        int i2 = copydefault + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return accountDetailsUiMapper;
    }

    @Provides
    @Singleton
    public final FixedDataViewModel provideFixedDataViewModel(FixedDataRepository fixedDataRepository, AccountDetailsUiMapper accountDetailsUiMapper) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fixedDataRepository, "");
        Intrinsics.checkNotNullParameter(accountDetailsUiMapper, "");
        FixedDataViewModel fixedDataViewModel = new FixedDataViewModel(fixedDataRepository, accountDetailsUiMapper);
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return fixedDataViewModel;
    }

    @Provides
    @Singleton
    public final HomeWirelessViewModel provideHomeWirelessViewModel(HomeWirelessRepository homeWirelessRepository, AccountDetailsUiMapper accountDetailsUiMapper) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(homeWirelessRepository, "");
        Intrinsics.checkNotNullParameter(accountDetailsUiMapper, "");
        HomeWirelessViewModel homeWirelessViewModel = new HomeWirelessViewModel(homeWirelessRepository, accountDetailsUiMapper);
        int i2 = copydefault + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return homeWirelessViewModel;
    }

    @Provides
    @Singleton
    public final ManageAccountViewModel provideManageAccountViewModel(ManageAccountRepository manageAccountRepository) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(manageAccountRepository, "");
        ManageAccountViewModel manageAccountViewModel = new ManageAccountViewModel(manageAccountRepository);
        int i2 = copydefault + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return manageAccountViewModel;
    }

    static {
        int i = component2 + 77;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 11 / 0;
        }
    }
}
