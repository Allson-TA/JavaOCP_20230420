package day24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Util {
	public static int getValue(String line) {
		return Integer.parseInt(line.split(" ")[1]);
	}
	
	public static List<String> getLines(String url) throws IOException {
		Path path = Paths.get(url);
		return Files.readAllLines(path);
	}
}