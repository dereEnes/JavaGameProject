package Concrete;

import Abstracts.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya indirim Oraný :"+campaign.getPercent());
		System.out.println("Kampanya Kategorisi    :"+campaign.getCategory());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi "+campaign.getId());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi "+campaign.getId());
		
	}

	
}
