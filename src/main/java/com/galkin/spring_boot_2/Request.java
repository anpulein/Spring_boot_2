package com.galkin.spring_boot_2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Request {
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
}
