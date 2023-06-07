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
package com.dalcomlab.ap.logback.core.rolling;

import com.dalcomlab.ap.logback.core.LogbackException;

/**
 * A RolloverFailure occurs if, for whatever reason a rollover fails.
 *
 * @author Ceki Gulcu
 */
public class RolloverFailure extends LogbackException {

    private static final long serialVersionUID = -4407533730831239458L;

    public RolloverFailure(String msg) {
        super(msg);
    }

    public RolloverFailure(String message, Throwable cause) {
        super(message, cause);
    }
}