package com.listings;




import com.listings.Listing;
import com.listings.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ListingServiceImp implements ListingService {
	
	
private ListingRepository listingRepository;


		
		@Autowired
		
		public void setListingRepository(ListingRepository listingRepository) {
			this.listingRepository=listingRepository;
		}
		
		
				
		@Override
		public Iterable<Listing> listAllListings() {
			
			return listingRepository.findAll();
		}

		@Override
		public Listing getListingById(Integer id) {
			
			return listingRepository.findOne(id);
		}
		
	  
		

		@Override
		public Listing saveListing(Listing listing) {
			// TODO Auto-generated method stub
			return listingRepository.save(listing);
		}
		
		
		// After overriding interfaces, one can write own methods too!

		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


