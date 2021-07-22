package io.snyk;

import static org.junit.Assert.assertEquals;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class GreetPersonTest {

  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  @Test
  public void shouldPrintHello() throws JsonGenerationException, IOException {
    String[] args = new String[0];
    GreetPerson.main(args);
    assertEquals("Hello Phill Garrett\n", systemOutRule.getLog());
  }
}
