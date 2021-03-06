/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.restdocs.http;

import java.util.Map;

import org.springframework.restdocs.snippet.Snippet;

/**
 * Static factory methods for documenting a RESTful API's HTTP requests.
 *
 * @author Andy Wilkinson
 * @author Jonathan Pearlin
 */
public abstract class HttpDocumentation {

	private HttpDocumentation() {

	}

	/**
	 * Returns a handler that will produce a snippet containing the HTTP request for the
	 * API call.
	 *
	 * @return the handler that will produce the snippet
	 */
	public static Snippet httpRequest() {
		return new HttpRequestSnippet();
	}

	/**
	 * Returns a handler that will produce a snippet containing the HTTP request for the
	 * API call. The given {@code attributes} will be available during snippet generation.
	 *
	 * @param attributes the attributes
	 * @return the handler that will produce the snippet
	 */
	public static Snippet httpRequest(Map<String, Object> attributes) {
		return new HttpRequestSnippet(attributes);
	}

	/**
	 * Returns a handler that will produce a snippet containing the HTTP response for the
	 * API call.
	 * @return the handler that will produce the snippet
	 */
	public static Snippet httpResponse() {
		return new HttpResponseSnippet();
	}

	/**
	 * Returns a handler that will produce a snippet containing the HTTP response for the
	 * API call. The given {@code attributes} will be available during snippet generation.
	 *
	 * @param attributes the attributes
	 * @return the handler that will produce the snippet
	 */
	public static Snippet httpResponse(Map<String, Object> attributes) {
		return new HttpResponseSnippet(attributes);
	}

}
