package com.huateng.udf;

import com.huateng.util.Pinyin4jUtil;
import org.apache.hadoop.hive.ql.exec.UDF;

public class PinyinConvertUDF extends UDF{
  public String evaluate(String str){
    String s = Pinyin4jUtil.converterToSpellOne(str);
    System.out.println(s);
    return s;
  }
  
  
  
  
  
  public static void main(String[] args) {
    String s = "English(³¤É³ÊÐ)";
    PinyinConvertUDF udf = new PinyinConvertUDF();
    udf.evaluate(s);
  }
}