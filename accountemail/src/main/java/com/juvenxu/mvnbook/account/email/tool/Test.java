package com.juvenxu.mvnbook.account.email.tool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Test {
    public static void main(String[] args) throws Exception {
        String template1 = " DELETE from acc_event_";
        String template2 = " WHERE (EVENT_DETAIL LIKE '%\"dt\":\"2018-02-09 00:00:00\"%' OR EVENT_DETAIL LIKE '%\"dt\":\"2018-02-08 00:00:00\"%' OR EVENT_DETAIL LIKE '%\"dt\":\"2018-02-07 00:00:00\"%' OR EVENT_DETAIL LIKE '%\"dt\":\"2018-02-06 00:00:00\"%' OR EVENT_DETAIL LIKE '%\"dt\":\"2018-02-05 00:00:00\"%' OR EVENT_DETAIL LIKE '%\"dt\":\"2018-02-04 00:00:00\"%' OR EVENT_DETAIL LIKE '%\"dt\":\"2018-02-03 00:00:00\"%' OR EVENT_DETAIL LIKE '%\"dt\":\"2018-02-02 00:00:00\"%' OR EVENT_DETAIL LIKE '%\"dt\":\"2018-02-01 00:00:00\"%' OR EVENT_DETAIL LIKE '%\"dt\":\"2018-01-31 00:00:00\"%' OR EVENT_DETAIL LIKE '%\"dt\":\"2018-01-30 00:00:00\"%' OR EVENT_DETAIL LIKE '%\"dt\":\"2018-01-29 00:00:00\"%') and EVENT_DETAIL LIKE '%QIANBAO_SPRING_FESTIVAL%';";
        File wFile = null;
        BufferedWriter bw = null;

        for (int i = 0; i < 10; i++) {
            wFile = new File("D:\\guotai" + i + ".sql");
            String beginStri = String.valueOf(i);
            bw = new BufferedWriter(new FileWriter(wFile, true));

            for (int j = 0; j < 100; j++) {
                String beginStrj = String.valueOf(j);

                if (j<10) {//10
                    String fullStr = template1 + beginStri + "0" + beginStrj + template2 + "\n";
                    bw.write(fullStr);
                } else {//10
                    String fullStr = template1 + beginStri + beginStrj + template2 + "\n";
                    bw.write(fullStr);
                }
                if (j==99) {
// 满了,关闭老文件
                    bw.flush();
                    bw.close();
                    bw=null;
                }

            }
        }
    }


}