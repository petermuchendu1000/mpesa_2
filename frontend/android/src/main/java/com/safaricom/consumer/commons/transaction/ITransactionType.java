package com.safaricom.consumer.commons.transaction;

import android.os.Parcelable;
import com.iap.ac.android.rpc.constant.BodyFields;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/safaricom/consumer/commons/transaction/ITransactionType;", "Landroid/os/Parcelable;", BodyFields.OPERATION_TYPE, "", "getOperationType", "()I", "operationName", "", "getOperationName", "()Ljava/lang/String;", "usesMsisdn", "", "hasSecondaryNumber", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ITransactionType extends Parcelable {
    String getOperationName();

    int getOperationType();

    boolean hasSecondaryNumber();

    boolean usesMsisdn();
}
