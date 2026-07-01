package com.huawei.digitalpayment.customer.dynamics.util.checker;

import android.graphics.Bitmap;
import java.util.List;

public class EdgeAlignmentChecker implements AlignmentChecker {
    private static final String copydefault = "EdgeAlignmentChecker";
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private int ShareDataUIState;
    private float component1;
    private float component2;
    private int component3;
    private int component4;

    public EdgeAlignmentChecker(int i, float f, float f2, int i2, int i3) {
        this.component4 = i;
        this.component2 = f;
        this.component1 = f2;
        this.component3 = i2;
        this.ShareDataUIState = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isAligned(android.graphics.Bitmap r13, android.graphics.Rect r14, int r15) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.util.checker.EdgeAlignmentChecker.isAligned(android.graphics.Bitmap, android.graphics.Rect, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean component3(java.util.List<int[]> r6, java.util.List<int[]> r7, java.util.List<int[]> r8, java.util.List<int[]> r9, int r10, int r11, int r12, int r13) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = r6.size()
            int r2 = r5.component3
            r3 = 0
            r4 = 1
            if (r1 < r2) goto L1c
            float r10 = (float) r10
            int r6 = r6.size()
            float r6 = (float) r6
            float r1 = r5.component1
            float r6 = r6 * r1
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 <= 0) goto L1c
            r6 = r4
            goto L1d
        L1c:
            r6 = r3
        L1d:
            int r10 = r7.size()
            int r1 = r5.component3
            if (r10 < r1) goto L3d
            int r10 = com.huawei.digitalpayment.customer.dynamics.util.checker.EdgeAlignmentChecker.getRequestBeneficiariesState
            int r10 = r10 + 73
            int r1 = r10 % 128
            com.huawei.digitalpayment.customer.dynamics.util.checker.EdgeAlignmentChecker.getAsAtTimestamp = r1
            int r10 = r10 % r0
            float r10 = (float) r11
            int r7 = r7.size()
            float r7 = (float) r7
            float r11 = r5.component1
            float r7 = r7 * r11
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 <= 0) goto L3d
            r7 = r4
            goto L3e
        L3d:
            r7 = r3
        L3e:
            int r10 = r8.size()
            int r11 = r5.component3
            if (r10 < r11) goto L5e
            float r10 = (float) r12
            int r8 = r8.size()
            float r8 = (float) r8
            float r11 = r5.component1
            float r8 = r8 * r11
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 <= 0) goto L5e
            int r8 = com.huawei.digitalpayment.customer.dynamics.util.checker.EdgeAlignmentChecker.getAsAtTimestamp
            int r8 = r8 + 99
            int r10 = r8 % 128
            com.huawei.digitalpayment.customer.dynamics.util.checker.EdgeAlignmentChecker.getRequestBeneficiariesState = r10
            int r8 = r8 % r0
            r8 = r4
            goto L5f
        L5e:
            r8 = r3
        L5f:
            int r10 = r9.size()
            int r11 = r5.component3
            if (r10 < r11) goto L7f
            int r10 = com.huawei.digitalpayment.customer.dynamics.util.checker.EdgeAlignmentChecker.getAsAtTimestamp
            int r10 = r10 + 59
            int r11 = r10 % 128
            com.huawei.digitalpayment.customer.dynamics.util.checker.EdgeAlignmentChecker.getRequestBeneficiariesState = r11
            int r10 = r10 % r0
            float r10 = (float) r13
            int r9 = r9.size()
            float r9 = (float) r9
            float r11 = r5.component1
            float r9 = r9 * r11
            int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r9 <= 0) goto L7f
            r9 = r4
            goto L80
        L7f:
            r9 = r3
        L80:
            r10 = 4
            boolean[] r11 = new boolean[r10]
            r11[r3] = r6
            r11[r4] = r7
            r11[r0] = r8
            r6 = 3
            r11[r6] = r9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "isAligned: valid: "
            r6.<init>(r7)
            java.lang.String r7 = java.util.Arrays.toString(r11)
            r6.append(r7)
            java.lang.String r7 = "EdgeAlignmentChecker"
            java.lang.String r6 = r6.toString()
            com.huawei.common.util.L.d(r7, r6)
            r6 = r3
            r7 = r6
        La5:
            if (r6 >= r10) goto Lb0
            boolean r8 = r11[r6]
            if (r8 == 0) goto Lad
            int r7 = r7 + 1
        Lad:
            int r6 = r6 + 1
            goto La5
        Lb0:
            int r6 = r5.ShareDataUIState
            if (r7 < r6) goto Lb5
            r3 = r4
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.util.checker.EdgeAlignmentChecker.component3(java.util.List, java.util.List, java.util.List, java.util.List, int, int, int, int):boolean");
    }

    private int component3(int[] iArr, int i, List<int[]> list) {
        boolean z;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = 0;
        for (int[] iArr2 : list) {
            int i4 = iArr2[0];
            int i5 = iArr2[1];
            int i6 = iArr[0];
            boolean z3 = i4 >= i6 - i && i4 <= i6 + i;
            int i7 = i6 + iArr[2];
            if (i4 < i7 - i || i4 > i7 + i) {
                int i8 = getAsAtTimestamp + 29;
                getRequestBeneficiariesState = i8 % 128;
                int i9 = i8 % 2;
                z = false;
            } else {
                int i10 = getRequestBeneficiariesState + 59;
                getAsAtTimestamp = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            }
            int i12 = iArr[1];
            if (i5 < i12 - i || i5 > i12 + i) {
                int i13 = getRequestBeneficiariesState + 3;
                getAsAtTimestamp = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 4 / 3;
                }
                z2 = false;
            } else {
                int i15 = getAsAtTimestamp + 51;
                getRequestBeneficiariesState = i15 % 128;
                int i16 = i15 % 2;
                z2 = true;
            }
            int i17 = i12 + iArr[3];
            boolean z4 = i5 >= i17 - i && i5 <= i17 + i;
            if (!z3 && !z) {
                int i18 = getAsAtTimestamp + 101;
                getRequestBeneficiariesState = i18 % 128;
                int i19 = i18 % 2;
                if (z2 || z4) {
                }
            }
            i3++;
        }
        int i20 = getAsAtTimestamp + 91;
        getRequestBeneficiariesState = i20 % 128;
        if (i20 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    private void copydefault(Bitmap bitmap, List<int[]> list, List<int[]> list2, List<int[]> list3, List<int[]> list4, int[] iArr) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[][] iArr2 = {new int[]{-1, 0, 1}, new int[]{-2, 0, 2}, new int[]{-1, 0, 1}};
        int[][] iArr3 = {new int[]{-1, -2, -1}, new int[]{0, 0, 0}, new int[]{1, 2, 1}};
        int i4 = 1;
        while (i4 < height - 1) {
            int i5 = getAsAtTimestamp + 13;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 1;
            while (i7 < width - 1) {
                int i8 = getAsAtTimestamp + 93;
                getRequestBeneficiariesState = i8 % 128;
                int i9 = i7;
                int i10 = i4;
                if (i8 % 2 == 0) {
                    component2(i9, i10, iArr2, iArr3, bitmap, list, list2, list3, list4, iArr);
                    i7 += 74;
                } else {
                    component2(i9, i10, iArr2, iArr3, bitmap, list, list2, list3, list4, iArr);
                    i7++;
                }
            }
            i4++;
            int i11 = getAsAtTimestamp + 71;
            getRequestBeneficiariesState = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    private void component2(int i, int i2, int[][] iArr, int[][] iArr2, Bitmap bitmap, List<int[]> list, List<int[]> list2, List<int[]> list3, List<int[]> list4, int[] iArr3) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState + 35;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = -1; i8 <= 1; i8++) {
            int i9 = getAsAtTimestamp + 3;
            getRequestBeneficiariesState = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 / 3;
            }
            int i11 = -1;
            while (i11 <= 1) {
                int pixel = bitmap.getPixel(i + i11, i2 + i8) & 255;
                int i12 = i8 + 1;
                i11++;
                i6 += iArr[i12][i11] * pixel;
                i7 += iArr2[i12][i11] * pixel;
            }
        }
        if (((int) Math.sqrt((i6 * i6) + (i7 * i7))) > 128) {
            int i13 = getRequestBeneficiariesState + 117;
            getAsAtTimestamp = i13 % 128;
            if (i13 % 2 == 0 ? i <= iArr3[0] * 2 : i <= iArr3[1] / 5) {
                list.add(new int[]{i, i2});
            }
            if (i >= iArr3[2]) {
                list3.add(new int[]{i, i2});
            }
            if (i2 <= iArr3[1] * 2) {
                list2.add(new int[]{i, i2});
                int i14 = getRequestBeneficiariesState + 107;
                getAsAtTimestamp = i14 % 128;
                int i15 = i14 % 2;
            }
            if (i2 >= iArr3[3]) {
                list4.add(new int[]{i, i2});
            }
        }
    }
}
