/*
 * Copyright (c) 2018, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package net.jeebiz.fastxls.spring.boot;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

import org.springframework.boot.context.properties.ConfigurationProperties;

import jxl.biff.formula.FunctionNames;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties(FastxlsJXLProperties.PREFIX)
@Getter
@Setter
@ToString
public class FastxlsJXLProperties {

	public static final String PREFIX = "spring.fastxls.jxl";

	/**
	 * Accessor to set the suppress warnings flag. Due to the change in logging in
	 * version 2.4, this will now set the warning behaviour across the JVM
	 * (depending on the type of logger used)
	 */
	private boolean suppressWarnings = false;

	/**
	 * The amount of memory allocated to store the workbook data when reading a
	 * worksheet. For processeses reading many small workbooks inside a WAS it might
	 * be necessary to reduce the default size
	 */
	private int initialFileSize;

	/**
	 * The amount of memory allocated to the array containing the workbook data when
	 * its current amount is exhausted.
	 */
	private int arrayGrowSize;

	/**
	 * Flag to indicate whether the drawing feature is enabled or not Drawings
	 * deactivated using -Djxl.nodrawings=true on the JVM command line Activated by
	 * default or by using -Djxl.nodrawings=false on the JVM command line
	 */
	private boolean drawingsDisabled;

	/**
	 * Flag to indicate whether the name feature is enabled or not Names deactivated
	 * using -Djxl.nonames=true on the JVM command line Activated by default or by
	 * using -Djxl.nonames=false on the JVM command line
	 */
	private boolean namesDisabled;

	/**
	 * Flag to indicate whether formula cell references should be adjusted following
	 * row/column insertion/deletion
	 */
	private boolean formulaReferenceAdjustDisabled;

	/**
	 * Flag to indicate whether the system hint garbage collection is enabled or
	 * not. As a rule of thumb, it is desirable to enable garbage collection when
	 * reading large spreadsheets from a batch process or from the command line, but
	 * better to deactivate the feature when reading large spreadsheets within a
	 * WAS, as the calls to System.gc() not only garbage collect the junk in
	 * JExcelApi, but also in the webservers JVM and can cause significant slowdown
	 * GC deactivated using -Djxl.nogc=true on the JVM command line Activated by
	 * default or by using -Djxl.nogc=false on the JVM command line
	 */
	private boolean gcDisabled;

	/**
	 * Flag to indicate whether the rationalization of cell formats is disabled or
	 * not. Rationalization is enabled by default, but may be disabled for
	 * performance reasons. It can be deactivated using -Djxl.norat=true on the JVM
	 * command line
	 */
	private boolean rationalizationDisabled;

	/**
	 * Flag to indicate whether or not the merged cell checking has been disabled
	 */
	private boolean mergedCellCheckingDisabled;

	/**
	 * Flag to indicate whether the copying of additional property sets are disabled
	 */
	private boolean propertySetsDisabled;

	/**
	 * Flag to indicate that cell validation criteria are ignored
	 */
	private boolean cellValidationDisabled;

	/**
	 * Flag to indicate whether or not to ignore blank cells when processing sheets.
	 * Cells which are identified as blank can still have associated cell formats
	 * which the processing program may still need to read
	 */
	private boolean ignoreBlankCells;

	/**
	 * Flag to indicate whether auto filtering should be read/copied
	 */
	private boolean autoFilterDisabled;

	/**
	 * Flag to indicate whether a temporary file should be used when writing out the
	 * workbook
	 */
	private boolean useTemporaryFileDuringWrite;

	/**
	 * The directory for used for the temporary file during write. If this is NULL,
	 * the default system directory is used
	 */
	private File temporaryFileDuringWriteDirectory;

	/**
	 * The locale. Normally this is the same as the system locale, but there may be
	 * cases (eg. where you are uploading many spreadsheets from foreign sources)
	 * where you may want to specify the locale on an individual worksheet basis The
	 * locale may also be specified on the command line using the lang and country
	 * System properties eg. -Djxl.lang=en -Djxl.country=UK for UK English
	 */
	private Locale locale;

	/**
	 * The locale specific function names for this workbook
	 */
	private FunctionNames functionNames;

	/**
	 * The character encoding used for reading non-unicode strings. This can be
	 * different from the default platform encoding if processing spreadsheets from
	 * abroad. This may also be set using the system property jxl.encoding
	 */
	private String encoding = "UTF-8";;

	/**
	 * The character set used by the readable spreadsheeet
	 */
	private int characterSet;

	/**
	 * The display language used by Excel (ISO 3166 mnemonic)
	 */
	private String excelDisplayLanguage;

	/**
	 * The regional settings used by Excel (ISO 3166 mnemonic)
	 */
	private String excelRegionalSettings;

	/**
	 * A hash map of function names keyed on locale
	 */
	private HashMap localeFunctionNames;

	/**
	 * Flag to indicate whether all external data and pivot stuff should refreshed
	 */
	private boolean refreshAll;

	/**
	 * Flag to indicate whether the file is a template or not (Usually with .xlt
	 * file name extension)
	 */
	private boolean template;

	/**
	 * Flag to indicate whether the file has been written by excel 2000.
	 *
	 * The EXCEL9FILE record indicates the file was written by Excel 2000. It has no
	 * record data field and is C0010000h. Any application other than Excel 2000
	 * that edits the file should not write out this record.
	 *
	 * However, it seemas that excel 2003 + 2007 still set this flag....
	 */
	private boolean excel9file = false;

	/**
	 * The WINDOWPROTECT record stores an option from the Protect Workbook dialog
	 * box.
	 *
	 * =1 if the workbook windows are protected
	 */
	private boolean windowProtected;

	/**
	 * Write access user name. When not set (null) then we set it to Java Excel API
	 * + Version number
	 */
	private String writeAccess;

	/**
	 * The HIDEOBJ record stores options selected in the Options dialog,View tab.
	 */
	private int hideobj;

}
