package com.huawei.digitalpayment.consumer.baselib.theme;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011J(\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0011\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/theme/IThemeConvert;", "", "convert", "", "componentType", "", "configValue", "Lorg/json/JSONObject;", "components", "Lorg/json/JSONArray;", "createComponent", "Landroidx/fragment/app/Fragment;", "component", "getPriority", "", "compareTo", "other", "Companion", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IThemeConvert extends Comparable<IThemeConvert> {

    public static final Companion INSTANCE = Companion.component1;
    public static final String KEY_COMPONENT = "component";

    int compareTo(IThemeConvert other);

    Object convert(String componentType, JSONObject configValue, JSONArray components);

    Fragment createComponent(Object component);

    int getPriority();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        public static int compareTo(IThemeConvert iThemeConvert, IThemeConvert iThemeConvert2) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 97;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(iThemeConvert2, "");
            int iCompare = Intrinsics.compare(iThemeConvert2.getPriority(), iThemeConvert.getPriority());
            int i4 = component1 + 31;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return iCompare;
        }

        public static int getPriority(IThemeConvert iThemeConvert) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 47;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000bJ*\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/theme/IThemeConvert$Companion;", "", "<init>", "()V", "KEY_COMPONENT", "", "newInstance", "Landroidx/fragment/app/Fragment;", "component", "Ljava/io/Serializable;", "clazz", "Ljava/lang/Class;", "args", "Landroid/os/Bundle;", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static final String KEY_COMPONENT = "component";
        private static int ShareDataUIState = 1;
        static final Companion component1 = new Companion();
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;

        private Companion() {
        }

        public final Fragment newInstance(Serializable component, Class<? extends Fragment> clazz) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(clazz, "");
            Fragment fragmentNewInstance = newInstance(component, clazz, new Bundle());
            int i2 = copydefault + 101;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return fragmentNewInstance;
            }
            throw null;
        }

        public static Fragment newInstance$default(Companion companion, Serializable serializable, Class cls, Bundle bundle, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3 + 19;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 4) != 0) {
                bundle = new Bundle();
            }
            Fragment fragmentNewInstance = companion.newInstance(serializable, cls, bundle);
            int i5 = copydefault + 5;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 51 / 0;
            }
            return fragmentNewInstance;
        }

        public final Fragment newInstance(Serializable component, Class<? extends Fragment> clazz, Bundle args) {
            Fragment fragment;
            int i = 2 % 2;
            int i2 = copydefault + 45;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(clazz, "");
            Intrinsics.checkNotNullParameter(args, "");
            args.putSerializable("component", component);
            try {
                fragment = clazz.newInstance();
                int i4 = copydefault + 113;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception unused) {
                fragment = new Fragment();
            }
            fragment.setArguments(args);
            Intrinsics.checkNotNull(fragment);
            return fragment;
        }

        static {
            int i = component2 + 113;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
