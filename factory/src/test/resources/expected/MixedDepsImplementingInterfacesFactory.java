/*
 * Copyright (C) 2013 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tests;

import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

/**
 * @author Gregory Kick
 */
@Generated(
    value = "com.google.auto.factory.processor.AutoFactoryProcessor",
    comments = "https://github.com/google/auto/tree/master/factory"
)
final class MixedDepsImplementingInterfacesFactory
    implements MixedDepsImplementingInterfaces.FromInt, MixedDepsImplementingInterfaces.FromObject,
        MixedDepsImplementingInterfaces.MarkerA, MixedDepsImplementingInterfaces.MarkerB {
  private final Provider<String> sProvider;

  @Inject MixedDepsImplementingInterfacesFactory(Provider<String> sProvider) {
    this.sProvider = sProvider;
  }

  MixedDepsImplementingInterfaces create(int i) {
    return new MixedDepsImplementingInterfaces(sProvider.get(), i);
  }

  MixedDepsImplementingInterfaces create(Object o) {
    return new MixedDepsImplementingInterfaces(o);
  }

  @Override public MixedDepsImplementingInterfaces fromInt(int i) {
    return create(i);
  }

  @Override public MixedDepsImplementingInterfaces fromObject(Object o) {
    return create(o);
  }
}
