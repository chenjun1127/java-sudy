package com.gson;

import java.io.File;
import java.io.IOException;

import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;
import com.entities.Girl;
import com.json.ReadJsonFile;

/**
 * @Description:
 * @Author: chenjun
 * @Date: 2021/3/5 9:46
 */
public class ReadJsonFileWithGson {
    public static void main(String[] args) throws IOException {
        File file = new File(ReadJsonFile.class.getResource("/person.json").getFile());
        String content = FileUtils.readFileToString(file);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        Girl girl = gson.fromJson(content, Girl.class);
        System.out.println("姓名是：" + girl.getName());
        for (int i = 0; i < girl.hobbies.length; i++) {
            System.out.println("爱好是：" + girl.hobbies[i]);
        }
        System.out.println(girl.getBirthday());
    }
}
