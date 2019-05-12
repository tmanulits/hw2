package stackHw2;

public class TestStack {

	public static void main(String[] args) {
		BoundedStack<String> browserBkBtn = new BoundedStack<String>();
		for(int i = 0; i <= 50; i++) {
			browserBkBtn.push("https://www.google.com/");
			System.out.println(browserBkBtn);
			System.out.println(i);
		}
		while (browserBkBtn.isEmpty() == true) {
			browserBkBtn.pop();
			System.out.println(browserBkBtn.pop());
		}
		
//		BoundedStack<String> browserBkBtn = new BoundedStack<String>();
//		browserBkBtn.push("https://www.google.com/");
//		browserBkBtn.push("https://www.google.com/");
//		browserBkBtn.push("https://www.google.com/");
//		browserBkBtn.push("https://www.google.com/");
//		browserBkBtn.push("https://www.google.com/");
//		browserBkBtn.push("https://www.google.com/");
//		System.out.println(browserBkBtn);
	}
}