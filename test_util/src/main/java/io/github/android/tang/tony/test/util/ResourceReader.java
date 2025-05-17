package io.github.android.tang.tony.test.util;

import com.google.common.io.Resources;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ResourceReader {

  private ResourceReader() {
  }

  public static String readString(String filePath) throws IOException {
    return Resources.toString(Resources.getResource(filePath), StandardCharsets.UTF_8);
  }

  public static String content(String filePath) {
    try {
      return readString(filePath);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}