import java.util.Scanner;

public class FriendListApp {

  public void run() {

    Scanner kbd = new Scanner(System.in);

    System.out.println();
    System.out.println("========================================");
    System.out.println();

    System.out.print("How many friends do you have time for? ");
    int numFriendsWanted = kbd.nextInt();
    kbd.nextLine();

    System.out.println("Making a FriendList that holds " + numFriendsWanted + "....");
    FriendList friendList = new FriendList(numFriendsWanted);

    System.out.println();
    System.out.println("Done! Let's try this sucker out....");

    System.out.println();
    System.out.print("Please enter a list of friend first names separated by spaces: ");
    String listOfFriends = kbd.nextLine();

    System.out.println();
    System.out.println("Adding friends: " + listOfFriends + "...");
    System.out.println();

    Scanner textScanner = new Scanner(listOfFriends);
    while (textScanner.hasNext()) {
      friendList.add(textScanner.next());
    }
    textScanner.close();

    System.out.println("You now have " + friendList.numFriends() + " friends.");
    System.out.println("They are: " + friendList);

    System.out.println();
    System.out.println("========================================");
    System.out.println();
  }
}
