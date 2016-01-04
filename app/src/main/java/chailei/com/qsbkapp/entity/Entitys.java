package chailei.com.qsbkapp.entity;

import android.util.Log;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 16-1-2.
 */
public class Entitys {

    /**
     * count : 30
     * err : 0
     * items : [{"high_url":"http://qiubai-video.qiushibaike.com/INEHPDU593EZPZI8.mp4","format":"video","image":null,"published_at":1451692502,"tag":"","user":{"avatar_updated_at":1451253613,"last_visited_at":1449975051,"created_at":1449975051,"state":"active","last_device":"android_8.4.0","role":"n","login":"伤wo祢不配","id":30775130,"icon":"20151227220013.jpg"},"image_size":null,"id":114512652,"votes":{"down":-196,"up":4675},"created_at":1451662059,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/INEHPDU593EZPZI8.jpg","content":"会说中国话的喵星人，可惜人家听不懂。","state":"publish","comments_count":156,"low_url":"http://qiubai-video.qiushibaike.com/INEHPDU593EZPZI8_3g.mp4","allow_comment":true,"share_count":2676,"type":"hot","loop":207056},{"high_url":"http://qiubai-video.qiushibaike.com/DSG102ZOFFN6HSJA.mp4","format":"video","image":null,"published_at":1451692202,"tag":"","user":{"avatar_updated_at":1449489610,"last_visited_at":1443528025,"created_at":1443528025,"state":"active","last_device":"android_7.3.0","role":"n","login":"一段伤感的爱情","id":30363842,"icon":"20151207120009.jpg"},"image_size":null,"id":114512989,"votes":{"down":-202,"up":4017},"created_at":1451663911,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/DSG102ZOFFN6HSJA.jpg","content":"剑圣对战压缩","state":"publish","comments_count":136,"low_url":"http://qiubai-video.qiushibaike.com/DSG102ZOFFN6HSJA_3g.mp4","allow_comment":true,"share_count":628,"type":"hot","loop":225717},{"high_url":"http://qiubai-video.qiushibaike.com/DHR954KV2114VHGM.mp4","format":"video","image":null,"published_at":1451689502,"tag":"","user":{"avatar_updated_at":1451253613,"last_visited_at":1449975051,"created_at":1449975051,"state":"active","last_device":"android_8.4.0","role":"n","login":"伤wo祢不配","id":30775130,"icon":"20151227220013.jpg"},"image_size":null,"id":114512483,"votes":{"down":-87,"up":2750},"created_at":1451661401,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/DHR954KV2114VHGM.jpg","content":"主人你太坏了。","state":"publish","comments_count":25,"low_url":"http://qiubai-video.qiushibaike.com/DHR954KV2114VHGM_3g.mp4","allow_comment":true,"share_count":108,"type":"hot","loop":193237},{"high_url":"http://qiubai-video.qiushibaike.com/3S4FMUHEEPKZB5TT.mp4","format":"video","image":null,"published_at":1451713501,"tag":"","user":{"avatar_updated_at":1450812303,"last_visited_at":1450812302,"created_at":1450812302,"state":"active","last_device":"android_9.0.0","role":"n","login":"一1抹红尘","id":30827902,"icon":"20151222192502.jpg"},"image_size":null,"id":114513182,"votes":{"down":-26,"up":261},"created_at":1451664778,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/3S4FMUHEEPKZB5TT.jpg","content":"奔跑吧兄弟","state":"publish","comments_count":12,"low_url":"http://qiubai-video.qiushibaike.com/3S4FMUHEEPKZB5TT_3g.mp4","allow_comment":true,"share_count":85,"loop":15523},{"high_url":"http://qiubai-video.qiushibaike.com/3J2DCVE9S4XLZ68D.mp4","format":"video","image":null,"published_at":1451715601,"tag":"","user":{"avatar_updated_at":0,"last_visited_at":1451431101,"created_at":1451431101,"state":"active","last_device":"ios_8.4.6","role":"n","login":"风起时云还在","id":30871124,"icon":""},"image_size":null,"id":114516095,"votes":{"down":-28,"up":315},"created_at":1451700538,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/3J2DCVE9S4XLZ68D.jpg","content":"求老师心理阴影面积！","state":"publish","comments_count":25,"low_url":"http://qiubai-video.qiushibaike.com/3J2DCVE9S4XLZ68D_3g.mp4","allow_comment":true,"share_count":127,"loop":31141},{"high_url":"http://qiubai-video.qiushibaike.com/BEUKRUO3I1WZ9KFN.mp4","format":"video","image":null,"published_at":1451717701,"tag":"","user":{"avatar_updated_at":1450812303,"last_visited_at":1450812302,"created_at":1450812302,"state":"active","last_device":"android_9.0.0","role":"n","login":"一1抹红尘","id":30827902,"icon":"20151222192502.jpg"},"image_size":null,"id":114513222,"votes":{"down":-2,"up":56},"created_at":1451664928,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/BEUKRUO3I1WZ9KFN.jpg","content":"梗在这呢！","state":"publish","comments_count":5,"low_url":"http://qiubai-video.qiushibaike.com/BEUKRUO3I1WZ9KFN_3g.mp4","allow_comment":true,"share_count":3,"type":"fresh","loop":2581},{"high_url":"http://qiubai-video.qiushibaike.com/4FUT8F0OFDHN9MF8.mp4","format":"video","image":null,"published_at":1451712302,"tag":"","user":{"avatar_updated_at":0,"last_visited_at":1440289278,"created_at":1440289278,"state":"active","last_device":"android_8.0.1","role":"n","login":"【一凡】","id":30152731,"icon":"20150929175640.jpg"},"image_size":null,"id":114513648,"votes":{"down":-23,"up":344},"created_at":1451668113,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/4FUT8F0OFDHN9MF8.jpg","content":"怎么扣才最爽？","state":"publish","comments_count":9,"low_url":"http://qiubai-video.qiushibaike.com/4FUT8F0OFDHN9MF8_3g.mp4","allow_comment":true,"share_count":32,"loop":44146},{"high_url":"http://qiubai-video.qiushibaike.com/YSWTK6ETKPYWO5YW.mp4","format":"video","image":null,"published_at":1451711701,"tag":"","user":{"avatar_updated_at":1450812303,"last_visited_at":1450812302,"created_at":1450812302,"state":"active","last_device":"android_9.0.0","role":"n","login":"一1抹红尘","id":30827902,"icon":"20151222192502.jpg"},"image_size":null,"id":114513128,"votes":{"down":-23,"up":350},"created_at":1451664515,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/YSWTK6ETKPYWO5YW.jpg","content":"不要动亲亲么","state":"publish","comments_count":14,"low_url":"http://qiubai-video.qiushibaike.com/YSWTK6ETKPYWO5YW_3g.mp4","allow_comment":true,"share_count":80,"loop":20558},{"high_url":"http://qiubai-video.qiushibaike.com/0VRPUFEMV4FRR10S.mp4","format":"video","image":null,"published_at":1451710201,"tag":"","user":{"avatar_updated_at":1450812303,"last_visited_at":1450812302,"created_at":1450812302,"state":"active","last_device":"android_9.0.0","role":"n","login":"一1抹红尘","id":30827902,"icon":"20151222192502.jpg"},"image_size":null,"id":114513098,"votes":{"down":-61,"up":563},"created_at":1451664412,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/0VRPUFEMV4FRR10S.jpg","content":"见过这样的桌球案子么","state":"publish","comments_count":41,"low_url":"http://qiubai-video.qiushibaike.com/0VRPUFEMV4FRR10S_3g.mp4","allow_comment":true,"share_count":161,"loop":81308},{"high_url":"http://qiubai-video.qiushibaike.com/61EPP3R2H3IZ6OWP.mp4","format":"video","image":null,"published_at":1451714104,"tag":"","user":{"avatar_updated_at":1438102185,"last_visited_at":1417788416,"created_at":1417788416,"state":"active","last_device":"android_3.4.2","role":"n","login":"不说话不话说","id":23487783,"icon":"20150728164945.jpg"},"image_size":null,"id":114513300,"votes":{"down":-11,"up":182},"created_at":1451665356,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/61EPP3R2H3IZ6OWP.jpg","content":"人有多大胆，树有多大砍，火车路上跑","state":"publish","comments_count":13,"low_url":"http://qiubai-video.qiushibaike.com/61EPP3R2H3IZ6OWP_3g.mp4","allow_comment":true,"share_count":10,"type":"fresh","loop":22957},{"high_url":"http://qiubai-video.qiushibaike.com/O59VX58AJR16GV9S.mp4","format":"video","image":null,"published_at":1451708102,"tag":"","user":{"avatar_updated_at":1450812303,"last_visited_at":1450812302,"created_at":1450812302,"state":"active","last_device":"android_9.0.0","role":"n","login":"一1抹红尘","id":30827902,"icon":"20151222192502.jpg"},"image_size":null,"id":114513093,"votes":{"down":-62,"up":744},"created_at":1451664372,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/O59VX58AJR16GV9S.jpg","content":"这样的拔牙你值得拥有","state":"publish","comments_count":57,"low_url":"http://qiubai-video.qiushibaike.com/O59VX58AJR16GV9S_3g.mp4","allow_comment":true,"share_count":148,"loop":85531},{"high_url":"http://qiubai-video.qiushibaike.com/K7RL1VQY73CM01EH.mp4","format":"video","image":null,"published_at":1451707801,"tag":"","user":{"avatar_updated_at":1450812303,"last_visited_at":1450812302,"created_at":1450812302,"state":"active","last_device":"android_9.0.0","role":"n","login":"一1抹红尘","id":30827902,"icon":"20151222192502.jpg"},"image_size":null,"id":114513237,"votes":{"down":-39,"up":562},"created_at":1451665014,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/K7RL1VQY73CM01EH.jpg","content":"宝马敞篷的","state":"publish","comments_count":15,"low_url":"http://qiubai-video.qiushibaike.com/K7RL1VQY73CM01EH_3g.mp4","allow_comment":true,"share_count":55,"loop":81407},{"high_url":"http://qiubai-video.qiushibaike.com/HBHCZAYGALBDL83G.mp4","format":"video","image":null,"published_at":1451713802,"tag":"","user":{"avatar_updated_at":1451253613,"last_visited_at":1449975051,"created_at":1449975051,"state":"active","last_device":"android_8.4.0","role":"n","login":"伤wo祢不配","id":30775130,"icon":"20151227220013.jpg"},"image_size":null,"id":114517812,"votes":{"down":-13,"up":200},"created_at":1451710447,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/HBHCZAYGALBDL83G.jpg","content":"小萝莉在这里给所有糗友们拜年了！","state":"publish","comments_count":7,"low_url":"http://qiubai-video.qiushibaike.com/HBHCZAYGALBDL83G_3g.mp4","allow_comment":true,"share_count":7,"type":"fresh","loop":15163},{"high_url":"http://qiubai-video.qiushibaike.com/52Y1H07H536TW1EB.mp4","format":"video","image":null,"published_at":1451717401,"tag":"","user":{"avatar_updated_at":1451739236,"last_visited_at":1451739235,"created_at":1451739235,"state":"active","last_device":"android_7.3.0","role":"n","login":"东北那嘎的地","id":30889999,"icon":"20160102125355.jpg"},"image_size":null,"id":114517827,"votes":{"down":-7,"up":49},"created_at":1451710514,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/52Y1H07H536TW1EB.jpg","content":"辛苦的工作","state":"publish","comments_count":5,"low_url":"http://qiubai-video.qiushibaike.com/52Y1H07H536TW1EB_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":1387},{"high_url":"http://qiubai-video.qiushibaike.com/LLVPVP10FVGMMPHI.mp4","format":"video","image":null,"published_at":1451717101,"tag":"","user":{"avatar_updated_at":0,"last_visited_at":1442570899,"created_at":1442570899,"state":"active","last_device":"android_8.1.1","role":"n","login":"SYuki","id":30305103,"icon":"20150918100819.jpg"},"image_size":null,"id":114514528,"votes":{"down":-4,"up":73},"created_at":1451688818,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/LLVPVP10FVGMMPHI.jpg","content":"我朋友说我是不是倒了水银给他喝，我真是日了狗了。。。糗友们，这像水银？","state":"publish","comments_count":15,"low_url":"http://qiubai-video.qiushibaike.com/LLVPVP10FVGMMPHI_3g.mp4","allow_comment":true,"share_count":1,"type":"fresh","loop":9274},{"high_url":"http://qiubai-video.qiushibaike.com/XVYLA73690K4191U.mp4","format":"video","image":null,"published_at":1451716201,"tag":"","user":{"avatar_updated_at":1421890824,"last_visited_at":1395142834,"created_at":1395142834,"state":"bonded","last_device":"web","role":"n","login":"来啊来啊强奸我啊","id":14809269,"icon":"20150122094024.jpg"},"image_size":null,"id":114515293,"votes":{"down":-5,"up":90},"created_at":1451695873,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/XVYLA73690K4191U.jpg","content":"好机智的猴子怕狗就这样了","state":"publish","comments_count":8,"low_url":"http://qiubai-video.qiushibaike.com/XVYLA73690K4191U_3g.mp4","allow_comment":true,"share_count":1,"type":"fresh","loop":5593},{"high_url":"http://qiubai-video.qiushibaike.com/DP6V9NYHOPM9P26P.mp4","format":"video","image":null,"published_at":1451709002,"tag":"","user":{"avatar_updated_at":1426025908,"last_visited_at":1411707416,"created_at":1411707416,"state":"active","last_device":"android_3.3.1","role":"n","login":"henhengan","id":21082835,"icon":"20150311061827.jpg"},"image_size":null,"id":114515578,"votes":{"down":-42,"up":388},"created_at":1451697418,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/DP6V9NYHOPM9P26P.jpg","content":"我JJ不歪啊","state":"publish","comments_count":11,"low_url":"http://qiubai-video.qiushibaike.com/DP6V9NYHOPM9P26P_3g.mp4","allow_comment":true,"share_count":49,"loop":58558},{"high_url":"http://qiubai-video.qiushibaike.com/MI2V5PCFMUBL587C.mp4","format":"video","image":null,"published_at":1451708701,"tag":"","user":{"avatar_updated_at":1416671405,"last_visited_at":1389790701,"created_at":1389790701,"state":"active","last_device":"android_2.6.4","role":"n","login":"~芝麻绿豆点事～","id":13409869,"icon":"20141122235005.jpg"},"image_size":null,"id":114515847,"votes":{"down":-19,"up":266},"created_at":1451699098,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/MI2V5PCFMUBL587C.jpg","content":"又在秀恩爱，我该弄死它们两个么\u2026","state":"publish","comments_count":23,"low_url":"http://qiubai-video.qiushibaike.com/MI2V5PCFMUBL587C_3g.mp4","allow_comment":true,"share_count":15,"loop":23626},{"high_url":"http://qiubai-video.qiushibaike.com/8T28GTQHPB3CTF17.mp4","format":"video","image":null,"published_at":1451713201,"tag":"","user":{"avatar_updated_at":0,"last_visited_at":1449350129,"created_at":1449350129,"state":"active","last_device":"android_8.3.3","role":"n","login":"请输你的名称","id":30734761,"icon":""},"image_size":null,"id":114514624,"votes":{"down":-28,"up":162},"created_at":1451690112,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/8T28GTQHPB3CTF17.jpg","content":"婊子自拍给过，糗事不给过。","state":"publish","comments_count":16,"low_url":"http://qiubai-video.qiushibaike.com/8T28GTQHPB3CTF17_3g.mp4","allow_comment":true,"share_count":29,"type":"fresh","loop":12459},{"high_url":"http://qiubai-video.qiushibaike.com/AJ2O4S5KMIXTZJTN.mp4","format":"video","image":null,"published_at":1451707502,"tag":"","user":{"avatar_updated_at":1450812303,"last_visited_at":1450812302,"created_at":1450812302,"state":"active","last_device":"android_9.0.0","role":"n","login":"一1抹红尘","id":30827902,"icon":"20151222192502.jpg"},"image_size":null,"id":114513344,"votes":{"down":-74,"up":791},"created_at":1451665623,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/AJ2O4S5KMIXTZJTN.jpg","content":"哈哈，原来是亲妈呀","state":"publish","comments_count":22,"low_url":"http://qiubai-video.qiushibaike.com/AJ2O4S5KMIXTZJTN_3g.mp4","allow_comment":true,"share_count":153,"loop":155734},{"high_url":"http://qiubai-video.qiushibaike.com/74BW9EGK3P6KOCCP.mp4","format":"video","image":null,"published_at":1451709902,"tag":"","user":{"avatar_updated_at":1438102185,"last_visited_at":1417788416,"created_at":1417788416,"state":"active","last_device":"android_3.4.2","role":"n","login":"不说话不话说","id":23487783,"icon":"20150728164945.jpg"},"image_size":null,"id":114513387,"votes":{"down":-87,"up":985},"created_at":1451666015,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/74BW9EGK3P6KOCCP.jpg","content":"什么时候改版的","state":"publish","comments_count":86,"low_url":"http://qiubai-video.qiushibaike.com/74BW9EGK3P6KOCCP_3g.mp4","allow_comment":true,"share_count":324,"loop":94158},{"high_url":"http://qiubai-video.qiushibaike.com/C2Y9WZ5OPMAY0U7Z.mp4","format":"video","image":null,"published_at":1451718002,"tag":"","user":{"avatar_updated_at":1450787559,"last_visited_at":1420907347,"created_at":1420907347,"state":"bonded","last_device":"android_5.0.0","role":"n","login":".夜夜夜夜.","id":24674122,"icon":"20151222123238.jpg"},"image_size":null,"id":114513908,"votes":{"down":-3,"up":44},"created_at":1451671257,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/C2Y9WZ5OPMAY0U7Z.jpg","content":"这车给力嘛？只能10s'后面更牛掰！","state":"publish","comments_count":10,"low_url":"http://qiubai-video.qiushibaike.com/C2Y9WZ5OPMAY0U7Z_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":567},{"high_url":"http://qiubai-video.qiushibaike.com/NXUL2L8BXHG6U0IZ.mp4","format":"video","image":null,"published_at":1451712001,"tag":"","user":{"avatar_updated_at":1448619074,"last_visited_at":1448619074,"created_at":1448619074,"state":"active","last_device":"ios_8.2.15","role":"n","login":"机械师fc","id":30690884,"icon":"20151127101114.jpg"},"image_size":null,"id":114513569,"votes":{"down":-10,"up":146},"created_at":1451667395,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/NXUL2L8BXHG6U0IZ.jpg","content":"这才是永动鸡。这种遛狗方式太机智了","state":"publish","comments_count":7,"low_url":"http://qiubai-video.qiushibaike.com/NXUL2L8BXHG6U0IZ_3g.mp4","allow_comment":true,"share_count":6,"type":"fresh","loop":10766},{"high_url":"http://qiubai-video.qiushibaike.com/MQQPEH6UO77L8RA3.mp4","format":"video","image":null,"published_at":1451709302,"tag":"","user":{"avatar_updated_at":1450787559,"last_visited_at":1420907347,"created_at":1420907347,"state":"bonded","last_device":"android_5.0.0","role":"n","login":".夜夜夜夜.","id":24674122,"icon":"20151222123238.jpg"},"image_size":null,"id":114513925,"votes":{"down":-38,"up":314},"created_at":1451671560,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/MQQPEH6UO77L8RA3.jpg","content":"大神这是什么鱼？","state":"publish","comments_count":21,"low_url":"http://qiubai-video.qiushibaike.com/MQQPEH6UO77L8RA3_3g.mp4","allow_comment":true,"share_count":19,"loop":34336},{"high_url":"http://qiubai-video.qiushibaike.com/SRPJN3HXA9SB3GRZ.mp4","format":"video","image":null,"published_at":1451711401,"tag":"","user":{"avatar_updated_at":1451418151,"last_visited_at":1451418150,"created_at":1451418150,"state":"active","last_device":"ios_8.4.6","role":"n","login":"亲爱的丹","id":30869650,"icon":"20151229194230.jpg"},"image_size":null,"id":114513304,"votes":{"down":-11,"up":181},"created_at":1451665375,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/SRPJN3HXA9SB3GRZ.jpg","content":"老有才了 \u2014\u2014\u2014\u2014\u2014鞋垫","state":"publish","comments_count":7,"low_url":"http://qiubai-video.qiushibaike.com/SRPJN3HXA9SB3GRZ_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":22058},{"high_url":"http://qiubai-video.qiushibaike.com/INCXUZQA8E6N43QI.mp4","format":"video","image":null,"published_at":1451712902,"tag":"","user":{"avatar_updated_at":1450812303,"last_visited_at":1450812302,"created_at":1450812302,"state":"active","last_device":"android_9.0.0","role":"n","login":"一1抹红尘","id":30827902,"icon":"20151222192502.jpg"},"image_size":null,"id":114513245,"votes":{"down":-25,"up":171},"created_at":1451665099,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/INCXUZQA8E6N43QI.jpg","content":"很牛逼的样子","state":"publish","comments_count":13,"low_url":"http://qiubai-video.qiushibaike.com/INCXUZQA8E6N43QI_3g.mp4","allow_comment":true,"share_count":8,"type":"fresh","loop":21439},{"high_url":"http://qiubai-video.qiushibaike.com/ZPVUS7RGZ8VFC1ND.mp4","format":"video","image":null,"published_at":1451714702,"tag":"","user":{"avatar_updated_at":1379296454,"last_visited_at":1378649607,"created_at":1378649607,"state":"active","last_device":"ios_2.6","role":"n","login":"哦买噶此奶胸罩","id":11157178,"icon":"20130916095410.jpg"},"image_size":null,"id":114514470,"votes":{"down":-10,"up":109},"created_at":1451687938,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/ZPVUS7RGZ8VFC1ND.jpg","content":"这两逗逼哈哈哈","state":"publish","comments_count":9,"low_url":"http://qiubai-video.qiushibaike.com/ZPVUS7RGZ8VFC1ND_3g.mp4","allow_comment":true,"share_count":4,"type":"fresh","loop":8483},{"high_url":"http://qiubai-video.qiushibaike.com/GXBG3Y2X272RQ86P.mp4","format":"video","image":null,"published_at":1451710502,"tag":"","user":{"avatar_updated_at":1443486477,"last_visited_at":1391729811,"created_at":1391729811,"state":"bonding","last_device":"android_2.7","role":"n","login":"强剪哥","id":13990355,"icon":"20150929002756.jpg"},"image_size":null,"id":114516888,"votes":{"down":-88,"up":1147},"created_at":1451705081,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/GXBG3Y2X272RQ86P.jpg","content":"好严肃有木有？要逆天有木有？","state":"publish","comments_count":60,"low_url":"http://qiubai-video.qiushibaike.com/GXBG3Y2X272RQ86P_3g.mp4","allow_comment":true,"share_count":434,"type":"hot","loop":123915},{"high_url":"http://qiubai-video.qiushibaike.com/R4DU4SMXHSMP1MSZ.mp4","format":"video","image":null,"published_at":1451693102,"tag":"","user":{"avatar_updated_at":1451253613,"last_visited_at":1449975051,"created_at":1449975051,"state":"active","last_device":"android_8.4.0","role":"n","login":"伤wo祢不配","id":30775130,"icon":"20151227220013.jpg"},"image_size":null,"id":114512439,"votes":{"down":-100,"up":2086},"created_at":1451661144,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/R4DU4SMXHSMP1MSZ.jpg","content":"阿三又开挂了。","state":"publish","comments_count":29,"low_url":"http://qiubai-video.qiushibaike.com/R4DU4SMXHSMP1MSZ_3g.mp4","allow_comment":true,"share_count":99,"type":"hot","loop":158639},{"high_url":"http://qiubai-video.qiushibaike.com/GNRWR6WFURG2V29U.mp4","format":"video","image":null,"published_at":1451716802,"tag":"","user":{"avatar_updated_at":1451685976,"last_visited_at":1448411154,"created_at":1448411154,"state":"active","last_device":"android_8.3.3","role":"n","login":"帽子君花宝","id":30679045,"icon":"20160101220615.jpg"},"image_size":null,"id":114515572,"votes":{"down":-6,"up":72},"created_at":1451697403,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/GNRWR6WFURG2V29U.jpg","content":"瞧这货！到底是梦到啥美味了！！！","state":"publish","comments_count":3,"low_url":"http://qiubai-video.qiushibaike.com/GNRWR6WFURG2V29U_3g.mp4","allow_comment":true,"share_count":1,"type":"fresh","loop":2217}]
     * total : 300
     * page : 1
     * refresh : 300
     */

