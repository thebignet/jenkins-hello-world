package org.detoeuf.helloworld;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainControllerTest {
  @Test
  public void shouldUseJenkinsTemplate(){
    final MainController controller = new MainController();
    assertThat(controller.home()).isEqualTo("jenkins");
  }
}
