package com.example.gtc.domain.user.repository.dto.response;

import com.example.gtc.domain.user.entity.User;
import com.example.gtc.domain.user.entity.UserInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "로그인")
public class PostEditUserRes {
    private String message;

    private String nickname;
    private String name;
    private String password;

    private UserInfo userInfo;

    private int userUpdateNameCount;
    private LocalDateTime userUpdateNameTime;

    private String agree;
    private int state;

    public PostEditUserRes(String message, User user) {
        this.message = message;
        this.nickname = user.getNickname();
        this.name = user.getName();
        this.password = user.getPassword();
        this.userInfo = user.getUserInfo();
        this.userUpdateNameCount = user.getUserUpdateNameCount();
        this.userUpdateNameTime = user.getUserUpdateNameTime();
        this.agree = user.getAgree();
        this.state = user.getState();
    }

}
