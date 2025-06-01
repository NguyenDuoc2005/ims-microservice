package com.evaluationservice.config.constant;

public final class MappingConstants {

    /* API VERSION PREFIX */
    public static final String API_VERSION_PREFIX = "/api/v1";

    /* API COMMON */
    public static final String API_COMMON = API_VERSION_PREFIX + "/common";

    /* AUTHENTICATION */
    public static final String API_AUTH_PREFIX = API_VERSION_PREFIX + "/auth";

    // Constants representing the base paths for various resources
    public static final String ADMIN = "/admin";

    public static final String MANAGE = "/manage";

    public static final String MEMBER = "/member";

    public static final String PROJECT_DETAILS = "/project-details";

    // Constants representing the full paths for various resources
    public static final String API_ADMIN_PREFIX =API_VERSION_PREFIX + ADMIN;
    public static final String API_MANAGE_PREFIX =API_VERSION_PREFIX + MANAGE;
    public static final String API_MEMBER_PREFIX =API_VERSION_PREFIX + MEMBER;
    public static final String API_PROJECT_DETAILS_PREFIX =API_VERSION_PREFIX + PROJECT_DETAILS;

    public static final String API_ADMIN_PROJECT = API_ADMIN_PREFIX + "/project";

    public static final String API_ADMIN_ROLE = API_ADMIN_PREFIX + "/role";

    // API MEMBER
    public static final String API_MEMBER_MYPROJECT = API_MEMBER_PREFIX + "";
    // admin

    public static final String API_ADMIN_ACCOUNT_MANAGE = API_ADMIN_PREFIX + "/account-manage";
    //manage
    public static final String API_MANAGE_INTERN = API_MANAGE_PREFIX + "/intern";
    public static final String API_MANAGE_MEETINGS = API_MANAGE_PREFIX + "/meetings";
    public static final String API_MANAGE_EVALUATION = API_MANAGE_PREFIX + "/evaluation";
}
