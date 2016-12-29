package com.cov001.rds.core.audio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.mysql.jdbc.Field;

public class Mp3AudioFileUtil {

	private int readPos;
	
	private int fileSize;
	
	private FileInputStream fis;
	
	private String filePath;
	
	public Mp3AudioFileUtil(String filePath) throws Exception{
		this.filePath=filePath;
		initStream(this.filePath);
	}
	
	private void initStream(String filePath) throws Exception{
		File file=new File(filePath);
		fis=new FileInputStream(file);
		fileSize=fis.available();
	}
	
	/***
	 * 以最大每次读取1024个字节读取数据
	 * @return
	 * @throws Exception 
	 */
	public byte[] readFile(int count) throws Exception{
		int read=0;
		if(fis !=null){
			byte buffer[]=new byte[count];
			read= fis.read(buffer);
			if(read == -1){
				//此时已经说明读取完成，不需要再次进行发送数据，
				closeFile();
			}else{
				readPos+= read;
				System.out.println("已经读取---"+readPos+"--个字节");
			}
			if(read==-1){
				return null;
			}
			return buffer;
			
		}
		return null;
	}
	
	public void closeFile() throws IOException{
		if(fis !=null){
			fis.close();
			
		}
	}
}
