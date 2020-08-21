package zz.black.community.community.dto;

import lombok.Data;
import zz.black.community.community.model.User;

@Data
public class QuestionDTO {
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
    private User user;
}
