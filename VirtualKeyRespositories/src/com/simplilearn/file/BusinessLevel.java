package com.simplilearn.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BusinessLevel {

	public String Filedetails() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the filename :");
		String filename = input.next();
		return filename;

	}

	public File[] FileArray() throws IOException {
		Path directorypath = Paths.get("root");
		Path createdirectory = Files.createDirectories(directorypath);

		String directorypathtostring = createdirectory.toString();

		File retreivefiles = new File(directorypathtostring);
		File files[] = retreivefiles.listFiles();
		return files;
	}

	public void CreateFile(String userfilename) throws IOException {

		Path directorypath = Paths.get("root");
		Path createdirectory = Files.createDirectories(directorypath);
		Path filepath = Paths.get(directorypath + File.separator + userfilename);
		Path createfile = Files.createFile(filepath);

		if (Files.exists(createdirectory)) {

			if (Files.exists(createfile)) {
				System.out.println("File has been created successfully");
			}
		}
	}

	public void SortingFile() throws IOException {
		System.out.println("The directory contains following files :");
		System.out.println("***************************************************");

		Arrays.sort(FileArray());

		if (FileArray().length != 0) {
			for (File file : FileArray()) {
				System.out.println(file.getName());

			}
			System.out.println("\nFiles are sorting completed");
		} else {
			System.out.println("Invalid filename. Please create file");
		}
	}

	public void SearchFile(String userfilename) throws IOException {
		int count = 0;
		Pattern pattern = Pattern.compile(Pattern.quote(userfilename), Pattern.CASE_INSENSITIVE);

		for (File file : FileArray()) {
			String filetostring = file.getName();

			Matcher matcher = pattern.matcher(filetostring);
			if (matcher.find()) {
				System.out.println();
				System.out.println("->> The file has been found " + filetostring + " ->>");
			} else {
				count++;
			}
		}
		if (count== FileArray().length) {
			System.out.println("File not found in the following directroy");
		}
	}

	public void DeleteFile(String userfilename) throws IOException {
		int count = 0;
		int filescount = FileArray().length;
		File userfile = new File(userfilename);
		for (File file : FileArray()) {
			String filetostring = file.getName();
			File stringtofile = new File(filetostring);
			if (userfile.equals(stringtofile)) {
				if (file.delete()) {
					System.out.println(file.getName() + " " + "is deleted successfully.");
				}
			} else {
				count++;
			}
		}
		if (count== filescount) {
			System.out.println("The following file does not exist in the directory");
		}
	}
}