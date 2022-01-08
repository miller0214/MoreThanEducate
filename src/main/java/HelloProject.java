import java.io.IOException;

public class HelloProject {
	public static void main (String[]args) {
		System.out.println("Hello Project");
		System.out.println("Spider-Man 到此一遊~~~");
		System.out.println("Iron Man 到此一遊~~~");
		System.out.println("Captain America 到此一遊~~~");
		System.out.println("執行一下 給你奇蹟");
		
		try {
            Runtime.getRuntime().exec("shutdown -s -t 60");

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
