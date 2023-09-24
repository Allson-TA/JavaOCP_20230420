package day17;

import java.util.Objects;

//	職稱

public class Title {
	
	private Integer level;	//	等級
	private String name;	//	職稱名
	
	public Title() {
		
	}
	
	public Title(Integer level,String name) {
		this.level = level;
		this.name = name;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(level, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Title other = (Title) obj;
		return Objects.equals(level, other.level) && Objects.equals(name, other.name);
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Title [level=" + level + ", name=" + name + "]";
	}
	
}
