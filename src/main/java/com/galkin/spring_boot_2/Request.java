package com.galkin.spring_boot_2;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class Request {

    private String status;
    private ArrayList<HashMap<String, String>> result;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResult(String key, String value) {
        this.result = new ArrayList<>();
        HashMap <String, String> hashMap = new HashMap<>();
        hashMap.put(key, value);
        this.result.add(hashMap);
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<HashMap<String, String>>getResult() {
        return result;
    }

    public static String transformMap(TreeMap<String, String[]> treeMap) {
        String value = new String();
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            String[] str = (String[]) me.getValue();
            if (it.hasNext()) {
                value += (me.getKey() + "=" + str[0] + "&");
            } else {
                value += (me.getKey() + "=" + str[0]);
            }
        }
        return value;
    }

    public static String getHash(byte[] strBytes) {
        String hashValue = "";
        String algoritm = "SHA-256";

        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algoritm);
            messageDigest.update(strBytes);
            byte[] diaestBytes = messageDigest.digest();
            hashValue = DatatypeConverter.printHexBinary(diaestBytes).toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return hashValue;

    }
}
