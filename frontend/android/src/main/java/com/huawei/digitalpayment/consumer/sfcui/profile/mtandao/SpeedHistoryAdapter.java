package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.SpeedTestsHistoryData;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.MtandaoUtils;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u0016\u0017B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/SpeedHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/SpeedHistoryItem;", "<init>", "(Ljava/util/List;)V", "submitList", "", "newItems", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "holder", "Companion", "HeaderViewHolder", "ItemViewHolder", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpeedHistoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int ShareDataUIState = 0;
    private static final int component1 = 1;
    private static int component3 = 1;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private List<? extends SpeedHistoryItem> component2;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SpeedHistoryAdapter(List<? extends SpeedHistoryItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.component2 = list;
    }

    public final void submitList(List<? extends SpeedHistoryItem> newItems) {
        int i = 2 % 2;
        int i2 = equals + 83;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(newItems, "");
        this.component2 = newItems;
        notifyDataSetChanged();
        int i4 = getAsAtTimestamp + 67;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/SpeedHistoryAdapter$Companion;", "", "<init>", "()V", "TYPE_HEADER", "", "TYPE_ITEM", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override
    public int getItemViewType(int position) {
        int i = 2 % 2;
        SpeedHistoryItem speedHistoryItem = this.component2.get(position);
        if (!(!(speedHistoryItem instanceof SpeedHistoryItem.DateHeader))) {
            int i2 = getAsAtTimestamp + 15;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 103;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        if (speedHistoryItem instanceof SpeedHistoryItem.TestItem) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040 A[PHI: r1
  0x0040: PHI (r1v8 android.view.LayoutInflater) = (r1v5 android.view.LayoutInflater), (r1v10 android.view.LayoutInflater) binds: [B:8:0x002d, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r1
  0x002f: PHI (r1v6 android.view.LayoutInflater) = (r1v5 android.view.LayoutInflater), (r1v10 android.view.LayoutInflater) binds: [B:8:0x002d, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.getAsAtTimestamp
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.equals = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 != 0) goto L22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            android.content.Context r1 = r5.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 46
            int r2 = r2 / r3
            if (r6 != 0) goto L40
            goto L2f
        L22:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            android.content.Context r1 = r5.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            if (r6 != 0) goto L40
        L2f:
            int r6 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_mtandao_dateheader
            android.view.View r5 = r1.inflate(r6, r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter$HeaderViewHolder r6 = new com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter$HeaderViewHolder
            r6.<init>(r5)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r6
            goto L50
        L40:
            int r6 = com.huawei.digitalpayment.consumer.sfc.R.layout.item_mtandao_speedtest
            android.view.View r5 = r1.inflate(r6, r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter$ItemViewHolder r6 = new com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter$ItemViewHolder
            r6.<init>(r5)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r6
        L50:
            int r5 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.getAsAtTimestamp
            int r5 = r5 + 9
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.equals = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L5e
            r5 = 55
            int r5 = r5 / r3
        L5e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = equals + 123;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            this.component2.size();
            throw null;
        }
        int size = this.component2.size();
        int i3 = equals + 93;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 50 / 0;
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[PHI: r6
  0x003c: PHI (r6v3 com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem) = 
  (r6v2 com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem)
  (r6v11 com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem)
 binds: [B:8:0x0032, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[PHI: r6
  0x0034: PHI (r6v8 com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem) = 
  (r6v2 com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem)
  (r6v11 com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem)
 binds: [B:8:0x0032, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.getAsAtTimestamp
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.equals = r2
            int r1 = r1 % r0
            r2 = 1
            java.lang.String r3 = ""
            if (r1 != 0) goto L25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            java.util.List<? extends com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem> r1 = r4.component2
            java.lang.Object r6 = r1.get(r6)
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem r6 = (com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem) r6
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem.DateHeader
            r3 = 17
            int r3 = r3 / 0
            if (r1 == r2) goto L34
            goto L3c
        L25:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            java.util.List<? extends com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem> r1 = r4.component2
            java.lang.Object r6 = r1.get(r6)
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem r6 = (com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem) r6
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem.DateHeader
            if (r1 == 0) goto L3c
        L34:
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter$HeaderViewHolder r5 = (com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.HeaderViewHolder) r5
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem$DateHeader r6 = (com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem.DateHeader) r6
            r5.bind(r6)
            goto L54
        L3c:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem.TestItem
            if (r1 != r2) goto L5e
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter$ItemViewHolder r5 = (com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.ItemViewHolder) r5
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem$TestItem r6 = (com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpeedHistoryItem.TestItem) r6
            com.huawei.digitalpayment.consumer.base.database.entities.mtandao.SpeedTestsHistoryData r6 = r6.getEntity()
            r5.bind(r6)
            int r5 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.getAsAtTimestamp
            int r5 = r5 + 65
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.equals = r6
            int r5 = r5 % r0
        L54:
            int r5 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.getAsAtTimestamp
            int r5 = r5 + 71
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.equals = r6
            int r5 = r5 % r0
            return
        L5e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.SpeedHistoryAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    static {
        int i = component3 + 83;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/SpeedHistoryAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "dateText", "Landroid/widget/TextView;", "bind", "", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/SpeedHistoryItem$DateHeader;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HeaderViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 113 % 128;
        private final TextView copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            View viewFindViewById = view.findViewById(R.id.dateText);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.copydefault = (TextView) viewFindViewById;
        }

        public final void bind(SpeedHistoryItem.DateHeader header) {
            int i = 2 % 2;
            int i2 = component1 + 115;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(header, "");
            this.copydefault.setText(header.getDate());
            int i4 = component1 + 109;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }

        static {
            if (113 % 2 == 0) {
                int i = 47 / 0;
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/SpeedHistoryAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "timeText", "Landroid/widget/TextView;", "latencyJitterText", "uploadText", "downloadText", "bind", "", "item", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/SpeedTestsHistoryData;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ItemViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private static int component3 = 0;
        private static int component4 = 123 % 128;
        private static int copy = 1;
        private static int equals;
        private final TextView ShareDataUIState;
        private final TextView component1;
        private final TextView component2;
        private final TextView copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            View viewFindViewById = view.findViewById(R.id.timeText);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.ShareDataUIState = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.pinglatencyJitterText);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.component1 = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.uploadText);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.copydefault = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.downloadText);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.component2 = (TextView) viewFindViewById4;
        }

        public final void bind(SpeedTestsHistoryData item) {
            int i = 2 % 2;
            int i2 = copy + 105;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(item, "");
                Intrinsics.areEqual(item.getDataconntype(), "MOBILEDATA");
                throw null;
            }
            Intrinsics.checkNotNullParameter(item, "");
            if (Intrinsics.areEqual(item.getDataconntype(), "MOBILEDATA")) {
                this.ShareDataUIState.setText(MtandaoUtils.INSTANCE.formatDateTime(item.getTestDateTime()) + "\nConn. Type: " + item.getDataconntype() + ", Data SIM: " + item.getDataconnetwork());
            } else {
                this.ShareDataUIState.setText(MtandaoUtils.INSTANCE.formatDateTime(item.getTestDateTime()) + "\nConn. Type: " + item.getDataconntype());
            }
            this.component1.setText("Ping: " + item.getPing() + "\nLatency: " + item.getLatency() + "\nJitter: " + item.getJitter());
            TextView textView = this.copydefault;
            String upload = item.getUpload();
            StringBuilder sb = new StringBuilder("Upload: ");
            sb.append(upload);
            textView.setText(sb.toString());
            this.component2.setText("Download: " + item.getDownload());
            int i3 = equals + 91;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 87 / 0;
            }
        }

        static {
            int i = 123 % 2;
        }
    }
}
