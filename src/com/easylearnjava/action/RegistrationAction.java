package com.easylearnjava.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.easylearnjava.dao.RegistrationDao;
import com.easylearnjava.form.RegistrationForm;
import com.easylearnjava.service.RegistrationService;

public class RegistrationAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ActionMessages messages = new ActionMessages();
		RegistrationForm rf = (RegistrationForm) form;
		RegistrationService rs = new RegistrationService();
		boolean isValid = rs.checkUserData(rf.getUserName(), rf.getPassword());

		if (isValid) {
			
			RegistrationDao ds= new RegistrationDao();
			String password =null;
		    password= ds.registerRecord(rf.getUserName(), rf.getPassword());
			return mapping.findForward("Success");
			
	
			
		} else {
			messages.add("global", new ActionMessage("registration.failed"));
			saveErrors(request, messages);
			return mapping.findForward("faliure");
			
		}
	}
}
