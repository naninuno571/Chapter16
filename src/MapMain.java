import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("京都府", 255);//ペアで値を格納
        prefs.put("東京都", 1261);
        prefs.put("熊本県", 181);
        int tokyo = prefs.get("東京都");//キーを指定して対応する値を格納
        System.out.println("東京都の人口は、" + tokyo);
        prefs.remove("京都府");
        prefs.put("熊本県", 182);//値の書き換え
        //int kumamoto = prefs.get("熊本県");
        System.out.println("熊本県の人口は、" + prefs.get("熊本県"));
    }
}