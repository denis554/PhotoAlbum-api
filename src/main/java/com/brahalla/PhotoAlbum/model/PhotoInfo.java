package com.brahalla.PhotoAlbum.model;

import java.util.Date;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class PhotoInfo extends CommonModelBase {

	private static final long serialVersionUID = 2817453290727069227L;
	private String title;
	private String filePath;
	private Long albumId;

	public PhotoInfo() {
		super();
	}

	public PhotoInfo(String title, String filePath, Long albumId) {
		this.setTitle(title);
		this.setFilePath(filePath);
		this.setAlbumId(albumId);
	}

	@NotEmpty
	@Length(max = 50)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@NotEmpty
	@Length(max = 100)
	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Min(value = 1)
	public Long getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

}
