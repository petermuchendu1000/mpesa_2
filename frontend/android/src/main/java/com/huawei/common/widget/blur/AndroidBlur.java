package com.huawei.common.widget.blur;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.huawei.common.util.L;

public class AndroidBlur {
    private static final String copydefault = "AndroidBlur";
    private Allocation ShareDataUIState;
    private Allocation component1;
    private ScriptIntrinsicBlur component2;
    private RenderScript component3;

    public boolean prepare(Context context, Bitmap bitmap, float f) {
        if (this.component3 == null) {
            try {
                RenderScript renderScriptCreate = RenderScript.create(context);
                this.component3 = renderScriptCreate;
                this.component2 = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            } catch (RSRuntimeException e) {
                L.d(copydefault, "prepare: " + e.getMessage());
                release();
                return false;
            }
        }
        this.component2.setRadius(f);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.component3, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        this.component1 = allocationCreateFromBitmap;
        this.ShareDataUIState = Allocation.createTyped(this.component3, allocationCreateFromBitmap.getType());
        return true;
    }

    public void release() {
        Allocation allocation = this.component1;
        if (allocation != null) {
            allocation.destroy();
            this.component1 = null;
        }
        Allocation allocation2 = this.ShareDataUIState;
        if (allocation2 != null) {
            allocation2.destroy();
            this.ShareDataUIState = null;
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.component2;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.component2 = null;
        }
        RenderScript renderScript = this.component3;
        if (renderScript != null) {
            renderScript.destroy();
            this.component3 = null;
        }
    }

    public void blur(Bitmap bitmap, Bitmap bitmap2) {
        this.component1.copyFrom(bitmap);
        this.component2.setInput(this.component1);
        this.component2.forEach(this.ShareDataUIState);
        this.ShareDataUIState.copyTo(bitmap2);
    }
}
