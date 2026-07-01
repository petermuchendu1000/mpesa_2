package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.net.HttpHeaders;
import com.huawei.digitalpayment.consumer.sfcui.api.model.FavoriteBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent;", "", "Add", "Delete", "Reorder", "OnReorderCompleted", HttpHeaders.REFRESH, "ClearToast", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent$Add;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent$ClearToast;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent$Delete;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent$OnReorderCompleted;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent$Refresh;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent$Reorder;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FavouriteBundlesEvent {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent$Add;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent;", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;)V", "getBundle", "()Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Add implements FavouriteBundlesEvent {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int component3;
        private final FavoriteBundle copydefault;

        public Add(FavoriteBundle favoriteBundle) {
            Intrinsics.checkNotNullParameter(favoriteBundle, "");
            this.copydefault = favoriteBundle;
        }

        public final FavoriteBundle getBundle() {
            int i = 2 % 2;
            int i2 = component3 + 77;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.copydefault;
            }
            throw null;
        }

        static {
            int i = 1 + 123;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public static Add copy$default(Add add, FavoriteBundle favoriteBundle, int i, Object obj) {
            FavoriteBundle favoriteBundle2;
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component1;
                int i4 = i3 + 61;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    favoriteBundle2 = add.copydefault;
                    int i5 = 93 / 0;
                } else {
                    favoriteBundle2 = add.copydefault;
                }
                int i6 = i3 + 61;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                favoriteBundle = favoriteBundle2;
            }
            Add addCopy = add.copy(favoriteBundle);
            int i8 = component1 + 45;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 93 / 0;
            }
            return addCopy;
        }

        public final FavoriteBundle component1() {
            FavoriteBundle favoriteBundle;
            int i = 2 % 2;
            int i2 = component1 + 71;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 != 0) {
                favoriteBundle = this.copydefault;
                int i4 = 74 / 0;
            } else {
                favoriteBundle = this.copydefault;
            }
            int i5 = i3 + 9;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return favoriteBundle;
        }

        public final Add copy(FavoriteBundle bundle) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(bundle, "");
            Add add = new Add(bundle);
            int i2 = component1 + 19;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return add;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 105;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this != other) {
                return (other instanceof Add) && Intrinsics.areEqual(this.copydefault, ((Add) other).copydefault);
            }
            int i4 = i2 + 11;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 45;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            FavoriteBundle favoriteBundle = this.copydefault;
            if (i3 == 0) {
                return favoriteBundle.hashCode();
            }
            favoriteBundle.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Add(bundle=" + this.copydefault + ")";
            int i2 = component3 + 49;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 59 / 0;
            }
            return str;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent$Delete;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent;", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;)V", "getBundle", "()Lcom/huawei/digitalpayment/consumer/sfcui/api/model/FavoriteBundle;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Delete implements FavouriteBundlesEvent {
        public static final int $stable = 8;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int copydefault = 57 % 128;
        private final FavoriteBundle component3;

        public Delete(FavoriteBundle favoriteBundle) {
            Intrinsics.checkNotNullParameter(favoriteBundle, "");
            this.component3 = favoriteBundle;
        }

        public final FavoriteBundle getBundle() {
            FavoriteBundle favoriteBundle;
            int i = 2 % 2;
            int i2 = component1 + 57;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 == 0) {
                favoriteBundle = this.component3;
                int i4 = 70 / 0;
            } else {
                favoriteBundle = this.component3;
            }
            int i5 = i3 + 33;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return favoriteBundle;
        }

        static {
            if (57 % 2 == 0) {
                throw null;
            }
        }

        public static Delete copy$default(Delete delete, FavoriteBundle favoriteBundle, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 41;
            ShareDataUIState = i3 % 128;
            int i4 = i & 1;
            if (i3 % 2 != 0 ? i4 != 0 : i4 != 0) {
                favoriteBundle = delete.component3;
            }
            Delete deleteCopy = delete.copy(favoriteBundle);
            int i5 = ShareDataUIState + 103;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 85 / 0;
            }
            return deleteCopy;
        }

        public final FavoriteBundle component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 65;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            FavoriteBundle favoriteBundle = this.component3;
            int i4 = i2 + 61;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return favoriteBundle;
            }
            throw null;
        }

        public final Delete copy(FavoriteBundle bundle) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(bundle, "");
            Delete delete = new Delete(bundle);
            int i2 = ShareDataUIState + 73;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return delete;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component1 + 121;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof Delete) {
                return Intrinsics.areEqual(this.component3, ((Delete) other).component3);
            }
            int i4 = component1 + 23;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 27;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            FavoriteBundle favoriteBundle = this.component3;
            if (i3 != 0) {
                return favoriteBundle.hashCode();
            }
            favoriteBundle.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Delete(bundle=" + this.component3 + ")";
            int i2 = component1 + 91;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent$Reorder;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent;", "from", "", TypedValues.TransitionType.S_TO, "<init>", "(II)V", "getFrom", "()I", "getTo", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Reorder implements FavouriteBundlesEvent {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int copydefault = 33 % 128;
        private static int getAsAtTimestamp = 1;
        private final int ShareDataUIState;
        private final int component3;

        public Reorder(int i, int i2) {
            this.ShareDataUIState = i;
            this.component3 = i2;
        }

        public final int getFrom() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 57;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.ShareDataUIState;
            int i6 = i2 + 69;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final int getTo() {
            int i = 2 % 2;
            int i2 = component2 + 25;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            int i5 = this.component3;
            int i6 = i3 + 91;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 33 / 0;
            }
            return i5;
        }

        static {
            int i = 33 % 2;
        }

        public static Reorder copy$default(Reorder reorder, int i, int i2, int i3, Object obj) {
            int i4 = 2 % 2;
            int i5 = getAsAtTimestamp + 1;
            component2 = i5 % 128;
            if (i5 % 2 == 0 ? (i3 & 1) != 0 : (i3 & 1) != 0) {
                i = reorder.ShareDataUIState;
            }
            if ((i3 & 2) != 0) {
                i2 = reorder.component3;
            }
            Reorder reorderCopy = reorder.copy(i, i2);
            int i6 = component2 + 35;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 80 / 0;
            }
            return reorderCopy;
        }

        public final int component1() {
            int i = 2 % 2;
            int i2 = component2 + 25;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            int i5 = this.ShareDataUIState;
            int i6 = i3 + 5;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final int component2() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 103;
            getAsAtTimestamp = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = this.component3;
            int i5 = i2 + 87;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            obj.hashCode();
            throw null;
        }

        public final Reorder copy(int from, int to) {
            int i = 2 % 2;
            Reorder reorder = new Reorder(from, to);
            int i2 = getAsAtTimestamp + 113;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return reorder;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 47;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof Reorder)) {
                int i4 = getAsAtTimestamp + 103;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 0;
                }
                return false;
            }
            Reorder reorder = (Reorder) other;
            if (this.ShareDataUIState != reorder.ShareDataUIState) {
                int i6 = component2 + 37;
                getAsAtTimestamp = i6 % 128;
                return i6 % 2 == 0;
            }
            if (this.component3 != reorder.component3) {
                int i7 = component2 + 59;
                getAsAtTimestamp = i7 % 128;
                return i7 % 2 == 0;
            }
            int i8 = component2 + 65;
            getAsAtTimestamp = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 17 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 41;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (Integer.hashCode(this.ShareDataUIState) * 31) + Integer.hashCode(this.component3);
            int i4 = component2 + 99;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Reorder(from=" + this.ShareDataUIState + ", to=" + this.component3 + ")";
            int i2 = component2 + 99;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent$OnReorderCompleted;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnReorderCompleted implements FavouriteBundlesEvent {
        public static final int $stable = 0;
        public static final OnReorderCompleted INSTANCE = new OnReorderCompleted();
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;

        private OnReorderCompleted() {
        }

        static {
            int i = component3 + 113;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 29;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == other) {
                int i4 = i2 + 11;
                component2 = i4 % 128;
                return i4 % 2 != 0;
            }
            if (!(other instanceof OnReorderCompleted)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 43;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 67;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 71 / 0;
            }
            return -1948064868;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 61;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 51;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return "OnReorderCompleted";
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent$Refresh;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Refresh implements FavouriteBundlesEvent {
        public static final int $stable = 0;
        public static final Refresh INSTANCE = new Refresh();
        private static int component2 = 0;
        private static int component3 = 1;

        private Refresh() {
        }

        static {
            int i = component3 + 59;
            component2 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent$ClearToast;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/FavouriteBundlesEvent;", "<init>", "()V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClearToast implements FavouriteBundlesEvent {
        public static final int $stable = 0;
        public static final ClearToast INSTANCE = new ClearToast();
        private static int component1 = 1;
        private static int copydefault;

        private ClearToast() {
        }

        static {
            int i = component1 + 79;
            copydefault = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
