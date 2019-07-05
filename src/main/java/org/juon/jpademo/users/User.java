package org.juon.jpademo.users;

public class User {
    private String userId;
    private String userNm;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserNm() {
        return userNm;
    }
    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    @Override
    public String toString() {
        return "TbUserSample{" +
                "userId='" + userId + '\'' +
                ", userNm='" + userNm + '\'' +
                '}';
    }
}
