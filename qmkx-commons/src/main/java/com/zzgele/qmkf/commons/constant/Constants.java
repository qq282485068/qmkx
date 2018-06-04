package com.zzgele.qmkf.commons.constant;

public class Constants {
    public static final Integer RZ = 0;//注册用户默认认证通过，为2
    public static final boolean IS_DEBUG = false; //调试开关
    public static final Integer ONE_HUNDRED_THOUSAND = 100000; //10万

    public static final String APP_PACKAGE_CACHEKEY = "app_package";

    public static final String BUILD_PATH = "qmzb-api-1.0"; //默认打包名 xxx.war=配置到tomcat下的路径xxx
    public static final String IOS_BUNDLE_ID = "com.zjzf.qmzb";
    public static final Integer IOS_APP_STORE_VERSION = 0;

    public static final Integer SUCCESS = 1; // 成功
    public static final Integer FAILED = 0; // 失败
    public static final Integer ZERO = 0;

    public static final String SMS_CODE_DEF = "0000"; //开发阶段默认短信验证码
    public static final String LOGIN_TOKEN_DEF = "4ec6622830"; //开发阶段默认登录用TOKEN

    public static final String CLOUD_TV_APPID = "1100286"; //
    public static final String CLOUD_tv_APPSECRET = "3779abb94ba119242acb7da791bef83e"; //
    public static final String PUSH_DOMAIN = "push.zzove.net"; //


    public static final String NETEASE_APPKEY = "53c54ac5645a7f07b6c0f1e5c1602d55";  //网易AppKey
    public static final String NETEASE_SECRET = "8a23e73c15de";  //网易AppSecret

    //钻石 民票最大值1亿
    public static final Integer MAX_MONEY = 10_0000_000;

    public static final String ALIYUN_OSS_ACCESSKEYID_PRO = "LTAIXiFqxZfVDGzV";
    public static final String ALIYUN_OSS_ACCESSKEYSECRET_PRO = "0P310qSBHn3F9eKYRCkT1nyPGAxLwj";
    public static final String ALIYUN_OSS_ROLE_ARN_PRO = "acs:ram::1987503889013429:role/aliyunosstokengeneratorrole";

    public static final String ALIYUN_SMS_ACCESSKEYID = "LTAIxT7RJgZql0fJ"; //阿里云ACCESSKEYID
    public static final String ALIYUN_SMS_ACCESSKEYSECRET = "J6OVu4V6eK4t7AIbOj4wNmhG9IMBQp"; //阿里云ACCESSKEYSECRET
    public static final String ALIYUN_OSS_ENDPOINT = "https://oss-cn-beijing.aliyuncs.com/";
    public static final String ALIYUN_OSS_BUCKET = "qmwlzb-one-pro";

    public static final String ALIYUN_SMS_SIGN_NAME = "全民直播Live";
    public static final String ALIYUN_SMS_REG_TEMPLATE_CODE = "SMS_85525082"; //SMS_85525082=15分钟/SMS_85475068=没时限

    public static final String QQ_OPEN_APPID = "1106399552"; //QQ开放平台AppId
    public static final String QQ_OPEN_APPSECRET = "LIx68PbJrtXhaCsN"; //QQ开放平台AppSecret

    public static final String ALIPAY_PARTNER = "2088821641487427";//支付宝的partner
    public static final String ALIPAY_APP_ID = "2017110209681891";//支付宝的app_id
    public static final String ALIPAY_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALHtswZj+8rChpVS5jAP4+Cl60qeNDRSZpkyweK22r/K8qlwCwtWC3bUU1UZtePrdPHGEG9mPCRK8805d28RhycuyEf1bST7ABpN3V3YcXkn7Wcc7nK8BWXWui+t2yy7IqY3yiD+PdaoY0IO7jC2D+zP1J7smllRgEUQ1wJeGiZ1AgMBAAECgYEArdIhSuTyXqqa/9X0uo9Ld3Of4U2cgmDdilxjvTAVk7iYR58FqxVsLbJPlpt/biHgJTHxbGLb7jiq5Jp3azIcbTA47Ym8+y7fUFQiWMJFKdeb0et4NruaszbXr0EjRbXCKTwX2r8ql1+umx4J1v+z9utB57l3Hi1XpmStAjBhbyECQQDpptRAdE0GSINXAUWJSN0RFbO1R0h6rUO3T7C6p3+OfkRvg/0Burvxi/Qpizn58jDCHqBk2Oob8KfIsLWOCNmnAkEAwvJwRgcO/etyCU5eWDADthaVRmivBa5QTqaTtPmfcolS+pY2EEJmAUDSTsyZnJBqxnA3bGkVwL/ejVN4viPKgwJAE08eK1VxKBvF/uK0BGxpGIhamZiSfNDkz7leOY6uE/CLZ0vZFNOBxKx0ORqwZ9+D+Abf6nWiozx4ITW5S0uf8QJAUXTr5NbeNMtEgw7z7PVjF5qoFRt4xm7nr3V7EoubTEiFG5/YR0L3TF7BgZuMNBdEBlatUec256tEWtkeApUB8QJABeqp6Y0nkhLBWyEs3JJOu0F17cyoIzA6/xb8AlT7cWlf5fSdPPBlEH/+eFbQ5n6kHAOUnCcFBsHJl3RrW93k7A==";//支付宝的私钥
    public static final String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";

