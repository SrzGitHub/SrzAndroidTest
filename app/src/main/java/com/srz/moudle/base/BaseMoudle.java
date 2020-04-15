package com.srz.moudle.base;

import com.srz.moudle.ApiServer;
import com.srz.net.interfaces.IHttp;
import com.srz.net.interfaces.IOkHttp;
import com.srz.net.net.HttpFactroy;

/**
 * //                    .::::.
 * //                  .::::::::.
 * //                 :::::::::::  FUCK YOU
 * //             ..:::::::::::'
 * //           '::::::::::::'
 * //             .::::::::::
 * //        '::::::::::::::..
 * //             ..::::::::::::.
 * //           ``::::::::::::::::
 * //            ::::``:::::::::'        .:::.
 * //           ::::'   ':::::'       .::::::::.
 * //         .::::'      ::::     .:::::::'::::.
 * //        .:::'       :::::  .:::::::::' ':::::.
 * //       .::'        :::::.:::::::::'      ':::::.
 * //      .::'         ::::::::::::::'         ``::::.
 * //  ...:::           ::::::::::::'              ``::.
 * // ```` ':.          ':::::::::'                  ::::..
 * //                    '.:::::'                    ':'````..
 * ===========================================================
 * You may think you know what the following code does.
 * But you dont. Trust me.
 * Fiddle with it, and youll spend many a sleepless
 * night cursing the moment you thought youd be clever
 * enough to "optimize" the code below.
 * Now close this file and go play with something else.
 * <p>
 * 2019/12/17 16:53 星期二
 **/
public interface BaseMoudle {



    public static IHttp iHttp = HttpFactroy.create();
    public static ApiServer apiServer = iHttp.create(ApiServer.class);
    public static IOkHttp iOkHttp = HttpFactroy.createOk();





}
