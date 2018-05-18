package com.ly.api;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import static java.awt.SystemColor.info;

public class testAPI {
    public static void main(String[] args) throws IOException {
        //接口地址
        String requestUrl = "http://route.showapi.com/119-42";
        //params用于存储要请求的参数
        Map params = new HashMap();
        //showapi_appid的值，把###替换成你的appid
        params.put("showapi_appid","65287");
        //我们请求的字符串
        params.put("date",1001);
        //数字签名，###填你的数字签名，可以在你的个人中心看到
        params.put("showapi_sign","8e79787a8b034936af9ba44223da001d");

        URL u = new URL(requestUrl+"?"+urlencode(params));
        InputStream in = u.openStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            byte buf[] = new byte[1024];
            int read = 0;
            while ((read = in .read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        } finally {
            if ( in != null) {
                in .close();
            }
        }
        byte b[] = out.toByteArray();
        System.out.println(new String(b, "utf-8"));
    }


    public static String urlencode(Map<String,Object>data) {
        //将map里的参数变成像 showapi_appid=###&showapi_sign=###&的样子
        StringBuilder sb = new StringBuilder();
        for (Map.Entry i : data.entrySet()) {
            try {
                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue()+"","UTF-8")).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
