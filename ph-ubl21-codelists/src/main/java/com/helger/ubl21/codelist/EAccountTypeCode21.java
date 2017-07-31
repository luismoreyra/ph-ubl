/**
 * Copyright (C) 2014-2017 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.ubl21.codelist;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.Nonempty;
import com.helger.commons.id.IHasID;
import com.helger.commons.lang.EnumHelper;
import com.helger.commons.name.IHasDisplayName;


/**
 * This file was automatically generated from Genericode file AccountTypeCode-2.1.gc. Do NOT edit!
 * It contains a total of 2 entries!
 * @author com.helger.ubl21.main.MainCreateEnumsGenericode21
 */
@CodingStyleguideUnaware
public enum EAccountTypeCode21
    implements IHasID<String> , IHasDisplayName
{
    _1("1", "Saving", "The type of financial account is saving."),
    _2("2", "Checking", "The type of financial account is checking.");
    private final String m_sID;
    private final String m_sDisplayName;
    private final String m_sDescription;

    private EAccountTypeCode21(
        @Nonnull
        @Nonempty
        final String sID,
        @Nonnull
        final String sDisplayName,
        @Nullable
        final String sDescription) {
        m_sID = sID;
        m_sDisplayName = sDisplayName;
        m_sDescription = sDescription;
    }

    @Nonnull
    @Nonempty
    public String getID() {
        return m_sID;
    }

    @Nonnull
    public String getDisplayName() {
        return m_sDisplayName;
    }

    @Nullable
    public String getDescription() {
        return m_sDescription;
    }

    @Nullable
    public static EAccountTypeCode21 getFromIDOrNull(
        @Nullable
        final String sID) {
        return EnumHelper.getFromIDOrNull(EAccountTypeCode21 .class, sID);
    }

    @Nullable
    public static String getDisplayNameFromIDOrNull(
        @Nullable
        final String sID) {
        final EAccountTypeCode21 eValue = EAccountTypeCode21 .getFromIDOrNull(sID);
        return ((eValue == null)?null:eValue.getDisplayName());
    }
}