    //oss&&cdn config
    public static final Integer CDN_CONCURRENT_TASK_NUM = 100;
    public static final String ACTION_PUSH_OBJECT = "PushObjectCache";
    public static final String CDN_ACCESS_SECRET = "158sFp2fmxc7LCJiiG5PzSJqQSICN5";
    public static final String CDN_ACCESS_KEY = "LTAIHzmRH97Yok5o";
    public static final String CDN_PARAM_OBJECTPATH = "ObjectPath";
    public static final String CDN_HOST = "http://d.quanminzb.com/";
    public static final String ENCODE_UTF8 = "utf-8";
    public static final Integer OSS_MAX_FILEQUERY = 100;
    public static final Integer OSS_PAGE_FILEQUERY = 5;
    public static final String OSS_PAGE_CACHEKEY = "pageObject";
    public static final String CDN_NEWLINE = "\r\n";
    public static final String OSS_LIST_KEY = "objectSummaries";


    public static final String ALIPAY_LOG_PATH = "/tmp/";//支付宝的文件位置

    public static final String COMMISSION_CHARGE = "0.4";//票转余额和提现的手续费
    public static final String TICKET_SWAP_CHARGE = "0.3";//兑换民票比例


    public static final String WECHAT_OPEN_APPID = "wx8ccefd08be5eb631"; //微信开放平台AppId
    public static final String WECHAT_OPEN_APPSECRET = "b7d4a73e099a350d4b3170de1de14fb5"; //微信开放平台AppSecret

    public static final String IM_ROOT_USER_ACCID = "root"; //IM系统用户ACCID
    public static final String IM_ROOT_USER_NAME = "系统"; //IM系统用户昵称
    public static final Long IM_ROOT_ROOM_ID = 10621181L; //IM系统聊天室ROOM_ID

    public static final String ANNOUNCEMENT_DEF = "绿色直播";


    public static final Integer PAGE_SIZE_DEF = 20; //默认每页显示数量
    public static final Integer USER_LEVEL_DEF = 1; //用户默认等级
    public static final String USER_NICKNAME_PREFIX_DEF = "全民"; //用户默认昵称前缀
    public static final Integer USER_PUSH_STATUS_DEF = 3; //用户默认推送状态
    public static final Integer USER_PUSH_STATUS_SLIENT = 0; //用户静默推送状态
    public static final Long LOGIN_NUMBER_BASE = 10100100L; //用户号起始数

    public static final Integer CLIENT_TYPE_UNKNOWN = 0; //客户端类型Unknown
    public static final Integer CLIENT_TYPE_IOS = 1; //客户端类型iOS
    public static final Integer CLIENT_TYPE_ANDROID = 2; //客户端类型Android
    public static final Integer CLIENT_TYPE_H5 = 3; //客户端类型H5
    public static final Integer CLIENT_TYPE_WEB = 4; //客户端类型Web
    public static final Integer CLIENT_TYPE_PC = 5; //客户端类型Pc

    public static final Integer USER_TYPE_AUDIENCE = 0; //用户类型普通观众
    public static final Integer USER_TYPE_ANCHOR = 1; //用户类型主播
    public static final Integer USER_TYPE_PATROL = 2; //用户类型巡管
    public static final Integer USER_TYPE_ROBOT = 3; //用户类型机器人

    public static final Integer USER_RECOMMEND_TYPE_NO = 0; //推荐类型不推荐
    public static final Integer USER_RECOMMEND_TYPE_HOT = 1; //推荐类型热门
    public static final Integer USER_RECOMMEND_TYPE_STAR = 2; //推荐类型明星
    public static final Integer USER_RECOMMEND_TYPE_HOT_STAR = 3; //推荐类型明星且热门

