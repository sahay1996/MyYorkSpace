package edu.ycp.cs320.myYorkSpace.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.myYorkSpace.shared.Account;
import edu.ycp.cs320.myYorkSpace.shared.Post;


@RemoteServiceRelativePath("profile")
public interface ProfileService extends RemoteService{

	public ArrayList<Post> getActiveUserPosts(Account user);
	public String getUserName(Account user);
	public Account addPostToUser(Account userProfileBeingShown, String userName,
			String text);

	
}
