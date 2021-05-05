package Concrete;

import Abstracts.IUserCheckService;
import Entities.User;

public class InMemoryUserCheckService implements IUserCheckService{

	@Override
	public boolean validate(User user) {
		// TODO Auto-generated method stub
		return true;
	}

}
