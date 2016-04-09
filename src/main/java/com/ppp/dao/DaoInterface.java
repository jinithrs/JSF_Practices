package com.ppp.dao;

import java.sql.SQLException;

import com.ppp.eo.LoginTableEo;
import com.ppp.eo.RegisterTableEo;

public interface DaoInterface {
	public RegisterTableEo doRegister(RegisterTableEo object) throws SQLException;
	public boolean doLogin(LoginTableEo object)throws SQLException;
	public boolean activateAccount(RegisterTableEo object) throws SQLException;
	public RegisterTableEo retrieveRegisterEo(String email);
}
