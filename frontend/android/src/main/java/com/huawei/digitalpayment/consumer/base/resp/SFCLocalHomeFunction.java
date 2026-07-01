package com.huawei.digitalpayment.consumer.base.resp;

import android.content.Context;
import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eB\t\b\u0016¢\u0006\u0004\b\r\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0010B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0011J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003JY\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\nHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015¨\u00065"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunction;", "", "functionName", "", "funIcon", KeysConstants.KEY_EXECUTE, "functionId", "editEnable", "", "order", "", SfcServicePinActivity.EXTRA_IMAGE_RES, "functionDisplayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/String;)V", "()V", "(Ljava/lang/String;I)V", "(Ljava/lang/String;ILjava/lang/String;)V", "getFunctionName", "()Ljava/lang/String;", "setFunctionName", "(Ljava/lang/String;)V", "getFunIcon", "setFunIcon", "getExecute", "setExecute", "getFunctionId", "setFunctionId", "getEditEnable", "()Z", "setEditEnable", "(Z)V", "getOrder", "()I", "setOrder", "(I)V", "getImageRes", "setImageRes", "getFunctionDisplayName", "setFunctionDisplayName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SFCLocalHomeFunction {
    private static int ShareDataUIState = 1;
    private static int component1;
    private boolean editEnable;
    private String execute;
    private String funIcon;
    private String functionDisplayName;
    private String functionId;
    private String functionName;
    private int imageRes;
    private int order;

    public SFCLocalHomeFunction(String str, String str2, String str3, String str4, boolean z, int i, int i2, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.functionName = str;
        this.funIcon = str2;
        this.execute = str3;
        this.functionId = str4;
        this.editEnable = z;
        this.order = i;
        this.imageRes = i2;
        this.functionDisplayName = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SFCLocalHomeFunction(String str, String str2, String str3, String str4, boolean z, int i, int i2, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        int i4;
        int i5;
        String str6;
        if ((i3 & 16) != 0) {
            int i6 = ShareDataUIState + 5;
            component1 = i6 % 128;
            z2 = i6 % 2 != 0;
        } else {
            z2 = z;
        }
        if ((i3 & 32) != 0) {
            int i7 = component1 + 75;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 64) != 0) {
            int i10 = component1 + 93;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i3 & 128) != 0) {
            int i13 = component1 + 61;
            ShareDataUIState = i13 % 128;
            int i14 = i13 % 2;
            str6 = "";
        } else {
            str6 = str5;
        }
        this(str, str2, str3, str4, z2, i4, i5, str6);
    }

    public final String getFunctionName() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 65;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.functionName;
        int i5 = i2 + 111;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setFunctionName(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.functionName = str;
        int i4 = ShareDataUIState + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getFunIcon() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.funIcon;
        int i4 = i3 + 57;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void setFunIcon(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.funIcon = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.funIcon = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 109;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return str;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.execute = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.execute = str;
        int i3 = ShareDataUIState + 119;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final String getFunctionId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.functionId;
        }
        throw null;
    }

    public final void setFunctionId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.functionId = str;
        int i4 = ShareDataUIState + 71;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final boolean getEditEnable() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 51;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.editEnable;
        int i4 = i2 + 37;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final void setEditEnable(boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.editEnable = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int getOrder() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.order;
        int i5 = i3 + 49;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final void setOrder(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 91;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.order = i;
        if (i4 != 0) {
            int i5 = 36 / 0;
        }
    }

    public final int getImageRes() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.imageRes;
        int i6 = i2 + 57;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setImageRes(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        this.imageRes = i;
        int i6 = i3 + 71;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final String getFunctionDisplayName() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.functionDisplayName;
        int i4 = i2 + 35;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setFunctionDisplayName(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.functionDisplayName = str;
        int i4 = component1 + 123;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public SFCLocalHomeFunction() {
        this("", "", "", "", false, 0, 0, null, 240, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SFCLocalHomeFunction(String str, int i) {
        this(str, "", "", "", false, 0, i, null, 176, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SFCLocalHomeFunction(String str, int i, String str2) {
        this(str, "", "", "", false, 0, i, str2, 48, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    public final String component2() throws Throwable {
        int i = 2 % 2;
        String str = this.funIcon;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 67, View.MeasureSpec.getSize(0) + 33, (char) (19696 - View.getDefaultSize(0, 0)), 518907119, false, "component3", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 30, (char) View.resolveSizeAndState(0, 0, 0), 55511118, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault2).getInt(null);
        long j = i3;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 37, 30 - KeyEvent.keyCodeFromString(""), (char) TextUtils.getTrimmedLength(""), 58536393, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault3).getInt(null);
        long j2 = -1;
        long j3 = j2 ^ 1428527164966241443L;
        long jNextInt = new Random().nextInt();
        long j4 = (j3 | jNextInt) ^ j2;
        long j5 = 140;
        long j6 = j2 ^ (-635823711322037019L);
        long j7 = (((long) 141) * 1428527164966241443L) + (((long) (-139)) * (-635823711322037019L)) + (((long) (-280)) * (((j3 | (-635823711322037019L)) ^ j2) | j4)) + ((j4 | ((j6 | jNextInt) ^ j2)) * j5);
        long j8 = ((j3 | j6) | jNextInt) ^ j2;
        long j9 = jNextInt ^ j2;
        long j10 = j7 + (j5 * (j8 | (((j3 | j9) | (-635823711322037019L)) ^ j2) | (((j6 | j9) | 1428527164966241443L) ^ j2)));
        long j11 = j;
        int i5 = 0;
        while (true) {
            int i6 = 0;
            while (i6 != 8) {
                int i7 = ShareDataUIState + 69;
                component1 = i7 % 128;
                if (i7 % 2 != 0) {
                    i4 = (((((int) (j11 >> i6)) & 2287) / (i4 % 91)) / (i4 - 102)) << i4;
                    i6 += 82;
                } else {
                    i4 = (((((int) (j11 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                    i6++;
                }
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j11 = j10;
        }
        if (i4 != i2) {
            int i8 = component1 + 101;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - KeyEvent.normalizeMetaState(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 34, (char) (19696 - TextUtils.getOffsetAfter("", 0)), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j12 = -1;
            long j13 = 0;
            long j14 = (((long) (i3 ^ i2)) & ((((long) 0) << 32) | (j12 - ((j12 >> 63) << 32)))) | (((long) 1) << 32) | (j13 - ((j13 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6619 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 42 - KeyEvent.normalizeMetaState(0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {1636146058, Long.valueOf(j14), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0', 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 56, (char) TextUtils.getCapsMode("", 0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
                int i10 = ShareDataUIState + 111;
                component1 = i10 % 128;
                int i11 = i10 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return str;
    }

    public static SFCLocalHomeFunction copy$default(SFCLocalHomeFunction sFCLocalHomeFunction, String str, String str2, String str3, String str4, boolean z, int i, int i2, String str5, int i3, Object obj) {
        String str6;
        int i4;
        int i5;
        int i6 = 2 % 2;
        String str7 = (i3 & 1) != 0 ? sFCLocalHomeFunction.functionName : str;
        Object obj2 = null;
        if ((i3 & 2) != 0) {
            int i7 = ShareDataUIState + 23;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                String str8 = sFCLocalHomeFunction.funIcon;
                throw null;
            }
            str6 = sFCLocalHomeFunction.funIcon;
        } else {
            str6 = str2;
        }
        String str9 = (i3 & 4) != 0 ? sFCLocalHomeFunction.execute : str3;
        String str10 = (i3 & 8) != 0 ? sFCLocalHomeFunction.functionId : str4;
        boolean z2 = (i3 & 16) != 0 ? sFCLocalHomeFunction.editEnable : z;
        if ((i3 & 32) != 0) {
            int i8 = component1 + 85;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = sFCLocalHomeFunction.order;
                obj2.hashCode();
                throw null;
            }
            i4 = sFCLocalHomeFunction.order;
        } else {
            i4 = i;
        }
        if ((i3 & 64) != 0) {
            int i10 = ShareDataUIState + 1;
            component1 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = sFCLocalHomeFunction.imageRes;
                throw null;
            }
            i5 = sFCLocalHomeFunction.imageRes;
        } else {
            i5 = i2;
        }
        return sFCLocalHomeFunction.copy(str7, str6, str9, str10, z2, i4, i5, (i3 & 128) != 0 ? sFCLocalHomeFunction.functionDisplayName : str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.functionName;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.execute;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.functionId;
        int i5 = i2 + 53;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.editEnable;
        int i5 = i2 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final int component6() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.order;
        int i6 = i3 + 49;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component7() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.imageRes;
        int i5 = i3 + 123;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.functionDisplayName;
        int i4 = i3 + 1;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final SFCLocalHomeFunction copy(String functionName, String funIcon, String execute, String functionId, boolean editEnable, int order, int imageRes, String functionDisplayName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(functionName, "");
        Intrinsics.checkNotNullParameter(funIcon, "");
        Intrinsics.checkNotNullParameter(execute, "");
        Intrinsics.checkNotNullParameter(functionId, "");
        Intrinsics.checkNotNullParameter(functionDisplayName, "");
        SFCLocalHomeFunction sFCLocalHomeFunction = new SFCLocalHomeFunction(functionName, funIcon, execute, functionId, editEnable, order, imageRes, functionDisplayName);
        int i2 = component1 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return sFCLocalHomeFunction;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 95;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SFCLocalHomeFunction)) {
            return false;
        }
        SFCLocalHomeFunction sFCLocalHomeFunction = (SFCLocalHomeFunction) other;
        if (!Intrinsics.areEqual(this.functionName, sFCLocalHomeFunction.functionName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.funIcon, sFCLocalHomeFunction.funIcon)) {
            int i4 = ShareDataUIState + 63;
            component1 = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.execute, sFCLocalHomeFunction.execute)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.functionId, sFCLocalHomeFunction.functionId)) {
            int i5 = ShareDataUIState + 81;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (this.editEnable != sFCLocalHomeFunction.editEnable) {
            return false;
        }
        if (this.order != sFCLocalHomeFunction.order) {
            int i6 = ShareDataUIState + 51;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.imageRes != sFCLocalHomeFunction.imageRes || !Intrinsics.areEqual(this.functionDisplayName, sFCLocalHomeFunction.functionDisplayName)) {
            return false;
        }
        int i8 = component1 + 47;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 38 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((this.functionName.hashCode() * 31) + this.funIcon.hashCode()) * 31) + this.execute.hashCode()) * 31) + this.functionId.hashCode()) * 31) + Boolean.hashCode(this.editEnable)) * 31) + Integer.hashCode(this.order)) * 31) + Integer.hashCode(this.imageRes)) * 31) + this.functionDisplayName.hashCode();
        int i4 = component1 + 57;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SFCLocalHomeFunction(functionName=" + this.functionName + ", funIcon=" + this.funIcon + ", execute=" + this.execute + ", functionId=" + this.functionId + ", editEnable=" + this.editEnable + ", order=" + this.order + ", imageRes=" + this.imageRes + ", functionDisplayName=" + this.functionDisplayName + ")";
        int i2 = component1 + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