    public static final Integer IM_MSG_TYPE_TXT = 0; //消息类型文本
    public static final Integer IM_MSG_TYPE_IMG = 1; //消息类型图片
    public static final Integer IM_MSG_TYPE_SOUND = 2; //消息类型语音
    public static final Integer IM_MSG_TYPE_VIDEO = 3; //消息类型视频
    public static final Integer IM_MSG_TYPE_GEO = 4; //消息类型地理位置
    public static final Integer IM_MSG_TYPE_FILE = 6; //消息类型文件
    public static final Integer IM_MSG_TYPE_TIPS = 10; //消息类型TIPS
    public static final Integer IM_MSG_TYPE_CUSTOM = 100; //消息类型自定义

    public static final Integer LIVE_STATUS_CLOSE = 2; //直播状态暂停
    public static final Integer LIVE_STATUS_OPEN = 1; //直播状态开启
    public static final Integer LIVE_STATUS_PAUSE = 3; //直播状态暂停

    public static final Integer PAY_TYPE_MANUAL = 0; //支付类型手动
    public static final Integer PAY_TYPE_IAP = 1; //支付类型iap
    public static final Integer PAY_TYPE_IAP_SANDBOX = 2; //支付类型iap-sandbox
    public static final Integer PAY_TYPE_ALIPAY = 3; //支付类型alipay
    public static final Integer PAY_TYPE_WECHAT = 4; //支付类型wechat
    public static final Integer PAY_TYPE_UNIONPAY = 5; //支付类型银联

    public static final Integer PAY_STATUS_UNPAY = 0; //支付状态未支付
    public static final Integer PAY_STATUS_PAYED = 1; //支付状态已支付

    public static final Double LOG_DEF = 0D; //默认经度116.462410
    public static final Double LAT_DEF = 0D; //默认纬度116.462410

    //客户端IM加密相关
    public static final String IM_AES_KEY = "27056a0d19e0c71d3e46c70a6c602ab9";
    public static final String IM_AES_IV = "b04b8104c446a7276841503324ebd81e";

    //购买凭证验证地址
    public static final String IAP_CERTIFICATE_URL = "https://buy.itunes.apple.com/verifyReceipt";
    //测试的购买凭证验证地址
    public static final String IAP_CERTIFICATE_URL_TEST = "https://sandbox.itunes.apple.com/verifyReceipt";

    public static final Long CONFIG_KEY_ROBOT_COUNT = 1L; //机器人数量
    public static final Integer RED_PACKET_LIMIT_MINUTE = 5;//
    public static final Integer RED_PACKET_LIMIT_NUMBER = 10;//
    public static final Double COMMISSION_BONUS = 0.3;// 红包手续费

    public static final String BONUS = "bonus";//红包
    public static final String BONUS_PACKAGE = "package_bonus";//红包
    public static final String BONUS_CHILD = "child_bonus";//子包
    public final static String robot = "robot";
    public static final String CREATESENDMSGERROR = "createSendMsgError";//发送信息失败
    public static final String COUNTBONUSNUM = "countBonusNum";//计数器统计红包数
    public static final String GETBONUSEND = "getBonusEnd";//发送信息失败
    public static final String SENDMSGERROR = "sendMsgError";//发送信息失败(从队列中取红包)

    /**
     * 数据库操作服务相关参数
     */
    public static final String PRIMARYKEY_DEFAULT_PREFIXSTRING = "QM";//主键默认前缀
    public static final String PRIMARYKEY_TIMESTAMP_PATTERN = "yyyyMMdd";//主键时间戳格式
    public static final Integer CACHE_EXPIRE_TIME = 3600 * 24;//自增数据缓存过期时间
    public static final Integer ZERO_NUM = 5;//主键后缀补零个数
    public static final String ADD_ZERO_FORMAT_STRING = "%0" + ZERO_NUM + "d";//主键补零表达式

    public static final Integer AUTO_ROBOT_RANDOM_SEED = 3;
    public static final Integer AUTO_ROBOT_MILLIONS_MINUTES = 60000;


    public static final String LOCKRETAILSTORERELATIONSWAP = "lockRetailStoreRelationSwap";//二级分销兑换票key

    //极光推送相关
    public static final String JGKEY = "0a0faac48570464a93d4180d";
    public static final String JGSECRT = "c34cc7f8a7c8a8fb012b0c98";

