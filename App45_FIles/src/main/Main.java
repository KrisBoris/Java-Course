package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Lesson 45 - File class
		 */
		
		System.out.println("Lesson 45 - File class");
		
		File file = new File("D:\\2. Nauka\\GitHubRepositories\\Java-Course\\App45_FIles\\text.txt");
		
		if(file.exists()) {
			System.out.println("File exists");
			System.out.println(file.getName());
			System.out.println(file.getTotalSpace());
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
//			file.delete();	// Works
		}
		else
			System.out.println("File doesn't exist");
		
		
		/*
		 * Lesson 46 - FileWriter
		 */
		
		System.out.println("Lesson 46 - FileWriter");
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red\nThe Courussant is round\n");
			writer.append("It's over Anakin\nI have the high ground\n");
			writer.close();
			System.out.println("File writing finished successfully");
		}
		catch (IOException e) {
			e.printStackTrace();
		}		
		
		
		/*
		 * Lesson 47 - FileReader
		 */
		
		System.out.println("Lesson 47 - FileReader");			
		
		try {
			FileReader reader = new FileReader("poem.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * Lesson 48 - Audio
		 */
		
		System.out.println("Lesson 48 - Audio");			
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			File audioFile = new File("Devil May Cry 5 - Bury the Light.wav");
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			
			String response = "";
			
			while(!response.equals("q")) {
				System.out.println("p - play, s - stop, r - resume, I am the storm - v, q - quit");
				System.out.print("Enter your choice: ");
				
				response = scanner.next();
				response.toLowerCase();
				
				switch(response) {
					case "p": clip.start(); break;
					case "s": clip.stop(); break;
					case "r": clip.setMicrosecondPosition(0); break;
					case "v": clip.setMicrosecondPosition(121_000_000); break;
					case "q": clip.close(); System.out.println("Goddbye"); break;
					default: System.out.println("Invalid response");
				}
			}
			
			clip.stop();			
			audioStream.close();
		}		
		catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
		catch (LineUnavailableException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}				
		
	}

}
