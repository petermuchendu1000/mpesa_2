package com.huawei.biometric;

import com.blankj.utilcode.util.Utils;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.util.L;
import com.huawei.facerecognition.FaceManager;
import com.huawei.facerecognition.HwFaceManagerFactory;

public class LocalAuthenticationUtils {
    private static boolean component1 = false;
    private static boolean component2 = false;
    private static final String component3 = "LocalAuthenticationUtils";
    private static boolean copydefault;

    private static void component3() {
        FaceManager.FaceRecognitionCapability faceRecognitionCapability;
        FaceManager faceManager = HwFaceManagerFactory.getFaceManager(Utils.getApp());
        if (faceManager != null) {
            try {
                faceRecognitionCapability = faceManager.getFaceRecognitionCapability();
            } catch (NoSuchMethodError unused) {
                copydefault = faceManager.isHardwareDetected();
                component1 = faceManager.hasEnrolledTemplates();
                component2 = true;
            }
            if (faceRecognitionCapability == null) {
                L.e(component3, "capability is null");
                return;
            }
            copydefault = faceRecognitionCapability.isSupport;
            component1 = faceRecognitionCapability.isEnrolled;
            component2 = faceRecognitionCapability.is3D;
            if (!copydefault) {
                L.e(component3, "This device does not support face recognition");
            } else if (component1) {
                L.d(component3, "Face Recognition Modality: ".concat(component2 ? "3D" : "2D"));
            } else {
                L.e(component3, "No enrolled face");
            }
        }
    }

    @Deprecated
    public static boolean isSupport(boolean z) {
        component3();
        return copydefault && (!BiometricHelper2.getInstance().onlySupport3D() || component2);
    }

    public static boolean isSupport() {
        return isSupport(BiometricHelper2.getInstance().onlySupport3D());
    }

    public static boolean isEnrolled() {
        component3();
        return component1;
    }

    public static boolean is3D() {
        component3();
        return component2;
    }
}
