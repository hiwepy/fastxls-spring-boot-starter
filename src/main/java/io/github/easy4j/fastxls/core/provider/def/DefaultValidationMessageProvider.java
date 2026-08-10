/**
 * Copyright (C) 2018 Jeebiz (http://jeebiz.net).
 * All Rights Reserved.
 */
package io.github.easy4j.fastxls.core.provider.def;

import org.springframework.biz.context.NestedMessageSource;

/**
 * Default implementation of the validation message provider that resolves
 * cell-level validation messages using an optional {@link NestedMessageSource}.
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 1.0.0
 */
public class DefaultValidationMessageProvider {

    private final NestedMessageSource messageSource;

    /**
     * Creates a new provider with the given message source.
     * @param messageSource the message source used for i18n resolution, may be {@code null}
     */
    public DefaultValidationMessageProvider(NestedMessageSource messageSource) {
        this.messageSource = messageSource;
    }

    /**
     * Returns the underlying message source.
     * @return the message source, or {@code null} if none was configured
     */
    public NestedMessageSource getMessageSource() {
        return messageSource;
    }

}
