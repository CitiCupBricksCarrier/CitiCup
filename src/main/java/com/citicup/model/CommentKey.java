package com.citicup.model;

import java.io.Serializable;

public class CommentKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.author
     *
     * @mbggenerated
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.articleId
     *
     * @mbggenerated
     */
    private String articleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.time
     *
     * @mbggenerated
     */
    private String time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.author
     *
     * @return the value of comment.author
     *
     * @mbggenerated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.author
     *
     * @param author the value for comment.author
     *
     * @mbggenerated
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.articleId
     *
     * @return the value of comment.articleId
     *
     * @mbggenerated
     */
    public String getArticleid() {
        return articleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.articleId
     *
     * @param articleid the value for comment.articleId
     *
     * @mbggenerated
     */
    public void setArticleid(String articleid) {
        this.articleid = articleid == null ? null : articleid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.time
     *
     * @return the value of comment.time
     *
     * @mbggenerated
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.time
     *
     * @param time the value for comment.time
     *
     * @mbggenerated
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CommentKey other = (CommentKey) that;
        return (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getArticleid() == null ? other.getArticleid() == null : this.getArticleid().equals(other.getArticleid()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getArticleid() == null) ? 0 : getArticleid().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", author=").append(author);
        sb.append(", articleid=").append(articleid);
        sb.append(", time=").append(time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public CommentKey(String author, String articleid, String time) {
        this.author = author;
        this.articleid = articleid;
        this.time = time;
    }

    public CommentKey() {
    }
}