package com.huawei.common.util;

import com.huawei.common.util.encrypt.SecurityRandomUtil;
import com.huawei.common.widget.keyboard.KeyBroadItemEntry;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ShuffleArrayUtils {
    public static final String SHUFFLE_ITEM = "0123456789";

    public static <T> List<T> myShuffle(List<T> list) {
        SecureRandom secureRandomGenSecureRandom = SecurityRandomUtil.genSecureRandom();
        Object[] array = list.toArray();
        for (int size = list.size(); size > 1; size--) {
            int iNextInt = secureRandomGenSecureRandom.nextInt(size);
            int i = size - 1;
            if (i != 11 && i != 9 && iNextInt != 9 && iNextInt != 11) {
                ShareDataUIState(array, i, iNextInt);
            }
        }
        ListIterator<T> listIterator = list.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set(obj);
        }
        return list;
    }

    public static List<KeyBroadItemEntry> shuffleList(List<KeyBroadItemEntry> list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            if (!SHUFFLE_ITEM.contains(list.get(i).getValue())) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        SecureRandom secureRandomGenSecureRandom = SecurityRandomUtil.genSecureRandom();
        KeyBroadItemEntry[] keyBroadItemEntryArr = (KeyBroadItemEntry[]) list.toArray(new KeyBroadItemEntry[0]);
        while (size > 1) {
            int iNextInt = secureRandomGenSecureRandom.nextInt(size);
            int i2 = size - 1;
            if (!arrayList.contains(Integer.valueOf(i2)) && !arrayList.contains(Integer.valueOf(iNextInt))) {
                component1(keyBroadItemEntryArr, i2, iNextInt);
            }
            size--;
        }
        ListIterator<KeyBroadItemEntry> listIterator = list.listIterator();
        for (KeyBroadItemEntry keyBroadItemEntry : keyBroadItemEntryArr) {
            listIterator.next();
            listIterator.set(keyBroadItemEntry);
        }
        return new ArrayList(list);
    }

    private static void component1(KeyBroadItemEntry[] keyBroadItemEntryArr, int i, int i2) {
        int widthWeight = keyBroadItemEntryArr[i].getWidthWeight();
        int heightWeight = keyBroadItemEntryArr[i].getHeightWeight();
        keyBroadItemEntryArr[i].setWidthWeight(keyBroadItemEntryArr[i2].getWidthWeight());
        keyBroadItemEntryArr[i].setHeightWeight(keyBroadItemEntryArr[i2].getHeightWeight());
        keyBroadItemEntryArr[i2].setWidthWeight(widthWeight);
        keyBroadItemEntryArr[i2].setHeightWeight(heightWeight);
        KeyBroadItemEntry keyBroadItemEntry = keyBroadItemEntryArr[i];
        keyBroadItemEntryArr[i] = keyBroadItemEntryArr[i2];
        keyBroadItemEntryArr[i2] = keyBroadItemEntry;
    }

    private static void ShareDataUIState(Object[] objArr, int i, int i2) {
        Object obj = objArr[i];
        objArr[i] = objArr[i2];
        objArr[i2] = obj;
    }
}
