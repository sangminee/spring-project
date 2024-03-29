package com.example.gtc.common.config;

import lombok.Getter;

/**
 * 에러 코드 관리
 */
@Getter
public enum BaseResponseStatus {

    /**
     * 1000 : 요청 성공
     */
    SUCCESS(true, 1000, "요청에 성공하였습니다."),


    /**
     * 2000 : Request 오류
     */
    // Common
    REQUEST_ERROR(false, 2000, "입력값을 확인해주세요."),
    EMPTY_JWT(false, 2001, "JWT를 입력해주세요."),
    INVALID_JWT(false, 2002, "유효하지 않은 JWT입니다."),
    INVALID_USER_JWT(false,2003,"권한이 없는 유저의 접근입니다."),
    EMPTY_USER(false, 2004, "존재하지 않는 사용자입니다."),
    INVALID__USER(false, 2005, "유효하지 않은 사용자입니다."),

    EMPTY_COMMENT(false, 2006, "존재하지 않는 댓글입니다."),
    EMPTY_COMMENT_LIKE(false, 2007, "댓글 좋아요가 존재하지 않습니다."),
    EMPTY_REPORT(false, 2009, "존재하지 않는 신고리스트입니다."),
    EMPTY_FROM_USER(false, 2010, "채팅을 보낼 사용자 이름을 입력해 주세요."),
    DUPLICATED_FROM_USER(false, 2011, "중복된 채팅방이 존재합니다."),
    INVALID_REPORT_USER(false, 2012, "신고를 한 사용자가 아닙니다."),
    EMPTY_POST(false, 2013, "존재하지 않는 게시물입니다."),

    // USER
    // [POST]
    POST_USERS_EMPTY_EMAIL(false, 2010, "이메일을 입력해주세요."),
    POST_USERS_EMPTY_PHONE(false, 2011, "핸드폰번호를 입력해주세요."),
    POST_EMPTY_USER_NAME(false, 2012, "이름을 입력해주세요."),
    POST_USERS_EMPTY_NICKNAME(false, 2013, "사용자 이름을 입력해주세요."),
    POST_USERS_EMPTY_PASSWORD(false, 2014, "비밀번호를 입력해주세요."),
    POST_USERS_EMPTY_BIRTH(false, 2015, "생일을 입력해주세요."),

    POST_USERS_INVALID_EMAIL(false, 2020, "이메일 형식을 확인해주세요."),
    POST_USERS_INVALID_PHONE(false, 2021, "핸드폰 번호 형식을 확인해주세요."),
    POST_USERS_INVALID_PASSWORD(false, 2022, "비밀번호 형식을 확인해주세요."),
    POST_USERS_INVALID_USER_TYPE(false, 2023, "유저타입을 정확히 입력해주세요.(0: 일반유저, 1: 관리자)"),

    POST_USERS_EXISTS_EMAIL(false,2030,"중복된 이메일입니다."),
    POST_USERS_EXISTS_PHONE(false,2031,"중복된 번호입니다."),
    POST_USERS_EXISTS_NICKNAME(false,2032,"중복된 사용자 이름입니다."),

    // POST
    POST_POSTS_EMPTY_CONTENT(false, 2040, "게시글 내용을 입력해 주세요."),
    POST_POSTS_OVER_CONTENT(false, 2041, "글자수를 확인해 주세요."),

    POST_POSTS_EXISTENT_LIKE(false, 2042, "이미 좋아요가 되어있습니다."),

    // COMMENT
    POST_COMMENTS_EMPTY_CONTENT(false, 2050, "댓글 내용을 입력해 주세요."),
    POST_COMMENTS_OVER_CONTENT(false, 2051, "글자수를 확인해 주세요."),
    POST_COMMENTS_EMPTY_CONTENT_ID(false, 2052, "댓글 Id를 입력해 주세요."),
    POST_COMMENTS_EMPTY_CONTENT_LIKE_ID(false, 2053, "댓글 좋아요 Id를 입력해 주세요."),

    // REPORT
    EMPTY_REPORT_ID(false, 2060, "신고 Id를 입력해 주세요."),

    /**
     * 3000 : Response 오류
     */
    // Common
    RESPONSE_ERROR(false, 3000, "값을 불러오는데 실패하였습니다."),

    // [POST] /users
    DUPLICATED_EMAIL(false, 3013, "중복된 이메일입니다."),
    DUPLICATED_PHONE(false, 3014, "중복된 핸드폰번호입니다."),
    FAILED_TO_LOGIN(false,3015,"없는 아이디거나 비밀번호가 틀렸습니다."),

    DUPLICATED_NICKNAME(false, 3016, "중복된 사용자이름입니다."),


    POST_LOGIN_ERROR_AGREE(false,3020,"약관동의가 필요합니다."),
    POST_LOGIN_ERROR_STATE(false,3021,"정지된 계정입니다."),

    FAILED_TO_PASSWORD(false,3030,"비밀번호 변경에 실패했습니다. 제대로된 값을 입력해 주세요."),
    FAILED_TO_USER_IMG(false,3031,"프로필사진 변경에 실패했습니다. 제대로된 값을 입력해 주세요."),
    FAILED_TO_WEBSITE(false,3032,"웹사이트 변경에 실패했습니다. 제대로된 값을 입력해 주세요."),
    FAILED_TO_BIO(false,3033,"소개 변경에 실패했습니다. 제대로된 값을 입력해 주세요."),
    FAILED_TO_NAME(false,3034,"이름 변경에 실패했습니다. 제대로된 값을 입력해 주세요."),
    FAILED_TO_NICKNAME(false,3035,"사용자 이름 변경에 실패했습니다. 제대로된 값을 입력해 주세요."),
    FAILED_TO_STATE(false,3036,"상태 변경에 실패했습니다. 제대로된 값을 입력해 주세요."),

    FAILED_TO_NICKNAME_COUNT(false,3037,"2번이상 변경하셨습니다. 마지막 변경일에서 14일을 뒤에 시도하세요."),

    FAILED_TO_USER_DELETE(false,3040,"계정삭제에 실패했습니다."),


    /**
     * 4000 : Database, Server 오류
     */
    DATABASE_ERROR(false, 4000, "데이터베이스 연결에 실패하였습니다."),
    SERVER_ERROR(false, 4001, "서버와의 연결에 실패하였습니다."),

    //[PATCH] /users/{userIdx}
    MODIFY_FAIL_USERNAME(false,4014,"유저네임 수정 실패"),

    PASSWORD_ENCRYPTION_ERROR(false, 4011, "비밀번호 암호화에 실패하였습니다."),
    PASSWORD_DECRYPTION_ERROR(false, 4012, "비밀번호 복호화에 실패하였습니다.");


    // 5000 : 필요시 만들어서 쓰세요
    // 6000 : 필요시 만들어서 쓰세요

    private final boolean isSuccess;
    private final int code;
    private final String message;

    private BaseResponseStatus(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}
