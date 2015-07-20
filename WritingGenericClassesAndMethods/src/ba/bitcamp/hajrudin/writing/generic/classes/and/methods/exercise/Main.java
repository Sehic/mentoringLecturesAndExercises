package ba.bitcamp.hajrudin.writing.generic.classes.and.methods.exercise;

public class Main {
	public static void main(String[] args) {
		MyLinkedList<Application> appsList= new MyLinkedList<Application>();
		MyLinkedList<Editor> editorList = new MyLinkedList<Editor>();
		Application a1 = new Application("App1", 2001, 1, 25);
		Application a2 = new Application("App2", 2011, 1, 50);
		Application a3 = new Application("App3", 2013, 3, 33);
		
		appsList.add(a1);
		appsList.add(a2);
		appsList.add(a3);
		
		System.out.println(appsList.toString());
		
		Editor e1 = new Editor("App", 1999, 1, 13, 0, true);
		Editor e2 = new Editor("App1", 2000, 2, 99, 1, false);
		Editor e3 = new Editor("App2", 2011, 3, 33, 2, true);
		
		editorList.add(e1);
		editorList.add(e2);
		editorList.add(e3);
		
		System.out.println(editorList.toString());
		
		VideoGame vg1 = new VideoGame("App", 1999, 1, 100, "AS", "o", 3);
		VideoGame vg2 = new VideoGame("App1", 2001, 1, 165165, "asd", "assss", 54);
		VideoGame vg3 = new VideoGame("App2", 2011, 1, 1366, "afds", "asfdfsg", 68);
		
		MyLinkedList<VideoGame> videoGameList = new MyLinkedList<VideoGame>();
		
		videoGameList.add(vg1);
		videoGameList.add(vg2);
		videoGameList.add(vg3);
		
		
		
	}
}
