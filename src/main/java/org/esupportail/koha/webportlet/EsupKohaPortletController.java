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
package org.esupportail.koha.webportlet;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.log4j.Logger;
import org.esupportail.koha.domain.GetPatronInfo;
import org.esupportail.koha.domain.RenewLoan;
import org.esupportail.koha.domain.CancelHold;
import org.esupportail.koha.services.KohaService;
import org.esupportail.koha.services.UserAgentInspector;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;


@Controller
@Scope("request")
@RequestMapping("VIEW")
public class EsupKohaPortletController {

	static Logger log = Logger.getLogger(EsupKohaPortletController.class);

	private final static String PREF_KOHA_ILSDI_URL = "kohaIlsdiUrl";
	
	private final static String PREF_KOHA_MAIN_URL = "kohaMainUrl";
	
	private final static String PREF_KOHA_DETAIL_URL = "kohaDetailUrl";
	
	private final static String PREF_KOHA_USER_UID_ATTR = "kohaUserUidAttr";
	
	@Resource 
	KohaService kohaService;
	
    @Resource
    protected UserAgentInspector userAgentInspector;	
	   
    @RequestMapping
    public ModelAndView renderView(@RequestParam(value = "renewLoanSuccess", required = false) String renewLoanSuccess, @RequestParam(value = "cancelHoldCode", required = false) String cancelHoldCode, RenderRequest request, RenderResponse response) {	
    	ModelMap model = new ModelMap();  

    	String kohaIlsdiUrl = request.getPreferences().getValue(PREF_KOHA_ILSDI_URL, null); 	

    	String kohaMainUrl = request.getPreferences().getValue(PREF_KOHA_MAIN_URL, null);
    	model.put("kohaMainUrl", kohaMainUrl);

    	String kohaDetailUrl = request.getPreferences().getValue(PREF_KOHA_DETAIL_URL, null); 	
    	model.put("kohaDetailUrl", kohaDetailUrl);

    	String kohaId = getUid(request);
    	
    	String patronId = kohaService.getPatronId(kohaIlsdiUrl, kohaId);    	    	
    	GetPatronInfo patronInfo = kohaService.getPatronInfo(kohaIlsdiUrl, patronId);
    	
    	model.put("patronId", patronId);
    	model.put("patronInfo", patronInfo);

		boolean isAdmin = isAdmin(request);
		boolean isManager = isManager(request);

	model.put("isAdmin", isAdmin);
    	model.put("isManager", isManager);
    	model.put("active", "home");	

        if(renewLoanSuccess != null && !renewLoanSuccess.isEmpty()) {
                if("1".equals(renewLoanSuccess)) {
                        model.put("message", "renewLoanSuccess");
                } else {
                        model.put("message", "renewLoanFailed");
                }
	}
	if(cancelHoldCode != null && !cancelHoldCode.isEmpty()) {
		if("Canceled".equals(cancelHoldCode)) {
			model.put("message", "cancelHold.Canceled");
		} else {
			model.put("message", "cancelHold.NotCanceled");
		}
        }

    	return new ModelAndView(getViewName(request, "index"), model);
    }




    void addDateTimeFormatPatterns(ModelMap model) {
        model.put("koha_date_format", "dd/MM/yyyy-HH:mm:ss");
    }

    private String getUid(PortletRequest request) {
		String uidAttr = request.getPreferences().getValue(PREF_KOHA_USER_UID_ATTR, null);
		Map<String,String> userinfo = (Map<String,String>)request.getAttribute(PortletRequest.USER_INFO);
		String uid = null;
		if(userinfo != null) {
			uid = userinfo.get(uidAttr);
		}
		/* Hack pour test ...
		     	if(uid==null) {
     	    		uid = "000032415";
     	    		    	}
		*/		
		return uid;
	}

	private boolean isAdmin(PortletRequest request) {
		return request.isUserInRole("esupKohaAdmin");
	}
	private boolean isManager(PortletRequest request) {
		return request.isUserInRole("esupKohaManager");
	}
		
    public String getViewName(PortletRequest request, String viewName){
        if(userAgentInspector.isMobile(request)) {
                viewName = "m_".concat(viewName);
        }
        return viewName;
    }
    
    @RequestMapping(params = "action=renewLoan")
    public void renewLoan(@RequestParam String itemId, ActionRequest request, ActionResponse response) {
    	
    	ModelMap model = new ModelMap();  
    	
    	String kohaIlsdiUrl = request.getPreferences().getValue(PREF_KOHA_ILSDI_URL, null); 	
    	String kohaId = getUid(request);
    	String patronId = kohaService.getPatronId(kohaIlsdiUrl, kohaId);
    	
    	RenewLoan renewLoan = kohaService.renewLoan(kohaIlsdiUrl, patronId, itemId);
        model.put("renewLoan", renewLoan);
    	
    	Map<String, String[]> parameters = new HashMap<String, String[]>();
    	parameters.put("renewLoanSuccess", new String[] {renewLoan.getSuccess()});

        response.setRenderParameters(parameters);
    }
    
    @RequestMapping(params = "action=cancelHold")
    public void cancelHold(@RequestParam String itemId, ActionRequest request, ActionResponse response) {
    	
    	ModelMap model = new ModelMap();  
    	
    	String kohaIlsdiUrl = request.getPreferences().getValue(PREF_KOHA_ILSDI_URL, null); 	
    	String kohaId = getUid(request);
    	String patronId = kohaService.getPatronId(kohaIlsdiUrl, kohaId);
    	
    	CancelHold cancelHold = kohaService.cancelHold(kohaIlsdiUrl, patronId, itemId);
        model.put("cancelHold", cancelHold);
    	
    	Map<String, String[]> parameters = new HashMap<String, String[]>();
    	parameters.put("cancelHoldCode", new String[] {cancelHold.getCode()});

        response.setRenderParameters(parameters);
    }
    
}

