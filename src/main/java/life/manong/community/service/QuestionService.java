package life.manong.community.service;

import life.manong.community.dto.QuestionDTO;
import life.manong.community.mapper.QuestionMapper;
import life.manong.community.mapper.UserMapper;
import life.manong.community.model.Question;
import life.manong.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list();
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);//Spring的工具类，快速将question对象上的属性拷贝到后者对象上
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        
        return questionDTOList;
    }
}
