package LabFinal;

import java.util.ArrayList;


public class HTMLParentElement extends HTMLTag{
	private String tagName;
	private String startTag;
	private String endTag;
	
	HTMLParentElement(String tag){
		tagName = tag;
	}

	public String getTagName() {
		return tagName;
	}


	public void setStartTag(String startTag) {
		this.startTag = startTag;
	}

	public void setEndTag(String endTag) {
		this.endTag = endTag;
	}
	
	public ArrayList<HTMLTag> getChildren(){
		return children;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for (HTMLTag htmlTag : children) {
			htmlTag.generateHtml();
		}
		System.out.println(endTag);
	}
	
}
