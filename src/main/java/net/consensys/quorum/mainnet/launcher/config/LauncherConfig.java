/*
 * Copyright ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package net.consensys.quorum.mainnet.launcher.config;

import java.io.InputStream;
import java.util.List;
import javax.annotation.Nullable;

import de.codeshelf.consoleui.prompt.ConsolePrompt;
import org.immutables.value.Value;

@Value.Immutable
public interface LauncherConfig {

  InputStream launcherScript();

  List<Object> commandClasses();

  @Value.Default
  default boolean isLauncherForced() {
    return false;
  }

  @Nullable
  ConsolePrompt customConsolePrompt();
}
