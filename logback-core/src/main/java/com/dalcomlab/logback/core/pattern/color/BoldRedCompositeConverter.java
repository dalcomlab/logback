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
package com.dalcomlab.logback.core.pattern.color;

import static com.dalcomlab.logback.core.pattern.color.ANSIConstants.BOLD;
import static com.dalcomlab.logback.core.pattern.color.ANSIConstants.RED_FG;

/**
 * Encloses a given set of converter output in bold red using the appropriate ANSI escape codes.
 * @param <E>
 * @author  Ceki G&uuml;lc&uuml;
 * @since 1.0.5
 */
public class BoldRedCompositeConverter<E> extends ForegroundCompositeConverterBase<E> {

    @Override
    protected String getForegroundColorCode(E event) {
        return BOLD + RED_FG;
    }
}