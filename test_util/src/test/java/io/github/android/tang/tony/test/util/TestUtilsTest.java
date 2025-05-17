package io.github.android.tang.tony.test.util;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class TestUtilsTest {

  @Test
  public void content() {

    String json = ResourceReader.content("gson.json");
    Type type = new TypeToken<Map<String, Integer>>() {
    }.getType();
    Map<String, Integer> actual = new Gson().fromJson(json, type);
    assertThat(actual).isEqualTo(expected());
  }

  private Object expected() {
    Map<String, Integer> result = new HashMap<>();
    result.put("key", 1);
    return result;
  }
}
