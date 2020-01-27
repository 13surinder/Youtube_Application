package youtube;

public class Video {

public Video(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
private String title;
private String author;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "Video [title=" + title + ", author=" + author + "]";
}
}
