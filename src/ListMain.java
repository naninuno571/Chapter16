import java.util.ArrayList; // import文

public class ListMain {
    public static void main(String[] args) {
        // 1. ArrayListの宣言と初期化 (サイズ指定は不要)
        ArrayList<String> names = new ArrayList<String>();

        // 2. 要素の追加 (addメソッドで末尾にどんどん追加)
        names.add("たなか");
        names.add("すずき");
        names.add("さいとう");

        // 3. 要素の取得 (getメソッドでインデックスを指定して取得)
        String name1 = names.get(0);
        String name2 = names.get(1);
        String name3 = names.get(2);
        System.out.println("リスト0: " + name1);
        System.out.println("リスト1: " + name2);
        System.out.println("リスト2: " + name3);

        // 4. 要素数の確認 (size()メソッドを使用)
        int count = names.size(); // ArrayListはメソッドなので()が必要
        System.out.println("リストの要素数: " + count);
    }
}