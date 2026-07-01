package com.safaricom.sharedui.compose.welcometutorial;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialListener;", "", "onNextStep", "", "step", "Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialStep;", "onComplete", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WelcomeTutorialListener {
    void onComplete();

    void onNextStep(WelcomeTutorialStep step);
}
