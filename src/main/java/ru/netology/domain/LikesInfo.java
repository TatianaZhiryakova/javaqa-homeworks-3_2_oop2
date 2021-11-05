package ru.netology.domain;

public class LikesInfo {
    private int count; //Число пользователей, которым понравилась запись
    private int userLikes; //Наличие отметки "Мне нравиться" от текущего пользователя
    private int canLike; //может ли текущий пользователь поставить отметку "Мне нравится"
    private int canPublish; //ожет ли текущий пользователь сделать репост

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }

    public int getCanPublish() {
        return canPublish;
    }
}
