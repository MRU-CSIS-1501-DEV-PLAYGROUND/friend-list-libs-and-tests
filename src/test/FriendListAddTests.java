import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Quiz: FriendList")
public class FriendListAddTests {

	@Test
	@DisplayName("bound to fail")
	public void bound_to_fail() {
		assertEquals(true, false);
	}

    @Test
    @DisplayName("adding 1 friend to an empty list")
    public void add_1_friend_to_empty_list()  {
        FriendList friendList = new FriendList();

        friendList.add("Debbie");
        
        assertEquals(1, friendList.numFriends());
        assertEquals("[Debbie]", friendList.toString());
    }
   
    
    @Test
    @DisplayName("adding 1 friend to list with a friend already in it")
    public void add_1_friend_to_size_1_list()  {
        FriendList friendList = new FriendList();

        friendList.add("Debbie");
        friendList.add("Roald");
        
        assertEquals(2, friendList.numFriends());
        assertEquals("[Debbie, Roald]", friendList.toString());
    }
    
    @Test
    @DisplayName("adding 1 friend to list filled to capacity kicks out 'oldest' friend")
    public void add_1_friend_to_size_at_capacity_list()  {
        FriendList friendList = new FriendList(2);

        friendList.add("Debbie");
        friendList.add("Roald");
        
        friendList.add("Kris");
        
        assertEquals(2, friendList.numFriends());
        assertEquals("[Roald, Kris]", friendList.toString());
    }
    
    @Test
    @DisplayName("adding to a zero-capacity list works as expected")
    public void add_1_friend_to_size_0_capacity_list()  {
        FriendList friendList = new FriendList(0);

        friendList.add("Debbie");
        friendList.add("Roald");
        friendList.add("Kris");
        
        assertEquals(0, friendList.numFriends());
        assertEquals("[]", friendList.toString());
    }

}
