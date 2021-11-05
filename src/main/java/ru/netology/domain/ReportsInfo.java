package ru.netology.domain;

public class ReportsInfo {
    private int count; //число пользователей, скопировавших запись
    private int userReposted; //наличие репоста от текущего пользователя

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }

    public int getUserReposted() {
        return userReposted;
    }
}
