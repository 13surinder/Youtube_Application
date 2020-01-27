package youtube;

public class Subscriber implements Observer {

	
	private String name;
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	public void update(Video video) {
	System.out.println("Hi"+name +"New Video Added -:"+video);
	}

}
