import java.util.*;

public class HashMap {
  public static void main(String[] args) {
    Map<String, String> map = new java.util.HashMap<>();
    map.put("chenmo", "沉默");
    map.put("wanger", "王二");
    map.put("chenqingyang", "陈清扬");
    map.put("xiaozhuanling", "小转铃");
    map.put("fangxiaowan", "方小婉");

    // 遍历 HashMap
    for (String key : map.keySet()) {
      int h, n = 16;
      int hash = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
      int i = (n - 1) & hash;
      // 打印 key 的 hash 值 和 索引 i
      System.out.println(key + "的hash值 : " + hash + " 的索引 : " + i);
    }
  }
}
