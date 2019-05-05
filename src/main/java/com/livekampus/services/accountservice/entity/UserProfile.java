package com.livekampus.services.accountservice.entity;



public class UserProfile {
		
	private int userId;
	private String userName;
	private String profile="assets/images/user-avatar2.jpg";
	private String postProfile="assets/images/user.jpg";
	private String timelinePost="assets/images/user-post.jpg";
	private String friend1="assets/images/friend-avatar9.jpg";
	private String city;
	private String state;
	private String caption;
	private String friend1Name;
	private String friend2Name;
	
	public UserProfile() {
		super();
		
	}

	public UserProfile(int userId, String userName, String profile, String postProfile, String timelinePost,
			String friend1, String city, String state, String caption, String friend1Name, String friend2Name) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.profile = profile;
		this.postProfile = postProfile;
		this.timelinePost = timelinePost;
		this.friend1 = friend1;
		this.city = city;
		this.state = state;
		this.caption = caption;
		this.friend1Name = friend1Name;
		this.friend2Name = friend2Name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getPostProfile() {
		return postProfile;
	}

	public void setPostProfile(String postProfile) {
		this.postProfile = postProfile;
	}

	public String getTimelinePost() {
		return timelinePost;
	}

	public void setTimelinePost(String timelinePost) {
		this.timelinePost = timelinePost;
	}

	public String getFriend1() {
		return friend1;
	}

	public void setFriend1(String friend1) {
		this.friend1 = friend1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getFriend1Name() {
		return friend1Name;
	}

	public void setFriend1Name(String friend1Name) {
		this.friend1Name = friend1Name;
	}

	public String getFriend2Name() {
		return friend2Name;
	}

	public void setFriend2Name(String friend2Name) {
		this.friend2Name = friend2Name;
	}
	
	
	
	
	
}
