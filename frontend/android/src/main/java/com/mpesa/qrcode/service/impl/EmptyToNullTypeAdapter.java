package com.mpesa.qrcode.service.impl;

import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

class EmptyToNullTypeAdapter extends TypeAdapter<String> {
    EmptyToNullTypeAdapter() {
    }

    @Override
    public void write(JsonWriter jsonWriter, String str) throws IOException {
        if (str != null) {
            if (str.isEmpty()) {
                jsonWriter.nullValue();
                return;
            } else {
                TypeAdapters.STRING.write(jsonWriter, str);
                return;
            }
        }
        jsonWriter.nullValue();
    }

    @Override
    public String read2(JsonReader jsonReader) throws IOException {
        return TypeAdapters.STRING.read2(jsonReader);
    }
}
