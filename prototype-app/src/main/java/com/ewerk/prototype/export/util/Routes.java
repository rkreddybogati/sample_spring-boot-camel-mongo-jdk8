package com.ewerk.prototype.export.util;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * Utility class with helper functions for Camel routes.
 *
 * @author h.stolzenberg
 * @since 0.0.4
 */
public final class Routes {
  private static final String PREFIX = "prototype";

  private Routes() {
  }

  public static String id(final Class<?> routeBuilderClass, final String label) {
    checkArgument(routeBuilderClass != null,
      "Argument 'routeBuilderClass' must not be null or empty.");
    checkArgument(label != null && !label.isEmpty(), "Argument 'label' must not be null or empty.");

    //noinspection ConstantConditions
    return String.format("[%s/%s/%s]", PREFIX, routeBuilderClass.getCanonicalName(), label);
  }
}
