package com.safaricom.consumer.commons.fastlogin;

import com.safaricom.consumer.commons.session.SessionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0004H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H&J\b\u0010\f\u001a\u00020\bH&J\u000e\u0010\r\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0015\u001a\u00020\u0004H&¨\u0006\u0016"}, d2 = {"Lcom/safaricom/consumer/commons/fastlogin/IFastLoginRepository;", "", "getFastLoginSettingAsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "isFastLoginSettingEnabled", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startFastLoginBackgroundWorkers", "", "isSessionStateFastLoggedIn", "getSessionStateAsFlow", "Lcom/safaricom/consumer/commons/session/SessionState;", "logout", "setFastLoginEnabled", "setFastLoginDisabled", "getLoginCounter", "", "storeLoginCounter", "count", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFastLoginEnabled", "isInRapidActionsFastLoginFlow", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IFastLoginRepository {
    Flow<Boolean> getFastLoginSettingAsFlow();

    Object getLoginCounter(Continuation<? super Integer> continuation);

    Flow<SessionState> getSessionStateAsFlow();

    Flow<Boolean> isFastLoginEnabled();

    Object isFastLoginSettingEnabled(Continuation<? super Boolean> continuation);

    boolean isInRapidActionsFastLoginFlow();

    boolean isSessionStateFastLoggedIn();

    void logout();

    Object setFastLoginDisabled(Continuation<? super Boolean> continuation);

    Object setFastLoginEnabled(Continuation<? super Boolean> continuation);

    Object startFastLoginBackgroundWorkers(Continuation<? super Unit> continuation);

    Object storeLoginCounter(int i, Continuation<? super Unit> continuation);
}
