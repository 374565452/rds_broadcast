package com.cov001.rds.core.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

import com.cov001.rds.core.CoreServer;

public class CoreMainTest {

	public static void main(String[] args) {
		CoreServer cs=new CoreServer();
		cs.setPort(7002);
		new Thread(cs).start();
		try {
			/*System.out.println("start--at ---" + System.currentTimeMillis());
			//testReadFile();
			
			String path="E:\\mp3\\大海.mp3";
			File file=new File(path);
			FileInputStream fis=new FileInputStream(file);
			System.out.println(fis.available() +"=====size");
			
			System.out.println("end--at ---" + System.currentTimeMillis());*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void testReadFile() throws Exception{
		String path="E:\\mp3\\大海.mp3";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		byte buffer[]=new byte[1024];
		int count ,i=0;
		count=fis.read(buffer);
		while(count != -1){
			String info ="";
			for (i=0;i<count;i++) {
				if(i%10==0){
					info += String.format("0x%02x ,\r\n ",buffer[i]);
				}else{
					info += String.format("0x%02x , ",buffer[i]);
				}
			}
			testPrintFile(info);
			
			count=fis.read(buffer);
		}
		fis.close();
	}

	public static void testPrintFile(String info) throws Exception {
		String filePath="D:\\B.txt";
//System.out.println("写数据");
		File file=new File(filePath);
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(info);
		bw.flush();
		bw.close();
		fw.close();
	}
	
}
