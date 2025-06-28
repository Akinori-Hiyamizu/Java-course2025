package kouza.exercise3_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main3_1 {
  //正規表現

  public static void main(String[] args) {
    Map<String, String> addressMap = new HashMap<>();
    addressMap.put("井上", "hoge@gmail.com");
    addressMap.put("佐藤", "fuga@gmail.com");
    addressMap.put("田中", "aaabbbcc@yahoo.co.jp");
    addressMap.put("山本", "raise-tech.net");

    List<String> addressList = addressMap.values().stream()
        .filter(s -> s.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
        .collect(Collectors.toList());
    System.out.println(addressList);

  }

}
