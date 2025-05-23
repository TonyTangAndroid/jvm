package io.github.android.tang.tony.test.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ryanharter.auto.value.gson.GenerateTypeAdapter;

public class GsonTestUtil {

  public static <T> T from(String resourceFilesPath, Class<T> tClass) {
    String content = ResourceReader.content(resourceFilesPath);
    return gson().fromJson(content, tClass);
  }

  public static Gson gson() {
    return new GsonBuilder().registerTypeAdapterFactory(GenerateTypeAdapter.FACTORY).create();
  }
}
