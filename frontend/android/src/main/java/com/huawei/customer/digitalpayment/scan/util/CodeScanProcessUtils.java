package com.huawei.customer.digitalpayment.scan.util;

import androidx.fragment.app.FragmentActivity;
import com.huawei.common.exception.BaseException;
import com.huawei.customer.digitalpayment.scan.handler.CodeScanProcessHandler;

public class CodeScanProcessUtils {
    private static CodeScanProcessHandler copydefault;

    public static void addCodeScanProcessHandler(CodeScanProcessHandler codeScanProcessHandler) {
        CodeScanProcessHandler next = copydefault;
        if (next == null) {
            copydefault = codeScanProcessHandler;
            return;
        }
        CodeScanProcessHandler codeScanProcessHandler2 = null;
        while (next != null) {
            if (codeScanProcessHandler.getPriority() > next.getPriority()) {
                codeScanProcessHandler.setNext(next);
                if (codeScanProcessHandler2 == null) {
                    copydefault = codeScanProcessHandler;
                    return;
                } else {
                    codeScanProcessHandler2.setNext(codeScanProcessHandler);
                    return;
                }
            }
            if (next.getNext() == null) {
                next.setNext(codeScanProcessHandler);
                next = null;
            } else {
                codeScanProcessHandler2 = next;
                next = next.getNext();
            }
        }
    }

    public static void processScanError(FragmentActivity fragmentActivity, BaseException baseException) {
        for (CodeScanProcessHandler next = copydefault; next != null; next = next.getNext()) {
            next.processScanError(fragmentActivity, baseException);
        }
    }

    public static boolean processResultFromLocal(FragmentActivity fragmentActivity, String str) {
        for (CodeScanProcessHandler next = copydefault; next != null; next = next.getNext()) {
            if (next.processResultFromLocal(fragmentActivity, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean processResultFromService(FragmentActivity fragmentActivity, String str, String str2, String str3) {
        for (CodeScanProcessHandler next = copydefault; next != null; next = next.getNext()) {
            if (next.processResultFromService(fragmentActivity, str, str2, str3)) {
                return true;
            }
        }
        return false;
    }
}
