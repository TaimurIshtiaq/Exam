package LabFinal;

import java.util.ArrayList;
import java.util.List;

public abstract class HTMLTag {
	
	protected ArrayList<HTMLTag> children = new ArrayList<HTMLTag>();
	protected String tagBody;
	
	HTMLTag(){
		
	}
	
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	
	public void setTagBody(String body) {
		this.tagBody = body;
	}
	
	public void addChildTag(HTMLTag tag) {
		children.add(tag);
	}
	
	public void removeChildTag(HTMLTag tag) {
		children.remove(tag);
	}
	
	public List<HTMLTag> getChildren(){
		return null;
	}
	
	public abstract void generateHtml();
}
