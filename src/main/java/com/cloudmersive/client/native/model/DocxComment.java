/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.native.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Comment in a Word Document
 */
@ApiModel(description = "Comment in a Word Document")
@JsonPropertyOrder({
  DocxComment.JSON_PROPERTY_PATH,
  DocxComment.JSON_PROPERTY_AUTHOR,
  DocxComment.JSON_PROPERTY_AUTHOR_INITIALS,
  DocxComment.JSON_PROPERTY_COMMENT_TEXT,
  DocxComment.JSON_PROPERTY_COMMENT_DATE,
  DocxComment.JSON_PROPERTY_IS_TOP_LEVEL,
  DocxComment.JSON_PROPERTY_IS_REPLY,
  DocxComment.JSON_PROPERTY_PARENT_COMMENT_PATH,
  DocxComment.JSON_PROPERTY_DONE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T17:28:09.672516700-07:00[America/Los_Angeles]")
public class DocxComment {
  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_AUTHOR = "Author";
  private String author;

  public static final String JSON_PROPERTY_AUTHOR_INITIALS = "AuthorInitials";
  private String authorInitials;

  public static final String JSON_PROPERTY_COMMENT_TEXT = "CommentText";
  private String commentText;

  public static final String JSON_PROPERTY_COMMENT_DATE = "CommentDate";
  private OffsetDateTime commentDate;

  public static final String JSON_PROPERTY_IS_TOP_LEVEL = "IsTopLevel";
  private Boolean isTopLevel;

  public static final String JSON_PROPERTY_IS_REPLY = "IsReply";
  private Boolean isReply;

  public static final String JSON_PROPERTY_PARENT_COMMENT_PATH = "ParentCommentPath";
  private String parentCommentPath;

  public static final String JSON_PROPERTY_DONE = "Done";
  private Boolean done;

  public DocxComment() { 
  }

  public DocxComment path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path to the comment in the document
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the comment in the document")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  public DocxComment author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Author name of the comment
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Author name of the comment")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthor() {
    return author;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthor(String author) {
    this.author = author;
  }


  public DocxComment authorInitials(String authorInitials) {
    this.authorInitials = authorInitials;
    return this;
  }

   /**
   * Initials of the author of the comment
   * @return authorInitials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Initials of the author of the comment")
  @JsonProperty(JSON_PROPERTY_AUTHOR_INITIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorInitials() {
    return authorInitials;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR_INITIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorInitials(String authorInitials) {
    this.authorInitials = authorInitials;
  }


  public DocxComment commentText(String commentText) {
    this.commentText = commentText;
    return this;
  }

   /**
   * Text content of the comment
   * @return commentText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text content of the comment")
  @JsonProperty(JSON_PROPERTY_COMMENT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommentText() {
    return commentText;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommentText(String commentText) {
    this.commentText = commentText;
  }


  public DocxComment commentDate(OffsetDateTime commentDate) {
    this.commentDate = commentDate;
    return this;
  }

   /**
   * Date timestamp of the comment
   * @return commentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date timestamp of the comment")
  @JsonProperty(JSON_PROPERTY_COMMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCommentDate() {
    return commentDate;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommentDate(OffsetDateTime commentDate) {
    this.commentDate = commentDate;
  }


  public DocxComment isTopLevel(Boolean isTopLevel) {
    this.isTopLevel = isTopLevel;
    return this;
  }

   /**
   * True if the comment is at the top level, false if this comment is a child reply of another comment
   * @return isTopLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the comment is at the top level, false if this comment is a child reply of another comment")
  @JsonProperty(JSON_PROPERTY_IS_TOP_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsTopLevel() {
    return isTopLevel;
  }


  @JsonProperty(JSON_PROPERTY_IS_TOP_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsTopLevel(Boolean isTopLevel) {
    this.isTopLevel = isTopLevel;
  }


  public DocxComment isReply(Boolean isReply) {
    this.isReply = isReply;
    return this;
  }

   /**
   * True if this comment is a reply to another comment, false otherwise
   * @return isReply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this comment is a reply to another comment, false otherwise")
  @JsonProperty(JSON_PROPERTY_IS_REPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsReply() {
    return isReply;
  }


  @JsonProperty(JSON_PROPERTY_IS_REPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsReply(Boolean isReply) {
    this.isReply = isReply;
  }


  public DocxComment parentCommentPath(String parentCommentPath) {
    this.parentCommentPath = parentCommentPath;
    return this;
  }

   /**
   * Path to the parent of this comment, if this comment is a reply, otherwise this value will be null
   * @return parentCommentPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the parent of this comment, if this comment is a reply, otherwise this value will be null")
  @JsonProperty(JSON_PROPERTY_PARENT_COMMENT_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentCommentPath() {
    return parentCommentPath;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_COMMENT_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentCommentPath(String parentCommentPath) {
    this.parentCommentPath = parentCommentPath;
  }


  public DocxComment done(Boolean done) {
    this.done = done;
    return this;
  }

   /**
   * True if this comment is marked as Done in Word, otherwise it is false
   * @return done
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this comment is marked as Done in Word, otherwise it is false")
  @JsonProperty(JSON_PROPERTY_DONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDone() {
    return done;
  }


  @JsonProperty(JSON_PROPERTY_DONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDone(Boolean done) {
    this.done = done;
  }


  /**
   * Return true if this DocxComment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxComment docxComment = (DocxComment) o;
    return Objects.equals(this.path, docxComment.path) &&
        Objects.equals(this.author, docxComment.author) &&
        Objects.equals(this.authorInitials, docxComment.authorInitials) &&
        Objects.equals(this.commentText, docxComment.commentText) &&
        Objects.equals(this.commentDate, docxComment.commentDate) &&
        Objects.equals(this.isTopLevel, docxComment.isTopLevel) &&
        Objects.equals(this.isReply, docxComment.isReply) &&
        Objects.equals(this.parentCommentPath, docxComment.parentCommentPath) &&
        Objects.equals(this.done, docxComment.done);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, author, authorInitials, commentText, commentDate, isTopLevel, isReply, parentCommentPath, done);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxComment {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorInitials: ").append(toIndentedString(authorInitials)).append("\n");
    sb.append("    commentText: ").append(toIndentedString(commentText)).append("\n");
    sb.append("    commentDate: ").append(toIndentedString(commentDate)).append("\n");
    sb.append("    isTopLevel: ").append(toIndentedString(isTopLevel)).append("\n");
    sb.append("    isReply: ").append(toIndentedString(isReply)).append("\n");
    sb.append("    parentCommentPath: ").append(toIndentedString(parentCommentPath)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

