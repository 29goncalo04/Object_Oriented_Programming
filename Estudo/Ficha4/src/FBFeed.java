import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FBFeed {
    
    private ArrayList <FBPost> posts;

    public FBFeed(){
        this.posts = new ArrayList<FBPost>();
    }
    public FBFeed(ArrayList <FBPost> posts){
        this.setPosts(posts);
    }
    public FBFeed(FBFeed myFbFeed){
        this.setPosts(myFbFeed.getPosts());
    }
    public ArrayList <FBPost> getPosts(){
        return this.posts;
    }
    public void setPosts(ArrayList <FBPost> posts){
        this.posts = new ArrayList<FBPost>();
        for(FBPost l : posts){
            this.posts.add(l.clone());
        }
    }
    public FBFeed clone(){
        return new FBFeed(this);
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        FBFeed that = (FBFeed) o;
        return this.posts.equals(that.posts);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("FBFeed: {\n");
        sb.append("Posts: ").append(this.getPosts().toString()).append("}\n");
        return sb.toString();
    }

    public int nrPosts(String user){
        int res = 0;
        for(FBPost l : this.getPosts()){
            if(user.equals(l.getUtilizador())) res++;
        }
        return res;
    }

    public List<FBPost> postsOf(String user){
        List<FBPost> posts = new ArrayList<FBPost>();
        for(FBPost l : this.getPosts()){
            if(user.equals(l.getUtilizador())) posts.add(l.clone());
        }
        return posts;
    }

    public List<FBPost> postsOf(String user, LocalDateTime inicio, LocalDateTime fim){
        List<FBPost> posts = new ArrayList<FBPost>();
        for(FBPost l : this.getPosts()){
            if(user.equals(l.getUtilizador())){
                if(l.getData().isAfter(inicio) && l.getData().isBefore(fim)) posts.add(l.clone());
            }
        }
        return posts;
    }

    public FBPost getPost(int id){
        FBPost res = new FBPost();
        for(FBPost l : this.getPosts()){
            if(id == l.getId()) res = l.clone();
        }
        return res;
    }

    public void comment(FBPost post, String comentario){
        int id = 0;
        for(FBPost l : this.getPosts()){
            if(post.equals(l)){
                FBPost novo = new FBPost(l);
                novo.getComentarios().add(comentario);
                this.getPosts().set(id, novo);
            }
            id++;
        }
    }

    public void comment(int postid, String comentario){
        int id = 0;
        for(FBPost l : this.getPosts()){
            if(postid == l.getId()){
                FBPost novo = new FBPost(l);
                novo.getComentarios().add(comentario);
                this.getPosts().set(id, novo);
                break;
            }
            id++;
        }
    }

    public void like(FBPost post){
        int i = 0;
        for(FBPost l : this.getPosts()){
            if(post.equals(l)){
                FBPost novo = new FBPost(l);
                novo.setLikes(novo.getLikes() + 1);
                this.getPosts().set(i, novo);
                break;
            }
            i++;
        }
    }

    public void like(int postid){
        int id = 0;
        for(FBPost l : this.getPosts()){
            if(postid == l.getId()){
                FBPost novo = new FBPost(l);
                novo.setLikes(novo.getLikes() + 1);
                this.getPosts().set(id, novo);
                break;
            }
            id++;
        }
    }

    // public List<Integer> top5Comments(){

    // }

}