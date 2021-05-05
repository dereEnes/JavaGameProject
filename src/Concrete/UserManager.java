package Concrete;

import Abstracts.IUserCheckService;
import Abstracts.IUserService;
import Entities.User;

public class UserManager implements IUserService{

	private IUserCheckService _userCheckService;
	
	public UserManager(IUserCheckService _userCheckService) {
		this._userCheckService = _userCheckService;
	}

	@Override
	public void add(User user){
		if(_userCheckService.validate(user)) {
			System.out.println("Kullan�c�s� Veritaban�na eklendi : "+user.getFirstName());
		}else {
			System.out.println("Ge�erli bir kullan�c� de�il");
		}
		
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c�s� Veritaban�ndan silindi : "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c�s� g�ncellendi : "+user.getFirstName());
		
	}

}
