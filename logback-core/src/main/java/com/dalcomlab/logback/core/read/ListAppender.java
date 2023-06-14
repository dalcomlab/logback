/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2015, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */
package com.dalcomlab.logback.core.read;

import com.dalcomlab.logback.core.AppenderBase;

import java.util.ArrayList;
import java.util.List;

public class ListAppender<E> extends AppenderBase<E> {

    public List<E> list = new ArrayList<E>();

    protected void append(E e) {
        list.add(e);
    }
}