package domain;

public class Post {
    private int id; //идентификатор поста
    private String name; //заголовок поста
    private int date; //дата поста
    private String imgPost; //иконка поста
    private String text; //текст поста
    private String foto; //ссылка фото поста
    private String video; //ссылка на видео поста
    private String commentsInfo; //комментарии к посту
    private String iconLike; //иконка Нравится
    private String iconShare; //иконка Поделиться
    private String iconComment; //иконка Комментарий
    private String iconViews; //иконка Счетчика просмотров


    public void setId(int newId){
        id = newId;
    }

    public int getId() {
        return id;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setDate(int newDate){
        date = newDate;
    }

    public int getDate(){
        return date;
    }

    public void setImgPost(String newImgPost) {
        imgPost = newImgPost;
    }

    public String getImgPost() {
        return imgPost;
    }

    public void setText(String newText){
        text = newText;
    }

    public String getText() {
        return text;
    }

    public void setFoto(String newFoto){
        foto = newFoto;
    }

    public String getFoto() {
        return foto;
    }

    public void setVideo(String newVideo){
        video = newVideo;
    }

    public String getVideo() {
        return video;
    }
    public void setCommentsInfo(String newCommentsInfo){
        commentsInfo = newCommentsInfo;
    }

    public String getCommentsInfo() {
        return commentsInfo;
    }

    public void setIconLike(String newIconLike){
        iconLike = newIconLike;
    }

    public String getIconLike() {
        return iconLike;
    }
    public void setIconShare(String newIconShare){
        iconShare = newIconShare;
    }

    public String getIconShare() {
        return iconShare;
    }

    public void setIconComment(String newIconComment) {
        iconComment = newIconComment;
    }

    public String getIconComment() {
        return iconComment;
    }

    public void setIconViews(String newIconViews) {
        iconViews = newIconViews;
    }

    public String getIconViews() {
        return iconViews;
    }
}
