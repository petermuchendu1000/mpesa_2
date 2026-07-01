package com.huawei.common.util.sign;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.telephony.cdma.CdmaCellLocation;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.play.core.ktx.SplitInstallManagerKtxKt;
import com.huawei.common.util.L;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;

public class AppSigning {
    public static final String SHA256 = "SHA256";

    public static Signature[] getSignatures(Context context, String str) throws Throwable {
        int length = str != null ? str.length() : 0;
        ArrayList arrayList = new ArrayList();
        int iShareDataUIState = SplitInstallManagerKtxKt.C07541.C01691.ShareDataUIState(arrayList);
        int i = iShareDataUIState ^ length;
        if (iShareDataUIState != 0) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (length ^ i)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 1) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 42 - Drawable.resolveOpacity(0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr = {113643786, Long.valueOf(j3), arrayList, null, false, false};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((-16770654) - Color.rgb(0, 0, 0), 56 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr);
                Toast.makeText((Context) null, length / (((length - 1) * length) % 2), 0).show();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (PackageManager.NameNotFoundException e) {
            L.e(e.getMessage());
            return null;
        }
    }

    public static String getSignatureString(Signature signature, String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(str).digest(signature.toByteArray());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            L.e("NoSuchAlgorithmException catched");
            return "error!";
        }
    }

    public static ArrayList<String> getSingInfo(Context context, String str) throws Throwable {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Signature[] signatures = getSignatures(context, str);
            if (signatures != null) {
                for (Signature signature : signatures) {
                    arrayList.add(getSignatureString(signature, "SHA256"));
                }
            }
        } catch (Exception e) {
            L.e(e.getMessage());
        }
        return arrayList;
    }
}
