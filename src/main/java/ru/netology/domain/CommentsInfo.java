package ru.netology.domain;

public class CommentsInfo {
    private int count; //кол-во комментариев
    private int canPost; //может ли пользователь комментировать запись (1,0)
    private int groupsCanPost; //могут ли сообщества комментировать запись
    private boolean canClose; //может ли текущий пользователь закрыть комментарий
    private boolean canOpen; //может ли текущий пользователь открыть комментарий

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public boolean isCanOpen() {
        return canOpen;
    }
}
