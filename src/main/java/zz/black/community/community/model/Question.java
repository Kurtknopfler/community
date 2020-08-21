package zz.black.community.community.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creater;
    private Integer viewCount;
    private Integer likeCount;
    private Integer commentCount;
}
