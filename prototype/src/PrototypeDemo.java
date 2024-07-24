import java.util.Date;
//lombok
abstract class Post {
    private String text ="post caption" ;
    private String image = "test.png" ;
    private String author = "test man" ;
    private Date time = new Date(10) ;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor (String author) {
        this.author = author;
    }
    public Date getTime() {
        return time;
    }
    public void setTime (Date time) {
        this.time = time;
    }

    public abstract Post postCopy();
}

class ProfilePost extends Post {

    public ProfilePost (){
        super();
    }
    public ProfilePost (String text , String image , String author , Date time ){
        this.setText(text);
        this.setImage(image);
        this.setAuthor(author);
        this.setTime(time);
    }

    @Override
    public Post postCopy() {
        ProfilePost clonedPost = new ProfilePost(this.getText(),this.getImage(),this.getAuthor(), this.getTime());
        return clonedPost;
    }
}

class repost extends Post {
    private String receiver;
    public repost(String reciver){
        super();
        this.receiver = reciver ;
    }
    public repost (String reciver, String text , String image , String author , Date time){
        this.setText(text);
        this.setImage(image);
        this.setAuthor(author);
        this.setTime(time);
        this.receiver =reciver;
    }
    public String getReceiver() {
        return receiver;
    }
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public Post postCopy(){
        return new repost(this.receiver, this.getText(), this.getImage(), this.getAuthor(), this.getTime() );
    }
}
public class PrototypeDemo {
    public static void main(String[] args) {
        ProfilePost test = new ProfilePost();
        Post testClone = test.postCopy();
        repost test2 = new repost("recive client","repost message ","postimage.png","test man",new Date() );
        Post test2clone = test2.postCopy();

        System.out.println(testclone.getAuthor());
        System.out.println(test2clone.getImage());
        System.out.println(test2clone.getText());
    }

}

/*
Project Idea: Cloning Social Media Posts

Description: Create a system for cloning social media posts. Each post has properties such as text, image, author, and timestamp.
The prototype pattern can be used to clone posts when users want to share or repost content with slight modifications.
Features:
Create a base post with properties.
Implement a cloning feature to create new posts based on existing ones.
Allow modification of cloned posts before publishing.
 */