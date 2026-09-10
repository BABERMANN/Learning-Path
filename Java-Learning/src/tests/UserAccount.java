package tests;

public class UserAccount {
    private String email;
    private String UserName;
    private UserAccount[] followers;
    private Post[] timeline = new Post[10];
    private Post[] posts;


    public UserAccount(String email, String UserName) {
        this.email = email;
        this.UserName = UserName;
        this.followers = new UserAccount[999];
        this.timeline = new Post[10];
        this.posts = new Post[10];
    }

    public void updateTimeline (Post newPost) {
        for (int i = 0; i < timeline.length; i++) {
            if (timeline[i] == null) {
                timeline[i] = newPost;
                return;
            }
        }
        for (int i = 0; i < timeline.length - 1; i++) {
            timeline[i] = timeline[i + 1];
        }
        timeline[posts.length - 1] = newPost;
    }


    public void publish(String quote){
    if(quote == null) return;

    Post newPost = new Post(this, quote);
    for (int i = 0; i < posts.length; i++) {
            if(posts[i] == null){
                posts[i] = newPost;
                break;
            }
    }
    updateTimeline(newPost);

    }




}