    private int count;
    private int err;
    private int total;
    private int page;
    private int refresh;
    /**
     * high_url : http://qiubai-video.qiushibaike.com/INEHPDU593EZPZI8.mp4
     * format : video
     * image : null
     * published_at : 1451692502
     * tag :
     * user : {"avatar_updated_at":1451253613,"last_visited_at":1449975051,"created_at":1449975051,"state":"active","last_device":"android_8.4.0","role":"n","login":"伤wo祢不配","id":30775130,"icon":"20151227220013.jpg"}
     * image_size : null
     * id : 114512652
     * votes : {"down":-196,"up":4675}
     * created_at : 1451662059
     * pic_size : [480,480]
     * pic_url : http://qiubai-video.qiushibaike.com/INEHPDU593EZPZI8.jpg
     * content : 会说中国话的喵星人，可惜人家听不懂。
     * state : publish
     * comments_count : 156
     * low_url : http://qiubai-video.qiushibaike.com/INEHPDU593EZPZI8_3g.mp4
     * allow_comment : true
     * share_count : 2676
     * type : hot
     * loop : 207056
     */

    private List<ItemsEntity> items;

    public void setCount(int count) {
        this.count = count;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setRefresh(int refresh) {
        this.refresh = refresh;
    }

    public void setItems(List<ItemsEntity> items) {
        this.items = items;
    }

    public int getCount() {
        return count;
    }

    public int getErr() {
        return err;
    }

    public int getTotal() {
        return total;
    }

    public int getPage() {
        return page;
    }

    public int getRefresh() {
        return refresh;
    }

    public List<ItemsEntity> getItems() {
        return items;
    }

    public static class ItemsEntity {
        private String high_url;
        private String format;
        private String image;
        private int published_at;
        private String tag;
        /**
         * avatar_updated_at : 1451253613
         * last_visited_at : 1449975051
         * created_at : 1449975051
         * state : active
         * last_device : android_8.4.0
         * role : n
         * login : 伤wo祢不配
         * id : 30775130
         * icon : 20151227220013.jpg
         */

        private UserEntity user;
        private ImageSizeEntity image_size;
        private int id;
        /**
         * down : -196
         * up : 4675
         */
        public void setImage_size(ImageSizeEntity image_size) {
            this.image_size = image_size;
        }
        public ImageSizeEntity getImage_size() {
            return image_size;
        }
        public static class ImageSizeEntity {
            private List<Integer> s;
            private List<Integer> m;

            public void setS(List<Integer> s) {
                this.s = s;
            }

            public void setM(List<Integer> m) {
                this.m = m;
            }

            public List<Integer> getS() {
                return s;
            }

            public List<Integer> getM() {
                return m;
            }
        }

        private VotesEntity votes;
        private int created_at;
        private String pic_url;
        private String content;
        private String state;
        private int comments_count;
        private String low_url;
        private boolean allow_comment;
        private int share_count;
        private String type;
        private int loop;
        private List<Integer> pic_size;

        public void setHigh_url(String high_url) {
            this.high_url = high_url;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public void setPublished_at(int published_at) {
            this.published_at = published_at;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public void setUser(UserEntity user) {
            this.user = user;
        }


        public void setId(int id) {
            this.id = id;
        }

        public void setVotes(VotesEntity votes) {
            this.votes = votes;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setState(String state) {
            this.state = state;
        }

        public void setComments_count(int comments_count) {
            this.comments_count = comments_count;
        }

        public void setLow_url(String low_url) {
            this.low_url = low_url;
        }

        public void setAllow_comment(boolean allow_comment) {
            this.allow_comment = allow_comment;
        }

        public void setShare_count(int share_count) {
            this.share_count = share_count;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setLoop(int loop) {
            this.loop = loop;
        }

        public void setPic_size(List<Integer> pic_size) {
            this.pic_size = pic_size;
        }

        public String getHigh_url() {
            return high_url;
        }

        public String getFormat() {
            return format;
        }
//        private static final Pattern pattern = Pattern.compile("(\\d+)\\d{4}");
//        private static final String IMAGE_URL = "http://pic.qiushibike.com/system/pictures/%s/%s/%s/%s";
//        //不小心把url删掉一个
//        private static final String ICON_URL = "http://pic.qiushibaike.com/system/avtnew/%s/%s/thumb/%s";
//
//        public String getImageUrl() {
//            if (image != null) {
//                Matcher matcher = pattern.matcher(image);
//                matcher.find();
//                Log.d("image","entity image");
//                return String.format(IMAGE_URL, matcher.group(1), matcher.group(), "small", image);
//            } else {
//                return null;
//            }
//        }
private static final Pattern pattern = Pattern.compile("(\\d+)\\d{4}");
        private static final String IMAGE_URL = "http://pic.qiushibaike.com/system/pictures/%s/%s/%s/%s";
        private static final String ICON_URL = "http://pic.qiushibaike.com/system/avtnew/%s/%s/thumb/%s";
        public String getImageUrl(){
            if (image != null) {
                Matcher matcher = pattern.matcher(image);
                matcher.find();
                return String.format(IMAGE_URL, matcher.group(1), matcher.group(), "small", image);
            } else {
                return null;
            }
        }
        public String getImage(){
            return image;
        }
        public int getPublished_at() {
            return published_at;
        }

        public String getTag() {
            return tag;
        }

        public UserEntity getUser() {
            return user;
        }


        public int getId() {
            return id;
        }

        public VotesEntity getVotes() {
            return votes;
        }

        public int getCreated_at() {
            return created_at;
        }

        public String getPic_url() {
            return pic_url;
        }

        public String getContent() {
            return content;
        }

        public String getState() {
            return state;
        }

        public int getComments_count() {
            return comments_count;
        }

        public String getLow_url() {
            return low_url;
        }

        public boolean isAllow_comment() {
            return allow_comment;
        }

        public int getShare_count() {
            return share_count;
        }

        public String getType() {
            return type;
        }

        public int getLoop() {
            return loop;
        }

        public List<Integer> getPic_size() {
            return pic_size;
        }

        public  class UserEntity {
            private int avatar_updated_at;
            private int last_visited_at;
            private int created_at;
            private String state;
            private String last_device;
            private String role;
            private String login;
            private int id;
            private String icon;

            public void setAvatar_updated_at(int avatar_updated_at) {
                this.avatar_updated_at = avatar_updated_at;
            }

            public void setLast_visited_at(int last_visited_at) {
                this.last_visited_at = last_visited_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public void setState(String state) {
                this.state = state;
            }

            public void setLast_device(String last_device) {
                this.last_device = last_device;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getAvatar_updated_at() {
                return avatar_updated_at;
            }

            public int getLast_visited_at() {
                return last_visited_at;
            }

            public int getCreated_at() {
                return created_at;
            }

            public String getState() {
                return state;
            }

            public String getLast_device() {
                return last_device;
            }

            public String getRole() {
                return role;
            }

            public String getLogin() {
                return login;
            }

            public int getId() {
                return id;
            }

            public String getIcon() {
                if (icon != null) {
                    return String.format(ICON_URL, id / 10000, id, icon);
                } else {
                    return null;
                }
            }
        }

        public static class VotesEntity {
            private int down;
            private int up;

            public void setDown(int down) {
                this.down = down;
            }

            public void setUp(int up) {
                this.up = up;
            }

            public int getDown() {
                return down;
            }

            public int getUp() {
                return up;
            }
        }
    }
}
