package com.huawei.customer.digitalpayment.scan.handler;

import androidx.fragment.app.FragmentActivity;
import com.huawei.common.exception.BaseException;

public abstract class CodeScanProcessHandler implements Comparable<CodeScanProcessHandler> {
    private CodeScanProcessHandler component2;

    public int getPriority() {
        return 0;
    }

    public boolean processResultFromLocal(FragmentActivity fragmentActivity, String str) {
        return false;
    }

    public boolean processResultFromService(FragmentActivity fragmentActivity, String str, String str2, String str3) {
        return false;
    }

    public void processScanError(FragmentActivity fragmentActivity, BaseException baseException) {
    }

    public CodeScanProcessHandler getNext() {
        return this.component2;
    }

    public void setNext(CodeScanProcessHandler codeScanProcessHandler) {
        this.component2 = codeScanProcessHandler;
    }

    @Override
    public int compareTo(CodeScanProcessHandler codeScanProcessHandler) {
        return Integer.compare(codeScanProcessHandler.getPriority(), getPriority());
    }
}
