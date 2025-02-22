/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2022 Adobe
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.forms.core.components.models.form;

import org.jetbrains.annotations.NotNull;
import org.osgi.annotation.versioning.ConsumerType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Defines the form {@code Text} Sling Model used for the {@code /apps/core/fd/components/form/textinput} component.
 *
 * @since com.adobe.cq.forms.core.components.models.form 0.0.1
 */
@ConsumerType
public interface TextInput extends Field {

    /**
     * Returns {@code true} if multi line, otherwise {@code false}.
     *
     * @return {@code true} if multi line, otherwise {@code false}
     * @since com.adobe.cq.forms.core.components.models.form 0.0.1
     */
    @JsonIgnore
    default boolean isMultiLine() {
        return false;
    }

    /**
     * @see Base#getFieldType()
     * @since com.adobe.cq.forms.core.components.models.form 0.0.1
     */
    @NotNull
    @Override
    default String getFieldType() {
        return FieldType.TEXT_INPUT.getValue();
    }

    /**
     * Returns {@code true} if autocomplete, otherwise {@code false}.
     *
     * @return {@code true} if autocomplete, otherwise {@code false}
     * @since com.adobe.cq.forms.core.components.models.form 1.0.0
     */
    default boolean isAutoComplete() {
        return false;
    }

    /**
     * The autofillFieldKeyword.
     *
     * @return autofillFieldKeyword.
     * @since com.adobe.cq.forms.core.components.models.form 1.0.0
     */
    default String getAutofillFieldKeyword() {
        return null;
    }
}
