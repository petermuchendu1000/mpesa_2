package com.huawei.mobileapp.resourcelib;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blankj.utilcode.util.CloseUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.file.FileDownloadUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class ResourceStringUtils {
    public static final int ARRAY = 2;
    public static String NewResVersion = null;
    public static final int STRING = 1;
    public static List<String> UpdateUrlList = null;
    private static final String copydefault = "ResourceStringUtils";
    private static final Object ShareDataUIState = new Object();
    private static ArrayMap<String, String> component2 = new ArrayMap<>(256);
    private static ArrayMap<String, String[]> component1 = new ArrayMap<>();

    private ResourceStringUtils() {
    }

    private static Context component3() {
        return Utils.getApp();
    }

    public static void init() {
        init(null);
    }

    public static void init(final ApiCallback<Void> apiCallback) {
        ThreadUtils.executeByCached(new ThreadUtils.SimpleTask<Void>() {
            @Override
            public Void doInBackground() throws Throwable {
                ResourceStringUtils.reloadResFile();
                ResourceStringUtils.reloadArrayResFile();
                return null;
            }

            @Override
            public void onSuccess(Void r2) {
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    apiCallback2.onSuccess(r2);
                }
            }

            @Override
            public void onFail(Throwable th) {
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    apiCallback2.onError(new BaseException(th.getMessage(), th));
                }
            }
        });
    }

    public static void writeToFile(Map<String, String> map, String str) {
        File fileCopydefault = copydefault(str);
        if (fileCopydefault == null) {
            L.e(copydefault, "create xml file failure!!!");
            return;
        }
        try {
            FileWriter fileWriter = new FileWriter(fileCopydefault);
            try {
                fileWriter.write(mapToStringsXml(map));
                fileWriter.close();
            } finally {
            }
        } catch (Exception e) {
            L.d(copydefault, e.getMessage());
        }
    }

    private static File copydefault(String str) {
        String absolutePath = Utils.getApp().getFilesDir().getAbsolutePath();
        try {
            new File(absolutePath).mkdirs();
            File file = new File(absolutePath, str);
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            return file;
        } catch (Exception e) {
            L.d(copydefault, e.getMessage());
            return null;
        }
    }

    public static String mapToStringsXml(Map<String, String> map) {
        StringBuilder sb = new StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<resources>\n");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("    <string name=\"");
            sb.append(entry.getKey());
            sb.append("\">");
            sb.append(ShareDataUIState(entry.getValue()));
            sb.append("</string>\n");
        }
        sb.append("</resources>");
        return sb.toString();
    }

    private static String ShareDataUIState(String str) {
        if (str == null) {
            return "";
        }
        return str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public static String getCurrentResVersion() {
        String string = SPUtils.getInstance().getString("ResourceVersion", "");
        return TextUtils.isEmpty(string) ? "-1" : string;
    }

    public static void setCurrentResVersion(String str) {
        SPUtils.getInstance().put("ResourceVersion", str);
    }

    public static void reloadResFile() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        component1("strings." + LanguageUtils.getInstance().getCurrentLang() + ".xml");
        L.d(copydefault, "reloadResFile: " + (System.currentTimeMillis() - jCurrentTimeMillis) + Thread.currentThread().getName());
    }

    public static void reloadResFile(String str) {
        if (("strings." + LanguageUtils.getInstance().getCurrentLang() + ".xml").equals(str)) {
            component1(str);
        }
    }

    public static void reloadArrayResFile() {
        component3("arrays." + LanguageUtils.getInstance().getCurrentLang() + ".xml");
    }

    public static void reloadArrayResFile(String str) {
        if (("arrays." + LanguageUtils.getInstance().getCurrentLang() + ".xml").equals(str)) {
            component3(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static Map<String, String> loadResFromFile(String str) throws Throwable {
        Throwable th;
        InputStreamReader inputStreamReader;
        Exception e;
        FileInputStream fileInputStreamOpenFileInput;
        ?? r1;
        Throwable th2;
        InputStreamReader inputStreamReader2;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream = null;
        try {
            try {
                fileInputStreamOpenFileInput = component3().openFileInput(str);
            } catch (Throwable th3) {
                r1 = str;
                th2 = th3;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
        }
        try {
            inputStreamReader = new InputStreamReader(fileInputStreamOpenFileInput, StandardCharsets.UTF_8);
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    Map<String, String> requestBeneficiariesState = getRequestBeneficiariesState(sb.toString());
                    try {
                        IOUtils.closeQuietly((InputStream) fileInputStreamOpenFileInput);
                        IOUtils.closeQuietly((Reader) bufferedReader);
                        IOUtils.closeQuietly((Reader) inputStreamReader);
                    } catch (Exception e3) {
                        L.d("=====", e3.getMessage());
                    }
                    return requestBeneficiariesState;
                } catch (Exception e4) {
                    e = e4;
                    L.d("=====", e.getMessage());
                    try {
                        IOUtils.closeQuietly((InputStream) fileInputStreamOpenFileInput);
                        IOUtils.closeQuietly((Reader) bufferedReader);
                        IOUtils.closeQuietly((Reader) inputStreamReader);
                    } catch (Exception e5) {
                        L.d("=====", e5.getMessage());
                    }
                    return null;
                }
            } catch (Exception e6) {
                e = e6;
                bufferedReader = null;
            } catch (Throwable th5) {
                r1 = fileInputStreamOpenFileInput;
                th2 = th5;
                inputStreamReader2 = null;
                try {
                    IOUtils.closeQuietly((InputStream) r1);
                    IOUtils.closeQuietly((Reader) inputStreamReader2);
                    IOUtils.closeQuietly((Reader) inputStreamReader);
                    throw th2;
                } catch (Exception e7) {
                    L.d("=====", e7.getMessage());
                    throw th2;
                }
            }
        } catch (Exception e8) {
            e = e8;
            inputStreamReader = null;
            bufferedReader = null;
            L.d("=====", e.getMessage());
            IOUtils.closeQuietly((InputStream) fileInputStreamOpenFileInput);
            IOUtils.closeQuietly((Reader) bufferedReader);
            IOUtils.closeQuietly((Reader) inputStreamReader);
            return null;
        } catch (Throwable th6) {
            th = th6;
            inputStreamReader = null;
            fileInputStream = fileInputStreamOpenFileInput;
            th2 = th;
            inputStreamReader2 = inputStreamReader;
            r1 = fileInputStream;
            IOUtils.closeQuietly((InputStream) r1);
            IOUtils.closeQuietly((Reader) inputStreamReader2);
            IOUtils.closeQuietly((Reader) inputStreamReader);
            throw th2;
        }
    }

    private static void component1(String str) {
        synchronized (str) {
            component2.clear();
            Map<String, String> mapLoadResFromFile = loadResFromFile(str);
            if (mapLoadResFromFile != null) {
                component2.putAll(mapLoadResFromFile);
            }
        }
    }

    public static Map<String, String> loadStrings(File file) {
        Reader inputStreamReader;
        Exception exc;
        BufferedReader bufferedReader;
        Throwable th;
        Reader reader;
        StringBuilder sb;
        ArrayMap arrayMap = new ArrayMap();
        Reader reader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
        } catch (Exception e) {
            exc = e;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            inputStreamReader = null;
        }
        try {
            bufferedReader = new BufferedReader(inputStreamReader);
        } catch (Exception e2) {
            reader = inputStreamReader;
            exc = e2;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            CloseUtils.closeIO(reader2, inputStreamReader);
            throw th;
        }
        try {
            sb = new StringBuilder();
        } catch (Exception e3) {
            reader = inputStreamReader;
            exc = e3;
            reader2 = reader;
            try {
                L.d("=====", exc.getMessage());
                CloseUtils.closeIO(bufferedReader, reader2);
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = reader2;
                reader2 = bufferedReader;
                th = th;
                CloseUtils.closeIO(reader2, inputStreamReader);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            reader2 = inputStreamReader;
            inputStreamReader = reader2;
            reader2 = bufferedReader;
            th = th;
            CloseUtils.closeIO(reader2, inputStreamReader);
            throw th;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            return arrayMap;
        }
        arrayMap.putAll(getRequestBeneficiariesState(sb.toString()));
        CloseUtils.closeIO(bufferedReader, inputStreamReader);
        return arrayMap;
    }

    private static Map<String, String> getRequestBeneficiariesState(String str) {
        ArrayMap arrayMap = new ArrayMap();
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            int eventType = xmlPullParserNewPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParserNewPullParser.getAttributeCount() > 0) {
                        String attributeValue = xmlPullParserNewPullParser.getAttributeValue(0);
                        xmlPullParserNewPullParser.next();
                        arrayMap.put(attributeValue, xmlPullParserNewPullParser.getText());
                    }
                }
                eventType = xmlPullParserNewPullParser.next();
            } while (eventType != 1);
        } catch (Exception e) {
            L.d("=====", e.getMessage());
        }
        return arrayMap;
    }

    public static String getResString(String str) {
        if (component2.containsKey(str)) {
            return component2.get(str);
        }
        return null;
    }

    public static String getResString(int i) {
        String resourceEntryName = Utils.getApp().getResources().getResourceEntryName(i);
        if (!TextUtils.isEmpty(resourceEntryName)) {
            String resString = getResString(resourceEntryName);
            return TextUtils.isEmpty(resString) ? component3().getString(i) : resString;
        }
        return component3().getString(i);
    }

    public static String getResStringOrNull(int i) {
        try {
            String resourceEntryName = Utils.getApp().getResources().getResourceEntryName(i);
            String resString = getResString(resourceEntryName);
            L.d(copydefault, "getResStringOrNull:" + resourceEntryName + ":" + resString);
            if (TextUtils.isEmpty(resourceEntryName)) {
                return null;
            }
            return resString;
        } catch (Resources.NotFoundException e) {
            L.e(e.getMessage());
            return null;
        }
    }

    public static String getResString(int i, Object... objArr) {
        String resString = getResString(i);
        return !TextUtils.isEmpty(resString) ? String.format(resString, objArr) : resString;
    }

    public static String getResStringWithoutConvert(int i) {
        String resourceEntryName = Utils.getApp().getResources().getResourceEntryName(i);
        if (!TextUtils.isEmpty(resourceEntryName)) {
            String resString = getResString(resourceEntryName);
            return TextUtils.isEmpty(resString) ? component3().getString(i) : resString;
        }
        return component3().getString(i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:54|3|4|(2:63|5)|(6:69|6|67|7|65|8)|(3:9|(1:11)(1:71)|41)|12|61|13|41) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r0 = e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void component3(java.lang.String r6) {
        /*
            monitor-enter(r6)
            androidx.collection.ArrayMap<java.lang.String, java.lang.String[]> r0 = com.huawei.mobileapp.resourcelib.ResourceStringUtils.component1     // Catch: java.lang.Throwable -> La3
            r0.clear()     // Catch: java.lang.Throwable -> La3
            r0 = 0
            android.content.Context r1 = component3()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L68
            java.io.FileInputStream r1 = r1.openFileInput(r6)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L68
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5c
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5c
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5c
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L51
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            r0.<init>()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
        L20:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r4 == 0) goto L2a
            r0.append(r4)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            goto L20
        L2a:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            component2(r0)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            org.apache.commons.io.IOUtils.closeQuietly(r1)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> La3
            org.apache.commons.io.IOUtils.closeQuietly(r2)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> La3
            org.apache.commons.io.IOUtils.closeQuietly(r3)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> La3
            goto L85
        L3c:
            r0 = move-exception
        L3d:
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> La3
            goto L80
        L43:
            r0 = move-exception
            goto L8b
        L46:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L6b
        L4b:
            r3 = move-exception
            r5 = r3
            r3 = r0
            r0 = r1
            r1 = r5
            goto L8e
        L51:
            r3 = move-exception
            r5 = r3
            r3 = r0
            r0 = r1
            r1 = r5
            goto L6b
        L57:
            r2 = move-exception
            r3 = r2
            r2 = r0
            r0 = r1
            goto L65
        L5c:
            r2 = move-exception
            r3 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L6b
        L62:
            r1 = move-exception
            r3 = r1
            r2 = r0
        L65:
            r1 = r3
            r3 = r2
            goto L8e
        L68:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L6b:
            java.lang.String r4 = "====="
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L87
            com.huawei.common.util.L.d(r4, r1)     // Catch: java.lang.Throwable -> L87
            org.apache.commons.io.IOUtils.closeQuietly(r0)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La3
            org.apache.commons.io.IOUtils.closeQuietly(r2)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La3
            org.apache.commons.io.IOUtils.closeQuietly(r3)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La3
            goto L85
        L7e:
            r0 = move-exception
            goto L3d
        L80:
            java.lang.String r1 = "====="
            com.huawei.common.util.L.d(r1, r0)     // Catch: java.lang.Throwable -> La3
        L85:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La3
            return
        L87:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L8b:
            r5 = r1
            r1 = r0
            r0 = r5
        L8e:
            org.apache.commons.io.IOUtils.closeQuietly(r0)     // Catch: java.lang.Exception -> L98 java.lang.Throwable -> La3
            org.apache.commons.io.IOUtils.closeQuietly(r2)     // Catch: java.lang.Exception -> L98 java.lang.Throwable -> La3
            org.apache.commons.io.IOUtils.closeQuietly(r3)     // Catch: java.lang.Exception -> L98 java.lang.Throwable -> La3
            goto La2
        L98:
            r0 = move-exception
            java.lang.String r2 = "====="
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> La3
            com.huawei.common.util.L.d(r2, r0)     // Catch: java.lang.Throwable -> La3
        La2:
            throw r1     // Catch: java.lang.Throwable -> La3
        La3:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.mobileapp.resourcelib.ResourceStringUtils.component3(java.lang.String):void");
    }

    private static void component2(String str) {
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            int eventType = xmlPullParserNewPullParser.getEventType();
            while (!component2(xmlPullParserNewPullParser, eventType)) {
                eventType = xmlPullParserNewPullParser.next();
                if (eventType == 1) {
                    return;
                }
            }
        } catch (Exception e) {
            L.d("=====", e.getMessage());
        }
    }

    private static boolean component2(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        if (i == 2 && xmlPullParser.getAttributeCount() > 0) {
            ArrayList arrayList = new ArrayList();
            String name = xmlPullParser.getName();
            String attributeValue = xmlPullParser.getAttributeValue(0);
            while (true) {
                xmlPullParser.next();
                int eventType = xmlPullParser.getEventType();
                if (eventType == 3 && xmlPullParser.getName().equals(name)) {
                    component1.put(attributeValue, (String[]) arrayList.toArray(new String[arrayList.size()]));
                    break;
                }
                if (eventType == 1) {
                    return true;
                }
                if (eventType == 2) {
                    xmlPullParser.next();
                    arrayList.add(xmlPullParser.getText());
                }
            }
        }
        return false;
    }

    public static String[] getStringArray(int i) {
        String resourceEntryName = Utils.getApp().getResources().getResourceEntryName(i);
        if (!TextUtils.isEmpty(resourceEntryName)) {
            String[] stringArray = getStringArray(resourceEntryName);
            return (stringArray == null || stringArray.length == 0) ? component3().getResources().getStringArray(i) : stringArray;
        }
        return component3().getResources().getStringArray(i);
    }

    public static String[] getStringArray(String str) {
        if (component1.containsKey(str)) {
            return component1.get(str);
        }
        return null;
    }

    private static String ShareDataUIState(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            str2 = str2.replace("null", "\uffff\uffff");
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                str2 = str2.replaceAll(jSONObject.getString("from"), jSONObject.getString(TypedValues.TransitionType.S_TO)).replace("null", "");
            }
        } catch (JSONException e) {
            L.d("=====", e.getMessage());
        }
        return str2.replace("\uffff\uffff", "null");
    }

    public static void saveStringResource(String str, List<String> list, List<String> list2) {
        Exception e;
        int iIntValue;
        int iIntValue2;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                iIntValue = Integer.valueOf(getCurrentResVersion()).intValue();
                try {
                    iIntValue2 = Integer.valueOf(str).intValue();
                } catch (Exception e2) {
                    e = e2;
                    L.d(copydefault, e.getMessage());
                    iIntValue2 = 0;
                }
            } catch (Exception e3) {
                e = e3;
                iIntValue = 0;
            }
            if (iIntValue >= iIntValue2) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                arrayList.addAll(list);
            }
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            UpdateUrlList = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                UpdateUrlList.add(new File((String) arrayList.get(i)).getName());
            }
            NewResVersion = str;
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    component1(it.next(), 1);
                }
            }
            if (list2 != null) {
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    component1(it2.next(), 2);
                }
            }
            if (arrayList.size() == 0) {
                setCurrentResVersion(str);
            }
        } catch (Exception e4) {
            L.e(copydefault, e4.getMessage());
        }
    }

    public static void saveStringResource(String str, String str2, String str3) {
        try {
            component3(str, str2, 1);
            component3(str, str3, 2);
        } catch (Exception e) {
            L.e(copydefault, e.getMessage());
        }
    }

    private static void component3(final String str, final String str2, final int i) {
        int i2;
        L.d(copydefault, "downloadResFile: version=" + str + " url:" + str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        final String name = new File(str2).getName();
        int i3 = 0;
        try {
            i2 = Integer.parseInt(SPUtils.getInstance().getString(name + "ResourceVersion" + i, "-1"));
        } catch (Exception e) {
            e = e;
            i2 = 0;
        }
        try {
            i3 = Integer.parseInt(str);
        } catch (Exception e2) {
            e = e2;
            L.d(copydefault, e.getMessage());
        }
        if (i2 >= i3) {
            return;
        }
        new ResourceDownloader().downloadWithProgress(str2, Utils.getApp().getFilesDir().getAbsolutePath(), new FileDownloadUtils.DownloadProgress() {
            @Override
            public void onSuccess() {
                L.d(ResourceStringUtils.copydefault, "downloadResFile success: version=" + str + " url:" + str2);
                int i4 = i;
                if (i4 == 1) {
                    ResourceStringUtils.reloadResFile(name);
                } else if (i4 != 2) {
                    return;
                } else {
                    ResourceStringUtils.reloadArrayResFile(name);
                }
                SPUtils.getInstance().put(name + "ResourceVersion" + i, str);
            }
        });
    }

    private static void component1(String str, final int i) {
        ResourceDownloader resourceDownloader = new ResourceDownloader();
        final String name = new File(str).getName();
        resourceDownloader.downloadWithProgress(str, Utils.getApp().getFilesDir().getAbsolutePath(), new FileDownloadUtils.DownloadProgress() {
            @Override
            public void onSuccess() {
                ResourceStringUtils.copydefault(i, name);
            }
        });
    }

    public static void copydefault(int i, String str) {
        if (i == 1) {
            reloadResFile(str);
        } else if (i != 2) {
            return;
        } else {
            reloadArrayResFile(str);
        }
        synchronized (ShareDataUIState) {
            UpdateUrlList.remove(str);
            if (UpdateUrlList.size() == 0) {
                setCurrentResVersion(NewResVersion);
            }
        }
    }
}
