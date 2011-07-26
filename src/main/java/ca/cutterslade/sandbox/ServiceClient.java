package ca.cutterslade.sandbox;

import java.util.ServiceLoader;

public class ServiceClient {

  public static void main(final String[] args) {
    final ServiceLoader<ServiceInterface> loader = ServiceLoader.load(ServiceInterface.class);
    for (final ServiceInterface impl : loader) {
      System.out.println(impl.getName());
    }
  }
}
