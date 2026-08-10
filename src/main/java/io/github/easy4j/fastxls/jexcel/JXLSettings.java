/**
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved.
 */
package io.github.easy4j.fastxls.jexcel;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Configuration settings for the JExcelAPI (JXL) integration.
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@Getter
@Setter
@ToString
public class JXLSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    /** Whether to use the temporary file setting for writable workbooks. */
    private boolean useTemporaryFileDuringWrite = false;

}
