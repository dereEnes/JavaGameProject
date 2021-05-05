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
			System.out.println("Kullanýcýsý Veritabanýna eklendi : "+user.getFirstName());
		}else {
			System.out.println("Geçerli bir kullanýcý deðil");
		}
		
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcýsý Veritabanýndan silindi : "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcýsý güncellendi : "+user.getFirstName());
		
	}

}
