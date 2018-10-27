package com.citicup.model;

import java.io.Serializable;

public class Article extends ArticleKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.time
     *
     * @mbggenerated
     */
    private String time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.watchNum
     *
     * @mbggenerated
     */
    private String watchnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.up
     *
     * @mbggenerated
     */
    private Integer up;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.down
     *
     * @mbggenerated
     */
    private Integer down;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.text
     *
     * @mbggenerated
     */
    private String text;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.time
     *
     * @return the value of article.time
     *
     * @mbggenerated
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.time
     *
     * @param time the value for article.time
     *
     * @mbggenerated
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.title
     *
     * @return the value of article.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.title
     *
     * @param title the value for article.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.watchNum
     *
     * @return the value of article.watchNum
     *
     * @mbggenerated
     */
    public String getWatchnum() {
        return watchnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.watchNum
     *
     * @param watchnum the value for article.watchNum
     *
     * @mbggenerated
     */
    public void setWatchnum(String watchnum) {
        this.watchnum = watchnum == null ? null : watchnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.up
     *
     * @return the value of article.up
     *
     * @mbggenerated
     */
    public Integer getUp() {
        return up;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.up
     *
     * @param up the value for article.up
     *
     * @mbggenerated
     */
    public void setUp(Integer up) {
        this.up = up;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.down
     *
     * @return the value of article.down
     *
     * @mbggenerated
     */
    public Integer getDown() {
        return down;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.down
     *
     * @param down the value for article.down
     *
     * @mbggenerated
     */
    public void setDown(Integer down) {
        this.down = down;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.text
     *
     * @return the value of article.text
     *
     * @mbggenerated
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.text
     *
     * @param text the value for article.text
     *
     * @mbggenerated
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
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
        Article other = (Article) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGraphid() == null ? other.getGraphid() == null : this.getGraphid().equals(other.getGraphid()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getWatchnum() == null ? other.getWatchnum() == null : this.getWatchnum().equals(other.getWatchnum()))
            && (this.getUp() == null ? other.getUp() == null : this.getUp().equals(other.getUp()))
            && (this.getDown() == null ? other.getDown() == null : this.getDown().equals(other.getDown()))
            && (this.getText() == null ? other.getText() == null : this.getText().equals(other.getText()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGraphid() == null) ? 0 : getGraphid().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getWatchnum() == null) ? 0 : getWatchnum().hashCode());
        result = prime * result + ((getUp() == null) ? 0 : getUp().hashCode());
        result = prime * result + ((getDown() == null) ? 0 : getDown().hashCode());
        result = prime * result + ((getText() == null) ? 0 : getText().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", time=").append(time);
        sb.append(", title=").append(title);
        sb.append(", watchnum=").append(watchnum);
        sb.append(", up=").append(up);
        sb.append(", down=").append(down);
        sb.append(", text=").append(text);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}