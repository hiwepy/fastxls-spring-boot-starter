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
 * Base properties for spreadsheet import configuration.
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
@Getter
@Setter
@ToString
/**
 * <p>Auto-configuration for ImportProperties.</p>
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class ImportProperties implements Serializable {

    private static final long serialVersionUID = 1L;

    /** Whether to skip the header row during import. */
    private boolean skipHeader = true;

    /** The maximum number of rows to import. */
    private int maxRows = 0;

}
