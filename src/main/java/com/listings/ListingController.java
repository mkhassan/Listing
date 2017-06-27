package com.listings;


	
	
import com.listings.Listing;
import com.listings.ListingService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




	@Controller
	public class ListingController {
		
		
		
		
				
		private ListingService listingService;
		
		
		@Autowired
		public void setListingService(ListingService listingService) {
			this.listingService = listingService;
		}
		
	    @RequestMapping("/")
	    String index(){
	        return "index";
	    }

		
	    
		
	@RequestMapping("listing/new")
	
	public String newTransaction(Model model) {
		model.addAttribute("listing", new Listing());
		return "listingform";
	}
		
	@PostMapping("/listing/new") 
	
	public String listingSubmit(@Valid Listing listing, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()) {
			return "listing";
		}
		
		return "result";
	}


	    
	    
	// save transaction
 @RequestMapping(value="listing", method=RequestMethod.POST)
 
 public String saveTransactiont(Listing listing){
	 
	 listingService.saveListing(listing);
	 
	 return "redirect:/listing/" + listing.getId();
 }
	    
	    
	    
	    
	    
	    
	    
	    
		@RequestMapping(value="/listings", method=RequestMethod.GET)
		
		
		// list all listings
		public String list(Model model) {
			model.addAttribute("listings", listingService.listAllListings());
			System.out.println("Returning list of Listings:");   // just for testing, not suppose to be here
			return "listings";
		}
		
		// get transaction by ID
		@RequestMapping("transaction/{id}")
			
			public String showListing(@PathVariable Integer id, Model model) {
				model.addAttribute("listing", listingService.getListingById(id));
				return "listingsshow";
			}
				
			

		
			


}
