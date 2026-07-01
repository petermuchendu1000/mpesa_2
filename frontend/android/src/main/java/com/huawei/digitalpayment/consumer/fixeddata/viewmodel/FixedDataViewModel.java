package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.ariver.engine.common.track.recovery.DeepRecoverARiverProxy;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.huawei.common.exception.BaseException;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.fixeddata.constant.HomeInternetConstants;
import com.huawei.digitalpayment.consumer.fixeddata.data.mapper.AccountDetailsUiMapper;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.DerivedKt;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances.FibreAccountBalances;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances.FibreAccountBalancesPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetails;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetailsPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.OfferingDetails;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreAddProductPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreChangePlanPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreDeleteProductPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreFeeQuotation;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePackageDetail;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePayment;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePaymentPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidation;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePreValidationPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.payRenewal.FibrePaymentRenewal;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.payRenewal.FibrePaymentRenewalPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.postpay.FibrePostPayPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewal;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewalPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.Account;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.AccountList;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.FibreUserDetails;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.FibreUserDetailsPayload;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType;
import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.FixedDataRepository;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel;
import com.huawei.payment.mvvm.Resource;
import com.iap.ac.android.acs.operation.log.LogConstants;
import com.safaricom.consumer.commons.statements.DisPlayItems;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.ActivityResultRegistryKtrememberLauncherForActivityResult11ExternalSyntheticLambda0;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.asn1.BERTags;

