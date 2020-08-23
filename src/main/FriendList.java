import java.util.ArrayList;
import java.util.Arrays;

public class FriendList {

  private int numOfFriends;
  private int friendCapac;
  private ArrayList<String> friendsArr = new ArrayList<>();

  public FriendList(int numberOfFriends) {
    this.friendCapac = numberOfFriends;
    this.numOfFriends = 0;
  }

  public FriendList() {
    this.friendCapac = 10;
    this.numOfFriends = 0;
  }

  public int numFriends() {
    return friendsArr.size();
  }

  public void add(String friendName) {
    if (friendCapac > 0 && numOfFriends < friendCapac) {
      friendsArr.add(friendName);
      numOfFriends += 1;
    } else if (friendCapac > 0 && numOfFriends == friendCapac) {
      friendsArr.remove(0);
      friendsArr.add(friendName);
    }
  }

  public int capacity() {
    return friendCapac;
  }

  @Override
  public String toString() {
    return Arrays.deepToString(friendsArr.toArray());
  }
}
