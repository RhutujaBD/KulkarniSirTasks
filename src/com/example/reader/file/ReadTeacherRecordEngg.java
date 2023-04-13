package com.example.reader.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTeacherRecordEngg {

	public void ReadingTeacher(File file) {
		BufferedReader bufferedReader = null;
		try {
			try {
				bufferedReader = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			String line = null;
			try {
				while ((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {

		ReadTeacherRecordEngg readFile = new ReadTeacherRecordEngg();
		String fileName = "ENGG_Teacher_Mechanical.csv";
		File file = new File(fileName);
		readFile.ReadingTeacher(file);
	}
}
