package com.brahalla.PhotoAlbum.dao;

import com.brahalla.PhotoAlbum.domain.entity.Photo;

import java.util.List;

public interface PhotoDao {

  public Photo createPhoto(Photo photo);

  public Photo getPhotoById(Long id);

  public List<Photo> getPhotoList();

  public List<Photo> getPhotoListByAlbumId(Long albumId);

  public Photo updatePhoto(Photo photo);

  public Photo deletePhoto(Long id);

}
