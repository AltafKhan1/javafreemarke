package net.viralpatel.struts2;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
 
	private static final long serialVersionUID = -8366209797454396351L;

	private static List<User> userList = new ArrayList<User>();
	private static List<User> checkList = new ArrayList<User>();

	private User user;
	
	static {
		userList.add(new User("Bill", "Gates",false));
		userList.add(new User("Steve", "Jobs",false));
		userList.add(new User("Larry", "Page",false));
		userList.add(new User("Sergey", "Brin",false));
		userList.add(new User("Larry", "Ellison",false));
	}
    /**
     * Action method to display user list. Uses <code>userList</code> array 
     * object defined as class level attribute to display list of users.
     * @return SUCCESS 
     */
    public String list() {
    	return SUCCESS;
    }
 
    /**
     * Action method to add new user. Read the user information
     * via <code>user</code> object defined as class level attribute.
     * @return SUCCESS if user is added successfully
     */
    public String add() {
    	
    	System.out.println("User:"+user);
    	
        userList.add(user);
        checkList.add(user);
    	
    	return SUCCESS;
    }

    public List<User> getUserList() {
	return userList;
    }

    public void setUserList(List<User> userList) {
	UserAction.userList = userList;
    }
    
    public List<User> getcheckList() {
    	return checkList;
        }

        public void setcheckList(List<User> userList) {
    	UserAction.checkList = userList;
        }

    public User getUser() {
	return user;
    }

    public void setUser(User user) {
	this.user = user;
    }
}