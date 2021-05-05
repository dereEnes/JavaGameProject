import Concrete.MenrisUserCheckManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User(1,"Enes","Dere","1997");
		
		
		Game game = new Game();
		game.setId(1);
		game.setName("Assassin's Creed Valhalla");
		game.setPrice(150);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sell(user, game);
		
		UserManager userManager = new UserManager(new MenrisUserCheckManager());
		userManager.add(user);
	}

}
