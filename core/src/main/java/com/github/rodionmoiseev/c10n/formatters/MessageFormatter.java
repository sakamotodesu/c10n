/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package com.github.rodionmoiseev.c10n.formatters;

import java.lang.reflect.Method;

/**
 * Formatter fills in the method argument placeholders
 * in the translated message.
 *
 * The syntax for placeholders in not defined, and
 * it's up to the implementation to parse and replace
 * the message correctly.
 */
public interface MessageFormatter {
    /**
     * Return a message with the argument placeholders
     * replaced with the given argument values.
     *
     * @param method  The method on which the invocation was made
     * @param message The translated message as it is declared in the method annotation
     * @param args    The actual argument values passed to the method
     * @return Formatted string with the argument placeholders replaced
     */
    String format(Method method, String message, Object... args);
}
