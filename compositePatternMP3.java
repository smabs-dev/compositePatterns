//IComponent.java
public interface IComponent{
public void play();
public void setPlaybackSpeed(float speed);
public String getName();
}
//Playlist.java
public class Playlist implements IComponent{
public String playlistName;
public ArrayList<IComponent> playlist = new ArrayList();
public float speed = 1;
public void play() {
}
public void setPlaybackSpeed(float speed) {
	this.speed  = speed;
}
public String getName() {
return this.getName();
}
public String getArtist() {
return this.getArtist();
}
}
//Song.java
public class Song implements IComponent{
public String songName;
public String artist;
public float speed = 1;

public Song(String songName, String artist) {
	this.songName=songName;
	this.artist=artist;
}

public void setPlaybackSpeed(float speed) {
	this.speed = speed;
}
public String getArtist() {
	return this.artist;
}
}