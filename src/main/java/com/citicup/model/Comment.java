package com.citicup.model;

import java.io.Serializable;

public class Comment extends CommentKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment
     *
     * @mbggenerated
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.up
     *
     * @mbggenerated
     */
    private Integer up;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.down
     *
     * @mbggenerated
     */
    private Integer down;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table comment
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment
     *
     * @return the value of comment.comment
     *
     * @mbggenerated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment
     *
     * @param comment the value for comment.comment
     *
     * @mbggenerated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.up
     *
     * @return the value of comment.up
     *
     * @mbggenerated
     */
    public Integer getUp() {
        return up;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.up
     *
     * @param up the value for comment.up
     *
     * @mbggenerated
     */
    public void setUp(Integer up) {
        this.up = up;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.down
     *
     * @return the value of comment.down
     *
     * @mbggenerated
     */
    public Integer getDown() {
        return down;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.down
     *
     * @param down the value for comment.down
     *
     * @mbggenerated
     */
    public void setDown(Integer down) {
        this.down = down;
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
        Comment other = (Comment) that;
        return (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getArticleid() == null ? other.getArticleid() == null : this.getArticleid().equals(other.getArticleid()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getUp() == null ? other.getUp() == null : this.getUp().equals(other.getUp()))
            && (this.getDown() == null ? other.getDown() == null : this.getDown().equals(other.getDown()));
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
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getUp() == null) ? 0 : getUp().hashCode());
        result = prime * result + ((getDown() == null) ? 0 : getDown().hashCode());
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
        sb.append(", comment=").append(comment);
        sb.append(", up=").append(up);
        sb.append(", down=").append(down);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public Comment(String author, String articleid, String time, String comment, Integer up, Integer down) {
        super(author, articleid, time);
        this.comment = comment;
        this.up = up;
        this.down = down;
    }

    public Comment() {
    }
}