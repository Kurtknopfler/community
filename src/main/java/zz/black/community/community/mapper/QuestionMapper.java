package zz.black.community.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import zz.black.community.community.model.Question;

import java.util.List;

@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title, description, gmt_create, gmt_modified, creater, tag ) values (#{title}, #{description}, #{gmtCreate}, #{gmtModified}, #{creater}, #{tag})")
    void create (Question question);

    @Select("select * from question")
    List<Question> list();
}
