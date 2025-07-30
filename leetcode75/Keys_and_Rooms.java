import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Keys_and_Rooms {
  public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
    Set<Integer> visited = new HashSet<>();
    List<Integer> keys = new ArrayList<>();

    visited.add(0);
    for (Integer i : rooms.get(0)) {
      keys.add(i);
    }

    Set<Integer> res = dfs(visited, keys, rooms);

    return res.size() == rooms.size();
  }

  public static Set<Integer> dfs(
      Set<Integer> visited, List<Integer> keys, List<List<Integer>> rooms) {
    for (int idx = 0; idx < keys.size(); idx++) {
      Integer i = keys.get(idx);
      if (visited.contains(i)) {
        continue;
      }
      visited.add(i);
      for (Integer j : rooms.get(i)) {
        keys.add(j);
      }
    }
    return visited;
  }

  public static void main(String[] args) {
    List<List<Integer>> rooms = new ArrayList<>();
    rooms.add(List.of(1)); // Room 0 has key to room 1
    rooms.add(List.of(2)); // Room 1 has key to room 2
    rooms.add(List.of(3)); // Room 2 has key to room 3
    rooms.add(new ArrayList<>()); // Room 3 has no keys

    boolean result = canVisitAllRooms(rooms);
    System.out.println("Can visit all rooms: " + result); // Expected: true
  }
}
