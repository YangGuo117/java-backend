package entity;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Item {
	private String itemId;
	private String name;
	private double rating;
	private String address;
	
	private Set<String> categories; 
	private String imageUrl; 
	private String url;
	private double distance;
	
	private String city;
	private String state;
	private String country;
	private String zipcode;
	private double latitude;
	private double longitude;
	private String description;
	
	public void main() {
		ItemBuilder a = new ItemBuilder();
	}
	
	public static class ItemBuilder {
		private String itemId;
		private String name;
		private double rating;
		private String address;
		private Set<String> categories;
		private String imageUrl; 
		private String url; 
		private double distance;
		
		private String city;
		private String state;
		private String country;
		private String zipcode;
		private double latitude;
		private double longitude;
		private String description;
		
		
		
		public ItemBuilder setItemId(String itemId) { 
			this.itemId = itemId;
			return this; 
		}
		public ItemBuilder setName(String name) { 
			this.name = name;
			return this; 
		}
		public ItemBuilder setRating(double rating) { 
			this.rating = rating;
			return this; 
		}
		public ItemBuilder setAddress(String address) { 
			this.address = address;
			return this; 
		}
		public ItemBuilder setCategories(Set<String> categories) { 
			this.categories = categories;
			return this; 
		}
		public ItemBuilder setImageUrl(String imageUrl) { 
			this.imageUrl = imageUrl;
			return this; 
		}
		public ItemBuilder setUrl(String url) { 
			this.url = url;
			return this; 
		}
		public ItemBuilder setDistance(double distance) { 
			this.distance = distance;
			return this; 
		}
		public Item build() {
			return new Item(this);
		}
		public void setCity(String c) {
			this.city = c;
			
		}
		public void setState(String s) {
			this.state = s;
			
		}
		public void setCountry(String c) {
			this.city = c;
			
		}
		public void setZipcode(String z) {
			this.zipcode = z;
			
		}
		public void setLatitude(Double la) {
			this.latitude = la;
			
		}
		public void setLongitude(Double lo) {
			this.longitude = lo;
			
		}
		public void setDescription(String des) {
			this.description = des;
			
		}
	}
	
	
	private Item(ItemBuilder builder) {
		this.itemId = builder.itemId;
		this.name = builder.name; 
		this.rating = builder.rating; 
		this.address = builder.address; 
		this.categories = builder.categories; 
		this.imageUrl = builder.imageUrl; 
		this.url = builder.url;
		this.distance = builder.distance;
	}






	public JSONObject toJSONObject() {
		JSONObject obj = new JSONObject();
		try {
			obj.put("item_id", itemId);
			obj.put("name", name);
			obj.put("rating", rating);
			obj.put("address", address);
			obj.put("categories", new JSONArray(categories)); obj.put("image_url", imageUrl);
			obj.put("url", url);
			obj.put("distance", distance);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	public String getItemId() {
		return itemId;
	}
	public String getName() {
		return name;
	}
	public double getRating() {
		return rating;
	}
	public String getAddress() {
		return address;
	}
	public Set<String> getCategories() {
		return categories;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public String getUrl() {
		return url;
	}
	public double getDistance() {
		return distance;
	}
	public Object getCity() {
		return city;
	}
	public Object getState() {
		return state;
	}
	public Object getLatitude() {
		return latitude;
	}
	public Object getLongitude() {
		return longitude;
	}
	public Object getDescription() {
		return description;
	}
}
