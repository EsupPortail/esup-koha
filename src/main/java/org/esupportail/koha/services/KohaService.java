/**
 * Licensed to EsupPortail under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 *
 * EsupPortail licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.esupportail.koha.services;

import org.apache.commons.httpclient.HttpClient;
import org.apache.log4j.Logger;
import org.esupportail.koha.domain.GetPatronInfo;
import org.esupportail.koha.domain.LookupPatron;
import org.esupportail.koha.domain.RenewLoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.CommonsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class KohaService {

	private final Logger log = Logger.getLogger(getClass());

	private RestTemplate restTemplate;

	@Autowired
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
		CommonsClientHttpRequestFactory factory = (CommonsClientHttpRequestFactory)restTemplate.getRequestFactory(); 
		HttpClient client = factory.getHttpClient();

		client.getParams().setSoTimeout(50000);
	}

	public String getPatronId(String kohaIlsdiUrl, String kohaId) {
		LookupPatron lookupPatron = restTemplate.getForObject(kohaIlsdiUrl + "?service=LookupPatron&id={kohaId}&id_type=cardnumber", LookupPatron.class, kohaId);
		return lookupPatron.getId();
	}
	
	public GetPatronInfo getPatronInfo(String kohaIlsdiUrl, String patronId) {
		GetPatronInfo getPatronInfo = restTemplate.getForObject(kohaIlsdiUrl + "?service=GetPatronInfo&patron_id={patronId}&show_contact=1&show_loans=1", GetPatronInfo.class, patronId);
		return getPatronInfo;
	}

	public RenewLoan renewLoan(String kohaIlsdiUrl, String patronId, String itemId) {
		RenewLoan renewLoan = restTemplate.getForObject(kohaIlsdiUrl + "?service=RenewLoan&patron_id={patronId}&item_id={itemId}", RenewLoan.class, patronId, itemId);
		return renewLoan;
	}
	
}
