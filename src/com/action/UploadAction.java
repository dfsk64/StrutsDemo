package com.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private File myFile;
	private String myFileContentType;
	private String myFileFileName;
	private String destPath;

	public String execute() {
		destPath = "e:/";
		try {
			File destFile = new File(destPath, myFileFileName);
			FileUtils.copyFile(myFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		
		return SUCCESS;
	}

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}
}
