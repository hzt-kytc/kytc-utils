package com.kytc.utils.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TxtUtils {
	public static void write(String str,String path){
        byte[] b = str.getBytes();  
		File file=new File(path);  
        try {   
        	if(file.exists()){
        		file.delete();
        	}
            file.createNewFile();  
            FileOutputStream  fos=new FileOutputStream(file);  
            fos.write(b);   
            fos.flush();  
            fos.close();  
        } catch (FileNotFoundException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }
        return ;
	}
	public static void write(StringBuffer sb,String path){
        write(sb.toString(),path);
	}
}
