package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.ExtensionMethodsKt;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.Bundle;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.PackageList;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.SubBundles;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaBundleResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesEvent;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.ktor.http.cio.HttpParserKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0007J\u0014\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\tJ\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0012\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020%H\u0002J\u0014\u0010&\u001a\u00020\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\t*\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\b\u0010)\u001a\u00020\u001aH\u0002J\u000e\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020!H\u0002J\u0010\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u0007H\u0002J\b\u00101\u001a\u00020\u001aH\u0002J\b\u00102\u001a\u00020\u001aH\u0002J\b\u00103\u001a\u00020\u001aH\u0002J\u0018\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0007H\u0002J\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\tH\u0002J\u0010\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesViewModel;", "Landroidx/lifecycle/ViewModel;", "appContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isBlazer", "", "tunukiwaResponse", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TunukiwaBundleResp;", "_searchBundlesState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesUIState;", "searchBundlesState", "getSearchBundlesState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_isLoading", GriverMonitorConstants.KEY_IS_LOADING, "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "allBundles", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;", "specialOffers", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/BundleSection;", "toggleLoading", "", "updateWithExpiryBundles", "plans", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Plans;", "extractIcon", "", "productName", "", "extractValidity", "extractBundleType", "item", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/SubBundles;", "updateSpecialOffers", FavouriteBundlesService.BUNDLES_PARAM, "mapToBundles", "showSpecialOffers", "onEvent", "event", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent;", "updateSearchInputValue", "searchInput", "handleDialogState", "showDialog", "makeSortFiltersActive", "clearAllSortAndFilterTypes", "filterBundlesList", "updateSortFilterValues", "sortFilterType", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;", "isSelected", "associateBundles", "getSortOrder", "validityStr", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SearchBundlesViewModel extends ViewModel {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int getShareableDataState = 1;
    private static int getSponsorBeneficiariesState = 0;
    private static int hashCode = 1;
    private boolean ShareDataUIState;
    private List<Bundle> component1;
    private final Context component2;
    private final MutableStateFlow<Boolean> component3;
    private final MutableStateFlow<SearchBundlesUIState> copy;
    private final MutableStateFlow<SearchBundlesUIState> copydefault;
    private final StateFlow<Boolean> equals;
    private List<BundleSection> getAsAtTimestamp;
    private List<TunukiwaBundleResp> getRequestBeneficiariesState;

    public static Object component1(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        SearchBundlesUIState value;
        int i7 = ~((~i6) | i);
        int i8 = (~((~i) | (~i2))) | i7;
        int i9 = i | i2;
        int i10 = i + i2 + i3 + ((-39394691) * i5) + ((-2104995841) * i4);
        int i11 = i10 * i10;
        int i12 = ((i * 1773844906) - 1404835566) + (i2 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (1773845519 * i3) + (1055723859 * i5) + (1996616689 * i4) + (i11 * (-1450508288));
        if ((i * (-1880913482)) + 198443008 + ((-1880913482) * i2) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i3) + ((-1529085952) * i5) + ((-319553536) * i4) + ((-289079296) * i11) + (i12 * i12 * (-778371072)) == 1) {
            return copydefault(objArr);
        }
        SearchBundlesViewModel searchBundlesViewModel = (SearchBundlesViewModel) objArr[0];
        int i13 = 2 % 2;
        int i14 = hashCode;
        int i15 = i14 + 59;
        getSponsorBeneficiariesState = i15 % 128;
        int i16 = i15 % 2;
        MutableStateFlow<SearchBundlesUIState> mutableStateFlow = searchBundlesViewModel.copydefault;
        int i17 = i14 + 1;
        getSponsorBeneficiariesState = i17 % 128;
        int i18 = i17 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, SearchBundlesUIState.copy$default(value, null, null, null, searchBundlesViewModel.getAsAtTimestamp, false, false, null, 119, null)));
        return null;
    }

    public static final int access$getSortOrder(SearchBundlesViewModel searchBundlesViewModel, String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 9;
        hashCode = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            searchBundlesViewModel.component1(str);
            throw null;
        }
        int iComponent1 = searchBundlesViewModel.component1(str);
        int i3 = getSponsorBeneficiariesState + 65;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            return iComponent1;
        }
        obj.hashCode();
        throw null;
    }

    @Inject
    public SearchBundlesViewModel(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.component2 = context;
        this.ShareDataUIState = SPUtils.getInstance().getBoolean(Keys.KEY_SHOOK_ELIGIBILITY, false);
        MutableStateFlow<SearchBundlesUIState> MutableStateFlow = StateFlowKt.MutableStateFlow(new SearchBundlesUIState(null, null, null, null, false, false, null, 127, null));
        this.copydefault = MutableStateFlow;
        this.copy = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(true);
        this.component3 = MutableStateFlow2;
        this.equals = FlowKt.asStateFlow(MutableStateFlow2);
        this.component1 = CollectionsKt.emptyList();
        this.getAsAtTimestamp = CollectionsKt.emptyList();
    }

    public final MutableStateFlow<SearchBundlesUIState> getSearchBundlesState() {
        int i = 2 % 2;
        int i2 = hashCode + 41;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        MutableStateFlow<SearchBundlesUIState> mutableStateFlow = this.copy;
        int i5 = i3 + 83;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    public final StateFlow<Boolean> isLoading() {
        int i = 2 % 2;
        int i2 = hashCode + 107;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.equals;
        }
        throw null;
    }

    public final void toggleLoading(boolean isLoading) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 85;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        this.component3.setValue(Boolean.valueOf(isLoading));
        if (i3 == 0) {
            throw null;
        }
    }

    public final void updateWithExpiryBundles(List<Plans> plans) {
        ArrayList arrayListEmptyList;
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(plans, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(OtherBundleTypes.DAILY_BUNDLES.getType(), OtherBundleTypes.SEVEN_DAY_BUNDLES.getType(), OtherBundleTypes.ALL_IN_ONE_BUNDLES.getType(), OtherBundleTypes.THIRTY_DAY_BUNDLES.getType(), OtherBundleTypes.ANGAZA_BUNDLES.getType(), OtherBundleTypes.DATA_SAVE_BUNDLE.getType(), OtherBundleTypes.DAILY_SMS.getType(), OtherBundleTypes.WEEKLY_SMS.getType(), OtherBundleTypes.MONTHLY_SMS.getType(), OtherBundleTypes.VIDEO_BUNDLES.getType(), OtherBundleTypes.LITE_HEAVY_ROAMING_BUNDLES.getType(), OtherBundleTypes.VODAFONE_VODACOM_ROAMING_BUNDLES.getType(), OtherBundleTypes.INTERNATIONAL_BUNDLES.getType());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : plans) {
            if (!(!CollectionsKt.contains(arrayListArrayListOf, ((Plans) obj).getPackageName()))) {
                int i2 = getSponsorBeneficiariesState + 59;
                hashCode = i2 % 128;
                int i3 = i2 % 2;
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            Object obj2 = null;
            if (!it.hasNext()) {
                List<TunukiwaBundleResp> list = this.getRequestBeneficiariesState;
                if (list != null) {
                    int i4 = hashCode + 51;
                    getSponsorBeneficiariesState = i4 % 128;
                    if (i4 % 2 != 0) {
                        arrayList.addAll(copydefault(list));
                        throw null;
                    }
                    arrayList.addAll(copydefault(list));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (!(!it2.hasNext())) {
                    Object next = it2.next();
                    Bundle bundle = (Bundle) next;
                    if (!(!this.ShareDataUIState) || !StringsKt.contains((CharSequence) bundle.getName(), (CharSequence) Keys.BUNDLE_TYPE_SHOOK, true)) {
                        arrayList3.add(next);
                    }
                }
                this.component1 = arrayList3;
                return;
            }
            Plans plans2 = (Plans) it.next();
            List<PackageList> packageList = plans2.getPackageList();
            int i5 = 0;
            if (packageList != null) {
                ArrayList arrayList4 = new ArrayList();
                Iterator<T> it3 = packageList.iterator();
                while (it3.hasNext()) {
                    List<SubBundles> childBundles = ((PackageList) it3.next()).getChildBundles();
                    if (childBundles == null) {
                        int i6 = hashCode + 107;
                        getSponsorBeneficiariesState = i6 % 128;
                        if (i6 % 2 != 0) {
                            childBundles = CollectionsKt.emptyList();
                            int i7 = 51 / 0;
                        } else {
                            childBundles = CollectionsKt.emptyList();
                        }
                    }
                    CollectionsKt.addAll(arrayList4, childBundles);
                }
                arrayListEmptyList = arrayList4;
            } else {
                arrayListEmptyList = CollectionsKt.emptyList();
            }
            Iterator it4 = arrayListEmptyList.iterator();
            while (it4.hasNext()) {
                int i8 = hashCode + 95;
                getSponsorBeneficiariesState = i8 % 128;
                if (i8 % 2 != 0) {
                    SubBundles subBundles = (SubBundles) it4.next();
                    component2(subBundles.getProductName());
                    subBundles.getProductId();
                    throw null;
                }
                SubBundles subBundles2 = (SubBundles) it4.next();
                int iComponent2 = component2(subBundles2.getProductName());
                String productId = subBundles2.getProductId();
                String str4 = productId == null ? "" : productId;
                String productName = subBundles2.getProductName();
                if (productName == null) {
                    int i9 = getSponsorBeneficiariesState + 85;
                    int i10 = i9 % 128;
                    hashCode = i10;
                    int i11 = i9 % 2;
                    int i12 = i10 + 65;
                    getSponsorBeneficiariesState = i12 % 128;
                    int i13 = i12 % 2;
                    str = "";
                } else {
                    str = productName;
                }
                String type = subBundles2.getType();
                String str5 = type == null ? "" : type;
                Integer productAmount = subBundles2.getProductAmount();
                float fIntValue = productAmount != null ? productAmount.intValue() : i5;
                CounterUnits counterUnits = CounterUnits.KES;
                String strComponent1 = component1(subBundles2);
                String strShareDataUIState = ShareDataUIState(subBundles2.getProductName());
                List listEmptyList = CollectionsKt.emptyList();
                List listEmptyList2 = CollectionsKt.emptyList();
                String packageName = plans2.getPackageName();
                if (packageName == null) {
                    int i14 = getSponsorBeneficiariesState + 5;
                    hashCode = i14 % 128;
                    if (i14 % 2 == 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    str2 = "";
                } else {
                    str2 = packageName;
                }
                String balanceCode = subBundles2.getBalanceCode();
                if (balanceCode == null) {
                    int i15 = getSponsorBeneficiariesState + 77;
                    hashCode = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 3 % 3;
                    }
                    str3 = "";
                } else {
                    str3 = balanceCode;
                }
                arrayList.add(new Bundle(iComponent2, str4, str, str5, fIntValue, counterUnits, null, null, listEmptyList, listEmptyList2, null, null, null, null, strComponent1, null, strShareDataUIState, str2, str3, 48320, null));
                int i17 = hashCode + 69;
                getSponsorBeneficiariesState = i17 % 128;
                int i18 = i17 % 2;
                i5 = 0;
            }
        }
    }

    private final int component2(String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = getSponsorBeneficiariesState + 109;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.drawable.ic_one_app_bundle;
        if (str == null) {
            return i5;
        }
        int i6 = getSponsorBeneficiariesState + 43;
        hashCode = i6 % 128;
        int i7 = i6 % 2;
        String str2 = str;
        if (StringsKt.contains((CharSequence) str2, (CharSequence) "voice", true)) {
            int i8 = hashCode + 47;
            getSponsorBeneficiariesState = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = R.drawable.ic_bundles_voice;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i = R.drawable.ic_bundles_voice;
        } else {
            i = StringsKt.contains((CharSequence) str2, (CharSequence) Keys.BUNDLE_TYPE_SMS, true) ? R.drawable.ic_sms_bundles : R.drawable.ic_one_app_bundle;
        }
        return i;
    }

    private final String ShareDataUIState(String str) {
        int i = 2 % 2;
        if (str != null) {
            String str2 = str;
            String str3 = "weekly";
            if (!StringsKt.contains((CharSequence) str2, (CharSequence) "weekly", true)) {
                int i2 = hashCode + 75;
                getSponsorBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                if (!StringsKt.contains((CharSequence) str2, (CharSequence) "7day", true)) {
                    str3 = "monthly";
                    if (!StringsKt.contains((CharSequence) str2, (CharSequence) "monthly", true) && !StringsKt.contains((CharSequence) str2, (CharSequence) "30day", true)) {
                        str3 = "daily";
                        if (!StringsKt.contains((CharSequence) str2, (CharSequence) "daily", true)) {
                            int i4 = getSponsorBeneficiariesState + 35;
                            hashCode = i4 % 128;
                            int i5 = i4 % 2;
                            if (!StringsKt.contains((CharSequence) str2, (CharSequence) "24hr", true)) {
                                int i6 = getSponsorBeneficiariesState + 47;
                                hashCode = i6 % 128;
                                int i7 = i6 % 2;
                                if (!StringsKt.contains((CharSequence) str2, (CharSequence) "24 hr", true) && !StringsKt.contains((CharSequence) str2, (CharSequence) "midnight", true)) {
                                    if (StringsKt.contains((CharSequence) str2, (CharSequence) "hr", true)) {
                                        int i8 = getSponsorBeneficiariesState + 101;
                                        hashCode = i8 % 128;
                                        int i9 = i8 % 2;
                                        return "hourly";
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return str3;
        }
        return "other";
    }

    private final String component1(SubBundles subBundles) {
        int i = 2 % 2;
        if (subBundles.getProductName() == null) {
            return null;
        }
        if (StringsKt.contains((CharSequence) subBundles.getProductName(), (CharSequence) Keys.BUNDLE_TYPE_SMS, true)) {
            int i2 = getSponsorBeneficiariesState + 33;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            return Keys.BUNDLE_TYPE_SMS;
        }
        if (!StringsKt.contains((CharSequence) subBundles.getProductName(), (CharSequence) "mb", true)) {
            int i4 = hashCode + 17;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            if (!StringsKt.contains((CharSequence) subBundles.getProductName(), (CharSequence) "gb", true)) {
                return "voice";
            }
        }
        return "data";
    }

    public final void updateSpecialOffers(List<TunukiwaBundleResp> bundles) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundles, "");
        this.getRequestBeneficiariesState = bundles;
        String string = this.component2.getString(R.string.gsm_special_offers);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = bundles.iterator();
        while (it.hasNext()) {
            int i2 = hashCode + 83;
            getSponsorBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.areEqual(((TunukiwaBundleResp) it.next()).getTunukiwaTypeDisplay(), Keys.TUNUKIWA_CATEGORY_MINUTES);
                throw null;
            }
            Object next = it.next();
            if (!(!Intrinsics.areEqual(((TunukiwaBundleResp) next).getTunukiwaTypeDisplay(), Keys.TUNUKIWA_CATEGORY_MINUTES))) {
                arrayList.add(next);
            }
        }
        this.getAsAtTimestamp = CollectionsKt.listOf(new BundleSection(string, copydefault(arrayList)));
        component1(710505138, -710505138, new Object[]{this}, HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), HttpParserKt.component2.component2());
        int i3 = getSponsorBeneficiariesState + 81;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onEvent(SearchBundlesEvent event) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof SearchBundlesEvent.OnSortTypeSelected) {
            Object[] objArr = {this, ((SearchBundlesEvent.OnSortTypeSelected) event).getSortFilterType(), true};
            int iComponent2 = HttpParserKt.component2.component2();
            component1(1141084021, -1141084020, objArr, HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), iComponent2);
            return;
        }
        if (Intrinsics.areEqual(event, SearchBundlesEvent.OnApply.INSTANCE)) {
            copydefault();
            return;
        }
        if (Intrinsics.areEqual(event, SearchBundlesEvent.OnClearAll.INSTANCE)) {
            int i2 = getSponsorBeneficiariesState + 77;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            component1();
            return;
        }
        if (Intrinsics.areEqual(event, SearchBundlesEvent.OnDialogDismissed.INSTANCE)) {
            int i4 = hashCode + 21;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            ShareDataUIState(false);
            int i6 = hashCode + 49;
            getSponsorBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        if (Intrinsics.areEqual(event, SearchBundlesEvent.OnShowDialog.INSTANCE)) {
            ShareDataUIState(true);
            return;
        }
        if (event instanceof SearchBundlesEvent.OnSearchInput) {
            component3(((SearchBundlesEvent.OnSearchInput) event).getSearchInput());
            return;
        }
        if (!(event instanceof SearchBundlesEvent.OnSortTypeUnSelected)) {
            throw new NoWhenBranchMatchedException();
        }
        int i8 = hashCode + 9;
        getSponsorBeneficiariesState = i8 % 128;
        int i9 = i8 % 2;
        Object[] objArr2 = {this, ((SearchBundlesEvent.OnSortTypeUnSelected) event).getSortFilterType(), false};
        int iComponent22 = HttpParserKt.component2.component2();
        component1(1141084021, -1141084020, objArr2, HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), iComponent22);
    }

    private final void component3(String str) {
        SearchBundlesUIState value;
        int i = 2 % 2;
        int i2 = hashCode + 15;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<SearchBundlesUIState> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, SearchBundlesUIState.copy$default(value, null, null, null, null, false, false, str, 63, null)));
        if (str.length() > 0) {
            int i4 = hashCode + 69;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            ShareDataUIState();
        } else {
            int iComponent2 = HttpParserKt.component2.component2();
            component1(710505138, -710505138, new Object[]{this}, HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), iComponent2);
        }
        int i6 = getSponsorBeneficiariesState + 49;
        hashCode = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void copydefault() {
        SortFilterUiModel sortFilterUiModelCopy$default;
        SortFilterUiModel sortFilterUiModelCopy$default2;
        SearchBundlesUIState value;
        int i = 2 % 2;
        SortFilterUiModel selectedFilterByValidity = this.copydefault.getValue().getSelectedFilterByValidity();
        SortFilterUiModel sortFilterUiModelCopy$default3 = null;
        if (selectedFilterByValidity != null) {
            sortFilterUiModelCopy$default = SortFilterUiModel.copy$default(selectedFilterByValidity, null, true, 1, null);
            int i2 = hashCode + 101;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
        } else {
            sortFilterUiModelCopy$default = null;
        }
        SortFilterUiModel selectedFilterByType = this.copydefault.getValue().getSelectedFilterByType();
        if (selectedFilterByType != null) {
            int i4 = getSponsorBeneficiariesState + 79;
            hashCode = i4 % 128;
            sortFilterUiModelCopy$default2 = i4 % 2 == 0 ? SortFilterUiModel.copy$default(selectedFilterByType, null, true, 1, null) : SortFilterUiModel.copy$default(selectedFilterByType, null, true, 1, null);
        } else {
            sortFilterUiModelCopy$default2 = null;
        }
        SortFilterUiModel selectedSortFilterSortPrice = this.copydefault.getValue().getSelectedSortFilterSortPrice();
        if (selectedSortFilterSortPrice != null) {
            int i5 = getSponsorBeneficiariesState + 115;
            hashCode = i5 % 128;
            sortFilterUiModelCopy$default3 = i5 % 2 == 0 ? SortFilterUiModel.copy$default(selectedSortFilterSortPrice, null, false, 0, null) : SortFilterUiModel.copy$default(selectedSortFilterSortPrice, null, true, 1, null);
        }
        MutableStateFlow<SearchBundlesUIState> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, SearchBundlesUIState.copy$default(value, sortFilterUiModelCopy$default3, sortFilterUiModelCopy$default2, sortFilterUiModelCopy$default, null, false, false, null, 104, null)));
        ShareDataUIState();
    }

    private static Object copydefault(Object[] objArr) {
        SearchBundlesUIState value;
        SearchBundlesUIState value2;
        SearchBundlesUIState value3;
        SearchBundlesUIState value4;
        SearchBundlesUIState value5;
        boolean z = false;
        SearchBundlesViewModel searchBundlesViewModel = (SearchBundlesViewModel) objArr[0];
        ISortFilterType iSortFilterType = (ISortFilterType) objArr[1];
        int i = 2;
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i2 = 2 % 2;
        int i3 = hashCode;
        int i4 = i3 + 41;
        getSponsorBeneficiariesState = i4 % 128;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i4 % 2 != 0) {
            boolean z2 = iSortFilterType instanceof SortByPrice;
            throw null;
        }
        if (iSortFilterType instanceof SortByPrice) {
            int i5 = i3 + 97;
            getSponsorBeneficiariesState = i5 % 128;
            if (i5 % 2 != 0) {
                MutableStateFlow<SearchBundlesUIState> mutableStateFlow = searchBundlesViewModel.copydefault;
                throw null;
            }
            MutableStateFlow<SearchBundlesUIState> mutableStateFlow2 = searchBundlesViewModel.copydefault;
            do {
                value5 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value5, SearchBundlesUIState.copy$default(value5, zBooleanValue ? new SortFilterUiModel(iSortFilterType, z, i, defaultConstructorMarker) : null, null, null, null, false, false, null, 126, null)));
        } else if (iSortFilterType instanceof FilterByType) {
            int i6 = i3 + 107;
            getSponsorBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            MutableStateFlow<SearchBundlesUIState> mutableStateFlow3 = searchBundlesViewModel.copydefault;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, SearchBundlesUIState.copy$default(value2, null, zBooleanValue ? new SortFilterUiModel(iSortFilterType, z, i, defaultConstructorMarker) : null, null, null, false, false, null, 125, null)));
        } else if (iSortFilterType instanceof FilterByValidity) {
            MutableStateFlow<SearchBundlesUIState> mutableStateFlow4 = searchBundlesViewModel.copydefault;
            do {
                value = mutableStateFlow4.getValue();
            } while (!mutableStateFlow4.compareAndSet(value, SearchBundlesUIState.copy$default(value, null, null, zBooleanValue ? new SortFilterUiModel(iSortFilterType, z, i, defaultConstructorMarker) : null, null, false, false, null, 123, null)));
        }
        SortFilterUiModel selectedFilterByValidity = searchBundlesViewModel.copydefault.getValue().getSelectedFilterByValidity();
        SortFilterUiModel selectedFilterByType = searchBundlesViewModel.copydefault.getValue().getSelectedFilterByType();
        SortFilterUiModel selectedSortFilterSortPrice = searchBundlesViewModel.copydefault.getValue().getSelectedSortFilterSortPrice();
        if (selectedFilterByValidity == null && selectedFilterByType == null && selectedSortFilterSortPrice == null) {
            int i8 = getSponsorBeneficiariesState + 83;
            hashCode = i8 % 128;
            int i9 = i8 % 2;
            MutableStateFlow<SearchBundlesUIState> mutableStateFlow5 = searchBundlesViewModel.copydefault;
            do {
                value4 = mutableStateFlow5.getValue();
            } while (!mutableStateFlow5.compareAndSet(value4, SearchBundlesUIState.copy$default(value4, null, null, null, null, false, false, null, 95, null)));
        } else {
            MutableStateFlow<SearchBundlesUIState> mutableStateFlow6 = searchBundlesViewModel.copydefault;
            do {
                value3 = mutableStateFlow6.getValue();
            } while (!mutableStateFlow6.compareAndSet(value3, SearchBundlesUIState.copy$default(value3, null, null, null, null, false, true, null, 95, null)));
        }
        if (!zBooleanValue) {
            searchBundlesViewModel.ShareDataUIState();
        }
        int i10 = hashCode + 59;
        getSponsorBeneficiariesState = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 82 / 0;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final int component1(String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 51;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        switch (lowerCase.hashCode()) {
            case -1211426191:
                if (lowerCase.equals("hourly")) {
                    return 0;
                }
                break;
            case -791707519:
                if (lowerCase.equals("weekly")) {
                    return 2;
                }
                break;
            case 95346201:
                if (lowerCase.equals("daily")) {
                    return 1;
                }
                break;
            case 1236635661:
                if (lowerCase.equals("monthly")) {
                    return 3;
                }
                break;
        }
        int i4 = hashCode + 9;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 2;
        }
        return 4;
    }

    private final List<Bundle> copydefault(List<TunukiwaBundleResp> list) {
        String str;
        int i = 2 % 2;
        List<TunukiwaBundleResp> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (!(!it.hasNext())) {
            int i2 = hashCode + 81;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            TunukiwaBundleResp tunukiwaBundleResp = (TunukiwaBundleResp) it.next();
            int iComponent2 = component2(tunukiwaBundleResp.getOfferName());
            String strValueOf = String.valueOf(tunukiwaBundleResp.getOfferID());
            String appText = tunukiwaBundleResp.getAppText();
            if (appText == null) {
                int i4 = hashCode + 67;
                getSponsorBeneficiariesState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 60 / 0;
                }
                str = "";
            } else {
                str = appText;
            }
            String tunukiwaTypeDisplay = tunukiwaBundleResp.getTunukiwaTypeDisplay();
            String offerPrice = tunukiwaBundleResp.getOfferPrice();
            if (offerPrice == null) {
                int i6 = hashCode + 55;
                getSponsorBeneficiariesState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 61 / 0;
                }
                offerPrice = "0";
            }
            arrayList.add(new Bundle(iComponent2, strValueOf, str, tunukiwaTypeDisplay, Float.parseFloat(offerPrice), CounterUnits.KES, null, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, null, null, null, Keys.BUNDLE_TYPE_TUNUKIWA, tunukiwaBundleResp.getOfferType(), ShareDataUIState(tunukiwaBundleResp.getOfferName()), null, null, 408768, null));
        }
        ArrayList arrayList2 = arrayList;
        int i8 = getSponsorBeneficiariesState + 61;
        hashCode = i8 % 128;
        if (i8 % 2 != 0) {
            return arrayList2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ShareDataUIState(boolean z) {
        SearchBundlesUIState value;
        int i = 2 % 2;
        int i2 = hashCode + 7;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        MutableStateFlow<SearchBundlesUIState> mutableStateFlow = this.copydefault;
        int i5 = i3 + 117;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, SearchBundlesUIState.copy$default(value, null, null, null, null, z, false, null, 111, null)));
    }

    private final void component1() {
        SearchBundlesUIState value;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 23;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<SearchBundlesUIState> mutableStateFlow = this.copydefault;
        int i5 = i2 + 47;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 % 5;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, SearchBundlesUIState.copy$default(value, null, null, null, null, false, false, null, 88, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c A[PHI: r8
  0x019c: PHI (r8v24 java.lang.String) = (r8v23 java.lang.String), (r8v29 java.lang.String) binds: [B:76:0x019a, B:73:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ShareDataUIState() {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesViewModel.ShareDataUIState():void");
    }

    private final List<BundleSection> component1(List<Bundle> list) {
        int i = 2 % 2;
        List listSortedWith = CollectionsKt.sortedWith(list, new Comparator() {
            private static int component2 = 1;
            private static int copydefault;

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public final int compare(T t, T t2) {
                int i2 = 2 % 2;
                int i3 = copydefault + 75;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                int iCompareValues = ComparisonsKt.compareValues(Integer.valueOf(SearchBundlesViewModel.access$getSortOrder(this.component1, ((Bundle) t).getValidityStr())), Integer.valueOf(SearchBundlesViewModel.access$getSortOrder(this.component1, ((Bundle) t2).getValidityStr())));
                int i5 = component2 + 59;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 29 / 0;
                }
                return iCompareValues;
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listSortedWith) {
            String strCapitalizeNames = ExtensionMethodsKt.capitalizeNames(((Bundle) obj).getValidityStr());
            Object obj2 = linkedHashMap.get(strCapitalizeNames);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(strCapitalizeNames, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        int i2 = hashCode + 95;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new BundleSection((String) entry.getKey(), (List) entry.getValue()));
        }
        ArrayList arrayList2 = arrayList;
        int i4 = hashCode + 37;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return arrayList2;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    static {
        int i = 1 + 19;
        component4 = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    private final void component3() {
        int iComponent2 = HttpParserKt.component2.component2();
        component1(710505138, -710505138, new Object[]{this}, HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), iComponent2);
    }

    private final void ShareDataUIState(ISortFilterType iSortFilterType, boolean z) {
        Object[] objArr = {this, iSortFilterType, Boolean.valueOf(z)};
        int iComponent2 = HttpParserKt.component2.component2();
        component1(1141084021, -1141084020, objArr, HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), iComponent2);
    }
}
