package Concrete;

import Abstracts.IUserCheckService;
import Entities.User;

public class MenrisUserCheckManager implements IUserCheckService{

	@Override
	public boolean validate(User user) {
		if(user.getFirstName().length()>2) {
			return true;
		}else {
			return false;
			}
			
		
	}

}
