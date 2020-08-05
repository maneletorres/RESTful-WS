package com.maneletorres.app.ws.userservice;

import com.maneletorres.app.ws.ui.model.request.UserDetailsRequestModel;
import com.maneletorres.app.ws.ui.model.response.UserRest;

public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails);
}