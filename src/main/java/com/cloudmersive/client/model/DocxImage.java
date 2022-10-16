/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DocxImage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-11T01:19:39.601-07:00")
public class DocxImage {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("ImageName")
  private String imageName = null;

  @SerializedName("ImageId")
  private Long imageId = null;

  @SerializedName("ImageDescription")
  private String imageDescription = null;

  @SerializedName("ImageWidth")
  private Long imageWidth = null;

  @SerializedName("ImageHeight")
  private Long imageHeight = null;

  @SerializedName("XOffset")
  private Long xoffset = null;

  @SerializedName("YOffset")
  private Long yoffset = null;

  @SerializedName("ImageDataEmbedId")
  private String imageDataEmbedId = null;

  @SerializedName("ImageDataContentType")
  private String imageDataContentType = null;

  @SerializedName("ImageInternalFileName")
  private String imageInternalFileName = null;

  @SerializedName("ImageContentsURL")
  private String imageContentsURL = null;

  @SerializedName("InlineWithText")
  private Boolean inlineWithText = null;

  public DocxImage path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new tables
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new tables")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DocxImage imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * The Name of the image
   * @return imageName
  **/
  @ApiModelProperty(value = "The Name of the image")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public DocxImage imageId(Long imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * The Id of the image
   * @return imageId
  **/
  @ApiModelProperty(value = "The Id of the image")
  public Long getImageId() {
    return imageId;
  }

  public void setImageId(Long imageId) {
    this.imageId = imageId;
  }

  public DocxImage imageDescription(String imageDescription) {
    this.imageDescription = imageDescription;
    return this;
  }

   /**
   * The Description of the image
   * @return imageDescription
  **/
  @ApiModelProperty(value = "The Description of the image")
  public String getImageDescription() {
    return imageDescription;
  }

  public void setImageDescription(String imageDescription) {
    this.imageDescription = imageDescription;
  }

  public DocxImage imageWidth(Long imageWidth) {
    this.imageWidth = imageWidth;
    return this;
  }

   /**
   * Width of the image in EMUs (English Metric Units); set to 0 to default to page width and aspect-ratio based height
   * @return imageWidth
  **/
  @ApiModelProperty(value = "Width of the image in EMUs (English Metric Units); set to 0 to default to page width and aspect-ratio based height")
  public Long getImageWidth() {
    return imageWidth;
  }

  public void setImageWidth(Long imageWidth) {
    this.imageWidth = imageWidth;
  }

  public DocxImage imageHeight(Long imageHeight) {
    this.imageHeight = imageHeight;
    return this;
  }

   /**
   * Height of the image in EMUs (English Metric Units); set to 0 to default to page width and aspect-ratio based height
   * @return imageHeight
  **/
  @ApiModelProperty(value = "Height of the image in EMUs (English Metric Units); set to 0 to default to page width and aspect-ratio based height")
  public Long getImageHeight() {
    return imageHeight;
  }

  public void setImageHeight(Long imageHeight) {
    this.imageHeight = imageHeight;
  }

  public DocxImage xoffset(Long xoffset) {
    this.xoffset = xoffset;
    return this;
  }

   /**
   * X (horizontal) offset of the image
   * @return xoffset
  **/
  @ApiModelProperty(value = "X (horizontal) offset of the image")
  public Long getXoffset() {
    return xoffset;
  }

  public void setXoffset(Long xoffset) {
    this.xoffset = xoffset;
  }

  public DocxImage yoffset(Long yoffset) {
    this.yoffset = yoffset;
    return this;
  }

   /**
   * Y (vertical) offset of the image
   * @return yoffset
  **/
  @ApiModelProperty(value = "Y (vertical) offset of the image")
  public Long getYoffset() {
    return yoffset;
  }

  public void setYoffset(Long yoffset) {
    this.yoffset = yoffset;
  }

  public DocxImage imageDataEmbedId(String imageDataEmbedId) {
    this.imageDataEmbedId = imageDataEmbedId;
    return this;
  }

   /**
   * Read-only; internal ID for the image contents
   * @return imageDataEmbedId
  **/
  @ApiModelProperty(value = "Read-only; internal ID for the image contents")
  public String getImageDataEmbedId() {
    return imageDataEmbedId;
  }

  public void setImageDataEmbedId(String imageDataEmbedId) {
    this.imageDataEmbedId = imageDataEmbedId;
  }

  public DocxImage imageDataContentType(String imageDataContentType) {
    this.imageDataContentType = imageDataContentType;
    return this;
  }

   /**
   * Read-only; image data MIME content-type
   * @return imageDataContentType
  **/
  @ApiModelProperty(value = "Read-only; image data MIME content-type")
  public String getImageDataContentType() {
    return imageDataContentType;
  }

  public void setImageDataContentType(String imageDataContentType) {
    this.imageDataContentType = imageDataContentType;
  }

  public DocxImage imageInternalFileName(String imageInternalFileName) {
    this.imageInternalFileName = imageInternalFileName;
    return this;
  }

   /**
   * Read-only; internal file name/path for the image
   * @return imageInternalFileName
  **/
  @ApiModelProperty(value = "Read-only; internal file name/path for the image")
  public String getImageInternalFileName() {
    return imageInternalFileName;
  }

  public void setImageInternalFileName(String imageInternalFileName) {
    this.imageInternalFileName = imageInternalFileName;
  }

  public DocxImage imageContentsURL(String imageContentsURL) {
    this.imageContentsURL = imageContentsURL;
    return this;
  }

   /**
   * URL to the image contents; file is stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the contents.
   * @return imageContentsURL
  **/
  @ApiModelProperty(value = "URL to the image contents; file is stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the contents.")
  public String getImageContentsURL() {
    return imageContentsURL;
  }

  public void setImageContentsURL(String imageContentsURL) {
    this.imageContentsURL = imageContentsURL;
  }

  public DocxImage inlineWithText(Boolean inlineWithText) {
    this.inlineWithText = inlineWithText;
    return this;
  }

   /**
   * True if the image is inline with the text; false if it is floating
   * @return inlineWithText
  **/
  @ApiModelProperty(value = "True if the image is inline with the text; false if it is floating")
  public Boolean isInlineWithText() {
    return inlineWithText;
  }

  public void setInlineWithText(Boolean inlineWithText) {
    this.inlineWithText = inlineWithText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxImage docxImage = (DocxImage) o;
    return Objects.equals(this.path, docxImage.path) &&
        Objects.equals(this.imageName, docxImage.imageName) &&
        Objects.equals(this.imageId, docxImage.imageId) &&
        Objects.equals(this.imageDescription, docxImage.imageDescription) &&
        Objects.equals(this.imageWidth, docxImage.imageWidth) &&
        Objects.equals(this.imageHeight, docxImage.imageHeight) &&
        Objects.equals(this.xoffset, docxImage.xoffset) &&
        Objects.equals(this.yoffset, docxImage.yoffset) &&
        Objects.equals(this.imageDataEmbedId, docxImage.imageDataEmbedId) &&
        Objects.equals(this.imageDataContentType, docxImage.imageDataContentType) &&
        Objects.equals(this.imageInternalFileName, docxImage.imageInternalFileName) &&
        Objects.equals(this.imageContentsURL, docxImage.imageContentsURL) &&
        Objects.equals(this.inlineWithText, docxImage.inlineWithText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, imageName, imageId, imageDescription, imageWidth, imageHeight, xoffset, yoffset, imageDataEmbedId, imageDataContentType, imageInternalFileName, imageContentsURL, inlineWithText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxImage {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageDescription: ").append(toIndentedString(imageDescription)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
    sb.append("    xoffset: ").append(toIndentedString(xoffset)).append("\n");
    sb.append("    yoffset: ").append(toIndentedString(yoffset)).append("\n");
    sb.append("    imageDataEmbedId: ").append(toIndentedString(imageDataEmbedId)).append("\n");
    sb.append("    imageDataContentType: ").append(toIndentedString(imageDataContentType)).append("\n");
    sb.append("    imageInternalFileName: ").append(toIndentedString(imageInternalFileName)).append("\n");
    sb.append("    imageContentsURL: ").append(toIndentedString(imageContentsURL)).append("\n");
    sb.append("    inlineWithText: ").append(toIndentedString(inlineWithText)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
