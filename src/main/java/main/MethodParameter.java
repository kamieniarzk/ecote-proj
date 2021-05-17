package main;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MethodParameter extends Variable {

  @Builder
  public MethodParameter(final String name, final String type, final int line, final boolean isUsed, final Clazz clazz) {
    super(name, type, line, isUsed, clazz);
  }
}