package life.majiang.community.mapper;


import life.majiang.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {

        @Insert("insert into question(title,description,gmt_create,gmt_modified,creator,tags)values(#{title},#{description},#{gmt_create},#{gmt_modified},#{creator},#{tags})")
        void insert(Question question);


        @Select("select * from question limit #{offset},#{size}")
        List<Question> list(@Param(value = "offset") Integer offset, @Param(value="size") Integer size);

        @Select("select count(1) from question")
        Integer count();
}


