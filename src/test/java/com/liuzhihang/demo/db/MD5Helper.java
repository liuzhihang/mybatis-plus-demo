package com.liuzhihang.demo.db;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 */
public class MD5Helper {

	private MD5Helper(){

	}

	public static String createServerSign(String basestring,boolean toLowerCase){
		byte[] bytes = null;
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			bytes = md5.digest(basestring.getBytes(StandardCharsets.UTF_8));
		} catch (GeneralSecurityException ex) {
			ex.printStackTrace();
		}

        return HexUtils.encodeHexStr(bytes, toLowerCase);
	}

	public static String convertKeyValue(JSONObject bodyJson) {

        Set<String> strings = bodyJson.keySet();
        List<String> stringList = new ArrayList<>(strings);

        Collections.sort(stringList);

        StringBuilder stringBuilder = new StringBuilder();

        for (String key : stringList) {

            if (!key.equals("sign") && StringUtils.isNotBlank(bodyJson.getString(key))) {

                stringBuilder.append(key).append("=").append(bodyJson.getString(key)).append("&");

            }
        }
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf("&"));

        return stringBuilder.toString();

    }

    public static void main(String[] args) {

	    // {"sign":"C65248C6FED950E84273477F2486C16D","mobileNo":" 2348038341171"}

        String s = "mobileNo=+2348038341171&key=1qaz4rfv1234567890xyz";

        String serverSign = createServerSign(s, false);

        System.out.println("serverSign = " + serverSign);

    }

}