    public static final Integer PRIVATE_STATUS = 0; //私信通知状态,open
    public static final Integer Broadcast_STATUS = 0; //直播通知状态,open

    //用戶能私信主播条件（>=98元）
    public static final Integer BASEMNOEY = 98; //直播通知状态,open

    /**
     * 用户登录过期时间 30天  单位秒
     */
    public static final Long TOKEN_EXPIRE = 2592000L;

    /**
     * 用户登录token的key
     */
    public static final String USER_TONKEN = "userToken";


    /**
     * 二级分销兑换手续费  数据库配置
     */
    public static final String RETAILSTORERELATIONEXCHANGEFEE = "retailStoreRelationExchangefee";

    /**
     * 二维码地址  数据库配置
     */
    public static final String QR_CODE_URL = "qr_code_url";
    public static final String QR_CODE_SIZE = "qr_code_size";
    /**
     * 二维码大小
     */
    public static final int QR_CODE_WIDTH = 200;    // 图像宽度
    public static final int QR_CODE_HEIGHT = 200; //


    /**
     * 二级分销二级提现比例  数据库配置
     */
    public static final String TWO_SETTLEMENT_RATIO = "two_settlement_ratio";

    /**
     * 二级分销提现一级提现比例  数据库配置
     */
    public static final String ONE_SETTLEMENT_RATIO = "one_settlement_ratio";

    /**
     * 二级分销提现当日提现上限  数据库配置
     */
    public static final String WITHDRAW_CAPPED_DAY = "withdraw_capped_day";

    /**
     * 二级分销提现当月提现上限  数据库配置
     */
    public static final String WITHDRAW_CAPPED_MONTH = "withdraw_capped_month";

    /**
     * 二级分销提现当天提现上限次数  数据库配置
     */
    public static final String WITHDRAW_NUM_DAY = "withdraw_num_day";

    /**
     * 二级分销提现手续费  数据库配置
     */
    public static final String RETAILSTORERELATIONWITHDRAWFEE = "retailStoreRelationWithdrawfee";

    /**
     * 红包过期时间（秒）  数据库配置
     */
    public static final String BONUS_EXPIRED_TIME = "bonus_expired_time";

    /**
     * 红包最少发放数  数据库配置
     */
    public static final String BONUS_MIN_NUM = "bonus_min_num";

    /**
     * 单个红包金额  数据库配置
     */
    public static final String BONUS_MIN_AMOUNT = "bonus_min_amount";

    /**
     * 机器人抢红包所占比例  数据库配置
     */
    public static final String BONUS_ROBOT_GRAB_RATIO = "bonus_robot_grab_ratio";

    /**
     * 红包砖石最大额  数据库配置
     */
    public static final String BONUS_MAX_AMOUNT = "bonus_max_amount";

    /**
     * 二级分销用户注册方式 1-扫码 2-分享 2017-12-27
     */
    public static final short REGISTER_SCAN_QRCODE = 1;
    public static final short REGISTER_LINK_SHARE = 2;

    /**
     * 小视频举报处理状态 0:已处理 1:未处理
     */
    public static final int VIDEO_FEEDBACK_YES = 0;
    public static final int VIDEO_FEEDBACK_NO = 1;


    public static final String WB_APP_KEY = "2352338625"; //微博开放平台的OpenId
    public static final String WB_APPSECRET = "a50aca37b4491c1d95c1afe0aa04c124"; //微博开放平台的appSecret
    public static final String WB_REDIRECT_URI = ""; //微博开放平台的appSecret

    //用户等级至少15级才能连麦
    public static final int USER_LIANMAI_LEVEL = 25;

    /**
     * 冻结账户类型 0-全部， 1-我的钱包， 2-分享收益
     * 2018-02-01
     */
    public static final short FROZEN_SHARE_INCOME = 2;  // 分享收益

    public static String TEST_SMS_CODE = "0000";

    public static final String DEFULT_USER_PIC = "https://qmwlzb-one-pro.oss-cn-beijing.aliyuncs.com/img_1511446452980.jpg";


    /**
     * 拦截器参数
     */

    public static final String SIGN = "sign";

    public static final String TIME = "time";

    public static final String KEY = "com.zzgele.qmzb";

    public static final String LOGIN_UID = "login_uid";

    public static final String LOGIN_TOKEN = "login_token";

