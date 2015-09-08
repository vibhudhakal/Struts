package com.easylearnjava.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class RegistrationForm extends ActionForm {

	private String userName;
	private String password;
	private String message;

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		if (getUserName() == null || getUserName().length() < 5) {
			errors.add("username", new ActionMessage("error.name.required"));
		}

		if (getPassword() == null || getPassword().length() < 5) {
			errors.add("password", new ActionMessage("error.password.required"));
		}

		return errors;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		super.reset(mapping, request);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
