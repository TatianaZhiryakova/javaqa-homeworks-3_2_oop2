package ru.netology.domain;

public class Post {
    private int id; //идентификатор поста
    private int ownerId; //Идентификатор владельца стены
    private int fromId; //Идентификатор автора поста
    private int createdBy; //ИД админа сообщества, который опубликовал запись
    private int date; //время публикации поста
    private String text; //текст поста
    private int replyOwnerId; //ИД владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId; //ИД записи, в ответ на которую была оставлена текущая
    private int friendsOnly; //если запись была создана с опцией "Только для друзей"
    private CommentsInfo commentsInfo; // Информация о комментариях к записи
    private Copyright copyright; //Источник материала
    private LikesInfo likesInfo; //Информация о лайках к записи
    private ReportsInfo reportsInfo; //Информация о репостах записи
    private ViewsInfo viewsInfo; //Информация о просмотрах записи
    private String postType;
    private PostSours postSours; //Информация о способе размещения записи
    private Geo geo; //Информация о местоположении
    private int singerId; //ИД автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int canPin; //Информация о том, может ли текущий пользователь закрепить запись
    private int canDelete; //Инфо о том, может ли текущий пользователь удалить запись
    private int canEdit; //Инфо о том, может ли текущий пользователь редактировать запись
    private int isPinned; //Инфо о том, что запись закреплена
    private int markedAsAds; //Инфо о том, содержит ли запись отметку "реклама"
    private boolean isFavorite; //true, если объект добавлен в закладку у текущего пользователя
    private Donut donut;
    private int postponedId; //ИД отложенной записи


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setReportsInfo(ReportsInfo reportsInfo) {
        this.reportsInfo = reportsInfo;
    }

    public ReportsInfo getReportsInfo() {
        return reportsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostSours(PostSours postSours) {
        this.postSours = postSours;
    }

    public PostSours getPostSours() {
        return postSours;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public int getSingerId() {
        return singerId;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public int getPostponedId() {
        return postponedId;
    }
}
