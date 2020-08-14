package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestApp {

  private App app;

  @Before
  public void setup() {
    app = new App();
  }

  @Test
  public void appShouldIncludeTheOneBeingGreeted() {
    String username = "World";

    assertThat(app.appSay(username), containsString(username));
  }

  @Test
  public void greetShouldIncludeAppPhrase() {
    String username = "World";

    assertThat(app.appSay(username).length(), is(greaterThan(username.length())));
  }
}
