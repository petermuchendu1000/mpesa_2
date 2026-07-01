package com.safaricom.designsystem.components.avatar;

import androidx.compose.ui.graphics.ColorKt;
import com.huawei.hms.common.util.Logger;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"contactAvatarPalettes", "", "Lcom/safaricom/designsystem/components/avatar/AvatarColorPalette;", "getContactAvatarPalettes", "()Ljava/util/List;", "getAvatarPalette", "name", "", "number", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AvatarPaletteKt {
    private static final List<AvatarColorPalette> component3 = CollectionsKt.listOf((Object[]) new AvatarColorPalette[]{new AvatarColorPalette(ColorKt.Color(4293916927L), ColorKt.Color(4279595247L), ColorKt.Color(4279249494L), ColorKt.Color(4283675133L), null), new AvatarColorPalette(ColorKt.Color(4293850367L), ColorKt.Color(4282666215L), ColorKt.Color(4280230747L), ColorKt.Color(4286617849L), null), new AvatarColorPalette(ColorKt.Color(4294833407L), ColorKt.Color(4290389205L), ColorKt.Color(4282847308L), ColorKt.Color(4293163258L), null), new AvatarColorPalette(ColorKt.Color(4294243327L), ColorKt.Color(4285085935L), ColorKt.Color(4280750431L), ColorKt.Color(4288383739L), null), new AvatarColorPalette(ColorKt.Color(4294832890L), ColorKt.Color(4292683152L), ColorKt.Color(4283305264L), ColorKt.Color(4294340807L), null), new AvatarColorPalette(ColorKt.Color(4294964461L), ColorKt.Color(4293275141L), ColorKt.Color(4283896586L), ColorKt.Color(4294928686L), null), new AvatarColorPalette(ColorKt.Color(4294899438L), ColorKt.Color(4292890390L), ColorKt.Color(4283505680L), ColorKt.Color(4294149956L), null), new AvatarColorPalette(ColorKt.Color(4293786866L), ColorKt.Color(4281175856L), ColorKt.Color(4278529564L), ColorKt.Color(4284069981L), null)});

    public static final List<AvatarColorPalette> getContactAvatarPalettes() {
        return component3;
    }

    public static AvatarColorPalette getAvatarPalette$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return getAvatarPalette(str, str2);
    }

    public static final AvatarColorPalette getAvatarPalette(String str, String str2) throws IOException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String lowerCase = StringsKt.trim(str).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String str3 = str2;
        StringBuilder sb = new StringBuilder();
        int length = str3.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str3.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int iHashCode = (lowerCase + Logger.f2811c + string).hashCode();
        List<AvatarColorPalette> list = component3;
        return list.get((iHashCode & Integer.MAX_VALUE) % list.size());
    }
}
