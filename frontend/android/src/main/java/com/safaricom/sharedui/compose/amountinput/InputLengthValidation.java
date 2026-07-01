package com.safaricom.sharedui.compose.amountinput;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/safaricom/sharedui/compose/amountinput/InputLengthValidation;", "", "<init>", "()V", "NUMBER_INPUT_LIMIT", "", "AMOUNT_INPUT_LIMIT", "TILL_INPUT_LIMIT", "PAYBILL_INPUT_LIMIT", "PAYBILL_ACCOUNT_INPUT_LIMIT", "ATM_INPUT_LIMIT", "AGENT_INPUT_LIMIT", "AIRTIME_AMOUNT_INPUT_LIMIT", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputLengthValidation {
    public static final int $stable = 0;
    public static final int AGENT_INPUT_LIMIT = 12;
    public static final int AIRTIME_AMOUNT_INPUT_LIMIT = 5;
    public static final int AMOUNT_INPUT_LIMIT = 7;
    public static final int ATM_INPUT_LIMIT = 7;
    public static final InputLengthValidation INSTANCE = new InputLengthValidation();
    public static final int NUMBER_INPUT_LIMIT = 15;
    public static final int PAYBILL_ACCOUNT_INPUT_LIMIT = 20;
    public static final int PAYBILL_INPUT_LIMIT = 16;
    public static final int TILL_INPUT_LIMIT = 10;

    private InputLengthValidation() {
    }
}
