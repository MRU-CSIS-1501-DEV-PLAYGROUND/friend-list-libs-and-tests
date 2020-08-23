import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Quiz: FriendList")
public class FriendListCreationTests {

  @Test
  @DisplayName("can create a list that holds a given number of friends")
  public void create_list_of_given_capacity() {
    FriendList friendList = new FriendList(3);

    assertEquals(0, friendList.numFriends());
    assertEquals(3, friendList.capacity());
  }

  @Test
  @DisplayName("can create a list that holds default number of friends (10)")
  public void create_list_of_default_capacity() {
    FriendList friendList = new FriendList();

    assertEquals(0, friendList.numFriends());
    assertEquals(10, friendList.capacity());
  }

  @Test
  @DisplayName("can create a list that holds no friends")
  public void create_list_of_0_capacity() {
    FriendList friendList = new FriendList(0);

    assertEquals(0, friendList.numFriends());
    assertEquals(0, friendList.capacity());
  }
}
