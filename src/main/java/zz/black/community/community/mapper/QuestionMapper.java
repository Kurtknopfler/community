package zz.black.community.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import zz.black.community.community.model.Question;

@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title, description, gmt_create, gmt_modified, creater, tag ) values (#{title}, #{description}, #{gmtCreate}, #{gmtModified}, #{creater}, #{tag})")
    void create (Question question);
}
