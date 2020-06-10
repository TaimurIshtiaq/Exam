package LabFinal;

public class HTMLElement extends HTMLTag {

	private String tagName;
	private String startTag;
	private String endTag;
	
	HTMLElement(String tag) {
		tagName = tag;
	}
	
	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		startTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		endTag = tag;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag + " " + tagBody + " " + endTag);
	}
}
