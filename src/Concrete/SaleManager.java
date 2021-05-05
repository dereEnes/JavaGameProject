package Concrete;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Abstracts.ISaleService;
import Entities.Game;
import Entities.User;

public class SaleManager implements ISaleService{

	@Override
	public void sell(User user, Game game) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
	
		System.out.println("Alýcý :"+user.getFirstName());
		System.out.println("Oyun  :"+game.getName());
		System.out.println("Fiyat :"+game.getPrice());
		System.out.println("Date"+dtf.format(now));
		
	}

}
