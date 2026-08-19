/**
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved.
 */
package io.github.easy4j.fastxls.core.property;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Base properties for spreadsheet export configuration.
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@Getter
@Setter
@ToString
/**
 * <p>Auto-configuration for ExportProperties.</p>
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class ExportProperties implements Serializable {

    private static final long serialVersionUID = 1L;

    /** The default file name used when exporting. */
    private String defaultFileName = "export";

    /** Whether to automatically adjust column widths. */
    private boolean autoSizeColumns = false;

}
