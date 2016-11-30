/**
 * Noark Extraction Validator
 * Copyright (C) 2016, Documaster AS
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.documaster.validator.reporting.excel;

public enum StyleName {

	LINK("link"),

	GROUP("summaryGroup"),

	RESULT_TITLE("summaryTitle"),

	RESULT_SUCCESS("summarySuccess"),

	RESULT_WARNING("summaryWarning"),

	RESULT_FAILURE("summaryFailure"),

	RESULT_TITLE_SUCCESS("detailedTitleSuccess"),

	RESULT_TITLE_WARNING("detailedTitleWarning"),

	RESULT_TITLE_FAILURE("detailedTitleError"),

	RESULT_TYPE("detailedType"),

	RESULT_HEADER_ROW("detailedHeaderRow"),

	RESULT_ROW("detailedRow");

	private String name;

	private StyleName(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}
}
