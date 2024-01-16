package net.internalerror;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AppTest {

  @Test
  public void sampleTest() {
    assertDoesNotThrow(() -> App.main(new String[] { }));
  }

}
