/*
 * ApplicationInsights-Java
 * Copyright (c) Microsoft Corporation
 * All rights reserved.
 *
 * MIT License
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the ""Software""), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */

package com.microsoft.gcmonitor;

import com.microsoft.gcmonitor.garbagecollectors.GarbageCollector;
import com.microsoft.gcmonitor.memorypools.MemoryPool;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;

/** Parent class providing an overview of all memory management functions of the VM */
public interface MemoryManagement {

  /**
   * All pools that comprise the JVMs memory
   *
   * @return a copy of the list of all pools
   */
  Collection<MemoryPool> getPools();

  /**
   * Return a specific memory pool associated with the given name
   *
   * @param name The name of the memory pool
   */
  Optional<MemoryPool> getPool(String name);

  /**
   * Get all garbage collectors that manage the memory on this JVM
   *
   * @return a copy of the set of all collectors
   */
  Set<GarbageCollector> getCollectors();

  /** The up time of the JVM */
  long getUptime();

  /** The memory management group that manages this JVM */
  MemoryManagers getCollectorGroup();
}