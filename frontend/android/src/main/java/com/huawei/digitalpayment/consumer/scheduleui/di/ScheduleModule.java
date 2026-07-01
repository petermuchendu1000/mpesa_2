package com.huawei.digitalpayment.consumer.scheduleui.di;

import com.huawei.digitalpayment.consumer.schedule.model.ISchedulePaymentModel;
import com.huawei.digitalpayment.consumer.schedule.model.SchedulePaymentModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class ScheduleModule {
    @Binds
    public abstract ISchedulePaymentModel bindISchedulePaymentModel(SchedulePaymentModel schedulePaymentModel);
}
