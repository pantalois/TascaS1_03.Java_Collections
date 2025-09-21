package level_1.exercici_3.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileManagement {
	private final String pathName;

	public FileManagement(String pathName) {
		this.pathName = pathName;
	}

	public FileReader loadFile() {
		try {
			return new FileReader(this.pathName);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public BufferedReader createBufferedReader(FileReader reader) {
		return new BufferedReader(reader);
	}

}