@Singleton
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0086\u00012\u00020\u0001:\u0002\u0086\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u001a\u00108\u001a\u00020\u001c2\b\b\u0002\u00109\u001a\u00020$2\b\b\u0002\u0010:\u001a\u00020;J\u000e\u0010<\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020$J\u000e\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001fJ\u000e\u0010@\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001fJ\u0018\u0010A\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001f2\b\b\u0002\u0010=\u001a\u00020$J \u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020\u001f2\b\u0010E\u001a\u0004\u0018\u00010\u001fJ7\u0010F\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u001f2\b\u0010H\u001a\u0004\u0018\u00010\u001f2\b\u0010I\u001a\u0004\u0018\u00010J¢\u0006\u0002\u0010KJ\u0010\u0010L\u001a\u00020\u001c2\b\b\u0002\u0010M\u001a\u00020;J\u000e\u0010N\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001fJ\u001e\u0010O\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020\u001fJ;\u0010P\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020\u001f2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00172\u0006\u0010G\u001a\u00020\u001f2\b\u0010I\u001a\u0004\u0018\u00010J¢\u0006\u0002\u0010SJ0\u0010T\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020\u001f2\b\u0010U\u001a\u0004\u0018\u00010\u001f2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00172\b\b\u0002\u0010V\u001a\u00020;J(\u0010W\u001a\u00020\u001c2\b\u0010U\u001a\u0004\u0018\u00010\u001f2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00172\b\b\u0002\u0010V\u001a\u00020;J\u000e\u0010X\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001fJ\u001c\u0010Y\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001f2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020Z0\u0017J\u0006\u0010[\u001a\u00020\u001cJ\"\u0010\\\u001a\u00020\u001c2\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00172\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u001fJ\n\u0010]\u001a\u00020\u001f*\u00020\u001fJ\"\u0010^\u001a\u0004\u0018\u00010_2\u0006\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020\u001fH\u0002J9\u0010`\u001a\u0004\u0018\u00010a2\u0006\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020\u001f2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0002\u0010bJ\"\u0010c\u001a\u0004\u0018\u00010d2\u0006\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020\u001fH\u0002J1\u0010e\u001a\u0004\u0018\u00010f2\u0006\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u001f2\b\u0010I\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0002\u0010gJ©\u0001\u0010j\u001a\u00020!\"\u0004\b\u0000\u0010k2\b\b\u0002\u0010l\u001a\u00020;2\b\b\u0002\u0010m\u001a\u00020;2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u001f2(\u0010o\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002Hk0s0r0q\u0012\u0006\u0012\u0004\u0018\u00010t0p2$\b\u0002\u0010u\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002Hk\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0q\u0012\u0006\u0012\u0004\u0018\u00010t0v2$\b\u0002\u0010w\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020x\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0q\u0012\u0006\u0012\u0004\u0018\u00010t0vH\u0002¢\u0006\u0002\u0010yJ\b\u0010z\u001a\u00020\u001cH\u0002J\b\u0010{\u001a\u00020\u001cH\u0002J\b\u0010|\u001a\u00020\u001cH\u0002J.\u0010}\u001a\u00020\u001c2\u0006\u0010~\u001a\u00020$2\u0006\u0010?\u001a\u00020\u001f2\u0014\u0010\u007f\u001a\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0080\u00010pH\u0002J5\u0010\u0081\u0001\u001a\u00020\u001c2\u0006\u0010~\u001a\u00020$2\u0006\u0010?\u001a\u00020\u001f2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001fH\u0082@¢\u0006\u0003\u0010\u0085\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000eR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0019\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00101\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u00104\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0013\u00106\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b7\u00103R\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020\u001f0iX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0087\u0001"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "Landroidx/lifecycle/ViewModel;", "fixedDataRepository", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/FixedDataRepository;", "accountDetailsUiMapper", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/mapper/AccountDetailsUiMapper;", "<init>", "(Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/FixedDataRepository;Lcom/huawei/digitalpayment/consumer/fixeddata/data/mapper/AccountDetailsUiMapper;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FixedDataUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/UiEvent;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "_selectedAddons", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePackageDetail;", "selectedAddons", "getSelectedAddons", "updateSelectedAddons", "", "addons", "msisdn", "", "accountDetailsJob", "Lkotlinx/coroutines/Job;", "accountBalancesJob", "activeAccountDetailsType", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;", "activeAccountBalancesType", "accountState", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState;", "getAccountState", "ftthLastMiles", "", "getFtthLastMiles", "()Ljava/util/Set;", "ftthAccounts", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/Account;", "getFtthAccounts", "()Ljava/util/List;", "estateId", "getEstateId", "()Ljava/lang/String;", "lastMile", "getLastMile", "hierarchy", "getHierarchy", "fetchUserDetails", "clickedType", "forceRefresh", "", "switchFixedDataType", "fixedDataType", "selectAccount", "accountId", "fetchAccountDetails", "fetchAccountBalances", "preValidateRenewal", "pin", "amount", "selectedProductId", "payRenewal", "channelSessionId", "selectedProductOfferingCode", "useOd", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "fetchProducts", "showLoading", "fetchFeeQuotation", "preValidate", LogConstants.Mpm.EndNodeType.PAY, "selectedProducts", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$Product;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "changePlan", DisPlayItems.TRANSACTION_ID, "isPostPay", "addProduct", "deleteFamilyShareProduct", "deleteProduct", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/Product;", "fetchPostpayDetails", "postPay", "toLocalMsisdn", "buildPreValidationRenewalPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/preValidationRenewal/FibrePreValidationRenewalPayload;", "buildPaymentRenewalPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/FibrePaymentRenewalPayload;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/FibrePaymentRenewalPayload;", "buildPreValidationPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePreValidationPayload;", "buildPaymentPayload", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePaymentPayload;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePaymentPayload;", "activeLoadingTasks", "", "launchWithState", "T", "loading", "setGlobalError", "tag", LogConstants.Mpm.Interceptor.ACTION, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "", "onSuccess", "Lkotlin/Function2;", RVEvents.EMBED_WEBVIEW_LOAD_ERROR_EVENT, "Lcom/huawei/common/exception/BaseException;", "(ZZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "cancelActiveAccountRequests", "cancelAccountDetailsRequest", "cancelAccountBalanceRequest", "updateActiveTabState", "type", "update", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FixedDataTabState;", "handleAccountDetailsError", "loadingModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountDetailsUiModel;", "errorMessage", "(Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountDetailsUiModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FixedDataViewModel extends ViewModel {
    private static int CoroutineDebuggingKt = 0;
    private static final String ShareDataUIState = "selected_fixed_data_type";

    private static int f2668a = 0;

    private static int f2669b = 1;
    private static final String component3 = "selected_account_id_";
    private static int coroutineCreation = 1;
    private final Set<String> ArtificialStackFrames;
    private final StateFlow<List<FibrePackageDetail>> accessartificialFrame;
    private final MutableStateFlow<List<FibrePackageDetail>> component1;
    private final MutableStateFlow<FixedDataUiState> component2;
    private final AccountDetailsUiMapper component4;
    private FixedDataType copy;
    private final MutableSharedFlow<UiEvent> copydefault;
    private final String coroutineBoundary;
    private final StateFlow<AccountState> equals;
    private final StateFlow<FixedDataUiState> getARTIFICIAL_FRAME_PACKAGE_NAME;
    private Job getAsAtTimestamp;
    private Job getRequestBeneficiariesState;
    private final Set<String> getShareableDataState;
    private final FixedDataRepository getSponsorBeneficiariesState;
    private final SharedFlow<UiEvent> hashCode;
    private FixedDataType toString;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static Object copydefault(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i4;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i3;
        int i11 = i6 | i8;
        int i12 = (~(i6 | i3)) | (~(i8 | (~i3) | i9)) | (~(i3 | i4));
        int i13 = i3 + i4 + i7 + (764943627 * i2) + (189947931 * i5);
        int i14 = i13 * i13;
        int i15 = ((i3 * (-973936384)) - 801505280) + ((-973936384) * i4) + (1838296578 * i10) + (1228335359 * i11) + ((-1228335359) * i12) + (2092695552 * i7) + ((-1475084288) * i2) + ((-1479278592) * i5) + ((-626393088) * i14);
        int i16 = (i3 * 1860537600) + 224780607 + (i4 * 1860537600) + (i10 * 1034) + (i11 * (-517)) + (i12 * DeepRecoverARiverProxy.TYPE_EXCEPTION_CANNOT_CRASH_APP) + (i7 * 1860538117) + (i2 * (-1861700041)) + (i5 * (-831392377)) + (i14 * 995229696);
        return i15 + ((i16 * i16) * 1053163520) != 1 ? component2(objArr) : copydefault(objArr);
    }

    public static final AccountDetailsUiMapper access$getAccountDetailsUiMapper$p(FixedDataViewModel fixedDataViewModel) {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 15;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        AccountDetailsUiMapper accountDetailsUiMapper = fixedDataViewModel.component4;
        if (i4 != 0) {
            return accountDetailsUiMapper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Set access$getActiveLoadingTasks$p(FixedDataViewModel fixedDataViewModel) {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt;
        int i4 = i3 + 65;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        Set<String> set = fixedDataViewModel.ArtificialStackFrames;
        int i6 = i3 + 125;
        coroutineCreation = i6 % 128;
        int i7 = i6 % 2;
        return set;
    }

    public static final FixedDataRepository access$getFixedDataRepository$p(FixedDataViewModel fixedDataViewModel) {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 99;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        FixedDataRepository fixedDataRepository = fixedDataViewModel.getSponsorBeneficiariesState;
        if (i4 != 0) {
            return fixedDataRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String access$getMsisdn$p(FixedDataViewModel fixedDataViewModel) {
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 31;
        int i4 = i3 % 128;
        CoroutineDebuggingKt = i4;
        int i5 = i3 % 2;
        String str = fixedDataViewModel.coroutineBoundary;
        int i6 = i4 + 19;
        coroutineCreation = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public static final MutableSharedFlow access$get_events$p(FixedDataViewModel fixedDataViewModel) {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 1;
        int i4 = i3 % 128;
        coroutineCreation = i4;
        int i5 = i3 % 2;
        MutableSharedFlow<UiEvent> mutableSharedFlow = fixedDataViewModel.copydefault;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 97;
        CoroutineDebuggingKt = i6 % 128;
        int i7 = i6 % 2;
        return mutableSharedFlow;
    }

    public static final MutableStateFlow access$get_uiState$p(FixedDataViewModel fixedDataViewModel) {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 69;
        int i4 = i3 % 128;
        coroutineCreation = i4;
        int i5 = i3 % 2;
        MutableStateFlow<FixedDataUiState> mutableStateFlow = fixedDataViewModel.component2;
        int i6 = i4 + 41;
        CoroutineDebuggingKt = i6 % 128;
        int i7 = i6 % 2;
        return mutableStateFlow;
    }

    public static final Object access$handleAccountDetailsError(FixedDataViewModel fixedDataViewModel, FixedDataType fixedDataType, String str, AccountDetailsUiModel accountDetailsUiModel, String str2, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 81;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        Object objComponent3 = fixedDataViewModel.component3(fixedDataType, str, accountDetailsUiModel, str2, continuation);
        int i5 = CoroutineDebuggingKt + 101;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
        return objComponent3;
    }

    public static final void access$updateActiveTabState(FixedDataViewModel fixedDataViewModel, FixedDataType fixedDataType, String str, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 21;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        fixedDataViewModel.copydefault(fixedDataType, str, function1);
        if (i4 == 0) {
            int i5 = 12 / 0;
        }
        int i6 = CoroutineDebuggingKt + 95;
        coroutineCreation = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Inject
    public FixedDataViewModel(FixedDataRepository fixedDataRepository, AccountDetailsUiMapper accountDetailsUiMapper) {
        Intrinsics.checkNotNullParameter(fixedDataRepository, "");
        Intrinsics.checkNotNullParameter(accountDetailsUiMapper, "");
        this.getSponsorBeneficiariesState = fixedDataRepository;
        this.component4 = accountDetailsUiMapper;
        FixedDataType.Companion companion = FixedDataType.INSTANCE;
        String string = SPUtils.getInstance().getString(ShareDataUIState, FixedDataType.HOME_FIBRE.getCode());
        Intrinsics.checkNotNullExpressionValue(string, "");
        FixedDataType fixedDataTypeFromCode = companion.fromCode(string);
        if (fixedDataTypeFromCode == null) {
            fixedDataTypeFromCode = FixedDataType.HOME_FIBRE;
            int i2 = CoroutineDebuggingKt + 123;
            coroutineCreation = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        MutableStateFlow<FixedDataUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new FixedDataUiState(false, null, null, null, fixedDataTypeFromCode, null, null, null, null, null, false, 0L, 4079, null));
        this.component2 = MutableStateFlow;
        MutableStateFlow<FixedDataUiState> mutableStateFlow = MutableStateFlow;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = mutableStateFlow;
        MutableSharedFlow<UiEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.hashCode = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<List<FibrePackageDetail>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.component1 = MutableStateFlow2;
        this.accessartificialFrame = MutableStateFlow2;
        String string2 = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string2, "");
        this.coroutineBoundary = string2;
        this.equals = FlowKt.stateIn(new FixedDataViewModel$special$$inlined$map$1(mutableStateFlow), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), AccountState.NoAccount.INSTANCE);
        this.getShareableDataState = SetsKt.setOf((Object[]) new String[]{HomeInternetConstants.INTERNET_TYPE_CODE_FIBRE, HomeInternetConstants.INTERNET_TYPE_CODE_PTMP, HomeInternetConstants.INTERNET_TYPE_CODE_FIVE_G, "4g"});
        this.ArtificialStackFrames = new LinkedHashSet();
        int i5 = CoroutineDebuggingKt + 27;
        coroutineCreation = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
    }

    public final StateFlow<FixedDataUiState> getUiState() {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt;
        int i4 = i3 + 117;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        StateFlow<FixedDataUiState> stateFlow = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i6 = i3 + 51;
        coroutineCreation = i6 % 128;
        int i7 = i6 % 2;
        return stateFlow;
    }

    public final SharedFlow<UiEvent> getEvents() {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 39;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        SharedFlow<UiEvent> sharedFlow = this.hashCode;
        if (i4 == 0) {
            int i5 = 15 / 0;
        }
        return sharedFlow;
    }

    public final StateFlow<List<FibrePackageDetail>> getSelectedAddons() {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt;
        int i4 = i3 + 79;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        StateFlow<List<FibrePackageDetail>> stateFlow = this.accessartificialFrame;
        int i6 = i3 + 21;
        coroutineCreation = i6 % 128;
        int i7 = i6 % 2;
        return stateFlow;
    }

    public final void updateSelectedAddons(List<FibrePackageDetail> addons) {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 13;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(addons, "");
        this.component1.setValue(addons);
        int i5 = CoroutineDebuggingKt + 83;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
    }

    public final StateFlow<AccountState> getAccountState() {
        int i2 = 2 % 2;
        int i3 = coroutineCreation;
        int i4 = i3 + 119;
        CoroutineDebuggingKt = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StateFlow<AccountState> stateFlow = this.equals;
        int i5 = i3 + 85;
        CoroutineDebuggingKt = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final Set<String> getFtthLastMiles() {
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 99;
        int i4 = i3 % 128;
        CoroutineDebuggingKt = i4;
        int i5 = i3 % 2;
        Set<String> set = this.getShareableDataState;
        int i6 = i4 + 47;
        coroutineCreation = i6 % 128;
        int i7 = i6 % 2;
        return set;
    }

    public final String getEstateId() {
        Object next;
        int i2 = 2 % 2;
        List<Account> ftthAccounts = getFtthAccounts();
        if (ftthAccounts == null) {
            return null;
        }
        Iterator<T> it = ftthAccounts.iterator();
        int i3 = CoroutineDebuggingKt + 29;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Account) next).getAccountId(), this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId())) {
                break;
            }
        }
        Account account = (Account) next;
        if (account == null) {
            return null;
        }
        String estateId = account.getEstateId();
        int i5 = CoroutineDebuggingKt + 57;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
        return estateId;
    }

    public final String getLastMile() {
        Object next;
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 93;
        CoroutineDebuggingKt = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            getFtthAccounts();
            obj.hashCode();
            throw null;
        }
        List<Account> ftthAccounts = getFtthAccounts();
        if (ftthAccounts == null) {
            return null;
        }
        Iterator<T> it = ftthAccounts.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = CoroutineDebuggingKt + 115;
            coroutineCreation = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.areEqual(((Account) it.next()).getAccountId(), this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId());
                throw null;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Account) next).getAccountId(), this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId())) {
                int i5 = coroutineCreation + 39;
                CoroutineDebuggingKt = i5 % 128;
                int i6 = i5 % 2;
                break;
            }
        }
        Account account = (Account) next;
        if (account == null) {
            return null;
        }
        int i7 = CoroutineDebuggingKt + 73;
        coroutineCreation = i7 % 128;
        int i8 = i7 % 2;
        return account.getLastMile();
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/huawei/common/exception/BaseException;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchAccountBalances$3", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class hashCode extends SuspendLambda implements Function2<BaseException, Continuation<? super Unit>, Object> {
        private static char[] component4;
        private static int copydefault;
        private static int getAsAtTimestamp;
        final String ShareDataUIState;
        final FixedDataType component1;
        int component2;
        private static final byte[] $$c = {Ascii.SI, -74, 84, -51};
        private static final int $$f = 201;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {34, -56, Ascii.SUB, -92, -39, -25, -30, -26, -26, -18, -36, -33, 40};
        private static final int $$e = 223;
        private static final byte[] $$a = {13, 38, -109, 117, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK};
        private static final int $$b = 162;
        private static int getRequestBeneficiariesState = 0;
        private static int equals = 0;
        private static int copy = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(int r5, byte r6, byte r7) {
            /*
                int r5 = r5 + 65
                int r6 = r6 * 2
                int r0 = r6 + 1
                byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.$$c
                int r7 = r7 * 4
                int r7 = 4 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r6
                r4 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r5
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L22:
                r3 = r1[r7]
            L24:
                int r3 = -r3
                int r5 = r5 + r3
                int r7 = r7 + 1
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.$$g(int, byte, byte):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 3
                int r7 = 27 - r7
                int r8 = r8 * 6
                int r8 = r8 + 10
                int r9 = r9 * 16
                int r9 = r9 + 83
                byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.$$a
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r5 = r2
                goto L30
            L16:
                r3 = r2
                r6 = r9
                r9 = r7
                r7 = r6
            L1a:
                byte r4 = (byte) r7
                int r9 = r9 + 1
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L2b
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2b:
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L30:
                int r9 = -r9
                int r7 = r7 + r9
                int r7 = r7 + (-17)
                r9 = r3
                r3 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.a(short, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void d(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 4
                int r8 = r8 + 99
                int r6 = r6 * 4
                int r0 = r6 + 10
                int r7 = r7 * 2
                int r7 = r7 + 4
                byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.$$d
                byte[] r0 = new byte[r0]
                int r6 = r6 + 9
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r6
                r8 = r7
                r4 = r2
                goto L30
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L30:
                int r7 = -r7
                int r3 = r3 + r7
                int r7 = r8 + 1
                int r8 = r3 + (-27)
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.d(byte, int, short, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
            char[] cArr2 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            int i5 = $11 + 99;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                int i7 = $11 + 79;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
                cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
                int i9 = iTrustedWebActivityServiceStub.ShareDataUIState;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(copydefault)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3783 - ExpandableListView.getPackedPositionChild(0L), (Process.myTid() >> 22) + 38, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 26859), 2015799920, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7407, 16 - (KeyEvent.getMaxKeyCode() >> 16), (char) View.resolveSizeAndState(0, 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (i3 > 0) {
                int i10 = $10 + 123;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                iTrustedWebActivityServiceStub.component1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
                System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
            }
            if (!(!z)) {
                int i12 = $10 + 9;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                char[] cArr4 = new char[i2];
                iTrustedWebActivityServiceStub.ShareDataUIState = 0;
                while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7405 - TextUtils.indexOf((CharSequence) "", '0'), 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    int i14 = $11 + 35;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 3 % 3;
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2 % 2;
            ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
            int i3 = 0;
            int i4 = iArr[0];
            byte b2 = 1;
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr = component4;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i8 = 0; i8 < length; i8++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 658, Gravity.getAbsoluteGravity(0, 0) + 14, (char) (65118 - Color.argb(0, 0, 0, 0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i5];
            System.arraycopy(cArr, i4, cArr3, 0, i5);
            if (bArr != null) {
                int i9 = $10 + 79;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char[] cArr4 = new char[i5];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                char c2 = 0;
                while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                    int i11 = $10 + 37;
                    $11 = i11 % 128;
                    if (i11 % 2 != 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != b2 : bArr[iTrustedWebActivityService_Parcel.copydefault] != b2) {
                        int i12 = iTrustedWebActivityService_Parcel.copydefault;
                        char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                        try {
                            Object[] objArr3 = new Object[2];
                            objArr3[b2] = Integer.valueOf(c2);
                            objArr3[i3] = Integer.valueOf(c3);
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                            if (objCopydefault2 == null) {
                                byte b3 = (byte) i3;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3580 - TextUtils.indexOf("", ""), Color.red(i3) + 28, (char) Color.alpha(i3), 1180380354, false, $$g((byte) ($$f >>> 2), b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i12] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        int i13 = iTrustedWebActivityService_Parcel.copydefault;
                        char c4 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                        Object[] objArr4 = new Object[2];
                        objArr4[b2] = Integer.valueOf(c2);
                        objArr4[i3] = Integer.valueOf(c4);
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault3 == null) {
                            int maximumDrawingCacheSize = 4502 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int i14 = 37 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            char longPressTimeout = (char) (27897 - (ViewConfiguration.getLongPressTimeout() >> 16));
                            byte b4 = (byte) i3;
                            String str$$g = $$g((byte) 45, b4, b4);
                            Class[] clsArr = new Class[2];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[b2] = Integer.TYPE;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(maximumDrawingCacheSize, i14, longPressTimeout, -1464227204, false, str$$g, clsArr);
                        }
                        cArr4[i13] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    }
                    c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                    if (objCopydefault4 == null) {
                        byte b5 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - (ViewConfiguration.getTouchSlop() >> 8), 34 - View.getDefaultSize(0, 0), (char) ExpandableListView.getPackedPositionGroup(0L), 80302927, false, $$g((byte) 49, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                    i3 = 0;
                    b2 = 1;
                }
                int i15 = $11 + 13;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr3 = cArr4;
            }
            if (i7 > 0) {
                char[] cArr5 = new char[i5];
                i = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i5);
                int i17 = i5 - i7;
                System.arraycopy(cArr5, 0, cArr3, i17, i7);
                System.arraycopy(cArr5, i7, cArr3, 0, i17);
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr6 = new char[i5];
                while (true) {
                    iTrustedWebActivityService_Parcel.copydefault = i;
                    if (iTrustedWebActivityService_Parcel.copydefault >= i5) {
                        break;
                    }
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                cArr3 = cArr6;
            }
            if (i6 > 0) {
                iTrustedWebActivityService_Parcel.copydefault = 0;
                int i18 = $11 + 97;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 4 % 4;
                }
                while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                    iTrustedWebActivityService_Parcel.copydefault++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r4.component2 == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r4.component2 == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            kotlin.ResultKt.throwOnFailure(r5);
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.access$updateActiveTabState(r4.component3, r4.component1, r4.ShareDataUIState, new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchAccountBalances$3$$ExternalSyntheticLambda0());
            r5 = kotlin.Unit.INSTANCE;
            r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.copy + 109;
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.equals = r1 % 128;
            r1 = r1 % 2;
         */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.equals
                int r1 = r1 + 35
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.copy = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L1a
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.component2
                r2 = 28
                int r2 = r2 / 0
                if (r1 != 0) goto L3e
                goto L21
            L1a:
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.component2
                if (r1 != 0) goto L3e
            L21:
                kotlin.ResultKt.throwOnFailure(r5)
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r5 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.this
                com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType r1 = r4.component1
                java.lang.String r2 = r4.ShareDataUIState
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchAccountBalances$3$$ExternalSyntheticLambda0 r3 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchAccountBalances$3$$ExternalSyntheticLambda0
                r3.<init>()
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.access$updateActiveTabState(r5, r1, r2, r3)
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.copy
                int r1 = r1 + 109
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.equals = r2
                int r1 = r1 % r0
                return r5
            L3e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hashCode.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static final FixedDataTabState copydefault(FixedDataTabState fixedDataTabState) {
            int i = 2 % 2;
            int i2 = equals + 45;
            copy = i2 % 128;
            int i3 = i2 % 2;
            FixedDataTabState fixedDataTabStateCopy$default = FixedDataTabState.copy$default(fixedDataTabState, false, false, null, null, null, null, AccountDetailsUiModel.copy$default(fixedDataTabState.getAccountDetailsUiModel(), null, null, null, null, null, null, null, null, null, null, null, "", null, false, false, false, false, null, 260095, null), 30, null);
            int i4 = equals + 57;
            copy = i4 % 128;
            int i5 = i4 % 2;
            return fixedDataTabStateCopy$default;
        }

        public final Object copydefault(BaseException baseException, Continuation<? super Unit> continuation) throws Throwable {
            Object[] objArr;
            char c2;
            int i = 2 % 2;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1370061132);
            if (objCopydefault == null) {
                int iIndexOf = 823 - TextUtils.indexOf((CharSequence) "", '0');
                int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20;
                char cIndexOf = (char) (58322 - TextUtils.indexOf("", ""));
                byte b2 = (byte) 0;
                Object[] objArr2 = new Object[1];
                a((byte) (-$$a[9]), b2, (byte) (b2 + 1), objArr2);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, i2, cIndexOf, 1796168145, false, (String) objArr2[0], null);
            }
            long j = ((Field) objCopydefault).getLong(null);
            Object[] objArr3 = new Object[1];
            b(new int[]{0, 22, 11, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(new int[]{22, 15, 0, 2}, false, new byte[]{1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(731302035);
            if (objCopydefault2 == null) {
                int packedPositionGroup = 824 - ExpandableListView.getPackedPositionGroup(0L);
                int deadChar = 20 - KeyEvent.getDeadChar(0, 0);
                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 58322);
                byte b3 = (byte) (-$$a[21]);
                byte b4 = (byte) (b3 - 4);
                Object[] objArr5 = new Object[1];
                a(b3, b4, (byte) (b4 - 1), objArr5);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, deadChar, cArgb, -288417802, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1370984653);
                if (objCopydefault3 == null) {
                    int longPressTimeout = 824 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iMyTid = (Process.myTid() >> 22) + 20;
                    char cArgb2 = (char) (58322 - Color.argb(0, 0, 0, 0));
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    Object[] objArr6 = new Object[1];
                    a(b5, b6, (byte) (b6 + 1), objArr6);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout, iMyTid, cArgb2, 1796321366, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
                objArr = new Object[]{strArr, new int[1], new int[]{i}, new int[]{i}};
                int i3 = ((int[]) objArr7[2])[0];
                int i4 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[0];
                int iIdentityHashCode = System.identityHashCode(this);
                int i5 = ((((-1104765901) + (((~((-268537921) | (~iIdentityHashCode))) | (~((-169347869) | iIdentityHashCode))) * (-272))) + (((~((-363188291) | iIdentityHashCode)) | 94650370) * (-272))) + (((~(iIdentityHashCode | 363188290)) | (-263998239)) * 272)) - 1611771565;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                c2 = 3;
            } else {
                Object[] objArr8 = new Object[1];
                b(new int[]{37, 26, 0, 12}, true, new byte[]{0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b(new int[]{63, 18, 0, 13}, true, new byte[]{1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                b(new int[]{81, 16, BERTags.PRIVATE, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b(new int[]{97, 16, 0, 14}, false, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1}, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr12 = new Object[1];
                b(new int[]{113, 64, 73, 0}, false, new byte[]{1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0}, objArr12);
                String str = (String) objArr12[0];
                Object[] objArr13 = new Object[1];
                b(new int[]{177, 64, 93, 0}, true, new byte[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0}, objArr13);
                try {
                    Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -1611771565};
                    Object[] objArr15 = new Object[1];
                    c(new char[]{'\f', 1, 14, 65482, 5, 17, 65535, 2, 15, 65482, 14, 1, '\t', 17, 15, '\n', 11, 65535, 65482, 16, '\n', 1, '\t', 21, 65533, '\f', '\b', 65533, 16, 5, 3, 5, 0, 65482, 5, 1, 19, 65533, 17, 4, 65482, '\t', 11, 65535, 14, 11, 16, 65533, 1, 14, 65503, 65472, '\t', 1, 16, 65509, 16, 15, 5, 65512, 0, 17, 65533, 14, 65506, 0, 1, 16, 14, 11, '\f', 1, 65518, 65482, 15, '\b', 1, 0, 11, '\t', 65482, 0, 17, 65533, 14, 2, 16, 14, 11}, 134 - MotionEvent.axisFromString(""), View.MeasureSpec.makeMeasureSpec(0, 0) + 89, TextUtils.indexOf("", "", 0, 0) + 44, true, objArr15);
                    Class<?> cls4 = Class.forName(((String) objArr15[0]).intern());
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    Object[] objArr16 = new Object[1];
                    d(b7, b8, b8, objArr16);
                    Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                    int i8 = ((int[]) objArr17[3])[0];
                    int i9 = ((int[]) objArr17[2])[0];
                    if (applicationContext != null) {
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1370984653);
                        if (objCopydefault4 == null) {
                            int iResolveSize = 824 - View.resolveSize(0, 0);
                            int iMyTid2 = 20 - (Process.myTid() >> 22);
                            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 58322);
                            Object[] objArr18 = new Object[1];
                            a(b7, b8, (byte) (b8 + 1), objArr18);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, iMyTid2, fadingEdgeLength, 1796321366, false, (String) objArr18[0], null);
                        }
                        ((Field) objCopydefault4).set(null, objArr17);
                        try {
                            Object[] objArr19 = new Object[1];
                            b(new int[]{0, 22, 11, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr19);
                            Class<?> cls5 = Class.forName((String) objArr19[0]);
                            Object[] objArr20 = new Object[1];
                            b(new int[]{22, 15, 0, 2}, false, new byte[]{1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1}, objArr20);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(731302035);
                            if (objCopydefault5 == null) {
                                int iMyPid = 824 - (Process.myPid() >> 22);
                                int i10 = 21 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                char size = (char) (58322 - View.MeasureSpec.getSize(0));
                                byte b9 = (byte) (-$$a[21]);
                                byte b10 = (byte) (b9 - 4);
                                Object[] objArr21 = new Object[1];
                                a(b9, b10, (byte) (b10 - 1), objArr21);
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, i10, size, -288417802, false, (String) objArr21[0], null);
                            }
                            ((Field) objCopydefault5).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1370061132);
                            if (objCopydefault6 == null) {
                                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 824;
                                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 20;
                                char cMyTid = (char) ((Process.myTid() >> 22) + 58322);
                                Object[] objArr22 = new Object[1];
                                a((byte) (-$$a[9]), b7, (byte) (b7 + 1), objArr22);
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, edgeSlop, cMyTid, 1796168145, false, (String) objArr22[0], null);
                            }
                            ((Field) objCopydefault6).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr17;
                    c2 = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i11 = ((int[]) objArr[c2])[0];
            int i12 = ((int[]) objArr[2])[0];
            if (i12 == i11) {
                int i13 = copy + 19;
                equals = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr23 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                int i15 = ((int[]) objArr[1])[0];
                int i16 = ((int[]) objArr[2])[0];
                int i17 = ((int[]) objArr[3])[0];
                String[] strArr2 = (String[]) objArr[0];
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i18 = i15 + (-1538658455) + (((~((-582951151) | startElapsedRealtime)) | 547889154) * (-140)) + ((~((-35061997) | startElapsedRealtime)) * 70) + (((~(startElapsedRealtime | 682141202)) | (-169314045)) * 70);
                int i19 = (i18 << 13) ^ i18;
                int i20 = i19 ^ (i19 >>> 17);
                ((int[]) objArr23[1])[0] = i20 ^ (i20 << 5);
                Object[] objArr24 = {strArr2, new int[1], new int[]{i}, new int[]{i}};
                int i21 = ((int[]) objArr23[1])[0];
                int i22 = ((int[]) objArr23[2])[0];
                int i23 = ((int[]) objArr23[3])[0];
                int i24 = ~((~System.identityHashCode(this)) | (-809766279));
                int i25 = i21 + (((-913153967) | i24) * (-970)) + 1896262781 + ((i24 | 103387688) * 970);
                int i26 = (i25 << 13) ^ i25;
                int i27 = i26 ^ (i26 >>> 17);
                ((int[]) objArr24[1])[0] = i27 ^ (i27 << 5);
                int i28 = copy + 49;
                equals = i28 % 128;
                if (i28 % 2 != 0) {
                    int i29 = 5 / 5;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[0];
                if (strArr3 != null) {
                    for (String str2 : strArr3) {
                        arrayList.add(str2);
                    }
                }
                long j2 = -1;
                long j3 = ((long) (i11 ^ i12)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                long j4 = 0;
                long j5 = j3 | (((long) 8) << 32) | (j4 - ((j4 >> 63) << 32));
                try {
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault7 == null) {
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 42 - Drawable.resolveOpacity(0, 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                    Object[] objArr25 = {1271458211, Long.valueOf(j5), arrayList, null, false, false};
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault8 == null) {
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 56 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) Color.alpha(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault8).invoke(objInvoke, objArr25);
                    Object[] objArr26 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                    int i30 = ((int[]) objArr[1])[0];
                    int i31 = ((int[]) objArr[2])[0];
                    int i32 = ((int[]) objArr[3])[0];
                    String[] strArr4 = (String[]) objArr[0];
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i33 = ~iUptimeMillis;
                    int i34 = i30 + 357922113 + (((~((-45276538) | i33)) | (~((-53913515) | iUptimeMillis))) * 1900) + (((~(i33 | 53913514)) | (~(iUptimeMillis | 45276537))) * (-950)) + (((~(iUptimeMillis | 53913514)) | (~(i33 | 45276537))) * 950);
                    int i35 = (i34 << 13) ^ i34;
                    int i36 = i35 ^ (i35 >>> 17);
                    ((int[]) objArr26[1])[0] = i36 ^ (i36 << 5);
                    int[] iArr = new int[i12];
                    int i37 = i12 - 1;
                    iArr[i37] = 1;
                    Toast.makeText((Context) null, iArr[((i12 * i37) % 2) - 1], 1).show();
                    Object[] objArr27 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                    int i38 = ((int[]) objArr26[1])[0];
                    int i39 = ((int[]) objArr26[2])[0];
                    int i40 = ((int[]) objArr26[3])[0];
                    String[] strArr5 = (String[]) objArr26[0];
                    int iMyTid3 = Process.myTid();
                    int i41 = (~(642878823 | iMyTid3)) | 136974984;
                    int i42 = ~iMyTid3;
                    int i43 = i38 + (-854768329) + ((i41 | (~((-37784933) | i42))) * 886) + (((~(i42 | (-642878824))) | 742068875) * (-1772)) + ((~(i42 | 742068875)) * 886);
                    int i44 = (i43 << 13) ^ i43;
                    int i45 = i44 ^ (i44 >>> 17);
                    ((int[]) objArr27[1])[0] = i45 ^ (i45 << 5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            return ((hashCode) create(baseException, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public static FixedDataTabState component1(FixedDataTabState fixedDataTabState) {
            int i = 2 % 2;
            int i2 = copy + 67;
            equals = i2 % 128;
            int i3 = i2 % 2;
            FixedDataTabState fixedDataTabStateCopydefault = copydefault(fixedDataTabState);
            int i4 = equals + 75;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                return fixedDataTabStateCopydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        hashCode(FixedDataType fixedDataType, String str, Continuation<? super hashCode> continuation) {
            super(2, continuation);
            this.component1 = fixedDataType;
            this.ShareDataUIState = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            hashCode hashcode = FixedDataViewModel.this.new hashCode(this.component1, this.ShareDataUIState, continuation);
            int i2 = copy + 13;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 86 / 0;
            }
            return hashcode;
        }

        @Override
        public Object invoke(BaseException baseException, Continuation<? super Unit> continuation) throws Throwable {
            int i = 2 % 2;
            int i2 = copy + 23;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(baseException, continuation);
            int i4 = copy + 9;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return objCopydefault;
        }

        static {
            getAsAtTimestamp = 1;
            ShareDataUIState();
            copydefault = -890926406;
            int i = getRequestBeneficiariesState + 97;
            getAsAtTimestamp = i % 128;
            int i2 = i % 2;
        }

        static void ShareDataUIState() {
            component4 = new char[]{33513, 33453, 33451, 33449, 33444, 33448, 33454, 33419, 33414, 33443, 33412, 33428, 33454, 33374, 33441, 33448, 33451, 33468, 33469, 33447, 33451, 33453, 33513, 33462, 33466, 33463, 33465, 33463, 33454, 33459, 33467, 33412, 33412, 33468, 33465, 33455, 33457, 33480, 33424, 33455, 33463, 33432, 33430, 33465, 33459, 33455, 33460, 33462, 33464, 33469, 33469, 33468, 33460, 33458, 33409, 33465, 33449, 33457, 33456, 33456, 33457, 33460, 33421, 33518, 33465, 33461, 33457, 33455, 33415, 33413, 33454, 33462, 33460, 33453, 33452, 33459, 33463, 33457, 33459, 33457, 33461, 33354, 33786, 33780, 33780, 33752, 33746, 33785, 33784, 33781, 33749, 33759, 33785, 33769, 33772, 33779, 33782, 33517, 33462, 33454, 33457, 33457, 33449, 33471, 33419, 33461, 33458, 33418, 33414, 33462, 33467, 33464, 33465, 33416, 33351, 33352, 33356, 33357, 33396, 33397, 33354, 33353, 33355, 33354, 33395, 33355, 33442, 33444, 33356, 33353, 33441, 33353, 33352, 33355, 33396, 33395, 33354, 33443, 33442, 33440, 33353, 33395, 33356, 33354, 33354, 33441, 33352, 33352, 33440, 33440, 33375, 33441, 33440, 33352, 33354, 33444, 33355, 33394, 33356, 33357, 33356, 33353, 33351, 33351, 33394, 33356, 33354, 33394, 33352, 33352, 33395, 33352, 33374, 33443, 33446, 33356, 33395, 33430, 33397, 33311, 33398, 33357, 33359, 33398, 33308, 33399, 33400, 33376, 33398, 33355, 33396, 33311, 33398, 33397, 33399, 33358, 33358, 33358, 33397, 33399, 33360, 33361, 33358, 33356, 33357, 33354, 33354, 33357, 33356, 33357, 33360, 33399, 33399, 33362, 33401, 33401, 33357, 33397, 33400, 33360, 33359, 33357, 33356, 33357, 33358, 33398, 33310, 33310, 33397, 33356, 33355, 33358, 33400, 33310, 33397, 33399, 33400, 33400, 33311, 33396, 33354};
        }
    }

    public final String getHierarchy() {
        Product mainProduct;
        List<OfferingDetails> offeringDetails;
        Object next;
        int i2 = 2 % 2;
        FibreAccountDetails accountDetails = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getAccountDetails();
        if (accountDetails == null || (mainProduct = DerivedKt.getMainProduct(accountDetails)) == null || (offeringDetails = mainProduct.getOfferingDetails()) == null) {
            return null;
        }
        int i3 = coroutineCreation + 45;
        CoroutineDebuggingKt = i3 % 128;
        if (i3 % 2 == 0) {
            Iterator<T> it = offeringDetails.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (StringsKt.equals(((OfferingDetails) next).getName(), "hierarchy", true)) {
                        break;
                    }
                } else {
                    int i4 = coroutineCreation + 37;
                    CoroutineDebuggingKt = i4 % 128;
                    int i5 = i4 % 2;
                    next = null;
                    break;
                }
            }
            OfferingDetails offeringDetails2 = (OfferingDetails) next;
            if (offeringDetails2 != null) {
                return offeringDetails2.getValue();
            }
            return null;
        }
        offeringDetails.iterator();
        throw null;
    }

    public static void fetchUserDetails$default(FixedDataViewModel fixedDataViewModel, FixedDataType fixedDataType, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = coroutineCreation + 117;
        CoroutineDebuggingKt = i4 % 128;
        if (i4 % 2 == 0 && (i2 & 1) != 0) {
            fixedDataType = fixedDataViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getSelectedFixedDataType();
        }
        if ((i2 & 2) != 0) {
            int i5 = coroutineCreation + 55;
            CoroutineDebuggingKt = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        fixedDataViewModel.fetchUserDetails(fixedDataType, z);
    }

    public final void fetchUserDetails(FixedDataType clickedType, boolean forceRefresh) {
        FixedDataUiState value;
        FixedDataUiState fixedDataUiState;
        LinkedHashMap linkedHashMap;
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 51;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(clickedType, "");
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().isLoading()) {
            return;
        }
        MutableStateFlow<FixedDataUiState> mutableStateFlow = this.component2;
        do {
            value = mutableStateFlow.getValue();
            fixedDataUiState = value;
            Map<FixedDataType, FixedDataTabState> tabStates = fixedDataUiState.getTabStates();
            linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(tabStates.size()));
            Iterator<T> it = tabStates.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), FixedDataTabState.copy$default((FixedDataTabState) entry.getValue(), false, false, null, null, null, null, null, 95, null));
            }
        } while (!mutableStateFlow.compareAndSet(value, FixedDataUiState.copy$default(fixedDataUiState, false, null, null, null, null, linkedHashMap, null, null, null, null, false, 0L, 4063, null)));
        if (!forceRefresh) {
            int i5 = CoroutineDebuggingKt + 115;
            coroutineCreation = i5 % 128;
            int i6 = i5 % 2;
            if (this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getUserDetails() != null) {
                String selectedAccountId = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId();
                if (selectedAccountId != null) {
                    int i7 = coroutineCreation + 17;
                    CoroutineDebuggingKt = i7 % 128;
                    int i8 = i7 % 2;
                    fetchAccountDetails(selectedAccountId);
                    return;
                }
                return;
            }
        }
        ShareDataUIState(this, true, false, null, new a(null), new b(clickedType, forceRefresh, null), null, 38, null);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/FibreUserDetails;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchUserDetails$3", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreUserDetails>>>>, Object> {
        private static int component2 = 1;
        private static int component3;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 43;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.copydefault != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Flow<Resource<HaProxyResponse<FibreUserDetails>>> userDetails = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this).getUserDetails(new FibreUserDetailsPayload(FixedDataViewModel.access$getMsisdn$p(FixedDataViewModel.this)));
            int i3 = component3 + 63;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return userDetails;
        }

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            a aVar = FixedDataViewModel.this.new a(continuation);
            int i2 = component3 + 107;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return aVar;
            }
            throw null;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreUserDetails>>>> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 27;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(continuation);
            int i4 = component2 + 11;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objCopydefault;
        }

        public final Object copydefault(Continuation<? super Flow<Resource<HaProxyResponse<FibreUserDetails>>>> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 123;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            a aVar = (a) create(continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return aVar.invokeSuspend(unit);
            }
            aVar.invokeSuspend(unit);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/FibreUserDetails;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchUserDetails$4", f = "FixedDataViewModel.kt", i = {}, l = {194, 197, 199}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements Function2<HaProxyResponse<FibreUserDetails>, Continuation<? super Unit>, Object> {
        private static int equals = 1;
        private static int getRequestBeneficiariesState;
        final boolean ShareDataUIState;
        Object component1;
        int component2;
        final FixedDataType copydefault;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r38) {
            /*
                Method dump skipped, instruction units count: 733
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(FixedDataType fixedDataType, boolean z, Continuation<? super b> continuation) {
            super(2, continuation);
            this.copydefault = fixedDataType;
            this.ShareDataUIState = z;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            b bVar = FixedDataViewModel.this.new b(this.copydefault, this.ShareDataUIState, continuation);
            bVar.component1 = obj;
            b bVar2 = bVar;
            int i2 = equals + 45;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                return bVar2;
            }
            throw null;
        }

        public final Object component1(HaProxyResponse<FibreUserDetails> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = equals + 59;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            b bVar = (b) create(haProxyResponse, continuation);
            if (i3 == 0) {
                return bVar.invokeSuspend(Unit.INSTANCE);
            }
            bVar.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        @Override
        public Object invoke(HaProxyResponse<FibreUserDetails> haProxyResponse, Continuation<? super Unit> continuation) {
            Object objComponent1;
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 83;
            equals = i2 % 128;
            HaProxyResponse<FibreUserDetails> haProxyResponse2 = haProxyResponse;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                objComponent1 = component1(haProxyResponse2, continuation2);
                int i3 = 76 / 0;
            } else {
                objComponent1 = component1(haProxyResponse2, continuation2);
            }
            int i4 = getRequestBeneficiariesState + 101;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }
    }

    public final void switchFixedDataType(FixedDataType fixedDataType) {
        String str;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(fixedDataType, "");
        FixedDataUiState value = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue();
        FixedDataTabState fixedDataTabState = value.getTabStates().get(fixedDataType);
        String selectedAccountId = fixedDataTabState != null ? fixedDataTabState.getSelectedAccountId() : null;
        if (value.getSelectedFixedDataType() != fixedDataType) {
            int i3 = CoroutineDebuggingKt + 31;
            coroutineCreation = i3 % 128;
            int i4 = i3 % 2;
            SPUtils.getInstance().put(ShareDataUIState, fixedDataType.getCode());
            if (selectedAccountId != null) {
                SPUtils.getInstance().put(INSTANCE.getAccountSpKey(fixedDataType), selectedAccountId);
            }
            MutableStateFlow<FixedDataUiState> mutableStateFlow = this.component2;
            while (true) {
                FixedDataUiState value2 = mutableStateFlow.getValue();
                str = selectedAccountId;
                MutableStateFlow<FixedDataUiState> mutableStateFlow2 = mutableStateFlow;
                if (mutableStateFlow2.compareAndSet(value2, FixedDataUiState.copy$default(value2, false, null, null, null, fixedDataType, null, null, null, null, null, false, 0L, 4079, null))) {
                    break;
                }
                mutableStateFlow = mutableStateFlow2;
                selectedAccountId = str;
            }
            int i5 = CoroutineDebuggingKt + 1;
            coroutineCreation = i5 % 128;
            int i6 = i5 % 2;
            if (str != null) {
                fetchAccountDetails(str);
            }
        }
        int i7 = CoroutineDebuggingKt + 7;
        coroutineCreation = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public final void selectAccount(String accountId) {
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 15;
        CoroutineDebuggingKt = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(accountId, "");
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getSelectedFixedDataType();
            Intrinsics.areEqual(this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId(), accountId);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(accountId, "");
        FixedDataType selectedFixedDataType = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getSelectedFixedDataType();
        if (Intrinsics.areEqual(this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId(), accountId)) {
            return;
        }
        SPUtils.getInstance().put(INSTANCE.getAccountSpKey(selectedFixedDataType), accountId);
        MutableStateFlow<FixedDataUiState> mutableStateFlow = this.component2;
        while (true) {
            FixedDataUiState value = mutableStateFlow.getValue();
            FixedDataTabState fixedDataTabState = value.getTabStates().get(selectedFixedDataType);
            if (fixedDataTabState == null) {
                fixedDataTabState = new FixedDataTabState(false, false, null, null, null, null, null, 127, null);
            }
            String str = null;
            MutableStateFlow<FixedDataUiState> mutableStateFlow2 = mutableStateFlow;
            boolean z = false;
            FixedDataType fixedDataType = selectedFixedDataType;
            FixedDataTabState fixedDataTabStateCopy$default = FixedDataTabState.copy$default(fixedDataTabState, false, false, null, accountId, null, null, new AccountDetailsUiModel(accountId, null, null, null, null, null, null, null, null, null, null, str, str, z, z, false, false, fixedDataType, 131070, null), 55, null);
            MapsKt.toMutableMap(value.getTabStates()).put(fixedDataType, fixedDataTabStateCopy$default);
            Unit unit = Unit.INSTANCE;
            if (!(!mutableStateFlow2.compareAndSet(r13, FixedDataUiState.copy$default(value, false, null, null, null, null, r2, null, null, null, null, false, 0L, 4063, null)))) {
                int i4 = coroutineCreation + 95;
                CoroutineDebuggingKt = i4 % 128;
                int i5 = i4 % 2;
                fetchAccountDetails(accountId);
                return;
            }
            mutableStateFlow = mutableStateFlow2;
            selectedFixedDataType = fixedDataType;
        }
    }

    public final void fetchAccountDetails(String accountId) {
        boolean z;
        FixedDataUiState value;
        FixedDataUiState fixedDataUiState;
        long jCurrentTimeMillis;
        Map mutableMap;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(accountId, "");
        FixedDataType selectedFixedDataType = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getSelectedFixedDataType();
        AccountDetailsUiModel accountDetailsUiModel = new AccountDetailsUiModel(accountId, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, selectedFixedDataType, 131070, null);
        component3();
        if (selectedFixedDataType != FixedDataType.FOUR_G_WIRELESS) {
            int i3 = CoroutineDebuggingKt + 49;
            coroutineCreation = i3 % 128;
            int i4 = i3 % 2;
            if (selectedFixedDataType == FixedDataType.FIVE_G_WIRELESS) {
                int i5 = coroutineCreation + 75;
                CoroutineDebuggingKt = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        MutableStateFlow<FixedDataUiState> mutableStateFlow = this.component2;
        do {
            value = mutableStateFlow.getValue();
            fixedDataUiState = value;
            FixedDataTabState fixedDataTabState = fixedDataUiState.getTabStates().get(selectedFixedDataType);
            if (fixedDataTabState == null) {
                fixedDataTabState = new FixedDataTabState(false, false, null, null, null, null, null, 127, null);
            }
            FixedDataTabState fixedDataTabStateCopy$default = FixedDataTabState.copy$default(fixedDataTabState, !z, false, null, accountId, null, null, accountDetailsUiModel, 4, null);
            jCurrentTimeMillis = System.currentTimeMillis();
            mutableMap = MapsKt.toMutableMap(fixedDataUiState.getTabStates());
            mutableMap.put(selectedFixedDataType, fixedDataTabStateCopy$default);
        } while (!mutableStateFlow.compareAndSet(value, FixedDataUiState.copy$default(fixedDataUiState, false, null, null, null, null, mutableMap, null, null, null, null, false, jCurrentTimeMillis, 2015, null)));
        if (z) {
            return;
        }
        this.toString = selectedFixedDataType;
        this.getAsAtTimestamp = ShareDataUIState(this, true, false, null, new ArtificialStackFrames(accountId, null), new toString(selectedFixedDataType, accountId, accountDetailsUiModel, null), new getShareableDataState(selectedFixedDataType, accountId, accountDetailsUiModel, null), 6, null);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchAccountDetails$2", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class ArtificialStackFrames extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreAccountDetails>>>>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int component1;
        final String component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 63;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Flow<Resource<HaProxyResponse<FibreAccountDetails>>> accountDetails = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this).getAccountDetails(new FibreAccountDetailsPayload(this.component2));
            int i4 = copydefault + 63;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return accountDetails;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ArtificialStackFrames(String str, Continuation<? super ArtificialStackFrames> continuation) {
            super(1, continuation);
            this.component2 = str;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            ArtificialStackFrames artificialStackFrames = FixedDataViewModel.this.new ArtificialStackFrames(this.component2, continuation);
            int i2 = copydefault + 93;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return artificialStackFrames;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreAccountDetails>>>> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 77;
            copydefault = i2 % 128;
            Object obj = null;
            Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreAccountDetails>>>> continuation2 = continuation;
            if (i2 % 2 != 0) {
                component1(continuation2);
                throw null;
            }
            Object objComponent1 = component1(continuation2);
            int i3 = component3 + 99;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return objComponent1;
            }
            obj.hashCode();
            throw null;
        }

        public final Object component1(Continuation<? super Flow<Resource<HaProxyResponse<FibreAccountDetails>>>> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 83;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ArtificialStackFrames artificialStackFrames = (ArtificialStackFrames) create(continuation);
            if (i3 == 0) {
                return artificialStackFrames.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 35 / 0;
            return artificialStackFrames.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "resource", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchAccountDetails$3", f = "FixedDataViewModel.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
    static final class toString extends SuspendLambda implements Function2<HaProxyResponse<FibreAccountDetails>, Continuation<? super Unit>, Object> {
        private static int component4 = 1;
        private static int copy;
        final FixedDataType ShareDataUIState;
        final String component1;
        final AccountDetailsUiModel component2;
        int component3;
        Object copydefault;

        private static final FixedDataTabState copydefault(boolean z, FibreAccountDetails fibreAccountDetails, FixedDataViewModel fixedDataViewModel, FixedDataTabState fixedDataTabState) {
            AccountDetailsUiModel accountDetailsUiModelMergeDetails;
            boolean z2;
            List list;
            String str;
            FibreAccountBalances fibreAccountBalances;
            int i;
            int i2 = 2 % 2;
            int i3 = copy + 101;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                accountDetailsUiModelMergeDetails = FixedDataViewModel.access$getAccountDetailsUiMapper$p(fixedDataViewModel).mergeDetails(fixedDataTabState.getAccountDetailsUiModel(), fibreAccountDetails);
                z2 = true;
                list = null;
                str = null;
                fibreAccountBalances = null;
                i = 113;
            } else {
                accountDetailsUiModelMergeDetails = FixedDataViewModel.access$getAccountDetailsUiMapper$p(fixedDataViewModel).mergeDetails(fixedDataTabState.getAccountDetailsUiModel(), fibreAccountDetails);
                z2 = false;
                list = null;
                str = null;
                fibreAccountBalances = null;
                i = 44;
            }
            return FixedDataTabState.copy$default(fixedDataTabState, z, z2, list, str, fibreAccountDetails, fibreAccountBalances, accountDetailsUiModelMergeDetails, i, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public final Object invokeSuspend(Object obj) {
            Integer responseCode;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component3;
            boolean z = true;
            if (i2 != 0) {
                int i3 = copy + 63;
                component4 = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                HaProxyResponse haProxyResponse = (HaProxyResponse) this.copydefault;
                HaProxyResponse.Header header = haProxyResponse.getHeader();
                Object customerMessage = null;
                if (header == null || (responseCode = header.getResponseCode()) == null || responseCode.intValue() != 200) {
                    FixedDataViewModel fixedDataViewModel = FixedDataViewModel.this;
                    FixedDataType fixedDataType = this.ShareDataUIState;
                    String str = this.component1;
                    AccountDetailsUiModel accountDetailsUiModel = this.component2;
                    HaProxyResponse.Header header2 = haProxyResponse.getHeader();
                    if (header2 != null) {
                        int i5 = component4 + 17;
                        copy = i5 % 128;
                        int i6 = i5 % 2;
                        customerMessage = header2.getCustomerMessage();
                    }
                    this.component3 = 1;
                    if (FixedDataViewModel.access$handleAccountDetailsError(fixedDataViewModel, fixedDataType, str, accountDetailsUiModel, customerMessage, this) == coroutine_suspended) {
                        int i7 = copy + 45;
                        component4 = i7 % 128;
                        int i8 = i7 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    final FibreAccountDetails fibreAccountDetails = (FibreAccountDetails) haProxyResponse.getBody();
                    if (fibreAccountDetails != null) {
                        customerMessage = fibreAccountDetails.getProductList();
                        int i9 = copy + 41;
                        component4 = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    Collection collection = (Collection) customerMessage;
                    if (collection != null) {
                        if (collection.isEmpty()) {
                            int i11 = component4 + 85;
                            copy = i11 % 128;
                            int i12 = i11 % 2;
                        } else {
                            z = false;
                        }
                    }
                    final FixedDataViewModel fixedDataViewModel2 = FixedDataViewModel.this;
                    final boolean z2 = !z;
                    FixedDataViewModel.access$updateActiveTabState(fixedDataViewModel2, this.ShareDataUIState, this.component1, new Function1() {
                        private static int component1 = 1;
                        private static int component2;

                        @Override
                        public final Object invoke(Object obj2) {
                            int i13 = 2 % 2;
                            int i14 = component2 + 5;
                            component1 = i14 % 128;
                            if (i14 % 2 == 0) {
                                FixedDataViewModel.toString.ShareDataUIState(z2, fibreAccountDetails, fixedDataViewModel2, (FixedDataTabState) obj2);
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            FixedDataTabState fixedDataTabStateShareDataUIState = FixedDataViewModel.toString.ShareDataUIState(z2, fibreAccountDetails, fixedDataViewModel2, (FixedDataTabState) obj2);
                            int i15 = component1 + 95;
                            component2 = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i16 = 64 / 0;
                            }
                            return fixedDataTabStateShareDataUIState;
                        }
                    });
                    if (!z) {
                        FixedDataViewModel.this.fetchAccountBalances(this.component1, this.ShareDataUIState);
                    }
                }
            }
            return Unit.INSTANCE;
        }

        public static FixedDataTabState ShareDataUIState(boolean z, FibreAccountDetails fibreAccountDetails, FixedDataViewModel fixedDataViewModel, FixedDataTabState fixedDataTabState) {
            int i = 2 % 2;
            int i2 = copy + 69;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            FixedDataTabState fixedDataTabStateCopydefault = copydefault(z, fibreAccountDetails, fixedDataViewModel, fixedDataTabState);
            if (i3 == 0) {
                int i4 = 66 / 0;
            }
            return fixedDataTabStateCopydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toString(FixedDataType fixedDataType, String str, AccountDetailsUiModel accountDetailsUiModel, Continuation<? super toString> continuation) {
            super(2, continuation);
            this.ShareDataUIState = fixedDataType;
            this.component1 = str;
            this.component2 = accountDetailsUiModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            toString tostring = FixedDataViewModel.this.new toString(this.ShareDataUIState, this.component1, this.component2, continuation);
            tostring.copydefault = obj;
            toString tostring2 = tostring;
            int i2 = component4 + 73;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                return tostring2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object component2(HaProxyResponse<FibreAccountDetails> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component4 + 87;
            copy = i2 % 128;
            int i3 = i2 % 2;
            toString tostring = (toString) create(haProxyResponse, continuation);
            if (i3 != 0) {
                tostring.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = tostring.invokeSuspend(Unit.INSTANCE);
            int i4 = copy + 111;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override
        public Object invoke(HaProxyResponse<FibreAccountDetails> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component4 + 121;
            copy = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(haProxyResponse, continuation);
            int i4 = component4 + 73;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
            return objComponent2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", "Lcom/huawei/common/exception/BaseException;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchAccountDetails$4", f = "FixedDataViewModel.kt", i = {}, l = {295}, m = "invokeSuspend", n = {}, s = {})
    static final class getShareableDataState extends SuspendLambda implements Function2<BaseException, Continuation<? super Unit>, Object> {
        private static int equals = 0;
        private static int getAsAtTimestamp = 1;
        final FixedDataType ShareDataUIState;
        Object component1;
        final AccountDetailsUiModel component2;
        int component3;
        final String copydefault;

        /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[PHI: r1
  0x0045: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.getShareableDataState.getAsAtTimestamp
                int r1 = r1 + 29
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.getShareableDataState.equals = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 == 0) goto L1c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r9.component3
                r4 = 74
                int r4 = r4 / 0
                if (r3 == 0) goto L45
                goto L24
            L1c:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r9.component3
                if (r3 == 0) goto L45
            L24:
                if (r3 != r2) goto L3d
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.getShareableDataState.getAsAtTimestamp
                int r1 = r1 + 49
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.getShareableDataState.equals = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L35
                kotlin.ResultKt.throwOnFailure(r10)
                goto L6d
            L35:
                kotlin.ResultKt.throwOnFailure(r10)
                r10 = 0
                r10.hashCode()
                throw r10
            L3d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L45:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.component1
                com.huawei.common.exception.BaseException r10 = (com.huawei.common.exception.BaseException) r10
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r3 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.this
                com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType r4 = r9.ShareDataUIState
                java.lang.String r5 = r9.copydefault
                com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel r6 = r9.component2
                java.lang.String r7 = r10.getResponseDesc()
                r8 = r9
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                r9.component3 = r2
                java.lang.Object r10 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.access$handleAccountDetailsError(r3, r4, r5, r6, r7, r8)
                if (r10 != r1) goto L6d
                int r10 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.getShareableDataState.equals
                int r10 = r10 + 41
                int r2 = r10 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.getShareableDataState.getAsAtTimestamp = r2
                int r10 = r10 % r0
                return r1
            L6d:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.getShareableDataState.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getShareableDataState(FixedDataType fixedDataType, String str, AccountDetailsUiModel accountDetailsUiModel, Continuation<? super getShareableDataState> continuation) {
            super(2, continuation);
            this.ShareDataUIState = fixedDataType;
            this.copydefault = str;
            this.component2 = accountDetailsUiModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getShareableDataState getshareabledatastate = FixedDataViewModel.this.new getShareableDataState(this.ShareDataUIState, this.copydefault, this.component2, continuation);
            getshareabledatastate.component1 = obj;
            getShareableDataState getshareabledatastate2 = getshareabledatastate;
            int i2 = equals + 17;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return getshareabledatastate2;
        }

        public final Object copydefault(BaseException baseException, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = equals + 5;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getShareableDataState) create(baseException, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 58 / 0;
            }
            int i5 = getAsAtTimestamp + 85;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override
        public Object invoke(BaseException baseException, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = equals + 79;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(baseException, continuation);
            int i4 = getAsAtTimestamp + 27;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return objCopydefault;
        }
    }

    public static void fetchAccountBalances$default(FixedDataViewModel fixedDataViewModel, String str, FixedDataType fixedDataType, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = CoroutineDebuggingKt + 115;
        coroutineCreation = i4 % 128;
        if (i4 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 2) != 0) {
            fixedDataType = fixedDataViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getSelectedFixedDataType();
            int i5 = CoroutineDebuggingKt + 79;
            coroutineCreation = i5 % 128;
            int i6 = i5 % 2;
        }
        fixedDataViewModel.fetchAccountBalances(str, fixedDataType);
    }

    public final void fetchAccountBalances(String accountId, FixedDataType fixedDataType) {
        ArrayList arrayListEmptyList;
        FibreAccountDetails accountDetails;
        List<Product> productList;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(accountId, "");
        Intrinsics.checkNotNullParameter(fixedDataType, "");
        FixedDataTabState fixedDataTabState = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getTabStates().get(fixedDataType);
        Object obj = null;
        if (fixedDataTabState == null || (accountDetails = fixedDataTabState.getAccountDetails()) == null || (productList = accountDetails.getProductList()) == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = productList.iterator();
            while (it.hasNext()) {
                int i3 = coroutineCreation + 81;
                CoroutineDebuggingKt = i3 % 128;
                if (i3 % 2 != 0) {
                    hashSet.add(((Product) it.next()).getOfferingId());
                    obj.hashCode();
                    throw null;
                }
                Object next = it.next();
                if (hashSet.add(((Product) next).getOfferingId())) {
                    int i4 = coroutineCreation + 31;
                    CoroutineDebuggingKt = i4 % 128;
                    if (i4 % 2 != 0) {
                        arrayList.add(next);
                        obj.hashCode();
                        throw null;
                    }
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new FibreAccountBalancesPayload.Product(((Product) it2.next()).getOfferingId()));
            }
            arrayListEmptyList = arrayList3;
        }
        if (arrayListEmptyList.isEmpty()) {
            int i5 = CoroutineDebuggingKt + 111;
            coroutineCreation = i5 % 128;
            int i6 = i5 % 2;
        } else {
            FibreAccountBalancesPayload fibreAccountBalancesPayload = new FibreAccountBalancesPayload(accountId, arrayListEmptyList);
            copydefault(NumberTypeAdapter.AnonymousClass1.component2(), 279802845, -279802844, NumberTypeAdapter.AnonymousClass1.component2(), NumberTypeAdapter.AnonymousClass1.component2(), NumberTypeAdapter.AnonymousClass1.component2(), new Object[]{this});
            this.copy = fixedDataType;
            this.getRequestBeneficiariesState = ShareDataUIState(this, true, false, null, new copy(fibreAccountBalancesPayload, null), new equals(fixedDataType, accountId, null), new hashCode(fixedDataType, accountId, null), 6, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalances;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchAccountBalances$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copy extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreAccountBalances>>>>, Object> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        int component1;
        final FibreAccountBalancesPayload copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 3;
            ShareDataUIState = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Flow<Resource<HaProxyResponse<FibreAccountBalances>>> accountBalances = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this).getAccountBalances(this.copydefault);
            int i3 = component2 + 39;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return accountBalances;
            }
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copy(FibreAccountBalancesPayload fibreAccountBalancesPayload, Continuation<? super copy> continuation) {
            super(1, continuation);
            this.copydefault = fibreAccountBalancesPayload;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            copy copyVar = FixedDataViewModel.this.new copy(this.copydefault, continuation);
            int i2 = component2 + 97;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return copyVar;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreAccountBalances>>>> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 5;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(continuation);
            int i4 = ShareDataUIState + 19;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 67 / 0;
            }
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(Continuation<? super Flow<Resource<HaProxyResponse<FibreAccountBalances>>>> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            copy copyVar = (copy) create(continuation);
            if (i3 == 0) {
                copyVar.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = copyVar.invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 47;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "resource", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountBalances/FibreAccountBalances;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchAccountBalances$2", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class equals extends SuspendLambda implements Function2<HaProxyResponse<FibreAccountBalances>, Continuation<? super Unit>, Object> {
        private static int component4 = 1;
        private static int getAsAtTimestamp;
        int ShareDataUIState;
        final String component2;
        Object component3;
        final FixedDataType copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 27;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final HaProxyResponse haProxyResponse = (HaProxyResponse) this.component3;
            final FixedDataViewModel fixedDataViewModel = FixedDataViewModel.this;
            FixedDataViewModel.access$updateActiveTabState(fixedDataViewModel, this.copydefault, this.component2, new Function1() {
                private static int component3 = 0;
                private static int copydefault = 1;

                @Override
                public final Object invoke(Object obj2) {
                    FixedDataTabState fixedDataTabStateCopydefault;
                    int i4 = 2 % 2;
                    int i5 = copydefault + 67;
                    component3 = i5 % 128;
                    if (i5 % 2 != 0) {
                        fixedDataTabStateCopydefault = FixedDataViewModel.equals.copydefault(haProxyResponse, fixedDataViewModel, (FixedDataTabState) obj2);
                        int i6 = 63 / 0;
                    } else {
                        fixedDataTabStateCopydefault = FixedDataViewModel.equals.copydefault(haProxyResponse, fixedDataViewModel, (FixedDataTabState) obj2);
                    }
                    int i7 = component3 + 121;
                    copydefault = i7 % 128;
                    if (i7 % 2 != 0) {
                        return fixedDataTabStateCopydefault;
                    }
                    throw null;
                }
            });
            Unit unit = Unit.INSTANCE;
            int i4 = component4 + 123;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        private static final FixedDataTabState ShareDataUIState(HaProxyResponse haProxyResponse, FixedDataViewModel fixedDataViewModel, FixedDataTabState fixedDataTabState) {
            FibreAccountBalances fibreAccountBalances;
            AccountDetailsUiModel accountDetailsUiModelMergeBalances;
            boolean z;
            boolean z2;
            List list;
            String str;
            FibreAccountDetails fibreAccountDetails;
            int i;
            int i2 = 2 % 2;
            int i3 = component4 + 33;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 != 0) {
                fibreAccountBalances = (FibreAccountBalances) haProxyResponse.getBody();
                accountDetailsUiModelMergeBalances = FixedDataViewModel.access$getAccountDetailsUiMapper$p(fixedDataViewModel).mergeBalances(fixedDataTabState.getAccountDetailsUiModel(), (FibreAccountBalances) haProxyResponse.getBody());
                z = false;
                z2 = false;
                list = null;
                str = null;
                fibreAccountDetails = null;
                i = 75;
            } else {
                fibreAccountBalances = (FibreAccountBalances) haProxyResponse.getBody();
                accountDetailsUiModelMergeBalances = FixedDataViewModel.access$getAccountDetailsUiMapper$p(fixedDataViewModel).mergeBalances(fixedDataTabState.getAccountDetailsUiModel(), (FibreAccountBalances) haProxyResponse.getBody());
                z = false;
                z2 = false;
                list = null;
                str = null;
                fibreAccountDetails = null;
                i = 28;
            }
            return FixedDataTabState.copy$default(fixedDataTabState, z, z2, list, str, fibreAccountDetails, fibreAccountBalances, accountDetailsUiModelMergeBalances, i, null);
        }

        public static FixedDataTabState copydefault(HaProxyResponse haProxyResponse, FixedDataViewModel fixedDataViewModel, FixedDataTabState fixedDataTabState) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 57;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                ShareDataUIState(haProxyResponse, fixedDataViewModel, fixedDataTabState);
                throw null;
            }
            FixedDataTabState fixedDataTabStateShareDataUIState = ShareDataUIState(haProxyResponse, fixedDataViewModel, fixedDataTabState);
            int i3 = component4 + 75;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            return fixedDataTabStateShareDataUIState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        equals(FixedDataType fixedDataType, String str, Continuation<? super equals> continuation) {
            super(2, continuation);
            this.copydefault = fixedDataType;
            this.component2 = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            equals equalsVar = FixedDataViewModel.this.new equals(this.copydefault, this.component2, continuation);
            equalsVar.component3 = obj;
            equals equalsVar2 = equalsVar;
            int i2 = getAsAtTimestamp + 47;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                return equalsVar2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object component1(HaProxyResponse<FibreAccountBalances> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component4 + 37;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((equals) create(haProxyResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = getAsAtTimestamp + 13;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override
        public Object invoke(HaProxyResponse<FibreAccountBalances> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component4 + 93;
            getAsAtTimestamp = i2 % 128;
            HaProxyResponse<FibreAccountBalances> haProxyResponse2 = haProxyResponse;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component1(haProxyResponse2, continuation2);
            }
            component1(haProxyResponse2, continuation2);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[PHI: r15
  0x0045: PHI (r15v8 com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product) = 
  (r15v7 com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product)
  (r15v10 com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product)
 binds: [B:14:0x0043, B:11:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void preValidateRenewal(java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            r1 = r15
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            if (r1 == 0) goto L17
            int r1 = r1.length()
            if (r1 != 0) goto L4b
        L17:
            kotlinx.coroutines.flow.StateFlow<com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState> r15 = r12.getARTIFICIAL_FRAME_PACKAGE_NAME
            java.lang.Object r15 = r15.getValue()
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState r15 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState) r15
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState r15 = r15.getCurrentTabState()
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetails r15 = r15.getAccountDetails()
            if (r15 == 0) goto L4a
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation
            int r1 = r1 + 121
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L3f
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product r15 = com.huawei.digitalpayment.consumer.fixeddata.data.model.DerivedKt.getMainProduct(r15)
            r1 = 38
            int r1 = r1 / 0
            if (r15 == 0) goto L4a
            goto L45
        L3f:
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product r15 = com.huawei.digitalpayment.consumer.fixeddata.data.model.DerivedKt.getMainProduct(r15)
            if (r15 == 0) goto L4a
        L45:
            java.lang.String r15 = r15.getOfferingId()
            goto L4b
        L4a:
            r15 = r2
        L4b:
            java.lang.String r15 = java.lang.String.valueOf(r15)
            com.huawei.digitalpayment.consumer.fixeddata.data.model.preValidationRenewal.FibrePreValidationRenewalPayload r13 = r12.component3(r13, r14, r15)
            if (r13 != 0) goto L56
            return
        L56:
            r4 = 1
            r5 = 0
            r6 = 0
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$dispose r14 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$dispose
            r14.<init>(r13, r2)
            r7 = r14
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$m r13 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$m
            r13.<init>(r2)
            r8 = r13
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r9 = 0
            r10 = 36
            r11 = 0
            r3 = r12
            ShareDataUIState(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            int r13 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation
            int r13 = r13 + 93
            int r14 = r13 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt = r14
            int r13 = r13 % r0
            if (r13 == 0) goto L80
            r13 = 94
            int r13 = r13 / 0
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.preValidateRenewal(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/preValidationRenewal/FibrePreValidationRenewal;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$preValidateRenewal$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class dispose extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<FibrePreValidationRenewal>>>>, Object> {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        int component1;
        final FibrePreValidationRenewalPayload component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 75;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Flow<Resource<HaProxyResponse<FibrePreValidationRenewal>>> flowPreValidateRenewal = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this).preValidateRenewal(this.component3);
            int i3 = ShareDataUIState + 19;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return flowPreValidateRenewal;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dispose(FibrePreValidationRenewalPayload fibrePreValidationRenewalPayload, Continuation<? super dispose> continuation) {
            super(1, continuation);
            this.component3 = fibrePreValidationRenewalPayload;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            dispose disposeVar = FixedDataViewModel.this.new dispose(this.component3, continuation);
            int i2 = copydefault + 33;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return disposeVar;
            }
            throw null;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<FibrePreValidationRenewal>>>> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 47;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(continuation);
            int i4 = copydefault + 7;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 72 / 0;
            }
            return objCopydefault;
        }

        public final Object copydefault(Continuation<? super Flow<Resource<HaProxyResponse<FibrePreValidationRenewal>>>> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 63;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((dispose) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 83;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "resource", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/preValidationRenewal/FibrePreValidationRenewal;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$preValidateRenewal$2", f = "FixedDataViewModel.kt", i = {}, l = {348, 351, 353}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements Function2<HaProxyResponse<FibrePreValidationRenewal>, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        Object component1;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component3;
            if (i2 != 0) {
                int i3 = ShareDataUIState + 35;
                int i4 = i3 % 128;
                copydefault = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    int i6 = i4 + 95;
                    ShareDataUIState = i6 % 128;
                    if (i6 % 2 == 0 ? i2 != 2 : i2 != 3) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                HaProxyResponse haProxyResponse = (HaProxyResponse) this.component1;
                HaProxyResponse.Header header = haProxyResponse.getHeader();
                String customerMessage = null;
                Integer responseCode = header != null ? header.getResponseCode() : null;
                if (responseCode != null && responseCode.intValue() == 200) {
                    FibrePreValidationRenewal fibrePreValidationRenewal = (FibrePreValidationRenewal) haProxyResponse.getBody();
                    if (fibrePreValidationRenewal == null) {
                        Unit unit = Unit.INSTANCE;
                        int i7 = ShareDataUIState + 37;
                        copydefault = i7 % 128;
                        int i8 = i7 % 2;
                        return unit;
                    }
                    this.component3 = 1;
                    if (FixedDataViewModel.access$get_events$p(FixedDataViewModel.this).emit(new UiEvent.PreValidationRenewalCompleted(fibrePreValidationRenewal), this) == coroutine_suspended) {
                        int i9 = ShareDataUIState + 35;
                        copydefault = i9 % 128;
                        if (i9 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        customerMessage.hashCode();
                        throw null;
                    }
                } else if (responseCode != null && responseCode.intValue() == 201) {
                    int i10 = copydefault + 27;
                    ShareDataUIState = i10 % 128;
                    int i11 = i10 % 2;
                    FibrePreValidationRenewal fibrePreValidationRenewal2 = (FibrePreValidationRenewal) haProxyResponse.getBody();
                    if (fibrePreValidationRenewal2 == null) {
                        int i12 = ShareDataUIState + 119;
                        copydefault = i12 % 128;
                        int i13 = i12 % 2;
                        return Unit.INSTANCE;
                    }
                    this.component3 = 2;
                    if (FixedDataViewModel.access$get_events$p(FixedDataViewModel.this).emit(new UiEvent.PreValidationRenewalFulizaPrompt(fibrePreValidationRenewal2), this) == coroutine_suspended) {
                        int i14 = ShareDataUIState + 3;
                        copydefault = i14 % 128;
                        int i15 = i14 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    MutableSharedFlow mutableSharedFlowAccess$get_events$p = FixedDataViewModel.access$get_events$p(FixedDataViewModel.this);
                    HaProxyResponse.Header header2 = haProxyResponse.getHeader();
                    if (header2 != null) {
                        int i16 = copydefault + 69;
                        ShareDataUIState = i16 % 128;
                        int i17 = i16 % 2;
                        customerMessage = header2.getCustomerMessage();
                    }
                    this.component3 = 3;
                    if (mutableSharedFlowAccess$get_events$p.emit(new UiEvent.ShowError(new BaseException(customerMessage)), this) == coroutine_suspended) {
                        int i18 = ShareDataUIState + 43;
                        copydefault = i18 % 128;
                        int i19 = i18 % 2;
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            m mVar = FixedDataViewModel.this.new m(continuation);
            mVar.component1 = obj;
            m mVar2 = mVar;
            int i2 = ShareDataUIState + 25;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return mVar2;
        }

        public final Object ShareDataUIState(HaProxyResponse<FibrePreValidationRenewal> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 91;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            m mVar = (m) create(haProxyResponse, continuation);
            if (i3 == 0) {
                return mVar.invokeSuspend(Unit.INSTANCE);
            }
            mVar.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Object invoke(HaProxyResponse<FibrePreValidationRenewal> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 107;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(haProxyResponse, continuation);
            int i4 = ShareDataUIState + 25;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objShareDataUIState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void payRenewal(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Integer r22) {
        /*
            r17 = this;
            r9 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r0 = 2
            int r4 = r0 % r0
            int r4 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation
            int r4 = r4 + 111
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt = r5
            int r4 = r4 % r0
            r6 = 0
            java.lang.String r5 = ""
            if (r4 != 0) goto Lac
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            r4 = r21
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L32
            int r4 = r4.length()
            if (r4 != 0) goto L2f
            goto L32
        L2f:
            r0 = r21
            goto L5f
        L32:
            kotlinx.coroutines.flow.StateFlow<com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState> r4 = r9.getARTIFICIAL_FRAME_PACKAGE_NAME
            java.lang.Object r4 = r4.getValue()
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState r4 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState) r4
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState r4 = r4.getCurrentTabState()
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetails r4 = r4.getAccountDetails()
            if (r4 == 0) goto L5e
            int r5 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt
            int r5 = r5 + 97
            int r7 = r5 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation = r7
            int r5 = r5 % r0
            if (r5 == 0) goto L5a
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product r0 = com.huawei.digitalpayment.consumer.fixeddata.data.model.DerivedKt.getMainProduct(r4)
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.getOfferingCode()
            goto L5f
        L5a:
            com.huawei.digitalpayment.consumer.fixeddata.data.model.DerivedKt.getMainProduct(r4)
            throw r6
        L5e:
            r0 = r6
        L5f:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            java.lang.Object[] r16 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5}
            int r14 = com.google.gson.internal.bind.NumberTypeAdapter.AnonymousClass1.component2()
            int r15 = com.google.gson.internal.bind.NumberTypeAdapter.AnonymousClass1.component2()
            int r10 = com.google.gson.internal.bind.NumberTypeAdapter.AnonymousClass1.component2()
            int r13 = com.google.gson.internal.bind.NumberTypeAdapter.AnonymousClass1.component2()
            r11 = -205290181(0xfffffffff3c3853b, float:-3.098145E31)
            r12 = 205290181(0xc3c7ac5, float:1.4519938E-31)
            java.lang.Object r0 = copydefault(r10, r11, r12, r13, r14, r15, r16)
            com.huawei.digitalpayment.consumer.fixeddata.data.model.payRenewal.FibrePaymentRenewalPayload r0 = (com.huawei.digitalpayment.consumer.fixeddata.data.model.payRenewal.FibrePaymentRenewalPayload) r0
            if (r0 != 0) goto L90
            return
        L90:
            r1 = 1
            r2 = 0
            r3 = 0
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$k r4 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$k
            r4.<init>(r0, r6)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$hExternalSyntheticLambda0 r0 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$hExternalSyntheticLambda0
            r0.<init>(r6)
            r5 = r0
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r6 = 0
            r7 = 36
            r8 = 0
            r0 = r17
            ShareDataUIState(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        Lac:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            r0 = r21
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.payRenewal(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/FibrePaymentRenewal;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$payRenewal$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<FibrePaymentRenewal>>>>, Object> {
        private static int component1 = 1;
        private static int component2;
        int component3;
        final FibrePaymentRenewalPayload copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 43;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = component1 + 113;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.throwOnFailure(obj);
            FixedDataRepository fixedDataRepositoryAccess$getFixedDataRepository$p = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this);
            FibrePaymentRenewalPayload fibrePaymentRenewalPayload = this.copydefault;
            if (i5 == 0) {
                return fixedDataRepositoryAccess$getFixedDataRepository$p.payRenewal(fibrePaymentRenewalPayload);
            }
            fixedDataRepositoryAccess$getFixedDataRepository$p.payRenewal(fibrePaymentRenewalPayload);
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(FibrePaymentRenewalPayload fibrePaymentRenewalPayload, Continuation<? super k> continuation) {
            super(1, continuation);
            this.copydefault = fibrePaymentRenewalPayload;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            k kVar = FixedDataViewModel.this.new k(this.copydefault, continuation);
            int i2 = component2 + 93;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return kVar;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<FibrePaymentRenewal>>>> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 41;
            component2 = i2 % 128;
            Continuation<? super Flow<? extends Resource<HaProxyResponse<FibrePaymentRenewal>>>> continuation2 = continuation;
            if (i2 % 2 != 0) {
                component2(continuation2);
                throw null;
            }
            Object objComponent2 = component2(continuation2);
            int i3 = component1 + 73;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return objComponent2;
        }

        public final Object component2(Continuation<? super Flow<Resource<HaProxyResponse<FibrePaymentRenewal>>>> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 83;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((k) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 119;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "resource", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/payRenewal/FibrePaymentRenewal;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$payRenewal$2", f = "FixedDataViewModel.kt", i = {}, l = {376, 378}, m = "invokeSuspend", n = {}, s = {})
    static final class hExternalSyntheticLambda0 extends SuspendLambda implements Function2<HaProxyResponse<FibrePaymentRenewal>, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int copydefault = 1;
        int ShareDataUIState;
        Object component2;

        /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 222
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.hExternalSyntheticLambda0.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        hExternalSyntheticLambda0(Continuation<? super hExternalSyntheticLambda0> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            hExternalSyntheticLambda0 hexternalsyntheticlambda0 = FixedDataViewModel.this.new hExternalSyntheticLambda0(continuation);
            hexternalsyntheticlambda0.component2 = obj;
            hExternalSyntheticLambda0 hexternalsyntheticlambda02 = hexternalsyntheticlambda0;
            int i2 = copydefault + 3;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return hexternalsyntheticlambda02;
        }

        public final Object ShareDataUIState(HaProxyResponse<FibrePaymentRenewal> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 5;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((hExternalSyntheticLambda0) create(haProxyResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 11;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 99 / 0;
            }
            return objInvokeSuspend;
        }

        @Override
        public Object invoke(HaProxyResponse<FibrePaymentRenewal> haProxyResponse, Continuation<? super Unit> continuation) {
            Object objShareDataUIState;
            int i = 2 % 2;
            int i2 = copydefault + 71;
            component1 = i2 % 128;
            HaProxyResponse<FibrePaymentRenewal> haProxyResponse2 = haProxyResponse;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                objShareDataUIState = ShareDataUIState(haProxyResponse2, continuation2);
                int i3 = 71 / 0;
            } else {
                objShareDataUIState = ShareDataUIState(haProxyResponse2, continuation2);
            }
            int i4 = component1 + 63;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objShareDataUIState;
        }
    }

    public static void fetchProducts$default(FixedDataViewModel fixedDataViewModel, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = CoroutineDebuggingKt + 83;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        if ((i2 & 1) != 0) {
            z = false;
        }
        fixedDataViewModel.fetchProducts(z);
        int i6 = coroutineCreation + 59;
        CoroutineDebuggingKt = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void fetchProducts(boolean showLoading) {
        int i2 = 2 % 2;
        ShareDataUIState(this, showLoading, false, null, new c(null), new d(null), new invoke(null), 6, null);
        int i3 = CoroutineDebuggingKt + 73;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchProducts$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<List<? extends FibreProduct>>>>>, Object> {
        private static int ShareDataUIState = 1;
        private static int component1;
        int copydefault;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r4.component3.getAccountState().getValue(), com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState.Inactive.INSTANCE) == false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        
            r5 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.c.ShareDataUIState + 69;
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.c.component1 = r5 % 128;
            r5 = r5 % 2;
            r5 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        
            r5 = r4.component3.getHierarchy();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            r5 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.access$getFixedDataRepository$p(r4.component3).getProducts(r4.component3.getEstateId(), r5, null);
            r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.c.ShareDataUIState + 27;
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.c.component1 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r4.copydefault == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r4.copydefault == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            kotlin.ResultKt.throwOnFailure(r5);
         */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.c.ShareDataUIState
                int r1 = r1 + 21
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.c.component1 = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L1a
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.copydefault
                r2 = 95
                int r2 = r2 / 0
                if (r1 != 0) goto L62
                goto L21
            L1a:
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.copydefault
                if (r1 != 0) goto L62
            L21:
                kotlin.ResultKt.throwOnFailure(r5)
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r5 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.this
                kotlinx.coroutines.flow.StateFlow r5 = r5.getAccountState()
                java.lang.Object r5 = r5.getValue()
                com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState$Inactive r1 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState.Inactive.INSTANCE
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
                r1 = 0
                if (r5 == 0) goto L42
                int r5 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.c.ShareDataUIState
                int r5 = r5 + 69
                int r2 = r5 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.c.component1 = r2
                int r5 = r5 % r0
                r5 = r1
                goto L48
            L42:
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r5 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.this
                java.lang.String r5 = r5.getHierarchy()
            L48:
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r2 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.this
                com.huawei.digitalpayment.consumer.fixeddata.domain.repository.FixedDataRepository r2 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.access$getFixedDataRepository$p(r2)
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r3 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.this
                java.lang.String r3 = r3.getEstateId()
                kotlinx.coroutines.flow.Flow r5 = r2.getProducts(r3, r5, r1)
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.c.ShareDataUIState
                int r1 = r1 + 27
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.c.component1 = r2
                int r1 = r1 % r0
                return r5
            L62:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        c(Continuation<? super c> continuation) {
            super(1, continuation);
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            c cVar = FixedDataViewModel.this.new c(continuation);
            int i2 = component1 + 53;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return cVar;
            }
            throw null;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<List<? extends FibreProduct>>>>> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 71;
            ShareDataUIState = i2 % 128;
            Continuation<? super Flow<? extends Resource<HaProxyResponse<List<? extends FibreProduct>>>>> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component2(continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objComponent2 = component2(continuation2);
            int i3 = ShareDataUIState + 5;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return objComponent2;
        }

        public final Object component2(Continuation<? super Flow<Resource<HaProxyResponse<List<FibreProduct>>>>> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            c cVar = (c) create(continuation);
            if (i3 == 0) {
                cVar.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = cVar.invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 115;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n"}, d2 = {"<anonymous>", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchProducts$2", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements Function2<HaProxyResponse<List<? extends FibreProduct>>, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component2;
        Object component1;
        int copydefault;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[PHI: r4
  0x0042: PHI (r4v6 java.lang.Integer) = (r4v5 java.lang.Integer), (r4v12 java.lang.Integer) binds: [B:14:0x003f, B:11:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            d dVar = FixedDataViewModel.this.new d(continuation);
            dVar.component1 = obj;
            d dVar2 = dVar;
            int i2 = component2 + 21;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return dVar2;
        }

        public final Object copydefault(HaProxyResponse<List<FibreProduct>> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 51;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            d dVar = (d) create(haProxyResponse, continuation);
            if (i3 == 0) {
                dVar.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = dVar.invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 71;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override
        public Object invoke(HaProxyResponse<List<? extends FibreProduct>> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 117;
            ShareDataUIState = i2 % 128;
            HaProxyResponse<List<? extends FibreProduct>> haProxyResponse2 = haProxyResponse;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return copydefault(haProxyResponse2, continuation2);
            }
            copydefault(haProxyResponse2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/huawei/common/exception/BaseException;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchProducts$3", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class invoke extends SuspendLambda implements Function2<BaseException, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int copydefault;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 105;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = component1 + 103;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
            if (i5 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        invoke(Continuation<? super invoke> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            invoke invokeVar = new invoke(continuation);
            int i2 = component1 + 105;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return invokeVar;
        }

        public final Object ShareDataUIState(BaseException baseException, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 21;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((invoke) create(baseException, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 95;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Object invoke(BaseException baseException, Continuation<? super Unit> continuation) {
            Object objShareDataUIState;
            int i = 2 % 2;
            int i2 = copydefault + 77;
            component1 = i2 % 128;
            BaseException baseException2 = baseException;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                objShareDataUIState = ShareDataUIState(baseException2, continuation2);
                int i3 = 80 / 0;
            } else {
                objShareDataUIState = ShareDataUIState(baseException2, continuation2);
            }
            int i4 = component1 + 103;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return objShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void component2() {
            ActivityResultRegistryKtrememberLauncherForActivityResult11ExternalSyntheticLambda0.component1[0] = Class.forName("com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory$1").getDeclaredField("component2");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreFeeQuotation;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchFeeQuotation$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class getSponsorBeneficiariesState extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreFeeQuotation>>>>, Object> {
        private static int component3 = 0;
        private static int copydefault = 1;
        final FibreAccountBalancesPayload ShareDataUIState;
        int component1;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 115;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = copydefault + 123;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.throwOnFailure(obj);
            Flow<Resource<HaProxyResponse<FibreFeeQuotation>>> feeQuotation = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this).getFeeQuotation(this.ShareDataUIState);
            int i6 = component3 + 71;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 92 / 0;
            }
            return feeQuotation;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getSponsorBeneficiariesState(FibreAccountBalancesPayload fibreAccountBalancesPayload, Continuation<? super getSponsorBeneficiariesState> continuation) {
            super(1, continuation);
            this.ShareDataUIState = fibreAccountBalancesPayload;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            getSponsorBeneficiariesState getsponsorbeneficiariesstate = FixedDataViewModel.this.new getSponsorBeneficiariesState(this.ShareDataUIState, continuation);
            int i2 = copydefault + 89;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return getsponsorbeneficiariesstate;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreFeeQuotation>>>> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 79;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(continuation);
            int i4 = copydefault + 85;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objCopydefault;
        }

        public final Object copydefault(Continuation<? super Flow<Resource<HaProxyResponse<FibreFeeQuotation>>>> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 91;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getSponsorBeneficiariesState) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 61;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fetchFeeQuotation(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            kotlinx.coroutines.flow.StateFlow<com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState> r1 = r11.getARTIFICIAL_FRAME_PACKAGE_NAME
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState r1 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState) r1
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState r1 = r1.getCurrentTabState()
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetails r1 = r1.getAccountDetails()
            if (r1 == 0) goto L98
            int r2 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt
            int r2 = r2 + 17
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation = r3
            int r2 = r2 % r0
            java.util.List r1 = r1.getProductList()
            if (r1 == 0) goto L98
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product r5 = (com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product) r5
            java.lang.String r5 = r5.getOfferingId()
            boolean r5 = r2.add(r5)
            if (r5 == 0) goto L39
            int r5 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt
            int r5 = r5 + 109
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L63
            r3.add(r4)
            r4 = 12
            int r4 = r4 / 0
            goto L39
        L63:
            r3.add(r4)
            goto L39
        L67:
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r1)
            r0.<init>(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r1 = r3.iterator()
        L7c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r2 = r1.next()
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product r2 = (com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product) r2
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances.FibreAccountBalancesPayload$Product r3 = new com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances.FibreAccountBalancesPayload$Product
            java.lang.String r2 = r2.getOfferingId()
            r3.<init>(r2)
            r0.add(r3)
            goto L7c
        L95:
            java.util.List r0 = (java.util.List) r0
            goto L9c
        L98:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L9c:
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances.FibreAccountBalancesPayload r1 = new com.huawei.digitalpayment.consumer.fixeddata.data.model.accountBalances.FibreAccountBalancesPayload
            r1.<init>(r12, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$getSponsorBeneficiariesState r12 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$getSponsorBeneficiariesState
            r0 = 0
            r12.<init>(r1, r0)
            r6 = r12
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$CoroutineDebuggingKt r12 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$CoroutineDebuggingKt
            r12.<init>(r0)
            r7 = r12
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$accessartificialFrame r12 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$accessartificialFrame
            r12.<init>(r0)
            r8 = r12
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r9 = 7
            r10 = 0
            r2 = r11
            ShareDataUIState(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.fetchFeeQuotation(java.lang.String):void");
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreFeeQuotation;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchFeeQuotation$2", f = "FixedDataViewModel.kt", i = {}, l = {TypedValues.CycleType.TYPE_WAVE_OFFSET}, m = "invokeSuspend", n = {}, s = {})
    static final class CoroutineDebuggingKt extends SuspendLambda implements Function2<HaProxyResponse<FibreFeeQuotation>, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component2 = 1;
        int component3;
        Object copydefault;

        /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[PHI: r3 r5
  0x00bc: PHI (r3v4 com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse$Header) = 
  (r3v3 com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse$Header)
  (r3v7 com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse$Header)
 binds: [B:36:0x00ba, B:33:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00bc: PHI (r5v10 kotlinx.coroutines.flow.MutableSharedFlow) = (r5v9 kotlinx.coroutines.flow.MutableSharedFlow), (r5v13 kotlinx.coroutines.flow.MutableSharedFlow) binds: [B:36:0x00ba, B:33:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d5 A[RETURN] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 293
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        CoroutineDebuggingKt(Continuation<? super CoroutineDebuggingKt> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            CoroutineDebuggingKt coroutineDebuggingKt = FixedDataViewModel.this.new CoroutineDebuggingKt(continuation);
            coroutineDebuggingKt.copydefault = obj;
            CoroutineDebuggingKt coroutineDebuggingKt2 = coroutineDebuggingKt;
            int i2 = component2 + 17;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return coroutineDebuggingKt2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object ShareDataUIState(HaProxyResponse<FibreFeeQuotation> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 105;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            CoroutineDebuggingKt coroutineDebuggingKt = (CoroutineDebuggingKt) create(haProxyResponse, continuation);
            if (i3 != 0) {
                return coroutineDebuggingKt.invokeSuspend(Unit.INSTANCE);
            }
            coroutineDebuggingKt.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Object invoke(HaProxyResponse<FibreFeeQuotation> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 31;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(haProxyResponse, continuation);
            int i4 = component2 + 1;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
            return objShareDataUIState;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "<unused var>", "Lcom/huawei/common/exception/BaseException;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchFeeQuotation$3", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class accessartificialFrame extends SuspendLambda implements Function2<BaseException, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component3;
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            int i = 2 % 2;
            int i2 = component1 + 33;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlowAccess$get_uiState$p = FixedDataViewModel.access$get_uiState$p(FixedDataViewModel.this);
            do {
                value = mutableStateFlowAccess$get_uiState$p.getValue();
            } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, FixedDataUiState.copy$default((FixedDataUiState) value, false, null, null, null, null, null, null, null, null, null, false, 0L, 3967, null)));
            int i4 = component1 + 125;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return Unit.INSTANCE;
        }

        accessartificialFrame(Continuation<? super accessartificialFrame> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            accessartificialFrame accessartificialframe = FixedDataViewModel.this.new accessartificialFrame(continuation);
            int i2 = component3 + 101;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return accessartificialframe;
        }

        public final Object component1(BaseException baseException, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 53;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((accessartificialFrame) create(baseException, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 81;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override
        public Object invoke(BaseException baseException, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 49;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(baseException, continuation);
            int i4 = component1 + 67;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }
    }

    public final void preValidate(String pin, String amount, String selectedProductId) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(pin, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(selectedProductId, "");
        FibrePreValidationPayload fibrePreValidationPayloadComponent1 = component1(pin, amount, selectedProductId);
        Object obj = null;
        if (fibrePreValidationPayloadComponent1 != null) {
            ShareDataUIState(this, true, false, null, new i(fibrePreValidationPayloadComponent1, null), new valueOf(null), null, 36, null);
            int i3 = coroutineCreation + 63;
            CoroutineDebuggingKt = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = CoroutineDebuggingKt + 49;
        coroutineCreation = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePreValidation;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$preValidate$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<FibrePreValidation>>>>, Object> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        final FibrePreValidationPayload component1;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 69;
            component2 = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                obj2.hashCode();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.copydefault != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Flow<Resource<HaProxyResponse<FibrePreValidation>>> flowPreValidate = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this).preValidate(this.component1);
            int i3 = component2 + 23;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return flowPreValidate;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(FibrePreValidationPayload fibrePreValidationPayload, Continuation<? super i> continuation) {
            super(1, continuation);
            this.component1 = fibrePreValidationPayload;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            i iVar = FixedDataViewModel.this.new i(this.component1, continuation);
            int i2 = ShareDataUIState + 119;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 67 / 0;
            }
            return iVar;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<FibrePreValidation>>>> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            component2 = i2 % 128;
            Continuation<? super Flow<? extends Resource<HaProxyResponse<FibrePreValidation>>>> continuation2 = continuation;
            if (i2 % 2 == 0) {
                ShareDataUIState(continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objShareDataUIState = ShareDataUIState(continuation2);
            int i3 = component2 + 93;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(Continuation<? super Flow<Resource<HaProxyResponse<FibrePreValidation>>>> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 11;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((i) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 79;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 9 / 0;
            }
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePreValidation;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$preValidate$2", f = "FixedDataViewModel.kt", i = {}, l = {445, 448, 450}, m = "invokeSuspend", n = {}, s = {})
    static final class valueOf extends SuspendLambda implements Function2<HaProxyResponse<FibrePreValidation>, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        Object component1;
        int component3;

        /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
        
            if (r9 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
        
            if (r9 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
        
            r8.component3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
        
            if (com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.access$get_events$p(r8.copydefault).emit(new com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent.PreValidationCompleted(r9), r8) != r1) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
        
            r9 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.valueOf.component2 + 29;
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.valueOf.ShareDataUIState = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
        
            if ((r9 % 2) != 0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
        
            r5.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c2, code lost:
        
            if (r9 == null) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
        
            if (r9 == null) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
        
            r9 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.valueOf.component2 + 95;
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.valueOf.ShareDataUIState = r9 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
        
            if ((r9 % 2) != 0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
        
            r9 = kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
        
            r8.component3 = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f2, code lost:
        
            if (com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.access$get_events$p(r8.copydefault).emit(new com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent.PreValidationFulizaPrompt(r9), r8) != r1) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00f4, code lost:
        
            return r1;
         */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 310
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.valueOf.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        valueOf(Continuation<? super valueOf> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            valueOf valueof = FixedDataViewModel.this.new valueOf(continuation);
            valueof.component1 = obj;
            valueOf valueof2 = valueof;
            int i2 = ShareDataUIState + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return valueof2;
        }

        public final Object component1(HaProxyResponse<FibrePreValidation> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 25;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((valueOf) create(haProxyResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 23;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override
        public Object invoke(HaProxyResponse<FibrePreValidation> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 1;
            ShareDataUIState = i2 % 128;
            HaProxyResponse<FibrePreValidation> haProxyResponse2 = haProxyResponse;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component1(haProxyResponse2, continuation2);
            }
            Object objComponent1 = component1(haProxyResponse2, continuation2);
            int i3 = 15 / 0;
            return objComponent1;
        }
    }

    public final void pay(String pin, String amount, List<FibreProduct.Product> selectedProducts, String channelSessionId, Integer useOd) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(pin, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(selectedProducts, "");
        Intrinsics.checkNotNullParameter(channelSessionId, "");
        FibrePaymentPayload fibrePaymentPayloadCopydefault = copydefault(pin, amount, channelSessionId, useOd);
        if (fibrePaymentPayloadCopydefault == null) {
            int i3 = coroutineCreation + 1;
            CoroutineDebuggingKt = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        ShareDataUIState(this, true, false, null, new h(fibrePaymentPayloadCopydefault, null), new g(amount, selectedProducts, null), null, 36, null);
        int i4 = coroutineCreation + 99;
        CoroutineDebuggingKt = i4 % 128;
        int i5 = i4 % 2;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePayment;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$pay$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<FibrePayment>>>>, Object> {
        private static int component2 = 0;
        private static int copydefault = 1;
        final FibrePaymentPayload ShareDataUIState;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = component2 + 13;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.throwOnFailure(obj);
            Flow<Resource<HaProxyResponse<FibrePayment>>> flowPay = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this).pay(this.ShareDataUIState);
            int i4 = copydefault + 109;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return flowPay;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(FibrePaymentPayload fibrePaymentPayload, Continuation<? super h> continuation) {
            super(1, continuation);
            this.ShareDataUIState = fibrePaymentPayload;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            h hVar = FixedDataViewModel.this.new h(this.ShareDataUIState, continuation);
            int i2 = copydefault + 83;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return hVar;
            }
            throw null;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<FibrePayment>>>> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 13;
            component2 = i2 % 128;
            Continuation<? super Flow<? extends Resource<HaProxyResponse<FibrePayment>>>> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component3(continuation2);
            }
            component3(continuation2);
            throw null;
        }

        public final Object component3(Continuation<? super Flow<Resource<HaProxyResponse<FibrePayment>>>> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 123;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            h hVar = (h) create(continuation);
            if (i3 == 0) {
                hVar.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = hVar.invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 61;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePayment;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$pay$2", f = "FixedDataViewModel.kt", i = {}, l = {473}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements Function2<HaProxyResponse<FibrePayment>, Continuation<? super Unit>, Object> {
        private static int component4 = 0;
        private static int getRequestBeneficiariesState = 1;
        int component1;
        final String component2;
        Object component3;
        final List<FibreProduct.Product> copydefault;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[RETURN] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.g.getRequestBeneficiariesState
                int r1 = r1 + 53
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.g.component4 = r2
                int r1 = r1 % r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r12.component1
                r3 = 1
                if (r2 == 0) goto L23
                if (r2 != r3) goto L1b
                kotlin.ResultKt.throwOnFailure(r13)
                goto L8a
            L1b:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L23:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.component3
                com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse r13 = (com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse) r13
                com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse$Header r2 = r13.getHeader()
                r4 = 0
                if (r2 == 0) goto L64
                java.lang.Integer r2 = r2.getResponseCode()
                if (r2 != 0) goto L41
                int r2 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.g.component4
                int r2 = r2 + 27
                int r5 = r2 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.g.getRequestBeneficiariesState = r5
                int r2 = r2 % r0
                goto L64
            L41:
                int r0 = r2.intValue()
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L64
                java.lang.Object r13 = r13.getBody()
                com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePayment r13 = (com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePayment) r13
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r5 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.this
                java.lang.String r6 = r12.component2
                if (r13 == 0) goto L59
                java.lang.String r4 = r13.getTid()
            L59:
                r7 = r4
                java.util.List<com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct$Product> r8 = r12.copydefault
                r9 = 0
                r10 = 8
                r11 = 0
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.changePlan$default(r5, r6, r7, r8, r9, r10, r11)
                goto L8a
            L64:
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r0 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.this
                kotlinx.coroutines.flow.MutableSharedFlow r0 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.access$get_events$p(r0)
                com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse$Header r13 = r13.getHeader()
                if (r13 == 0) goto L74
                java.lang.String r4 = r13.getCustomerMessage()
            L74:
                com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent$ShowError r13 = new com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent$ShowError
                com.huawei.common.exception.BaseException r2 = new com.huawei.common.exception.BaseException
                r2.<init>(r4)
                r13.<init>(r2)
                r2 = r12
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r12.component1 = r3
                java.lang.Object r13 = r0.emit(r13, r2)
                if (r13 != r1) goto L8a
                return r1
            L8a:
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, List<FibreProduct.Product> list, Continuation<? super g> continuation) {
            super(2, continuation);
            this.component2 = str;
            this.copydefault = list;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            g gVar = FixedDataViewModel.this.new g(this.component2, this.copydefault, continuation);
            gVar.component3 = obj;
            g gVar2 = gVar;
            int i2 = component4 + 107;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return gVar2;
        }

        public final Object component3(HaProxyResponse<FibrePayment> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 43;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            g gVar = (g) create(haProxyResponse, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                gVar.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = gVar.invokeSuspend(unit);
            int i4 = getRequestBeneficiariesState + 19;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public Object invoke(HaProxyResponse<FibrePayment> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component4 + 15;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(haProxyResponse, continuation);
            if (i3 == 0) {
                int i4 = 82 / 0;
            }
            int i5 = component4 + 23;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return objComponent3;
        }
    }

    public static void changePlan$default(FixedDataViewModel fixedDataViewModel, String str, String str2, List list, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = CoroutineDebuggingKt;
        int i5 = i4 + 123;
        coroutineCreation = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 8) != 0 : (i2 & 90) != 0) {
            int i6 = i4 + 59;
            coroutineCreation = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        fixedDataViewModel.changePlan(str, str2, list, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181 A[PHI: r11 r12
  0x0181: PHI (r11v18 java.lang.Object) = (r11v17 java.lang.Object), (r11v21 java.lang.Object) binds: [B:67:0x017f, B:64:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0181: PHI (r12v5 java.lang.String) = (r12v4 java.lang.String), (r12v11 java.lang.String) binds: [B:67:0x017f, B:64:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0186 A[PHI: r11 r12
  0x0186: PHI (r11v20 java.lang.Object) = (r11v17 java.lang.Object), (r11v21 java.lang.Object) binds: [B:67:0x017f, B:64:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0186: PHI (r12v8 java.lang.String) = (r12v4 java.lang.String), (r12v11 java.lang.String) binds: [B:67:0x017f, B:64:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void changePlan(java.lang.String r21, java.lang.String r22, java.util.List<com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct.Product> r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.changePlan(java.lang.String, java.lang.String, java.util.List, boolean):void");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$changePlan$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<Object>>>>, Object> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        final FibreChangePlanPayload component1;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 51;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.copydefault != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = ShareDataUIState + 115;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.throwOnFailure(obj);
            FixedDataRepository fixedDataRepositoryAccess$getFixedDataRepository$p = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this);
            FibreChangePlanPayload fibreChangePlanPayload = this.component1;
            if (i5 != 0) {
                return fixedDataRepositoryAccess$getFixedDataRepository$p.changePlan(fibreChangePlanPayload);
            }
            fixedDataRepositoryAccess$getFixedDataRepository$p.changePlan(fibreChangePlanPayload);
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component3(FibreChangePlanPayload fibreChangePlanPayload, Continuation<? super component3> continuation) {
            super(1, continuation);
            this.component1 = fibreChangePlanPayload;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = FixedDataViewModel.this.new component3(this.component1, continuation);
            int i2 = ShareDataUIState + 95;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<Object>>>> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 69;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(continuation);
            int i4 = ShareDataUIState + 121;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objCopydefault;
        }

        public final Object copydefault(Continuation<? super Flow<Resource<HaProxyResponse<Object>>>> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 61;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 77;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$changePlan$2", f = "FixedDataViewModel.kt", i = {}, l = {519, 521}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<HaProxyResponse<Object>, Continuation<? super Unit>, Object> {
        private static int component2 = 0;
        private static int getRequestBeneficiariesState = 1;
        final String ShareDataUIState;
        Object component1;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            String customerMessage;
            Integer responseCode;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component3;
            if (i2 != 0) {
                int i3 = component2 + 35;
                getRequestBeneficiariesState = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                HaProxyResponse haProxyResponse = (HaProxyResponse) this.component1;
                HaProxyResponse.Header header = haProxyResponse.getHeader();
                Object obj2 = null;
                if (header == null || (responseCode = header.getResponseCode()) == null || responseCode.intValue() != 200) {
                    MutableSharedFlow mutableSharedFlowAccess$get_events$p = FixedDataViewModel.access$get_events$p(FixedDataViewModel.this);
                    HaProxyResponse.Header header2 = haProxyResponse.getHeader();
                    if (header2 != null) {
                        customerMessage = header2.getCustomerMessage();
                        int i4 = component2 + 93;
                        getRequestBeneficiariesState = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        customerMessage = null;
                    }
                    this.component3 = 2;
                    if (mutableSharedFlowAccess$get_events$p.emit(new UiEvent.ShowError(new BaseException(customerMessage)), this) == coroutine_suspended) {
                        int i6 = getRequestBeneficiariesState + 77;
                        component2 = i6 % 128;
                        if (i6 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    int i7 = component2 + 59;
                    getRequestBeneficiariesState = i7 % 128;
                    int i8 = i7 % 2;
                    MutableSharedFlow mutableSharedFlowAccess$get_events$p2 = FixedDataViewModel.access$get_events$p(FixedDataViewModel.this);
                    String str = this.ShareDataUIState;
                    HaProxyResponse.Header header3 = haProxyResponse.getHeader();
                    String customerMessage2 = header3 != null ? header3.getCustomerMessage() : null;
                    HaProxyResponse.Header header4 = haProxyResponse.getHeader();
                    String timestamp = header4 != null ? header4.getTimestamp() : null;
                    this.component3 = 1;
                    if (mutableSharedFlowAccess$get_events$p2.emit(new UiEvent.ChangePlanCompleted(str, customerMessage2, timestamp), this) == coroutine_suspended) {
                        int i9 = getRequestBeneficiariesState + 105;
                        component2 = i9 % 128;
                        if (i9 % 2 == 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component1(String str, Continuation<? super component1> continuation) {
            super(2, continuation);
            this.ShareDataUIState = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = FixedDataViewModel.this.new component1(this.ShareDataUIState, continuation);
            component1Var.component1 = obj;
            component1 component1Var2 = component1Var;
            int i2 = getRequestBeneficiariesState + 25;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component1Var2;
        }

        public final Object component3(HaProxyResponse<Object> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 125;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component1 component1Var = (component1) create(haProxyResponse, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return component1Var.invokeSuspend(unit);
            }
            component1Var.invokeSuspend(unit);
            throw null;
        }

        @Override
        public Object invoke(HaProxyResponse<Object> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 101;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(haProxyResponse, continuation);
            if (i3 == 0) {
                int i4 = 7 / 0;
            }
            int i5 = component2 + 117;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return objComponent3;
        }
    }

    public static void addProduct$default(FixedDataViewModel fixedDataViewModel, String str, List list, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = CoroutineDebuggingKt + 83;
        int i5 = i4 % 128;
        coroutineCreation = i5;
        if (i4 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 3) != 0) {
            int i6 = i5 + 115;
            CoroutineDebuggingKt = i6 % 128;
            z = i6 % 2 != 0;
        }
        fixedDataViewModel.addProduct(str, list, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addProduct(java.lang.String r11, java.util.List<com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct.Product> r12, boolean r13) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto Lf
            return
        Lf:
            kotlinx.coroutines.flow.StateFlow<com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState> r2 = r10.getARTIFICIAL_FRAME_PACKAGE_NAME
            java.lang.Object r2 = r2.getValue()
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState r2 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState) r2
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState r2 = r2.getCurrentTabState()
            java.lang.String r2 = r2.getSelectedAccountId()
            if (r2 != 0) goto L32
            int r2 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation
            int r2 = r2 + 117
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L30
            r2 = 13
            int r2 = r2 / 0
        L30:
            r3 = r1
            goto L33
        L32:
            r3 = r2
        L33:
            kotlinx.coroutines.flow.StateFlow<com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState> r1 = r10.getARTIFICIAL_FRAME_PACKAGE_NAME
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState r1 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState) r1
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState r1 = r1.getCurrentTabState()
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetails r1 = r1.getAccountDetails()
            r9 = 0
            if (r1 == 0) goto L5b
            int r2 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation
            int r2 = r2 + 15
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt = r4
            int r2 = r2 % r0
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product r1 = com.huawei.digitalpayment.consumer.fixeddata.data.model.DerivedKt.getMainProduct(r1)
            if (r1 == 0) goto L5b
            java.lang.String r1 = r1.getOfferingId()
            r5 = r1
            goto L5c
        L5b:
            r5 = r9
        L5c:
            kotlinx.coroutines.flow.StateFlow<com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState> r1 = r10.getARTIFICIAL_FRAME_PACKAGE_NAME
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState r1 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState) r1
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState r1 = r1.getCurrentTabState()
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetails r1 = r1.getAccountDetails()
            if (r1 == 0) goto L91
            int r2 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation
            int r2 = r2 + 85
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt = r4
            int r2 = r2 % r0
            com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.Product r1 = com.huawei.digitalpayment.consumer.fixeddata.data.model.DerivedKt.getMainProduct(r1)
            if (r1 == 0) goto L91
            java.lang.String r1 = r1.getOfferingCode()
            int r2 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation
            int r2 = r2 + 89
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L8f
            r0 = 3
            int r0 = r0 / 4
        L8f:
            r6 = r1
            goto L92
        L91:
            r6 = r9
        L92:
            com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreAddProductPayload r0 = new com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreAddProductPayload
            r2 = r0
            r4 = r11
            r7 = r12
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = 1
            r2 = 0
            r3 = 0
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$copydefault r4 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$copydefault
            r4.<init>(r0, r9)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$component2 r0 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$component2
            r0.<init>(r11, r9)
            r5 = r0
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r6 = 0
            r7 = 36
            r8 = 0
            r0 = r10
            ShareDataUIState(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.addProduct(java.lang.String, java.util.List, boolean):void");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$addProduct$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<Object>>>>, Object> {
        private static int component2 = 0;
        private static int component3 = 1;
        final FibreAddProductPayload ShareDataUIState;
        int component1;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
        
            if ((r1 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        
            r0 = 31 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r3.component1 == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r3.component1 == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            kotlin.ResultKt.throwOnFailure(r4);
            r4 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.access$getFixedDataRepository$p(r3.copydefault).addProduct(r3.ShareDataUIState);
            r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.copydefault.component2 + 67;
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.copydefault.component3 = r1 % 128;
         */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.copydefault.component3
                int r1 = r1 + 67
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.copydefault.component2 = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L1a
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.component1
                r2 = 60
                int r2 = r2 / 0
                if (r1 != 0) goto L40
                goto L21
            L1a:
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.component1
                if (r1 != 0) goto L40
            L21:
                kotlin.ResultKt.throwOnFailure(r4)
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r4 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.this
                com.huawei.digitalpayment.consumer.fixeddata.domain.repository.FixedDataRepository r4 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.access$getFixedDataRepository$p(r4)
                com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreAddProductPayload r1 = r3.ShareDataUIState
                kotlinx.coroutines.flow.Flow r4 = r4.addProduct(r1)
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.copydefault.component2
                int r1 = r1 + 67
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.copydefault.component3 = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L3f
                r0 = 31
                int r0 = r0 / 0
            L3f:
                return r4
            L40:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.copydefault.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copydefault(FibreAddProductPayload fibreAddProductPayload, Continuation<? super copydefault> continuation) {
            super(1, continuation);
            this.ShareDataUIState = fibreAddProductPayload;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = FixedDataViewModel.this.new copydefault(this.ShareDataUIState, continuation);
            int i2 = component2 + 89;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return copydefaultVar;
            }
            throw null;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<Object>>>> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 87;
            component3 = i2 % 128;
            Object obj = null;
            Continuation<? super Flow<? extends Resource<HaProxyResponse<Object>>>> continuation2 = continuation;
            if (i2 % 2 == 0) {
                copydefault(continuation2);
                obj.hashCode();
                throw null;
            }
            Object objCopydefault = copydefault(continuation2);
            int i3 = component2 + 123;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return objCopydefault;
            }
            obj.hashCode();
            throw null;
        }

        public final Object copydefault(Continuation<? super Flow<Resource<HaProxyResponse<Object>>>> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 51;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 23;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$addProduct$2", f = "FixedDataViewModel.kt", i = {}, l = {549, 551}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<HaProxyResponse<Object>, Continuation<? super Unit>, Object> {
        private static int copy = 1;
        private static int copydefault;
        int ShareDataUIState;
        final String component2;
        Object component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            String customerMessage;
            Integer responseCode;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.ShareDataUIState;
            if (i2 != 0) {
                if (i2 != 1) {
                    int i3 = copydefault + 109;
                    copy = i3 % 128;
                    if (i3 % 2 != 0 ? i2 != 2 : i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                HaProxyResponse haProxyResponse = (HaProxyResponse) this.component3;
                HaProxyResponse.Header header = haProxyResponse.getHeader();
                if (header == null || (responseCode = header.getResponseCode()) == null || responseCode.intValue() != 200) {
                    MutableSharedFlow mutableSharedFlowAccess$get_events$p = FixedDataViewModel.access$get_events$p(FixedDataViewModel.this);
                    HaProxyResponse.Header header2 = haProxyResponse.getHeader();
                    customerMessage = header2 != null ? header2.getCustomerMessage() : null;
                    this.ShareDataUIState = 2;
                    if (mutableSharedFlowAccess$get_events$p.emit(new UiEvent.ShowError(new BaseException(customerMessage)), this) == coroutine_suspended) {
                        int i4 = copy + 59;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    MutableSharedFlow mutableSharedFlowAccess$get_events$p2 = FixedDataViewModel.access$get_events$p(FixedDataViewModel.this);
                    String str = this.component2;
                    HaProxyResponse.Header header3 = haProxyResponse.getHeader();
                    String customerMessage2 = header3 != null ? header3.getCustomerMessage() : null;
                    HaProxyResponse.Header header4 = haProxyResponse.getHeader();
                    customerMessage = header4 != null ? header4.getTimestamp() : null;
                    this.ShareDataUIState = 1;
                    if (mutableSharedFlowAccess$get_events$p2.emit(new UiEvent.BuyPlanCompleted(str, customerMessage2, customerMessage), this) == coroutine_suspended) {
                        int i6 = copydefault + 45;
                        int i7 = i6 % 128;
                        copy = i7;
                        int i8 = i6 % 2;
                        int i9 = i7 + 91;
                        copydefault = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 5 / 0;
                        }
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(String str, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.component2 = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = FixedDataViewModel.this.new component2(this.component2, continuation);
            component2Var.component3 = obj;
            component2 component2Var2 = component2Var;
            int i2 = copy + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return component2Var2;
        }

        public final Object component2(HaProxyResponse<Object> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 1;
            copy = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(haProxyResponse, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                component2Var.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = component2Var.invokeSuspend(unit);
            int i4 = copy + 29;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 71 / 0;
            }
            return objInvokeSuspend;
        }

        @Override
        public Object invoke(HaProxyResponse<Object> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 107;
            copy = i2 % 128;
            HaProxyResponse<Object> haProxyResponse2 = haProxyResponse;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component2(haProxyResponse2, continuation2);
                throw null;
            }
            Object objComponent2 = component2(haProxyResponse2, continuation2);
            int i3 = copy + 65;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return objComponent2;
        }
    }

    public final void deleteFamilyShareProduct(String accountId) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(accountId, "");
        ShareDataUIState(this, true, false, null, new ShareDataUIState(new FibreAccountDetailsPayload(accountId), null), new getAsAtTimestamp(accountId, null), null, 36, null);
        int i3 = CoroutineDebuggingKt + 15;
        coroutineCreation = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$deleteFamilyShareProduct$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreAccountDetails>>>>, Object> {
        private static int ShareDataUIState = 1;
        private static int component1;
        final FibreAccountDetailsPayload component2;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 69;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Flow<Resource<HaProxyResponse<FibreAccountDetails>>> accountDetails = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this).getAccountDetails(this.component2);
            int i3 = component1 + 43;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return accountDetails;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(FibreAccountDetailsPayload fibreAccountDetailsPayload, Continuation<? super ShareDataUIState> continuation) {
            super(1, continuation);
            this.component2 = fibreAccountDetailsPayload;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = FixedDataViewModel.this.new ShareDataUIState(this.component2, continuation);
            int i2 = component1 + 69;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreAccountDetails>>>> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 53;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(continuation);
            if (i3 != 0) {
                int i4 = 71 / 0;
            }
            return objCopydefault;
        }

        public final Object copydefault(Continuation<? super Flow<Resource<HaProxyResponse<FibreAccountDetails>>>> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 95;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 49;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "resource", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$deleteFamilyShareProduct$2", f = "FixedDataViewModel.kt", i = {}, l = {570, 578}, m = "invokeSuspend", n = {}, s = {})
    static final class getAsAtTimestamp extends SuspendLambda implements Function2<HaProxyResponse<FibreAccountDetails>, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int equals = 1;
        final String component1;
        Object component3;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            String customerMessage;
            Integer responseCode;
            ArrayList arrayList;
            List<Product> productList;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.copydefault;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                int i3 = ShareDataUIState + 111;
                equals = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 2 : i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i4 = ShareDataUIState + 5;
                equals = i4 % 128;
                int i5 = i4 % 2;
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            HaProxyResponse haProxyResponse = (HaProxyResponse) this.component3;
            HaProxyResponse.Header header = haProxyResponse.getHeader();
            if (header == null || (responseCode = header.getResponseCode()) == null || responseCode.intValue() != 200) {
                MutableSharedFlow mutableSharedFlowAccess$get_events$p = FixedDataViewModel.access$get_events$p(FixedDataViewModel.this);
                HaProxyResponse.Header header2 = haProxyResponse.getHeader();
                if (header2 == null || (customerMessage = header2.getCustomerMessage()) == null) {
                    customerMessage = "Failed to delete product";
                }
                this.copydefault = 2;
                if (mutableSharedFlowAccess$get_events$p.emit(new UiEvent.ShowError(new BaseException(customerMessage)), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                FibreAccountDetails fibreAccountDetails = (FibreAccountDetails) haProxyResponse.getBody();
                if (fibreAccountDetails == null || (productList = fibreAccountDetails.getProductList()) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : productList) {
                        String offerInfo = ((Product) obj2).getOfferInfo();
                        if (offerInfo != null && StringsKt.contains((CharSequence) offerInfo, (CharSequence) "FAMILY SHARE", true)) {
                            int i6 = equals + 15;
                            ShareDataUIState = i6 % 128;
                            int i7 = i6 % 2;
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = arrayList2;
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    this.copydefault = 1;
                    if (FixedDataViewModel.access$get_events$p(FixedDataViewModel.this).emit(new UiEvent.ShowError(new BaseException("No Family Share product found to opt out")), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (!(!it.hasNext())) {
                    CollectionsKt.addAll(arrayList4, FixedDataViewModelKt.toProductsList((Product) it.next()));
                }
                FixedDataViewModel.this.deleteProduct(this.component1, arrayList4);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getAsAtTimestamp(String str, Continuation<? super getAsAtTimestamp> continuation) {
            super(2, continuation);
            this.component1 = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getAsAtTimestamp getasattimestamp = FixedDataViewModel.this.new getAsAtTimestamp(this.component1, continuation);
            getasattimestamp.component3 = obj;
            getAsAtTimestamp getasattimestamp2 = getasattimestamp;
            int i2 = equals + 83;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 35 / 0;
            }
            return getasattimestamp2;
        }

        public final Object component1(HaProxyResponse<FibreAccountDetails> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = equals + 87;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            getAsAtTimestamp getasattimestamp = (getAsAtTimestamp) create(haProxyResponse, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return getasattimestamp.invokeSuspend(unit);
            }
            getasattimestamp.invokeSuspend(unit);
            throw null;
        }

        @Override
        public Object invoke(HaProxyResponse<FibreAccountDetails> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 57;
            equals = i2 % 128;
            HaProxyResponse<FibreAccountDetails> haProxyResponse2 = haProxyResponse;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component1(haProxyResponse2, continuation2);
            }
            component1(haProxyResponse2, continuation2);
            throw null;
        }
    }

    public final void deleteProduct(String accountId, List<Product> selectedProducts) {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 21;
        coroutineCreation = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(accountId, "");
            Intrinsics.checkNotNullParameter(selectedProducts, "");
            selectedProducts.isEmpty();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(accountId, "");
        Intrinsics.checkNotNullParameter(selectedProducts, "");
        if (!selectedProducts.isEmpty()) {
            ShareDataUIState(this, true, false, null, new component4(new FibreDeleteProductPayload(accountId, selectedProducts), null), new getRequestBeneficiariesState(null), null, 36, null);
            return;
        }
        int i4 = CoroutineDebuggingKt + 3;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$deleteProduct$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component4 extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<Object>>>>, Object> {
        private static int component2 = 1;
        private static int component3;
        final FibreDeleteProductPayload ShareDataUIState;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 23;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.copydefault != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Flow<Resource<HaProxyResponse<Object>>> flowDeleteProduct = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this).deleteProduct(this.ShareDataUIState);
            int i4 = component3 + 107;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return flowDeleteProduct;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component4(FibreDeleteProductPayload fibreDeleteProductPayload, Continuation<? super component4> continuation) {
            super(1, continuation);
            this.ShareDataUIState = fibreDeleteProductPayload;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            component4 component4Var = FixedDataViewModel.this.new component4(this.ShareDataUIState, continuation);
            int i2 = component2 + 97;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component4Var;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<Object>>>> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 77;
            component2 = i2 % 128;
            Continuation<? super Flow<? extends Resource<HaProxyResponse<Object>>>> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component2(continuation2);
            }
            component2(continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component2(Continuation<? super Flow<Resource<HaProxyResponse<Object>>>> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component4) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 75;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$deleteProduct$2", f = "FixedDataViewModel.kt", i = {}, l = {598, 600}, m = "invokeSuspend", n = {}, s = {})
    static final class getRequestBeneficiariesState extends SuspendLambda implements Function2<HaProxyResponse<Object>, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int copydefault;
        Object ShareDataUIState;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            String customerMessage;
            Integer responseCode;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 != 0) {
                if (i2 != 1) {
                    int i3 = copydefault;
                    int i4 = i3 + 105;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i3 + 101;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                }
                ResultKt.throwOnFailure(obj);
                int i8 = copydefault + 17;
                component1 = i8 % 128;
                int i9 = i8 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                HaProxyResponse haProxyResponse = (HaProxyResponse) this.ShareDataUIState;
                HaProxyResponse.Header header = haProxyResponse.getHeader();
                if (header == null || (responseCode = header.getResponseCode()) == null || responseCode.intValue() != 200) {
                    MutableSharedFlow mutableSharedFlowAccess$get_events$p = FixedDataViewModel.access$get_events$p(FixedDataViewModel.this);
                    HaProxyResponse.Header header2 = haProxyResponse.getHeader();
                    if (header2 != null) {
                        int i10 = copydefault + 43;
                        component1 = i10 % 128;
                        int i11 = i10 % 2;
                        customerMessage = header2.getCustomerMessage();
                    } else {
                        customerMessage = null;
                    }
                    this.component2 = 2;
                    if (mutableSharedFlowAccess$get_events$p.emit(new UiEvent.ShowError(new BaseException(customerMessage)), this) == coroutine_suspended) {
                        int i12 = copydefault + 95;
                        component1 = i12 % 128;
                        if (i12 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                } else {
                    MutableSharedFlow mutableSharedFlowAccess$get_events$p2 = FixedDataViewModel.access$get_events$p(FixedDataViewModel.this);
                    HaProxyResponse.Header header3 = haProxyResponse.getHeader();
                    String customerMessage2 = header3 != null ? header3.getCustomerMessage() : null;
                    this.component2 = 1;
                    if (mutableSharedFlowAccess$get_events$p2.emit(new UiEvent.DeleteProductCompleted(customerMessage2), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        getRequestBeneficiariesState(Continuation<? super getRequestBeneficiariesState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getRequestBeneficiariesState getrequestbeneficiariesstate = FixedDataViewModel.this.new getRequestBeneficiariesState(continuation);
            getrequestbeneficiariesstate.ShareDataUIState = obj;
            getRequestBeneficiariesState getrequestbeneficiariesstate2 = getrequestbeneficiariesstate;
            int i2 = copydefault + 57;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return getrequestbeneficiariesstate2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object component2(HaProxyResponse<Object> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getRequestBeneficiariesState) create(haProxyResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 63;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override
        public Object invoke(HaProxyResponse<Object> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 13;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(haProxyResponse, continuation);
            int i4 = copydefault + 97;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 53 / 0;
            }
            return objComponent2;
        }
    }

    public final void fetchPostpayDetails() {
        int i2 = 2 % 2;
        ShareDataUIState(this, true, false, null, new coroutineBoundary(new FibreAccountDetailsPayload(toLocalMsisdn(this.coroutineBoundary)), null), new getARTIFICIAL_FRAME_PACKAGE_NAME(null), new coroutineCreation(null), 4, null);
        int i3 = CoroutineDebuggingKt + 17;
        coroutineCreation = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchPostpayDetails$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class coroutineBoundary extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreAccountDetails>>>>, Object> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        int component3;
        final FibreAccountDetailsPayload copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = ShareDataUIState + 95;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.throwOnFailure(obj);
            Flow<Resource<HaProxyResponse<FibreAccountDetails>>> accountDetails = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this).getAccountDetails(this.copydefault);
            int i4 = ShareDataUIState + 21;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 7 / 0;
            }
            return accountDetails;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        coroutineBoundary(FibreAccountDetailsPayload fibreAccountDetailsPayload, Continuation<? super coroutineBoundary> continuation) {
            super(1, continuation);
            this.copydefault = fibreAccountDetailsPayload;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            coroutineBoundary coroutineboundary = FixedDataViewModel.this.new coroutineBoundary(this.copydefault, continuation);
            int i2 = ShareDataUIState + 89;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return coroutineboundary;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<FibreAccountDetails>>>> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 99;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(continuation);
            int i4 = component2 + 115;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 82 / 0;
            }
            return objComponent2;
        }

        public final Object component2(Continuation<? super Flow<Resource<HaProxyResponse<FibreAccountDetails>>>> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 91;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((coroutineBoundary) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 75;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "resource", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchPostpayDetails$2", f = "FixedDataViewModel.kt", i = {}, l = {621}, m = "invokeSuspend", n = {}, s = {})
    static final class getARTIFICIAL_FRAME_PACKAGE_NAME extends SuspendLambda implements Function2<HaProxyResponse<FibreAccountDetails>, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component3;
        int component2;
        Object copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            Integer responseCode;
            Object value;
            Object value2;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 != 0) {
                int i3 = component3 + 35;
                component1 = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                HaProxyResponse haProxyResponse = (HaProxyResponse) this.copydefault;
                HaProxyResponse.Header header = haProxyResponse.getHeader();
                if (header != null) {
                    int i4 = component1 + 1;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    responseCode = header.getResponseCode();
                    int i6 = component1 + 51;
                    component3 = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 5 / 4;
                    }
                } else {
                    responseCode = null;
                }
                if (responseCode == null) {
                    int i8 = component1 + 39;
                    component3 = i8 % 128;
                    int i9 = i8 % 2;
                } else if (responseCode.intValue() == 200) {
                    int i10 = component3 + 105;
                    component1 = i10 % 128;
                    int i11 = i10 % 2;
                    FibreAccountDetails fibreAccountDetails = (FibreAccountDetails) haProxyResponse.getBody();
                    MutableStateFlow mutableStateFlowAccess$get_uiState$p = FixedDataViewModel.access$get_uiState$p(FixedDataViewModel.this);
                    do {
                        value = mutableStateFlowAccess$get_uiState$p.getValue();
                    } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, FixedDataUiState.copy$default((FixedDataUiState) value, false, null, fibreAccountDetails, null, null, null, null, null, null, null, false, 0L, 4091, null)));
                    this.component2 = 1;
                    if (FixedDataViewModel.access$get_events$p(FixedDataViewModel.this).emit(new UiEvent.PostPayDetailsRetrieved(fibreAccountDetails), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                MutableStateFlow mutableStateFlowAccess$get_uiState$p2 = FixedDataViewModel.access$get_uiState$p(FixedDataViewModel.this);
                do {
                    value2 = mutableStateFlowAccess$get_uiState$p2.getValue();
                } while (!mutableStateFlowAccess$get_uiState$p2.compareAndSet(value2, FixedDataUiState.copy$default((FixedDataUiState) value2, false, null, null, null, null, null, null, null, null, null, false, 0L, 4091, null)));
            }
            return Unit.INSTANCE;
        }

        getARTIFICIAL_FRAME_PACKAGE_NAME(Continuation<? super getARTIFICIAL_FRAME_PACKAGE_NAME> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getARTIFICIAL_FRAME_PACKAGE_NAME getartificial_frame_package_name = FixedDataViewModel.this.new getARTIFICIAL_FRAME_PACKAGE_NAME(continuation);
            getartificial_frame_package_name.copydefault = obj;
            getARTIFICIAL_FRAME_PACKAGE_NAME getartificial_frame_package_name2 = getartificial_frame_package_name;
            int i2 = component3 + 47;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
            return getartificial_frame_package_name2;
        }

        public final Object component1(HaProxyResponse<FibreAccountDetails> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 31;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            getARTIFICIAL_FRAME_PACKAGE_NAME getartificial_frame_package_name = (getARTIFICIAL_FRAME_PACKAGE_NAME) create(haProxyResponse, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return getartificial_frame_package_name.invokeSuspend(unit);
            }
            getartificial_frame_package_name.invokeSuspend(unit);
            throw null;
        }

        @Override
        public Object invoke(HaProxyResponse<FibreAccountDetails> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 49;
            component1 = i2 % 128;
            HaProxyResponse<FibreAccountDetails> haProxyResponse2 = haProxyResponse;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component1(haProxyResponse2, continuation2);
            }
            component1(haProxyResponse2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "<unused var>", "Lcom/huawei/common/exception/BaseException;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$fetchPostpayDetails$3", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class coroutineCreation extends SuspendLambda implements Function2<BaseException, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int copydefault = 1;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            int i = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlowAccess$get_uiState$p = FixedDataViewModel.access$get_uiState$p(FixedDataViewModel.this);
            int i2 = copydefault + 113;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 % 5;
            }
            do {
                value = mutableStateFlowAccess$get_uiState$p.getValue();
            } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, FixedDataUiState.copy$default((FixedDataUiState) value, false, null, null, null, null, null, null, null, null, null, false, 0L, 4091, null)));
            int i4 = copydefault + 89;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        coroutineCreation(Continuation<? super coroutineCreation> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            coroutineCreation coroutinecreation = FixedDataViewModel.this.new coroutineCreation(continuation);
            int i2 = component1 + 73;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return coroutinecreation;
        }

        public final Object ShareDataUIState(BaseException baseException, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 13;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((coroutineCreation) create(baseException, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 17;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 13 / 0;
            }
            return objInvokeSuspend;
        }

        @Override
        public Object invoke(BaseException baseException, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 31;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(baseException, continuation);
            int i4 = component1 + 111;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return objShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void postPay$default(FixedDataViewModel fixedDataViewModel, List list, String str, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = coroutineCreation + 13;
        CoroutineDebuggingKt = i4 % 128;
        if (i4 % 2 == 0 && (i2 & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i2 & 2) != 0) {
            int i5 = CoroutineDebuggingKt + 35;
            coroutineCreation = i5 % 128;
            int i6 = i5 % 2;
            str = null;
        }
        fixedDataViewModel.postPay(list, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r6 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r6 != null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void postPay(java.util.List<com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct.Product> r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.postPay(java.util.List, java.lang.String):void");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$postPay$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements Function1<Continuation<? super Flow<? extends Resource<HaProxyResponse<Object>>>>, Object> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        final FibrePostPayPayload component1;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 13;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Flow<Resource<HaProxyResponse<Object>>> flowPostPay = FixedDataViewModel.access$getFixedDataRepository$p(FixedDataViewModel.this).postPay(this.component1);
            int i4 = component2 + 119;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return flowPostPay;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(FibrePostPayPayload fibrePostPayPayload, Continuation<? super j> continuation) {
            super(1, continuation);
            this.component1 = fibrePostPayPayload;
        }

        @Override
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i = 2 % 2;
            j jVar = FixedDataViewModel.this.new j(this.component1, continuation);
            int i2 = component2 + 117;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return jVar;
        }

        @Override
        public Object invoke(Continuation<? super Flow<? extends Resource<HaProxyResponse<Object>>>> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 65;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(continuation);
            int i4 = component2 + 27;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(Continuation<? super Flow<Resource<HaProxyResponse<Object>>>> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 37;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 67;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "resource", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$postPay$2", f = "FixedDataViewModel.kt", i = {}, l = {672, 675}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements Function2<HaProxyResponse<Object>, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int equals = 1;
        Object ShareDataUIState;
        final List<FibreProduct.Product> component3;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            String timestamp;
            Object value;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.copydefault;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                HaProxyResponse haProxyResponse = (HaProxyResponse) this.ShareDataUIState;
                HaProxyResponse.Header header = haProxyResponse.getHeader();
                Integer responseCode = header != null ? header.getResponseCode() : null;
                if (responseCode != null && responseCode.intValue() == 200) {
                    boolean zIsNewCustomer = DerivedKt.isNewCustomer(FixedDataViewModel.this.getFtthAccounts(), FixedDataViewModel.this.getUiState().getValue().getCurrentTabState().getSelectedAccountId());
                    if (this.component3.isEmpty() || zIsNewCustomer) {
                        MutableSharedFlow mutableSharedFlowAccess$get_events$p = FixedDataViewModel.access$get_events$p(FixedDataViewModel.this);
                        HaProxyResponse.Header header2 = haProxyResponse.getHeader();
                        if (header2 != null) {
                            int i3 = component1 + 1;
                            equals = i3 % 128;
                            int i4 = i3 % 2;
                            timestamp = header2.getTimestamp();
                        } else {
                            timestamp = null;
                        }
                        HaProxyResponse.Header header3 = haProxyResponse.getHeader();
                        if (header3 != null) {
                            int i5 = equals + 109;
                            component1 = i5 % 128;
                            if (i5 % 2 != 0) {
                                customerMessage = header3.getCustomerMessage();
                                int i6 = 76 / 0;
                            } else {
                                customerMessage = header3.getCustomerMessage();
                            }
                        }
                        this.copydefault = 1;
                        if (mutableSharedFlowAccess$get_events$p.emit(new UiEvent.PostPayCompleted(timestamp, customerMessage), this) == coroutine_suspended) {
                            int i7 = component1 + 5;
                            equals = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i8 = 43 / 0;
                            }
                            return coroutine_suspended;
                        }
                    } else {
                        int i9 = component1 + 103;
                        equals = i9 % 128;
                        int i10 = i9 % 2;
                        MutableStateFlow mutableStateFlowAccess$get_uiState$p = FixedDataViewModel.access$get_uiState$p(FixedDataViewModel.this);
                        do {
                            value = mutableStateFlowAccess$get_uiState$p.getValue();
                        } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, FixedDataUiState.copy$default((FixedDataUiState) value, true, null, null, null, null, null, null, null, null, null, false, 0L, 4094, null)));
                        FixedDataViewModel.this.addProduct(null, this.component3, true);
                    }
                } else {
                    MutableSharedFlow mutableSharedFlowAccess$get_events$p2 = FixedDataViewModel.access$get_events$p(FixedDataViewModel.this);
                    HaProxyResponse.Header header4 = haProxyResponse.getHeader();
                    customerMessage = header4 != null ? header4.getCustomerMessage() : null;
                    this.copydefault = 2;
                    if (mutableSharedFlowAccess$get_events$p2.emit(new UiEvent.ShowError(new BaseException(customerMessage)), this) == coroutine_suspended) {
                        int i11 = equals + 65;
                        component1 = i11 % 128;
                        int i12 = i11 % 2;
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(List<FibreProduct.Product> list, Continuation<? super l> continuation) {
            super(2, continuation);
            this.component3 = list;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            l lVar = FixedDataViewModel.this.new l(this.component3, continuation);
            lVar.ShareDataUIState = obj;
            l lVar2 = lVar;
            int i2 = equals + 81;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return lVar2;
            }
            throw null;
        }

        public final Object ShareDataUIState(HaProxyResponse<Object> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = equals + 39;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((l) create(haProxyResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 39 / 0;
            }
            int i5 = equals + 87;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override
        public Object invoke(HaProxyResponse<Object> haProxyResponse, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = equals + 93;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(haProxyResponse, continuation);
            int i4 = component1 + 31;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                return objShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String toLocalMsisdn(String str) {
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 43;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!(!StringsKt.startsWith$default(str, "254", false, 2, (Object) null))) {
            int i5 = coroutineCreation + 59;
            CoroutineDebuggingKt = i5 % 128;
            int i6 = i5 % 2;
            str = StringsKt.removePrefix(str, (CharSequence) "254");
            if (i6 != 0) {
                int i7 = 88 / 0;
            }
        }
        return str;
    }

    private final FibrePreValidationRenewalPayload component3(String str, String str2, String str3) {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 75;
        coroutineCreation = i3 % 128;
        if (i3 % 2 != 0) {
            String selectedAccountId = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId();
            if (selectedAccountId == null) {
                int i4 = coroutineCreation + 89;
                CoroutineDebuggingKt = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            FibrePreValidationRenewalPayload fibrePreValidationRenewalPayload = new FibrePreValidationRenewalPayload(this.coroutineBoundary, selectedAccountId, str, str2, str3);
            int i6 = CoroutineDebuggingKt + 7;
            coroutineCreation = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 64 / 0;
            }
            return fibrePreValidationRenewalPayload;
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId();
        throw null;
    }

    private static Object component2(Object[] objArr) {
        FixedDataViewModel fixedDataViewModel = (FixedDataViewModel) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        Integer num = (Integer) objArr[5];
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 121;
        coroutineCreation = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            String selectedAccountId = fixedDataViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId();
            if (selectedAccountId == null) {
                return null;
            }
            FibrePaymentRenewalPayload fibrePaymentRenewalPayload = new FibrePaymentRenewalPayload(fixedDataViewModel.coroutineBoundary, null, selectedAccountId, str4, str2, str, str3, String.valueOf(num), 2, null);
            int i4 = CoroutineDebuggingKt + 101;
            coroutineCreation = i4 % 128;
            int i5 = i4 % 2;
            return fibrePaymentRenewalPayload;
        }
        fixedDataViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId();
        obj.hashCode();
        throw null;
    }

    private final FibrePreValidationPayload component1(String str, String str2, String str3) {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 97;
        coroutineCreation = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            String selectedAccountId = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId();
            if (selectedAccountId == null) {
                int i4 = coroutineCreation + 35;
                CoroutineDebuggingKt = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            FibrePreValidationPayload fibrePreValidationPayload = new FibrePreValidationPayload(this.coroutineBoundary, selectedAccountId, str, str2, str3);
            int i6 = CoroutineDebuggingKt + 7;
            coroutineCreation = i6 % 128;
            int i7 = i6 % 2;
            return fibrePreValidationPayload;
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId();
        obj.hashCode();
        throw null;
    }

    private final FibrePaymentPayload copydefault(String str, String str2, String str3, Integer num) {
        String selectedAccountId;
        String str4;
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 55;
        CoroutineDebuggingKt = i3 % 128;
        if (i3 % 2 != 0) {
            selectedAccountId = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId();
            int i4 = 60 / 0;
            if (selectedAccountId == null) {
                return null;
            }
        } else {
            selectedAccountId = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().getCurrentTabState().getSelectedAccountId();
            if (selectedAccountId == null) {
                return null;
            }
        }
        String str5 = selectedAccountId;
        String str6 = this.coroutineBoundary;
        if (num == null) {
            int i5 = CoroutineDebuggingKt + 53;
            coroutineCreation = i5 % 128;
            int i6 = i5 % 2;
            str4 = "0";
        } else {
            str4 = "1";
        }
        return new FibrePaymentPayload(str6, str5, str2, str, str3, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static Job ShareDataUIState(FixedDataViewModel fixedDataViewModel, boolean z, boolean z2, String str, Function1 function1, Function2 function2, Function2 function22, int i2, Object obj) {
        boolean z3;
        String str2;
        int i3 = 2 % 2;
        boolean z4 = (i2 & 1) != 0 ? true : z;
        if ((i2 & 2) != 0) {
            int i4 = CoroutineDebuggingKt + 67;
            coroutineCreation = i4 % 128;
            int i5 = i4 % 2;
            z3 = true;
        } else {
            z3 = z2;
        }
        if ((i2 & 4) != 0) {
            int i6 = CoroutineDebuggingKt + 15;
            coroutineCreation = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            str2 = null;
        } else {
            str2 = str;
        }
        return fixedDataViewModel.component3(z4, z3, str2, function1, (i2 & 16) != 0 ? new f(null) : function2, (i2 & 32) != 0 ? new e(z3, fixedDataViewModel, null) : function22);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$launchWithState$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 103;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
            int i4 = ShareDataUIState + 61;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            f fVar = new f(continuation);
            int i2 = ShareDataUIState + 95;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return fVar;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public Object invoke(Object obj, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 101;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(obj, continuation);
            if (i3 == 0) {
                int i4 = 54 / 0;
            }
            int i5 = copydefault + 115;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return objComponent1;
        }

        public final Object component1(T t, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 41;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((f) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 67 / 0;
            }
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/huawei/common/exception/BaseException;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$launchWithState$2", f = "FixedDataViewModel.kt", i = {}, l = {752}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements Function2<BaseException, Continuation<? super Unit>, Object> {
        private static int copydefault = 0;
        private static int getRequestBeneficiariesState = 1;
        Object ShareDataUIState;
        final FixedDataViewModel component1;
        int component2;
        final boolean component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                BaseException baseException = (BaseException) this.ShareDataUIState;
                if (this.component3) {
                    int i3 = copydefault + 105;
                    getRequestBeneficiariesState = i3 % 128;
                    int i4 = i3 % 2;
                    MutableStateFlow mutableStateFlowAccess$get_uiState$p = FixedDataViewModel.access$get_uiState$p(this.component1);
                    int i5 = copydefault + 47;
                    getRequestBeneficiariesState = i5 % 128;
                    int i6 = i5 % 2;
                    do {
                        value = mutableStateFlowAccess$get_uiState$p.getValue();
                    } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, FixedDataUiState.copy$default((FixedDataUiState) value, false, null, null, null, null, null, null, null, null, null, true, 0L, 3071, null)));
                }
                this.component2 = 1;
                if (FixedDataViewModel.access$get_events$p(this.component1).emit(new UiEvent.ShowError(baseException), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = copydefault + 35;
                getRequestBeneficiariesState = i7 % 128;
                if (i7 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    throw null;
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i8 = copydefault + 65;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z, FixedDataViewModel fixedDataViewModel, Continuation<? super e> continuation) {
            super(2, continuation);
            this.component3 = z;
            this.component1 = fixedDataViewModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            e eVar = new e(this.component3, this.component1, continuation);
            eVar.ShareDataUIState = obj;
            e eVar2 = eVar;
            int i2 = copydefault + 55;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                return eVar2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object component2(BaseException baseException, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 77;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((e) create(baseException, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 47;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Object invoke(BaseException baseException, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 55;
            getRequestBeneficiariesState = i2 % 128;
            Object obj = null;
            BaseException baseException2 = baseException;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component2(baseException2, continuation2);
                obj.hashCode();
                throw null;
            }
            Object objComponent2 = component2(baseException2, continuation2);
            int i3 = copydefault + 93;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 != 0) {
                return objComponent2;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$launchWithState$3", f = "FixedDataViewModel.kt", i = {}, l = {757, 772}, m = "invokeSuspend", n = {}, s = {})
    static final class invokeSuspend extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int copy = 1;
        private static int getAsAtTimestamp;
        final boolean ShareDataUIState;
        final Function2<BaseException, Continuation<? super Unit>, Object> component1;
        final boolean component2;
        final Function1<Continuation<? super Flow<Resource<T>>>, Object> component3;
        int component4;
        final Function2<T, Continuation<? super Unit>, Object> copydefault;
        final String equals;
        final FixedDataViewModel getRequestBeneficiariesState;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huawei/payment/mvvm/Resource;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$launchWithState$3$1", f = "FixedDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5<T> extends SuspendLambda implements Function2<FlowCollector<? super Resource<T>>, Continuation<? super Unit>, Object> {
            private static int component2 = 0;
            private static int equals = 1;
            int ShareDataUIState;
            final String component1;
            final boolean component3;
            final FixedDataViewModel copydefault;

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public final Object invokeSuspend(Object obj) {
                Object value;
                int i = 2 % 2;
                int i2 = equals + 45;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    throw null;
                }
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.ShareDataUIState != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.component3) {
                    FixedDataViewModel.access$getActiveLoadingTasks$p(this.copydefault).add(this.component1);
                    MutableStateFlow mutableStateFlowAccess$get_uiState$p = FixedDataViewModel.access$get_uiState$p(this.copydefault);
                    int i3 = equals + 59;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    do {
                        value = mutableStateFlowAccess$get_uiState$p.getValue();
                    } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, FixedDataUiState.copy$default((FixedDataUiState) value, true, null, null, null, null, null, null, null, null, null, false, 0L, 3070, null)));
                }
                Unit unit = Unit.INSTANCE;
                int i5 = component2 + 9;
                equals = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(boolean z, FixedDataViewModel fixedDataViewModel, String str, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.component3 = z;
                this.copydefault = fixedDataViewModel;
                this.component1 = str;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component3, this.copydefault, this.component1, continuation);
                int i2 = equals + 47;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            @Override
            public Object invoke(Object obj, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = equals + 93;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objCopydefault = copydefault((FlowCollector) obj, continuation);
                int i4 = equals + 107;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return objCopydefault;
                }
                throw null;
            }

            public final Object copydefault(FlowCollector<? super Resource<T>> flowCollector, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 41;
                equals = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass5 anonymousClass5 = (AnonymousClass5) create(flowCollector, continuation);
                if (i3 == 0) {
                    anonymousClass5.invokeSuspend(Unit.INSTANCE);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass5.invokeSuspend(Unit.INSTANCE);
                int i4 = component2 + 49;
                equals = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0015\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tH\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huawei/payment/mvvm/Resource;", "throwable", "", "Lkotlin/ParameterName;", "name", "cause"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$launchWithState$3$2", f = "FixedDataViewModel.kt", i = {}, l = {770}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3<T> extends SuspendLambda implements Function3<FlowCollector<? super Resource<T>>, Throwable, Continuation<? super Unit>, Object> {
            private static int component4 = 0;
            private static int getRequestBeneficiariesState = 1;
            final boolean ShareDataUIState;
            final boolean component1;
            final String component2;
            final Function2<BaseException, Continuation<? super Unit>, Object> component3;
            Object copydefault;
            final FixedDataViewModel equals;
            int getAsAtTimestamp;

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object value;
                FixedDataUiState fixedDataUiState;
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 85;
                component4 = i2 % 128;
                if (i2 % 2 != 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.getAsAtTimestamp;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Throwable th = (Throwable) this.copydefault;
                    if (th instanceof CancellationException) {
                        throw th;
                    }
                    if (this.ShareDataUIState) {
                        int i4 = getRequestBeneficiariesState + 77;
                        component4 = i4 % 128;
                        int i5 = i4 % 2;
                        FixedDataViewModel.access$getActiveLoadingTasks$p(this.equals).remove(this.component2);
                        MutableStateFlow mutableStateFlowAccess$get_uiState$p = FixedDataViewModel.access$get_uiState$p(this.equals);
                        FixedDataViewModel fixedDataViewModel = this.equals;
                        boolean z = this.component1;
                        do {
                            value = mutableStateFlowAccess$get_uiState$p.getValue();
                            fixedDataUiState = (FixedDataUiState) value;
                        } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, FixedDataUiState.copy$default(fixedDataUiState, !FixedDataViewModel.access$getActiveLoadingTasks$p(fixedDataViewModel).isEmpty(), null, null, null, null, null, null, null, null, null, !(z ^ true) ? true : fixedDataUiState.getHasError(), 0L, 3070, null)));
                    }
                    Function2<BaseException, Continuation<? super Unit>, Object> function2 = this.component3;
                    String message = th.getMessage();
                    if (message == null) {
                        message = "An unexpected error occurred";
                    }
                    BaseException baseException = new BaseException(message);
                    this.getAsAtTimestamp = 1;
                    if (function2.invoke(baseException, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = component4 + 87;
                    getRequestBeneficiariesState = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(boolean z, FixedDataViewModel fixedDataViewModel, String str, Function2<? super BaseException, ? super Continuation<? super Unit>, ? extends Object> function2, boolean z2, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.ShareDataUIState = z;
                this.equals = fixedDataViewModel;
                this.component2 = str;
                this.component3 = function2;
                this.component1 = z2;
            }

            @Override
            public Object invoke(Object obj, Throwable th, Continuation<? super Unit> continuation) throws Throwable {
                int i = 2 % 2;
                int i2 = component4 + 115;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                Object objCopydefault = copydefault((FlowCollector) obj, th, continuation);
                int i4 = getRequestBeneficiariesState + 113;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                return objCopydefault;
            }

            public final Object copydefault(FlowCollector<? super Resource<T>> flowCollector, Throwable th, Continuation<? super Unit> continuation) throws Throwable {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.ShareDataUIState, this.equals, this.component2, this.component3, this.component1, continuation);
                anonymousClass3.copydefault = th;
                Object objInvokeSuspend = anonymousClass3.invokeSuspend(Unit.INSTANCE);
                int i2 = component4 + 55;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                return objInvokeSuspend;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$invokeSuspend for r11v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r11.component4
                r3 = 1
                if (r2 == 0) goto L37
                int r4 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.invokeSuspend.copy
                int r4 = r4 + 73
                int r5 = r4 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.invokeSuspend.getAsAtTimestamp = r5
                int r4 = r4 % r0
                if (r4 == 0) goto L1a
                if (r2 == r3) goto L2a
                goto L1c
            L1a:
                if (r2 == r3) goto L2a
            L1c:
                if (r2 != r0) goto L22
                kotlin.ResultKt.throwOnFailure(r12)
                goto L91
            L22:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L2a:
                kotlin.ResultKt.throwOnFailure(r12)
                int r2 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.invokeSuspend.getAsAtTimestamp
                int r2 = r2 + 13
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.invokeSuspend.copy = r3
                int r2 = r2 % r0
                goto L45
            L37:
                kotlin.ResultKt.throwOnFailure(r12)
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.huawei.payment.mvvm.Resource<T>>>, java.lang.Object> r12 = r11.component3
                r11.component4 = r3
                java.lang.Object r12 = r12.invoke(r11)
                if (r12 != r1) goto L45
                return r1
            L45:
                kotlinx.coroutines.flow.Flow r12 = (kotlinx.coroutines.flow.Flow) r12
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$invokeSuspend$5 r2 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$invokeSuspend$5
                boolean r3 = r11.ShareDataUIState
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r4 = r11.getRequestBeneficiariesState
                java.lang.String r5 = r11.equals
                r6 = 0
                r2.<init>(r3, r4, r5, r6)
                kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
                kotlinx.coroutines.flow.Flow r12 = kotlinx.coroutines.flow.FlowKt.onStart(r12, r2)
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$invokeSuspend$3 r9 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$invokeSuspend$3
                boolean r3 = r11.ShareDataUIState
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r4 = r11.getRequestBeneficiariesState
                java.lang.String r5 = r11.equals
                kotlin.jvm.functions.Function2<com.huawei.common.exception.BaseException, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r6 = r11.component1
                boolean r7 = r11.component2
                r8 = 0
                r2 = r9
                r2.<init>(r3, r4, r5, r6, r7, r8)
                kotlin.jvm.functions.Function3 r9 = (kotlin.jvm.functions.Function3) r9
                kotlinx.coroutines.flow.Flow r12 = kotlinx.coroutines.flow.FlowKt.m13404catch(r12, r9)
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$launchWithState$3$3 r10 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$launchWithState$3$3
                boolean r3 = r11.ShareDataUIState
                com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r4 = r11.getRequestBeneficiariesState
                java.lang.String r5 = r11.equals
                kotlin.jvm.functions.Function2<com.huawei.common.exception.BaseException, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r6 = r11.component1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r7 = r11.copydefault
                boolean r8 = r11.component2
                r9 = 0
                r2 = r10
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
                r2 = r11
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r11.component4 = r0
                java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.collectLatest(r12, r10, r2)
                if (r12 != r1) goto L91
                return r1
            L91:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.invokeSuspend.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        invokeSuspend(Function1<? super Continuation<? super Flow<Resource<T>>>, ? extends Object> function1, boolean z, FixedDataViewModel fixedDataViewModel, String str, Function2<? super BaseException, ? super Continuation<? super Unit>, ? extends Object> function2, boolean z2, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super invokeSuspend> continuation) {
            super(2, continuation);
            this.component3 = function1;
            this.ShareDataUIState = z;
            this.getRequestBeneficiariesState = fixedDataViewModel;
            this.equals = str;
            this.component1 = function2;
            this.component2 = z2;
            this.copydefault = function22;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            invokeSuspend invokesuspend = new invokeSuspend(this.component3, this.ShareDataUIState, this.getRequestBeneficiariesState, this.equals, this.component1, this.component2, this.copydefault, continuation);
            int i2 = getAsAtTimestamp + 23;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return invokesuspend;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copy + 123;
            getAsAtTimestamp = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component3(coroutineScope2, continuation2);
            }
            component3(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 93;
            copy = i2 % 128;
            int i3 = i2 % 2;
            invokeSuspend invokesuspend = (invokeSuspend) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return invokesuspend.invokeSuspend(unit);
            }
            invokesuspend.invokeSuspend(unit);
            throw null;
        }
    }

    private final <T> Job component3(boolean z, boolean z2, String str, Function1<? super Continuation<? super Flow<Resource<T>>>, ? extends Object> function1, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super BaseException, ? super Continuation<? super Unit>, ? extends Object> function22) {
        String strValueOf;
        int i2 = 2 % 2;
        int i3 = coroutineCreation;
        int i4 = i3 + 27;
        CoroutineDebuggingKt = i4 % 128;
        int i5 = i4 % 2;
        if (str == null) {
            int i6 = i3 + 81;
            CoroutineDebuggingKt = i6 % 128;
            int i7 = i6 % 2;
            strValueOf = String.valueOf(function1.hashCode());
        } else {
            strValueOf = str;
        }
        return onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new invokeSuspend(function1, z, this, strValueOf, function22, z2, function2, null), 3, null);
    }

    private final void component3() {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 27;
        coroutineCreation = i3 % 128;
        if (i3 % 2 == 0) {
            component1();
            int iComponent2 = NumberTypeAdapter.AnonymousClass1.component2();
            int iComponent22 = NumberTypeAdapter.AnonymousClass1.component2();
            copydefault(NumberTypeAdapter.AnonymousClass1.component2(), 279802845, -279802844, NumberTypeAdapter.AnonymousClass1.component2(), iComponent2, iComponent22, new Object[]{this});
            int i4 = 53 / 0;
            return;
        }
        component1();
        int iComponent23 = NumberTypeAdapter.AnonymousClass1.component2();
        int iComponent24 = NumberTypeAdapter.AnonymousClass1.component2();
        copydefault(NumberTypeAdapter.AnonymousClass1.component2(), 279802845, -279802844, NumberTypeAdapter.AnonymousClass1.component2(), iComponent23, iComponent24, new Object[]{this});
    }

    private final void component1() {
        FixedDataUiState value;
        FixedDataUiState fixedDataUiStateCopy$default;
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 99;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        Job job = this.getAsAtTimestamp;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            int i5 = coroutineCreation + 17;
            CoroutineDebuggingKt = i5 % 128;
            int i6 = i5 % 2;
        }
        this.getAsAtTimestamp = null;
        FixedDataType fixedDataType = this.toString;
        if (fixedDataType != null) {
            MutableStateFlow<FixedDataUiState> mutableStateFlow = this.component2;
            do {
                value = mutableStateFlow.getValue();
                fixedDataUiStateCopy$default = value;
                FixedDataTabState fixedDataTabState = fixedDataUiStateCopy$default.getTabStates().get(fixedDataType);
                if (fixedDataTabState != null) {
                    FixedDataTabState fixedDataTabStateCopy$default = FixedDataTabState.copy$default(fixedDataTabState, false, false, null, null, null, null, null, 126, null);
                    Map mutableMap = MapsKt.toMutableMap(fixedDataUiStateCopy$default.getTabStates());
                    mutableMap.put(fixedDataType, fixedDataTabStateCopy$default);
                    fixedDataUiStateCopy$default = FixedDataUiState.copy$default(fixedDataUiStateCopy$default, false, null, null, null, null, mutableMap, null, null, null, null, false, 0L, 3038, null);
                }
            } while (!mutableStateFlow.compareAndSet(value, fixedDataUiStateCopy$default));
        }
        this.toString = null;
        int i7 = coroutineCreation + 75;
        CoroutineDebuggingKt = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static Object copydefault(Object[] objArr) {
        FixedDataUiState value;
        FixedDataUiState fixedDataUiStateCopy$default;
        FixedDataViewModel fixedDataViewModel = (FixedDataViewModel) objArr[0];
        int i2 = 2 % 2;
        Job job = fixedDataViewModel.getRequestBeneficiariesState;
        if (job != null) {
            int i3 = CoroutineDebuggingKt + 43;
            coroutineCreation = i3 % 128;
            int i4 = i3 % 2;
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        fixedDataViewModel.getRequestBeneficiariesState = null;
        FixedDataType fixedDataType = fixedDataViewModel.copy;
        if (fixedDataType != null) {
            int i5 = coroutineCreation + 31;
            CoroutineDebuggingKt = i5 % 128;
            int i6 = i5 % 2;
            MutableStateFlow<FixedDataUiState> mutableStateFlow = fixedDataViewModel.component2;
            do {
                value = mutableStateFlow.getValue();
                fixedDataUiStateCopy$default = value;
                FixedDataTabState fixedDataTabState = fixedDataUiStateCopy$default.getTabStates().get(fixedDataType);
                if (fixedDataTabState != null) {
                    FixedDataTabState fixedDataTabStateCopy$default = FixedDataTabState.copy$default(fixedDataTabState, false, false, null, null, null, null, null, 126, null);
                    Map mutableMap = MapsKt.toMutableMap(fixedDataUiStateCopy$default.getTabStates());
                    mutableMap.put(fixedDataType, fixedDataTabStateCopy$default);
                    fixedDataUiStateCopy$default = FixedDataUiState.copy$default(fixedDataUiStateCopy$default, false, null, null, null, null, mutableMap, null, null, null, null, false, 0L, 3038, null);
                }
            } while (!mutableStateFlow.compareAndSet(value, fixedDataUiStateCopy$default));
        }
        fixedDataViewModel.copy = null;
        return null;
    }

    private static final FixedDataTabState ShareDataUIState(AccountDetailsUiModel accountDetailsUiModel, FixedDataTabState fixedDataTabState) {
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 69;
        CoroutineDebuggingKt = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(accountDetailsUiModel, "");
            Intrinsics.checkNotNullParameter(fixedDataTabState, "");
            return FixedDataTabState.copy$default(fixedDataTabState, false, true, null, null, null, null, accountDetailsUiModel, 100, null);
        }
        Intrinsics.checkNotNullParameter(accountDetailsUiModel, "");
        Intrinsics.checkNotNullParameter(fixedDataTabState, "");
        return FixedDataTabState.copy$default(fixedDataTabState, false, true, null, null, null, null, accountDetailsUiModel, 12, null);
    }

    private final Object component3(FixedDataType fixedDataType, String str, final AccountDetailsUiModel accountDetailsUiModel, String str2, Continuation<? super Unit> continuation) {
        int i2 = 2 % 2;
        copydefault(fixedDataType, str, new Function1() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 89;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                AccountDetailsUiModel accountDetailsUiModel2 = accountDetailsUiModel;
                FixedDataTabState fixedDataTabState = (FixedDataTabState) obj;
                if (i5 != 0) {
                    return FixedDataViewModel.$r8$lambda$y2oPgxIGu7t651Aoag67Arhalfw(accountDetailsUiModel2, fixedDataTabState);
                }
                FixedDataViewModel.$r8$lambda$y2oPgxIGu7t651Aoag67Arhalfw(accountDetailsUiModel2, fixedDataTabState);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        MutableSharedFlow<UiEvent> mutableSharedFlow = this.copydefault;
        if (str2 == null) {
            int i3 = CoroutineDebuggingKt + 107;
            coroutineCreation = i3 % 128;
            int i4 = i3 % 2;
            str2 = "An unexpected error occurred";
        }
        Object objEmit = mutableSharedFlow.emit(new UiEvent.ShowError(new BaseException(str2)), continuation);
        if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i5 = CoroutineDebuggingKt + 125;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
        return objEmit;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel$Companion;", "", "<init>", "()V", "SELECTED_FIXED_DATA_TYPE", "", "SELECTED_ACCOUNT_ID_PREFIX", "getAccountSpKey", "type", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 0;
        private static int component3 = 1;

        private Companion() {
        }

        public final String getAccountSpKey(FixedDataType type) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(type, "");
            String str = FixedDataViewModel.component3 + type.getCode();
            int i2 = component2 + 29;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final List<Account> getFtthAccounts() {
        List<AccountList> accountList;
        Object next;
        int i2 = 2 % 2;
        int i3 = coroutineCreation + 91;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        FibreUserDetails userDetails = this.component2.getValue().getUserDetails();
        if (userDetails == null || (accountList = userDetails.getAccountList()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = accountList.iterator();
        while (it.hasNext()) {
            int i5 = CoroutineDebuggingKt + 113;
            coroutineCreation = i5 % 128;
            if (i5 % 2 == 0) {
                next = it.next();
                Set<String> set = this.getShareableDataState;
                String lowerCase = ((AccountList) next).getLastMile().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                boolean zContains = set.contains(lowerCase);
                int i6 = 12 / 0;
                if (zContains) {
                    arrayList.add(next);
                }
            } else {
                next = it.next();
                Set<String> set2 = this.getShareableDataState;
                String lowerCase2 = ((AccountList) next).getLastMile().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                if (set2.contains(lowerCase2)) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((AccountList) it2.next()).getAccounts());
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void copydefault(com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType r24, java.lang.String r25, kotlin.jvm.functions.Function1<? super com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState, com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState> r26) {
        /*
            r23 = this;
            r0 = r24
            r1 = r25
            r2 = 2
            int r3 = r2 % r2
            int r3 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt
            int r3 = r3 + 107
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation = r4
            int r3 = r3 % r2
            r3 = r23
            kotlinx.coroutines.flow.MutableStateFlow<com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState> r4 = r3.component2
        L14:
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState r6 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState) r6
            java.util.Map r7 = r6.getTabStates()
            java.lang.Object r7 = r7.get(r0)
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState r7 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState) r7
            if (r7 != 0) goto L39
            int r7 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt
            int r7 = r7 + 9
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation = r8
            int r7 = r7 % r2
            if (r7 == 0) goto L34
            goto La3
        L34:
            r0 = 0
            r0.hashCode()
            throw r0
        L39:
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType r8 = r6.getSelectedFixedDataType()
            if (r8 != r0) goto La3
            int r8 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt
            int r8 = r8 + 5
            int r9 = r8 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation = r9
            int r8 = r8 % r2
            if (r8 != 0) goto L59
            java.lang.String r8 = r7.getSelectedAccountId()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r1)
            r9 = 12
            int r9 = r9 / 0
            if (r8 != 0) goto L64
            goto La3
        L59:
            java.lang.String r8 = r7.getSelectedAccountId()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r1)
            if (r8 != 0) goto L64
            goto La3
        L64:
            java.util.Map r8 = r6.getTabStates()
            java.util.Map r12 = kotlin.collections.MapsKt.toMutableMap(r8)
            r15 = r26
            java.lang.Object r7 = r15.invoke(r7)
            r12.put(r0, r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 4063(0xfdf, float:5.693E-42)
            r22 = 0
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r20 = r21
            r21 = r22
            com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState r6 = com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21)
            int r7 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.coroutineCreation
            int r7 = r7 + 65
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.CoroutineDebuggingKt = r8
            int r7 = r7 % r2
        La3:
            boolean r5 = r4.compareAndSet(r5, r6)
            if (r5 == 0) goto L14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel.copydefault(com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    public static FixedDataTabState $r8$lambda$y2oPgxIGu7t651Aoag67Arhalfw(AccountDetailsUiModel accountDetailsUiModel, FixedDataTabState fixedDataTabState) {
        int i2 = 2 % 2;
        int i3 = CoroutineDebuggingKt + 9;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        FixedDataTabState fixedDataTabStateShareDataUIState = ShareDataUIState(accountDetailsUiModel, fixedDataTabState);
        if (i4 == 0) {
            int i5 = 19 / 0;
        }
        int i6 = coroutineCreation + 53;
        CoroutineDebuggingKt = i6 % 128;
        int i7 = i6 % 2;
        return fixedDataTabStateShareDataUIState;
    }

    static {
        int i2 = f2668a + 15;
        f2669b = i2 % 128;
        int i3 = i2 % 2;
    }

    private final FibrePaymentRenewalPayload component1(String str, String str2, String str3, String str4, Integer num) {
        int iComponent2 = NumberTypeAdapter.AnonymousClass1.component2();
        int iComponent22 = NumberTypeAdapter.AnonymousClass1.component2();
        return (FibrePaymentRenewalPayload) copydefault(NumberTypeAdapter.AnonymousClass1.component2(), -205290181, 205290181, NumberTypeAdapter.AnonymousClass1.component2(), iComponent2, iComponent22, new Object[]{this, str, str2, str3, str4, num});
    }

    private final void component2() {
        int iComponent2 = NumberTypeAdapter.AnonymousClass1.component2();
        int iComponent22 = NumberTypeAdapter.AnonymousClass1.component2();
        copydefault(NumberTypeAdapter.AnonymousClass1.component2(), 279802845, -279802844, NumberTypeAdapter.AnonymousClass1.component2(), iComponent2, iComponent22, new Object[]{this});
    }
}