    /**
     * 小视频推荐
     */
    public static final short VIDEO_RECOMMEND_TYPE = 0; // 推荐类型 - 推荐库
    public static final short VIDEO_RECOMMEND_TYPE_FIND = 1; // 推荐类型 - 发现
    public static final short VIDEO_RECOMMEND_TYPE_NEW = 2; // 推荐类型 - 最新
    public static final short VIDEO_RECOMMEND_TYPE_SELECT = 3; //推荐类型 - 精选

    public static final short VIDEO_RECOMMEND_YES = 0; // 推荐
    public static final short VIDEO_RECOMMEND_NO = 1; // 不推荐


    /**
     * 小视频点赞key
     */
    public static final String VIDEOPRAISENUM = "videoPraiseNum";
    public static final String VIDEO_LIKE = "videoLike:";

    /**
     * 未观看小视频key
     */
    public static final String NOTLOOKVIDEO = "notLookVideo";

    /**
     * 已观看小视频key
     */
    public static final String LOOKVIDEO = "lookVideo";

    /**
     * 小视频配置相关
     */
    public static final int VIDEO_FIND_OVERTIME = 48;    // 小视频超时进发现
    public static final int VIDEO_RECOMMEND_DURATION = 10 * 300 * 24 * 60;  // 小视频推荐时长
    public static final int VIDEO_RECOMMEND_COUNT = 20; // 小视频默认推荐位数
    public static final int VIDEO_RECOMMEND_MINTIME = 10;   // 小视频默认推荐时间
    public static final int VIDEO_RECOMMEND_MAXTIME = 1440; // 小视频默认推荐时间

    public static final String RECOMMEND_VIDEO = "recommendVideo";
    public static final String RECOMMEND_VIDEO_SELECTVIDEO = "recommendVideoSELECTVIDEO_";
    public static final String RECOMMEND_VIDEO_DISCOVERVIDEO = "recommendVideoDISCOVERVIDEO_";

    //微信公众号配置
    public static final String WXOPEN_APP_ID = "wx8ff909ee2baf62e6";//微信公众号的app_id
    public static final String WXOPEN_PARTNERKEY = "a1c137c70949f2d09ce8a6a1fe7a8246";//微信公众号的partnerKey


    /**
     * Ajax操作没有权限的响应头key
     */
    public static final String HEAD_NO_PERMISSION_KEY = "X-No-Permission";

    /**
     * Ajax操作没有权限的响应头value
     */
    public static final String HEAD_NO_PERMISSION_VALUE = "No-Permission";


    //首次登录私信消息
//    public static final String FIRST_LOGIN_MESSAGE = "欢迎您来到全民直播～我是全民小可爱，先让我简单的给您介绍一下我们的平台呦～！在这里，只要轻轻的动动您的手指就能赚钱呦～分享收益让您的账户盆钵满盈。不仅分享收益让您轻松赚钱，4月1号-5月20号的“谁是优质UP主？”活动，也是让你赚到手软，只要上传短视频，通过就能获得500钻石的礼物。详情请看首页公告。全民直播再次欢迎您的加入！玩转全民，赚你所想！";
    public static final String FIRST_LOGIN_MESSAGE = "终于等到你～\n" +
            "欢迎宝宝下载全民直播，我们力争为您提供最优质的服务和最便捷的体验。\n" +
            "\n" +
            "全民直播以【短视频】为核心，看视频的同时还可以进行“礼物打赏”哦，【分享收益】可随时分享随时提现，我们最大的优势是：全网首家提现“秒”“到”“帐”！\n" +
            "\n" +
            "在您观看直播时不仅可以打赏、抢红包、抢到的红包在分享账户中还可以【提现】哦～\n" +
            "\n" +
            "分门别类的短视频、用心创作的PGC、聚集多个kol、艺人的精彩直播、给您提供最优的视觉体验。\n" +
            "\n" +
            "创造最优质的“内容”，满足每一位宝宝的独特体验，是我们一直追求的目标！全心全意，全面发展，全民直播目前为您创造了涵盖视频创作、分发、互动、分享、社交的一站式服务。\n" +
            "\n" +
            "用户的愉悦体验是我们至高无上的重大使命，我们力争将最好的体验、最优的服务来回馈每一位用户。\n" +
            "\n" +
            "欢迎勾搭：400 179 1118\n" +
            "\n" +
            "微信服务指南：\n" +
            "QMXKA001        用户咨询\n" +
            "QMXKA002       艺人签约服务\n" +
            "QMXKA003       短视频合作\n" +
            "\n" +
            "在这里，记录全民的美好！\n" +
            "祝您体验愉快！";
}