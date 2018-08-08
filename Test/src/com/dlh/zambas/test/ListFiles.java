package com.dlh.zambas.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ListFiles {
	public static void main(String[] args) throws Exception {
		ListFiles l = new ListFiles();
		l.listFilesAndFolders("D:/WSDL");
		l.generateFiles("D:/WSDL");
		
		String s = "D:/WSDL/a.txt";
		System.out.println(s.substring(s.lastIndexOf(".")+1,s.length()));
	}

	public void generateFiles(String directoryName) throws Exception {
		String ext = ".txt";
		for (int i = 0; i < 1000; i++) {
			File file = new File(directoryName + File.separator + i + ext);
			if (file.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }
			if(i==350){
				ext = ".wadl";
			}else if(i==700){
				ext = ".wsdl";
			}
		}
	}

	/**
	 * List all the files and folders from a directory
	 * 
	 * @param directoryName
	 *            to be listed
	 * @throws IOException
	 */
	public void listFilesAndFolders(String directoryName) throws IOException {
		File directory = new File(directoryName);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		for (File file : fList) {
			if (file.isFile()) {
				File directoryAsPerFileName = new File(
						file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf(File.separator) + 2));
				if (directoryAsPerFileName.exists()) {
					FileUtils.copyFileToDirectory(file, directoryAsPerFileName);
				} else {
					directoryAsPerFileName.mkdir();
					System.out.println(directoryAsPerFileName.getName());
					FileUtils.copyFileToDirectory(file, directoryAsPerFileName);
				}

			} else if (file.isDirectory()) {
				listFilesAndFolders(file.getAbsolutePath());
			}
		}
	}
}
